import {Component, Output} from '@angular/core';
import {AuthService} from "./login/auth.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-app';
  @Output() autenticado: boolean = false;

  constructor(private authService: AuthService) {

  }

  ngOnInit() {
    this.authService.autenticadoEmitter.subscribe(
      response => this.autenticado = response
    );
  }
}
