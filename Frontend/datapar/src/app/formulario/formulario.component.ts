import { NgIf } from '@angular/common';
import { Component, Injectable } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { AvaliacaoService } from '../avaliacao.service';
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

  emailValido = true;

  constructor(private avaliacaoService: AvaliacaoService, private router: Router) { }

  validarEmail() {
    this.emailValido = !!this.avaliacao.email && this.avaliacao.email.match(/[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}/) !== null;
  }

  registrarAvaliacao(formulario: NgForm) {
    this.avaliacaoService.registrarAvaliacao(this.avaliacao).subscribe(
      (response) => {
        console.log('Avaliação registrada com sucesso:', response);
        formulario.resetForm();
        this.router.navigateByUrl('/pagina-sucesso');
      },
      (error) => {
        alert('Erro ao registrar avaliação. Verifique o e-mail pois não é possível registrar uma nova avaliação com o mesmo e-mail.');
        // Lógica para lidar com o erro, se necessário
      }
    );
  }
}

