import { Component, OnInit } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
import { FormBuilder, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';
import { finalize } from 'rxjs/operators';

import { IOperation, Operation } from '../operation.model';
import { OperationService } from '../service/operation.service';
import { TypeOperation } from 'app/entities/enumerations/type-operation.model';

@Component({
  selector: 'jhi-operation-update',
  templateUrl: './operation-update.component.html',
})
export class OperationUpdateComponent implements OnInit {
  isSaving = false;
  typeOperationValues = Object.keys(TypeOperation);

  editForm = this.fb.group({
    id: [],
    numOperation: [null, [Validators.required]],
    date: [],
    typeOperatin: [],
    etatOperation: [],
    montant: [null, [Validators.required]],
  });

  constructor(protected operationService: OperationService, protected activatedRoute: ActivatedRoute, protected fb: FormBuilder) {}

  ngOnInit(): void {
    this.activatedRoute.data.subscribe(({ operation }) => {
      this.updateForm(operation);
    });
  }

  previousState(): void {
    window.history.back();
  }

  save(): void {
    this.isSaving = true;
    const operation = this.createFromForm();
    if (operation.id !== undefined) {
      this.subscribeToSaveResponse(this.operationService.update(operation));
    } else {
      this.subscribeToSaveResponse(this.operationService.create(operation));
    }
  }

  protected subscribeToSaveResponse(result: Observable<HttpResponse<IOperation>>): void {
    result.pipe(finalize(() => this.onSaveFinalize())).subscribe({
      next: () => this.onSaveSuccess(),
      error: () => this.onSaveError(),
    });
  }

  protected onSaveSuccess(): void {
    this.previousState();
  }

  protected onSaveError(): void {
    // Api for inheritance.
  }

  protected onSaveFinalize(): void {
    this.isSaving = false;
  }

  protected updateForm(operation: IOperation): void {
    this.editForm.patchValue({
      id: operation.id,
      numOperation: operation.numOperation,
      date: operation.date,
      typeOperatin: operation.typeOperatin,
      etatOperation: operation.etatOperation,
      montant: operation.montant,
    });
  }

  protected createFromForm(): IOperation {
    return {
      ...new Operation(),
      id: this.editForm.get(['id'])!.value,
      numOperation: this.editForm.get(['numOperation'])!.value,
      date: this.editForm.get(['date'])!.value,
      typeOperatin: this.editForm.get(['typeOperatin'])!.value,
      etatOperation: this.editForm.get(['etatOperation'])!.value,
      montant: this.editForm.get(['montant'])!.value,
    };
  }
}
