import dayjs from 'dayjs/esm';
import { TypeOperation } from 'app/entities/enumerations/type-operation.model';

export interface IOperation {
  id?: number;
  numOperation?: string;
  date?: dayjs.Dayjs | null;
  typeOperatin?: TypeOperation | null;
  etatOperation?: string | null;
  montant?: number;
}

export class Operation implements IOperation {
  constructor(
    public id?: number,
    public numOperation?: string,
    public date?: dayjs.Dayjs | null,
    public typeOperatin?: TypeOperation | null,
    public etatOperation?: string | null,
    public montant?: number
  ) {}
}

export function getOperationIdentifier(operation: IOperation): number | undefined {
  return operation.id;
}
