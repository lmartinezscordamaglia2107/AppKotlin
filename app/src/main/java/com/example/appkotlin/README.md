# 🍕 Sistema de Pizzaria

Análise e gerenciamento de pedidos para uma pizzaria moderna, desenvolvido inteiramente em **Kotlin**. O sistema foi desenhado para ser eficiente, escalável e de fácil manutenção, aplicando conceitos sólidos de orientação a objetos.

---

## 🚀 Funcionalidades

O sistema conta com um fluxo completo para o gerenciamento de uma pizzaria, incluindo:

*   **Gerenciamento de Cardápio:** Cadastro, remoção e listagem de pizzas (sabores, tamanhos e preços).
*   **Controle de Pedidos:** Abertura de novos pedidos, adição de itens, cálculo automático do total e taxas de entrega.
*   **Status do Pedido:** Acompanhamento do ciclo de vida do pedido (Em preparo, Saiu para entrega, Entregue).
*   **Cadastro de Clientes:** Vinculação de pedidos a clientes com endereço de entrega.
*   **Interface via Console:** Menu interativo e intuitivo no terminal para simular a operação da pizzaria. *(Substitua se for uma API ou Mobile!)*

---

## 🛠️ Tecnologias Utilizadas

*   **Linguagem:** [Kotlin](https://kotlinlang.org/) (Versão 1.9+)
*   **Ambiente de Desenvolvimento:** IntelliJ IDEA / Android Studio
*   **Gerenciador de Dependências:** Gradle (Kotlin DSL)

---

## 📦 Estrutura do Projeto

A arquitetura do projeto está dividida de forma organizada para garantir a separação de responsabilidades:

```text
├── src
│   └── main
│       └── kotlin
│           ├── model         # Modelos de dados (Pizza, Cliente, Pedido)
│           ├── repository    # Gerenciamento de dados em memória ou DB
│           ├── service       # Regras de negócio (Fluxo de pedidos, cálculo de preços)
│           └── Main.kt       # Ponto de entrada da aplicação (Menu principal)
    status: in starting