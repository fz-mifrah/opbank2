import dayjs from 'dayjs/esm';

export interface ICompte {
  id?: number;
  rib?: number;
  dateOuverture?: dayjs.Dayjs | null;
  code?: number;
}

export class Compte implements ICompte {
  constructor(public id?: number, public rib?: number, public dateOuverture?: dayjs.Dayjs | null, public code?: number) {}
}

export function getCompteIdentifier(compte: ICompte): number | undefined {
  return compte.id;
}
