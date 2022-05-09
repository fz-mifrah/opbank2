import dayjs from 'dayjs/esm';
import { ICompte } from 'app/entities/compte/compte.model';
import { TypeOperation } from 'app/entities/enumerations/type-operation.model';

export interface IOperation {
  id?: number;
  numOperation?: string;
  date?: dayjs.Dayjs | null;
  typeOperatin?: TypeOperation | null;
  etatOperation?: string | null;
  montant?: number;
  compte?: ICompte | null;
}

export class Operation implements IOperation {
  constructor(
    public id?: number,
    public numOperation?: string,
    public date?: dayjs.Dayjs | null,
    public typeOperatin?: TypeOperation | null,
    public etatOperation?: string | null,
    public montant?: number,
    public compte?: ICompte | null
  ) {}
}

export function getOperationIdentifier(operation: IOperation): number | undefined {
  return operation.id;
}
