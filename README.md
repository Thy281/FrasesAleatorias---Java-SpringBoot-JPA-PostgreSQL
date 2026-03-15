# Frases Aleatórias - API Spring Boot

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)

Este é um projeto de API REST desenvolvido com **Spring Boot** que gerencia e fornece frases aleatórias, utilizando **Spring Data JPA** para persistência e **PostgreSQL** como banco de dados.

## 🚀 Tecnologias Utilizadas

- **Java 21** 
- **Spring Boot 3+**
- **Spring Data JPA**
- **PostgreSQL** (Banco de Dados Relacional)
- **Maven** (Gerenciador de Dependências)

## 📋 Funcionalidades

- [x] Cadastro de novas frases.
- [x] Listagem de todas as frases.
- [x] Busca de uma frase aleatória (Random).
- [x] Atualização e exclusão de frases.

## 🛠️ Como Executar o Projeto

### Pré-requisitos
- JDK 21 ou superior.
- Maven instalado.
- PostgreSQL rodando localmente ou via Docker.

### 1. Configurar o Banco de Dados
No arquivo `src/main/resources/application.properties`, ajuste as credenciais do seu banco de dados:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```
git clone [https://github.com/Thy281/FrasesAleatorias---Java-SpringBoot-JPA-PostgreSQL.git](https://github.com/Thy281/FrasesAleatorias---Java-SpringBoot-JPA-PostgreSQL.git)
cd FrasesAleatorias---Java-SpringBoot-JPA-PostgreSQL
mvn spring-boot:run
