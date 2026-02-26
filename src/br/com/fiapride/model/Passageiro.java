package br.com.fiapride.model;

public class Passageiro {
    private String nome;
    private String cpf;
    private double saldo;

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0.0;
    }

    // MÉTODO 1: Recarregar (Altera o estado do saldo)
    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Sucesso: R$" + valor + " adicionados.");
        } else {
            System.out.println("Erro: Valor de recarga inválido.");
        }
    }

    // MÉTODO 2: Pagar Viagem (Altera o estado do saldo com validação)
    public void pagarViagem(double custo) {
        if (custo > 0 && this.saldo >= custo) {
            this.saldo -= custo;
            System.out.println("Viagem autorizada. Saldo restante: R$" + this.saldo);
        } else {
            System.out.println("Erro: Saldo insuficiente (R$" + this.saldo + ") para o custo de R$" + custo);
        }
    }

    // GETTERS (Necessários para a Main conseguir ler os dados agora que são private)
    public String getNome() { return nome; }
    public double getSaldo() { return saldo; }
    public String getCpf() { return cpf; }
}