import dayjs from 'dayjs/esm';
import { IOperation } from 'app/entities/operation/operation.model';
import { IBanque } from 'app/entities/banque/banque.model';

export interface ICompte {
  id?: number;
  rib?: number;
  dateOuverture?: dayjs.Dayjs | null;
  code?: number;
  operations?: IOperation[] | null;
  banque?: IBanque | null;
}

export class Compte implements ICompte {
  constructor(
    public id?: number,
    public rib?: number,
    public dateOuverture?: dayjs.Dayjs | null,
    public code?: number,
    public operations?: IOperation[] | null,
    public banque?: IBanque | null
  ) {}
}

export function getCompteIdentifier(compte: ICompte): number | undefined {
  return compte.id;
}
