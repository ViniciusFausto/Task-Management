# projeto Task-Management

API do projeto Task-Management

## Objetivo

API construida para um projeto de gerenciamento de tarefas.

## Começando

Estas instruções lhe darão uma cópia do projeto instalado e funcionando em
sua máquina local para fins de desenvolvimento e teste.

### 🤖 Pré-requisitos

Requisitos para o software e outras ferramentas para desenvolver e testar.
- IDE Java;
- JDK 17;

### 🎲 Instalando e executando
```bash 
# Clonar este repositório
$ git clone https://github.com/ViniciusFausto/Task-Management.git

#Exportando o projeto
- Exporte o projeto como maven project na sua IDE de preferencia.

# Configurando as credenciais

-Renomei o arquivo env.example para env.properties

DB_DATABASE= {Sua String de conexão}
DB_USER={Usuario do banco}
DB_PASSWORD={Senha do banco}

Exemplo

DB_DATABASE=//banco.database.windows.net:1433;database=banconame;user=admin@test;password=123;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;
DB_USER=admin
DB_PASSWORD=123

```
## Documentação da Api
  - Com a aplicação rodando acessar a url "http://localhost:8080/swagger-ui/index.html#" para ver a documentação via Swagger UI

## 👥 Autor
  - **Vinicius Fausto**
