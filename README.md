# Workshop Spring Boot JPA

## Visão Geral
Bem-vindo ao projeto **Workshop Spring Boot JPA**!  
Este projeto foi criado para demonstrar o uso de tecnologias modernas do **Java** para construir uma aplicação robusta e escalável. O foco está na **gestão de produtos e pedidos**, utilizando diversas tecnologias e ferramentas para criar uma solução completa.

## Tecnologias Utilizadas
- **Java 21**: Versão moderna do Java para desenvolvimento eficiente.
- **Maven**: Ferramenta de gerenciamento de dependências e automação de build.
- **Spring Boot 3**: Framework para construir aplicações Java autônomas e prontas para produção.
- **H2 Database**: Banco de dados em memória leve para desenvolvimento e testes.
- **Apache Tomcat**: Contêiner de servlets para deploy de aplicações web Java.
- **Swagger/OpenAPI**: Documentação interativa da API para facilitar testes e integração.
- **Insomnia**: Cliente de API para testar e interagir com os endpoints da aplicação.

## Funcionalidades
- **Gestão de Produtos**: Operações CRUD para entidades de produtos.
- **Gestão de Pedidos**: Criação, recuperação, atualização e exclusão de pedidos.

## Como Começar

### Pré-requisitos
- **Java 21** instalado na sua máquina.
- **Maven** instalado para compilar o projeto.

### Instalação
1. Clone o repositório:
   ```sh
   git clone https://github.com/caiocssilva/workshop-springboot-jpa.git

2. Acesse o diretório do projeto:
   ```sh
   cd workshop-springboot-jpa

3. Compile o projeto com Maven:
   ```sh
   mvn clean install

4. Execute a aplicação:
   ```sh
   mvn spring-boot:run

### Configuração
- **Propriedades da Aplicação:** Configure os detalhes no arquivo
  ```plaintext
  src/main/resources/application.properties.
   
### Testando a API 
Use o Insomnia para interagir com os endpoints da API fornecidos pelo aplicativo. A URL base para testes locais é http://localhost:8080.

### Exemplos de Endpoints

**Gestão de Usuários**
- **GET /users/{id}:** Buscar um usuário específico pelo ID.
- **PUT /users/{id}:** Atualizar as informações de um usuário.
- **DELETE /users/{id}:** Deletar um usuário pelo ID.
- **GET /users:** Listar todos os usuários.
- **POST /users:** Criar um novo usuário.

**Gestão de Pedidos**
- **GET /orders:** Listar todos os pedidos.
- **GET /orders/{id}:** Buscar um pedido específico por ID.

**Gestão de Categorias**
- **GET /categories:** Listar todas as categorias de produtos.
- **GET /categories/{id}:** Buscar uma categoria específica por ID.

**Gestão de Produtos**
- **GET /products:** Listar todos os produtos.
- **GET /products/{id}:** Buscar um produto específico por ID.

### Documentação com Swagger
A documentação interativa da API pode ser acessada através do Swagger em:
http://localhost:8080/swagger-ui.html

### Contribuição
Se você deseja contribuir para este projeto, faça um fork do repositório e envie um pull request com suas alterações.
