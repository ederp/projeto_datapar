export interface Avaliacao {
  email: string;
  pontuacao: number;
  observacoes: string;
  contato?: string; // O campo contato é opcional
  horario?: string; // O campo horario é opcional
}
