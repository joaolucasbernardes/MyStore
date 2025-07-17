# MyStore API - Backend de E-commerce

Esta é a API REST para o projeto MyStore, uma aplicação que simula o backend de um sistema de e-commerce, gerenciando usuários, produtos, categorias e pedidos.

## 📜 Sumário

* [Tecnologias Utilizadas](#-tecnologias-utilizadas)
* [Funcionalidades Implementadas](#-funcionalidades-implementadas)
* [Como Executar o Projeto](#-como-executar-o-projeto)
    * [Pré-requisitos](#-pré-requisitos)
    * [Localmente via Maven](#-localmente-via-maven)
* [Endpoints da API](#-endpoints-da-api)
* [Autor](#-autor)

## ✨ Tecnologias Utilizadas

Este projeto foi construído utilizando as seguintes tecnologias:

* **Java 17**: Versão da linguagem de programação.
* **Spring Boot 3**: Framework principal para a construção da API.
* **Spring Data JPA**: Para persistência de dados e comunicação com o banco.
* **Maven**: Gerenciador de dependências e build do projeto.
* **H2 Database Engine**: Banco de dados em memória utilizado para o ambiente de teste.

## 🚀 Funcionalidades Implementadas

* **Gerenciamento de Usuários**: Operações de Criar, Ler, Atualizar e Deletar (CRUD) para usuários.
* **Gerenciamento de Pedidos**: Listagem e consulta de pedidos e seus itens.
* **Catálogo de Produtos**: Listagem e consulta de produtos e suas categorias associadas.
* **Estrutura de Dados**: Mapeamento de relacionamentos entre as entidades (Usuário, Pedido, Produto, Categoria).
* **Seed de Banco de Dados**: A aplicação é populada com dados de exemplo na inicialização (`TestConfig.java`) para facilitar testes e demonstrações.
* **Tratamento de Exceções**: Respostas de erro padronizadas para recursos não encontrados e erros de banco de dados.

## ⚙️ Como Executar o Projeto

### Pré-requisitos

Para o método local, você precisa do **Java 17** e do **Maven 3.8+** instalados e configurados no seu sistema.

### Localmente via Maven

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/joaolucasbernardes/mystore.git](https://github.com/joaolucasbernardes/mystore.git)
    cd mystore
    ```

2.  **Navegue até a raiz do projeto** e execute o seguinte comando Maven:
    ```bash
    mvn spring-boot:run
    ```
    A aplicação iniciará e estará disponível em `http://localhost:8080`.

## Endpoints da API

A seguir estão os endpoints disponíveis para interagir com a API.

### Usuários (`/users`)

| Verbo | Rota | Descrição |
| :--- | :--- | :--- |
| `GET` | `/users` | Lista todos os usuários cadastrados. |
| `GET` | `/users/{id}` | Busca um usuário específico pelo seu ID. |
| `POST`| `/users` | Cria um novo usuário. É preciso enviar os dados no corpo da requisição. |
| `PUT` | `/users/{id}` | Atualiza os dados de um usuário existente (nome, email, telefone). |
| `DELETE`| `/users/{id}` | Remove um usuário do sistema. |

### Produtos (`/products`)

| Verbo | Rota | Descrição |
| :--- | :--- | :--- |
| `GET` | `/products` | Lista todos os produtos disponíveis. |
| `GET` | `/products/{id}`| Busca um produto específico pelo seu ID. |

### Categorias (`/categories`)

| Verbo | Rota | Descrição |
| :--- | :--- | :--- |
| `GET` | `/categories` | Lista todas as categorias de produtos. |
| `GET` | `/categories/{id}`| Busca uma categoria específica pelo seu ID. |

### Pedidos (`/orders`)

| Verbo | Rota | Descrição |
| :--- | :--- | :--- |
| `GET` | `/orders` | Lista todos os pedidos realizados. |
| `GET` | `/orders/{id}`| Busca um pedido específico e seus itens pelo ID. |

## 👤 Autor

**JOÃO LUCAS BERNARDES**

* **LinkedIn**: https://www.linkedin.com/in/joaolucasbernardes/
