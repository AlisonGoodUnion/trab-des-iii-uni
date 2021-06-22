import { NgModule } from '@angular/core';
import {BrowserModule, HammerModule} from '@angular/platform-browser';

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
import { AuthService } from './login/auth.service';
import {FormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import { FooterComponent } from './footer/footer.component';
import { RegistrarComponent } from './registrar/registrar.component';
import { CalendarioComponent } from './calendario/calendario.component';
import { ComprovantesComponent } from './comprovantes/comprovantes.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    MenuComponent,
    HomeComponent,
    DashboardComponent,
    FooterComponent,
    RegistrarComponent,
    CalendarioComponent,
    ComprovantesComponent,
    // BrowserAnimationsModule,
    // HammerModule,
    // IgxCalendarModule
  ],
  imports: [
    NgbModule,
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    MaterializeModule,
    routing,
    FormsModule,
  ],
  providers: [
    AuthService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
