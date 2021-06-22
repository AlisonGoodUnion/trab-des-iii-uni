import {Component, OnInit} from '@angular/core';
import {AuthService} from './auth.service';
import {Usuario} from './usuario';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  usuario: Usuario = new Usuario();

  constructor(private authService: AuthService) {
  }

  ngOnInit(): void {
    this.usuario.cpf = '03190462062';
    this.usuario.senha = '12345';

  }

  fazerLogin() {
    this.authService.fazerLogin(this.usuario);

  }
}
