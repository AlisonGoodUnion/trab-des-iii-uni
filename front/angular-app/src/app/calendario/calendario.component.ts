import { Component, OnInit } from '@angular/core';
import {Calendario} from './calendario';

@Component({
  selector: 'app-calendario',
  templateUrl: './calendario.component.html',
  styleUrls: ['./calendario.component.css']
})
export class CalendarioComponent implements OnInit {
  calendario: Calendario;

  constructor() { }

  ngOnInit(): void {
    this.calendario.estado = "RS";
    this.calendario.idade = 65;
  }

}
