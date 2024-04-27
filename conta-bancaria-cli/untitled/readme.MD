# Sintaxe - Desafio: ContaBanco

Neste desafio, vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe, codificando o seguinte cenário.

## Descrição do Projeto

O projeto **ContaBanco** receberá dados via terminal contendo as características de uma conta bancária, conforme os atributos abaixo:

- **Número**: Inteiro (Exemplo: 1021)
- **Agência**: Texto (Exemplo: 067-8)
- **Nome do Cliente**: Texto (Exemplo: MARIO ANDRADE)
- **Saldo**: Decimal (Exemplo: 237.48)

Dentro do projeto, criaremos a classe `ContaTerminal.java` para realizar toda a codificação do nosso programa.

## Passos para Implementação

1. Revise as regras de declaração de variáveis.
2. Familiarize-se com o uso do terminal, argumentos principais (`main args`) e a classe `Scanner`.
3. Permita que os dados sejam inseridos via terminal. O usuário receberá a mensagem de qual informação será solicitada, por exemplo:
    - Programa: "Por favor, digite o número da Agência!"
    - Usuário: 1021 (depois pressionar ENTER para o próximo campo)
4. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
    - "Olá [Nome do Cliente], obrigado por criar uma conta em nosso banco. Sua agência é [Agência], conta [Número] e seu saldo [Saldo] já está disponível para saque."

Lembre-se de substituir os campos em `[ ]` pelas informações que forem inseridas pelos usuários.

