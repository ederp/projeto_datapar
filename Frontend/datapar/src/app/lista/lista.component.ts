import { NgFor, NgIf } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { AvaliacaoService } from '../avaliacao.service';

@Component({
  selector: 'app-lista',
  standalone: true,
  imports: [NgIf, NgFor],
  templateUrl: './lista.component.html',
  styleUrls: ['./lista.component.css'],
})
export class ListaComponent implements OnInit {
  listaAvaliacoes: any[] = [];
  listaAvaliacoesPaginadas: any[] = [];
  paginaAtual = 1;
  itensPorPagina = 5;
  totalAvaliacoes = 0;

  constructor(private avaliacaoService: AvaliacaoService) { }

  ngOnInit(): void {
    this.carregarAvaliacoes();
  }

  carregarAvaliacoes(): void {
    this.avaliacaoService.obterListaAvaliacoes().subscribe(
      (lista) => {
        this.listaAvaliacoes = lista;
        this.totalAvaliacoes = lista.length;
        this.atualizarListaPaginada();
      },
      (error) => {
        console.error('Erro ao obter lista de avaliações', error);
      }
    );
  }

  proximaPagina(): void {
    if (this.paginaAtual * this.itensPorPagina < this.totalAvaliacoes) {
      this.paginaAtual++;
      this.atualizarListaPaginada();
    }
  }

  paginaAnterior(): void {
    if (this.paginaAtual > 1) {
      this.paginaAtual--;
      this.atualizarListaPaginada();
    }
  }

  atualizarListaPaginada(): void {
    const inicio = (this.paginaAtual - 1) * this.itensPorPagina;
    this.listaAvaliacoesPaginadas = this.listaAvaliacoes.slice(inicio, inicio + this.itensPorPagina);
  }
}

