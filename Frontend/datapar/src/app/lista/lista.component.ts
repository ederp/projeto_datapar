import { Component, OnInit } from '@angular/core';
import { AvaliacaoService } from '../avaliacao.service';

@Component({
  selector: 'app-lista',
  templateUrl: './lista.component.html',
  styleUrls: ['./lista.component.css'],
})
export class ListaComponent implements OnInit {
  listaAvaliacoes: any[] = [];

  constructor(private avaliacaoService: AvaliacaoService) { }

  ngOnInit(): void {
    this.obterListaAvaliacoes();
  }

  obterListaAvaliacoes(): void {
    this.avaliacaoService.obterListaAvaliacoes().subscribe(
      (lista) => {
        this.listaAvaliacoes = lista;
      },
      (error) => {
        console.error('Erro ao obter lista de avaliações', error);
      }
    );
  }
}

