import { Component, OnInit } from '@angular/core';
import {Usuario} from '../login/usuario';

@Component({
  selector: 'app-comprovantes',
  templateUrl: './comprovantes.component.html',
  styleUrls: ['./comprovantes.component.css']
})
export class ComprovantesComponent implements OnInit {
  usuario: Usuario;


  constructor() { }

  ngOnInit(): void {

  }

}
