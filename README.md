# BoraViajar API ✈️

API REST desenvolvida em Java com Spring Boot para gestão e consulta de destinos turísticos. Este projeto faz parte da construção de um portfólio de ferramentas e estudos focados em desenvolvimento backend.

## 🚀 Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot 3**
- **Spring Web** (construção de endpoints REST)
- **Maven** (gerenciador de dependências)

## 📌 Funcionalidades Atuais

- [x] **Listar todos os destinos:** Retorna a lista completa de destinos cadastrados.  
- [x] **Buscar destino por ID:** Retorna as informações detalhadas de um destino específico (com tratamento para erro 404).  
- [x] **Cadastrar destino:** Permite adicionar novos destinos à lista.  
- [x] **Atualizar destino:** Permite modificar os dados de um destino existente pelo ID.  
- [x] **Remover destino:** Elimina um destino cadastrado pelo ID.  

## 🛠️ Endpoints da API

A rota base para os destinos é `/api/v1/destinos`.

| Método | Rota | Descrição | Status HTTP |
| :--- | :--- | :--- | :--- |
| `GET` | `/api/v1/destinos` | Retorna todos os destinos | `200 OK` |
| `GET` | `/api/v1/destinos/{id}` | Retorna um destino pelo ID | `200 OK` / `404 Not Found` |
| `POST` | `/api/v1/destinos` | Cadastra um novo destino | `200 OK` |
| `PUT` | `/api/v1/destinos/{id}` | Atualiza um destino existente pelo ID | `200 OK` / `404 Not Found` |
| `DELETE` | `/api/v1/destinos/{id}` | Remove um destino pelo ID | `204 No Content` / `404 Not Found` |

---

## 📝 Exemplos de Requisição

### Cadastrar Destino (`POST /api/v1/destinos`)
Body (JSON):
{
  "id": 3,
  "nome": "Salvador",
  "estadoOuRegiao": "Bahia",
  "pais": "Brasil",
  "categoria": "Praia e Cultura",
  "descricao": "Conhecida pela sua rica cultura e praias."
}

### Atualizar Destino (`PUT /api/v1/destinos/1`)
Body (JSON):
{
  "nome": "Ouro Preto - MG",
  "estadoOuRegiao": "Minas Gerais",
  "pais": "Brasil",
  "categoria": "Histórico e Cultural",
  "descricao": "Cidade histórica famosa por suas igrejas e arquitetura barroca."
}

---

## 💻 Como Executar o Projeto

1. **Clonar o repositório:**  
   `git clone https://github.com/teu-usuario/boraviajar-api.git`

2. **Entrar no diretório:**  
   `cd boraviajar-api`

3. **Executar a aplicação:**  
   `./mvnw spring-boot:run`

A aplicação estará acessível em `http://localhost:8080`.