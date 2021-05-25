import {EventEmitter, Injectable } from '@angular/core';
import {Usuario} from "./usuario";
import {Router} from "@angular/router";
import {HttpClient, HttpErrorResponse} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private urlBase: string = 'http://localhost:8080/api/usuario/login?cpf=03190462062&senha=12345'

  private usuarioAutenticado: boolean = false;

  autenticadoEmitter = new EventEmitter<boolean>();

  constructor(private router: Router, private _http : HttpClient) { }

  fazerLogin(usuario: Usuario) {
    if(!usuario.cpf) {
      console.warn('CPF não informado')
      this.autenticadoEmitter.emit(false)
    }
    if(!usuario.senha) {
      console.warn('Senha não informada')
      this.autenticadoEmitter.emit(false)
    }

    this._http.get('/api').subscribe(
      response => response === HttpErrorResponse ?
        console.log('Login invalido') :
        console.log(response)
    );

    this.usuarioAutenticado = true;
    this.autenticadoEmitter.emit(true)
    this.router.navigate(['/']);

  }
}
