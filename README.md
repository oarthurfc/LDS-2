# Laboratorio projeto 2
O objetivo do projeto é desenvolver um sistema integrado para a gestão de assinaturas de automóveis, permitindo que clientes e agentes (empresas e bancos) possam gerenciar contratos de aluguel de veículos de longa duração de forma eficiente e segura. O sistema permitirá a criação, modificação, consulta e avaliação de pedidos de aluguel, incluindo a análise financeira dos contratos, com a opção de compra do veículo ao final do período de locação.

Além disso, o sistema visa facilitar a interação entre as partes envolvidas, oferecendo uma plataforma centralizada que conecta clientes e agentes via internet, automatizando processos e garantindo a integridade dos dados armazenados, como informações de contratantes, veículos e contratos de crédito associados.

## Integrantes
* Arthur Ferreira Costa
* Felipe Freitas Campos Picinin
* Gabriel Faria
* Pedro Franco

## Orientadores
* Cristiano de Macêdo Neto

## Instruções de utilização
Abaixo está um guia geral de como configurar e utilizar a aplicação:

Instalação de Dependências
Instale o Node.js: A aplicação pode requerer Node.js, então, baixe e instale a versão mais recente do Node.js através do site oficial (Node.js).

Clone o repositório: Baixe o código do projeto para o seu ambiente local usando Git:

git clone <URL_DO_REPOSITÓRIO>
Acesse a pasta do projeto:

cd <PASTA_DO_PROJETO>
Instale as dependências: Se o projeto utiliza o gerenciador de pacotes npm ou yarn, execute um dos seguintes comandos para instalar todas as bibliotecas necessárias:

npm install
ou

yarn install
Execução da Aplicação
Configuração de variáveis de ambiente: Se houver variáveis de ambiente (ex.: conexão com o banco de dados), crie um arquivo .env na raiz do projeto e defina as chaves necessárias, como:

DB_HOST=localhost
DB_USER=root
DB_PASS=sua_senha
Inicie o servidor: Após instalar as dependências e configurar o ambiente, execute a aplicação com o seguinte comando:

npm start

Acesse a aplicação: Com o servidor rodando, você poderá acessar o sistema pelo navegador, geralmente no endereço:

http://localhost:8080
Testando APIs com Postman
Importação das rotas: Para testar as APIs, o arquivo com as rotas da aplicação poderá ser importado diretamente no Postman. Utilize o botão de "Importar" no Postman e carregue o arquivo postman_collection.json que será fornecido junto ao projeto.

Realizar requisições: Após a importação, você poderá testar todas as funcionalidades da API, como criar, modificar, consultar ou cancelar pedidos de aluguel, utilizando as rotas configuradas no Postman.

Seguindo esses passos, o sistema estará pronto para uso e testes.

## Histórias de Usuário
* Eu como Usuario quero realizar cadastro para que possa participar do sistema de aluguel de Carros.
* Eu como Cliente quero introduzir pedidos de aluguel para que eu possa alugar Carros.
* Eu como Cliente quero modificar pedidos de aluguel para que eu possa alterar os dados dos carros que desejo alugar.
* Eu como Cliente quero consultar pedidos de aluguel para que eu possa verificar os meus pedidos para alugar carros.
* Eu como Cliente quero cancelar pedidos de aluguel para que eu possa apagar os meus pedidos para alugar carros.
* Eu como Agente quero avaliar pedidos de aluguel para que eu possa aceitar ou nao o pedido de aluguel de carros.
* Eu como Agente quero modificar pedidos de aluguel para que eu possa fazer uma contraproposta ao pedido de aluguel de carros.
* Eu como Banco quero concender contrato de Crédito para que o cliente possa financiar o pedido de aluguel de carros.

### Link swagger
 - Para utilizar o swagger, basta dar run no projeto e acessar o link.
[Swagger](http://localhost:8080/swagger-ui/index.html#/)
