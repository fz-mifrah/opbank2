import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'client',
        data: { pageTitle: 'libraryApp.client.home.title' },
        loadChildren: () => import('./client/client.module').then(m => m.ClientModule),
      },
      {
        path: 'compte',
        data: { pageTitle: 'libraryApp.compte.home.title' },
        loadChildren: () => import('./compte/compte.module').then(m => m.CompteModule),
      },
      {
        path: 'banque',
        data: { pageTitle: 'libraryApp.banque.home.title' },
        loadChildren: () => import('./banque/banque.module').then(m => m.BanqueModule),
      },
      {
        path: 'carte-bancaire',
        data: { pageTitle: 'libraryApp.carteBancaire.home.title' },
        loadChildren: () => import('./carte-bancaire/carte-bancaire.module').then(m => m.CarteBancaireModule),
      },
      {
        path: 'operation',
        data: { pageTitle: 'libraryApp.operation.home.title' },
        loadChildren: () => import('./operation/operation.module').then(m => m.OperationModule),
      },
      {
        path: 'virement',
        data: { pageTitle: 'libraryApp.virement.home.title' },
        loadChildren: () => import('./virement/virement.module').then(m => m.VirementModule),
      },
      {
        path: 'beneficiaire',
        data: { pageTitle: 'libraryApp.beneficiaire.home.title' },
        loadChildren: () => import('./beneficiaire/beneficiaire.module').then(m => m.BeneficiaireModule),
      },
      {
        path: 'destinataire',
        data: { pageTitle: 'libraryApp.destinataire.home.title' },
        loadChildren: () => import('./destinataire/destinataire.module').then(m => m.DestinataireModule),
      },
      {
        path: 'transfer',
        data: { pageTitle: 'libraryApp.transfer.home.title' },
        loadChildren: () => import('./transfer/transfer.module').then(m => m.TransferModule),
      },
      {
        path: 'recharge',
        data: { pageTitle: 'libraryApp.recharge.home.title' },
        loadChildren: () => import('./recharge/recharge.module').then(m => m.RechargeModule),
      },
      {
        path: 'operateur',
        data: { pageTitle: 'libraryApp.operateur.home.title' },
        loadChildren: () => import('./operateur/operateur.module').then(m => m.OperateurModule),
      },
      {
        path: 'paiment-facture',
        data: { pageTitle: 'libraryApp.paimentFacture.home.title' },
        loadChildren: () => import('./paiment-facture/paiment-facture.module').then(m => m.PaimentFactureModule),
      },
      {
        path: 'facture',
        data: { pageTitle: 'libraryApp.facture.home.title' },
        loadChildren: () => import('./facture/facture.module').then(m => m.FactureModule),
      },
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ]),
  ],
})
export class EntityRoutingModule {}
