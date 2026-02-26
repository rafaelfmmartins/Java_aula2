#FiapRide - Sistema de Bilhetagem Eletrônica

O **FiapRide** é um projeto desenvolvido em Java que simula o funcionamento de um sistema de transporte público, focando na gestão de passageiros, saldos e validação de viagens através de Programação Orientada a Objetos (POO).

## O que o projeto representa?
No mundo real, um sistema de transporte precisa garantir que ninguém viaje sem saldo e que valores de recarga sejam legítimos. A classe `Passageiro` atua como o "cartão de transporte", armazenando dados sensíveis e aplicando regras para garantir que o estado financeiro do objeto nunca fique inconsistente (ex: saldo negativo).

## Estrutura do Projeto

O projeto está dividido em pacotes para melhor organização:
- `br.com.fiapride.model`: Contém a classe de modelo (`Passageiro.java`).
- `br.com.fiapride.main`: Contém a classe de execução (`SistemaPrincipal.java`).

##  Diagrama de Classe (UML)



### Atributos:
- `nome`: Identificação do passageiro.
- `cpf`: Documento único do passageiro (String).
- `saldo`: Valor disponível para viagens (protegido por encapsulamento).

##  Regras de Negócio (Métodos)

A classe implementa **Encapsulamento** e **Validação**, protegendo os dados através dos seguintes métodos:

1.  **`adicionarSaldo(double valor)`**: 
    - Altera o estado do atributo `saldo`.
    - **Regra**: Só permite valores estritamente positivos. Caso contrário, exibe uma mensagem de erro e não altera o saldo.
2.  **`pagarViagem(double custo)`**: 
    - Reduz o valor do `saldo`.
    - **Regra 1**: O custo deve ser maior que zero.
    - **Regra 2**: O passageiro deve ter saldo suficiente para cobrir o custo. Se o saldo for insuficiente, a viagem é negada.

##  Como Executar

1. Certifique-se de ter o **JDK 17+** instalado.
2. Clone o repositório:
   ```bash
   git clone [https://github.com/SEU_USUARIO/fiapride.git](https://github.com/SEU_USUARIO/fiapride.git)
