import { IFacture } from 'app/entities/facture/facture.model';

export interface IPaimentFacture {
  id?: number;
  referance?: number;
  factures?: IFacture[] | null;
}

export class PaimentFacture implements IPaimentFacture {
  constructor(public id?: number, public referance?: number, public factures?: IFacture[] | null) {}
}

export function getPaimentFactureIdentifier(paimentFacture: IPaimentFacture): number | undefined {
  return paimentFacture.id;
}
