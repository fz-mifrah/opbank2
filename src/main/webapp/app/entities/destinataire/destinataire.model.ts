export interface IDestinataire {
  id?: number;
  nom?: string;
  prenom?: string;
  rib?: number;
}

export class Destinataire implements IDestinataire {
  constructor(public id?: number, public nom?: string, public prenom?: string, public rib?: number) {}
}

export function getDestinataireIdentifier(destinataire: IDestinataire): number | undefined {
  return destinataire.id;
}
