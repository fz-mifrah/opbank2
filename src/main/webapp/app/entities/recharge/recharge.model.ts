import { IOperateur } from 'app/entities/operateur/operateur.model';

export interface IRecharge {
  id?: number;
  numTel?: number;
  operateurs?: IOperateur[] | null;
}

export class Recharge implements IRecharge {
  constructor(public id?: number, public numTel?: number, public operateurs?: IOperateur[] | null) {}
}

export function getRechargeIdentifier(recharge: IRecharge): number | undefined {
  return recharge.id;
}
