import { RouterModule, Routes } from '@angular/router';
import { FormularioComponent } from './formulario/formulario.component';
import { PaginaSucessoComponent } from './formulario/pagina-sucesso/pagina-sucesso.component';
import { ListaComponent } from './lista/lista.component';

const routes: Routes = [
  { path: 'formulario', component: FormularioComponent },
  { path: 'pagina-sucesso', component: PaginaSucessoComponent, pathMatch: 'full' },
  { path: 'lista', component: ListaComponent },
  { path: '', redirectTo: '/formulario', pathMatch: 'full' },
];

export const AppRoutingModule = RouterModule.forRoot(routes);
export { routes };
