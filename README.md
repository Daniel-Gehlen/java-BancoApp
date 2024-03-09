# Relatório: Aplicação Bancária em Java

## Introdução
A aplicação bancária desenvolvida em Java tem como objetivo simular o funcionamento básico de um sistema bancário, permitindo que os usuários realizem consultas de saldo, depósitos, saques e encerrem o uso da aplicação. O código foi implementado seguindo os princípios do paradigma de Orientação a Objetos, utilizando classes e métodos para organizar e modularizar o código de forma eficiente.

## Métodos
- **Classe ContaBancaria:**
  - Armazena os dados pessoais do usuário (nome, sobrenome e CPF).
  - Gerencia o saldo da conta e permite consultas, depósitos e saques.

- **Classe BancoApp:**
  - Contém o método principal `main` que inicia a aplicação.
  - Exibe um menu interativo para que os usuários realizem operações bancárias.
  - Utiliza estruturas de repetição e decisão para controlar o fluxo da aplicação.

## Resultados
A aplicação desenvolvida permite que os usuários interajam com o sistema bancário de forma intuitiva e segura. Os principais resultados obtidos são:
- Possibilidade de consultar saldo, realizar depósitos e saques.
- Validação de operações de saque para garantir que o saldo seja suficiente.
- Encerramento da aplicação quando o usuário desejar.

## Conclusão
O desenvolvimento da aplicação bancária em Java demonstra a aplicação prática dos conceitos de Orientação a Objetos para criar sistemas robustos e modulares. A utilização de classes e métodos permite uma organização eficiente do código, facilitando a manutenção e expansão do sistema. Além disso, a implementação de um menu interativo proporciona uma experiência amigável ao usuário, tornando a aplicação acessível e funcional.

## Estudo de Caso
Imagine um cliente, João, que deseja realizar algumas operações bancárias utilizando a aplicação desenvolvida. João inicia a aplicação, informa seus dados pessoais (nome, sobrenome e CPF) e é apresentado com um menu contendo as opções disponíveis: consultar saldo, realizar depósito, realizar saque e encerrar. Ele decide consultar seu saldo e descobre que possui R$ 100,00 em sua conta. Em seguida, João decide realizar um depósito de R$ 50,00. A operação é realizada com sucesso, e seu saldo atualizado é exibido. Posteriormente, João decide fazer um saque de R$ 200,00. Como seu saldo é insuficiente, a operação é recusada, e uma mensagem de saldo insuficiente é exibida. Por fim, João decide encerrar a aplicação. Ele recebe uma mensagem de despedida e a aplicação é encerrada.

Este estudo de caso ilustra como um usuário pode interagir com a aplicação bancária para realizar operações simples de forma segura e eficiente.
