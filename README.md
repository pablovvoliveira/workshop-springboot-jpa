# Workshop Spring Boot - Curso de Java do Professor Nélio Alves
Este repositório contém o código-fonte do projeto desenvolvido durante o Workshop de Spring Boot para o curso de Java do Professor Nélio Alves. O objetivo deste workshop é fornecer uma introdução prática ao desenvolvimento de aplicativos web utilizando o framework Spring Boot.

## Descrição
O projeto consiste em um backend para um sistema de gerenciamento de pedidos de uma loja. O backend foi construído utilizando o Spring Boot e a API de Persistência Java (JPA) para fornecer endpoints RESTful para criar, atualizar, recuperar e excluir pedidos, produtos e categorias.

## Pré-requisitos
Antes de começar, certifique-se de ter os seguintes pré-requisitos instalados em sua máquina:

* Java Development Kit (JDK) 8 ou superior
* Maven

## Configuração
Siga as etapas abaixo para configurar o projeto em sua máquina local:

1. Clone este repositório usando o seguinte comando:

shell
Copy code
git clone https://github.com/pablovvoliveira/workshop-springboot-jpa.git
2. Navegue até o diretório raiz do projeto:

shell
Copy code
cd workshop-springboot-jpa
3. Compile o projeto usando o Maven:

shell
Copy code
mvn clean install

## Executando o projeto
Após a conclusão da etapa de configuração, você pode executar o projeto usando o seguinte comando:

shell
Copy code
mvn spring-boot:run
O aplicativo será iniciado e estará acessível em http://localhost:8080.

## Recursos disponíveis
O projeto oferece os seguintes recursos:

* API RESTful para gerenciamento de pedidos, produtos e categorias.
* Implementação de camada de persistência utilizando JPA com o banco de dados H2 embutido.
* Endpoints para criar, atualizar, recuperar e excluir pedidos, produtos e categorias.
* Autenticação básica de usuário para proteger os endpoints.

## Autor
Este projeto foi desenvolvido por Pablo Oliveira, baseado nas aulas do curso de Java do professor Nélio Alves.
