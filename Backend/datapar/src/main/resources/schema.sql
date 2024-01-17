CREATE TABLE avaliacao (
    id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255) NOT NULL,
    pontuacao INT NOT NULL,
    observacoes TEXT,
    numero_celular VARCHAR(20),
    horario_contato VARCHAR(50)
);