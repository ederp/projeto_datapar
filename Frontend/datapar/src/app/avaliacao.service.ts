import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class AvaliacaoService {
  private apiUrl = 'http://localhost:8080/avaliacoes';

  constructor(private http: HttpClient) { }

  registrarAvaliacao(avaliacao: any): Observable<any> {
    return this.http.post(`${this.apiUrl}`, avaliacao, { observe: 'response' });
  }

  obterListaAvaliacoes(): Observable<any> {
    return this.http.get(`${this.apiUrl}/lista`);
  }
}

