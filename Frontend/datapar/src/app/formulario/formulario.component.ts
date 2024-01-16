import { NgIf } from '@angular/common';
import { Component } from '@angular/core';
import { NgForm, FormsModule } from '@angular/forms';
import { Avaliacao } from '../models/avaliacao.model';

@Component({
  selector: 'app-formulario',
  standalone: true,
  imports: [FormsModule, NgIf],
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css'],
})
export class FormularioComponent {

  avaliacao: Avaliacao = {
    email: '',
    pontuacao: 0,
    observacoes: '',
    contato: '',
    horario:'',
  };

  registrarAvaliacao(formulario: NgForm) {
    console.log('Avaliação registrada:', this.avaliacao);
    formulario.resetForm();
  }
}

