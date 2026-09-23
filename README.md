# BoraViajar API

API REST desenvolvida em Java com Spring Boot para gestão e consulta de destinos turísticos. Este projeto faz parte da construção de um portfólio de ferramentas e estudos focados em desenvolvimento backend. 

## 🚀 Tecnologias Utilizadas

* **Java 17+**
* **Spring Boot 3**
* **Spring Web** (construção de endpoints REST)
** **Maven** (gerenciador de dependências)

** 📌 Funcionalidades Atuais

- [x] **Listar todos os destinos:** Retorna a lista completa de destinos cadastrados.
= [X] **Buscar destino por ID:** Retorna as informações datalhadas de um destino específico através do seu identificador.

** 🛠️ Endpoint da API

```text
| Método | Rota | Descrição | Exemplo de Uso |
| :--- | :--- | :--- | :--- |
| `GET` | `/api/v1/destinos` | Retorna todos os destinos | `http://localhost:8080/api/v1/destinos` |
| `GET` | `/api/v1/destinos/{id}` | Retorna um destino pelo ID | `http://localhost:8080/api/v1/destinos/1` |
```
## 💻 Como Executar o Projeto

1. **Clonar o repositório:**  
git clone https://github.com/teu-usuario/boraviajar-api.git

2. **Entrar no diretório:**  
cd boraviajar-api

3. **Executar a aplicação:**  
./mvnw spring-boot:run

A aplicação estará acessível em `http://localhost:8080`.

---

# Comandos Git para subir as alterações no terminal:
1. git add .  
2. git commit -m "docs: adiciona README.md"  
3. git push