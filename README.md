# projeto_datapar
Aplicação web que permite registros de classificação de 1 a 5 onde 5 é a melhor classificação.

Requisitos:  
● Permitir que o usuário registre sua avaliação através de um formulário (não é necessário fazer login).  
● O formulário de pesquisa deve conter um campo de:  
➢ email (cada email só pode responder ao formulário uma vez).  
➢ a pontuação.  
➢ campo de observações.  
● Após esta resposta, deverá ser dado feedback ao usuário de que o cadastro foi realizado com sucesso, caso contrário, informe se houve erros no formulário.  
● Lista com os dados cadastrados do formulário. 

Tecnologias utilizadas no projeto:  
Front-end: Angular  
Back-end: Java, frameworks Spring (Boot, MVC, JPA) e Hibernate, banco de dados MySQL

Instruções de como executar:

Após baixar o projeto, considerando que o Java esteja instalado e configurado na máquina, abrir o projeto na pasta Backend na IDE de preferência, e na primeira execução, descomentar as últimas linhas do [application.properties](https://github.com/ederp/projeto_datapar/blob/main/Backend/datapar/src/main/resources/application.properties) para rodar o [script](https://github.com/ederp/projeto_datapar/blob/main/Backend/datapar/src/main/resources/schema.sql) de criação do banco de dados. Comentar novamente após executar o banco. O endpoint da API no backend é o [http://localhost:8080](http://localhost:8080). No endereço [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html) estará disponível toda a documentação do Swagger necessária para acessar os endpoints da API.  
Para executar o front da aplicação, considerando que o Angular já esteja instalado na máquina (caso contrário, siga estes [passos](https://kinsta.com/pt/base-de-conhecimento/instalar-angular/)), abra a pasta [Frontend](https://github.com/ederp/projeto_datapar/tree/main/Frontend) na IDE de preferência, vá até a pasta datapar e execute o comando 'ng serve -o'. O formulário deve ser aberto automaticamente no endereço [http://localhost:4200](http://localhost:4200).


