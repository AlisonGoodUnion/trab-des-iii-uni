import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import 'materialize-css';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { MenuComponent } from './menu/menu.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { MaterializeModule } from 'angular2-materialize';
import { HomeComponent } from './home/home.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import {routing} from './app.routing';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    MenuComponent,
    HomeComponent,
    DashboardComponent
  ],
  imports: [
    NgbModule,
    BrowserModule,
    AppRoutingModule,
    MaterializeModule,
    routing
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
