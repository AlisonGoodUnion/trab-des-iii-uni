import {RouterModule, Routes} from '@angular/router';
import {HomeComponent} from './home/home.component';
import {LoginComponent} from './login/login.component';
import {DashboardComponent} from './dashboard/dashboard.component';
import {ModuleWithProviders} from '@angular/core';
import {CalendarioComponent} from './calendario/calendario.component';
import {ComprovantesComponent} from './comprovantes/comprovantes.component';

const APP_ROUTES: Routes = [
  { path: 'dashboard', component: DashboardComponent},
  { path: 'login', component: LoginComponent},
  { path: 'calendario', component: CalendarioComponent},
  { path: 'comprovantes', component: ComprovantesComponent},
  { path: '', component: HomeComponent}
];

export const routing: ModuleWithProviders<any> = RouterModule.forRoot(APP_ROUTES);
