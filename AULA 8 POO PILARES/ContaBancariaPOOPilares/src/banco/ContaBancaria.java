package banco;

public class ContaBancaria {

	    // Atributos privados (Encapsulamento)
	    private int numeroConta;
	    private String nomeCliente;
	    private double saldo;

	    // Construtor (Atividade 8 - Valida saldo inicial >= 0)
	    public ContaBancaria(int numeroConta, String nomeCliente, double saldoInicial) {
	        this.numeroConta = numeroConta;
	        this.nomeCliente = nomeCliente;
	        
	        if (saldoInicial >= 0) {
	            this.saldo = saldoInicial;
	        } else {
	            System.out.println("Aviso: Saldo inicial não pode ser negativo! Definido como R$ 0,00.");
	            this.saldo = 0.0;
	        }
	    }

	    // Método depositar (Atividade 9)
	    public void depositar(double valor) {
	        if (valor > 0) {
	            this.saldo += valor;
	            System.out.printf("Depósito de R$ %.2f realizado com sucesso!\n", valor);
	        } else {
	            System.out.println("Erro: O valor de depósito deve ser maior que zero.");
	        }
	    }

	    // Método sacar (Atividade 9)
	    public boolean sacar(double valor) {
	        if (valor <= 0) {
	            System.out.println("Erro: O valor do saque deve ser maior que zero.");
	            return false;
	        }

	        if (valor <= this.saldo) {
	            this.saldo -= valor;
	            System.out.printf("Saque de R$ %.2f realizado com sucesso!\n", valor);
	            return true;
	        } else {
	            System.out.println("Erro: Saldo insuficiente para realizar o saque.");
	            return false;
	        }
	    }

	    // Método consultarSaldo (Atividade 9)
	    public void consultarSaldo() {
	        System.out.printf("Cliente: %s | Conta: %d | Saldo Atual: R$ %.2f\n", 
	                          nomeCliente, numeroConta, saldo);
	    }

	    // Getters e Setters
	    public int getNumeroConta() {
	        return numeroConta;
	    }

	    public String getNomeCliente() {
	        return nomeCliente;
	    }

	    // Getter para o saldo (Importante para o calcularNovoSaldo e para as subclasses)
	    public double getSaldo() {
	        return saldo;
	    }

	    // Método protegido auxiliar para permitir que subclasses ajustem o saldo internamente
	    protected void setSaldo(double novoSaldo) {
	        this.saldo = novoSaldo;
	    }
	}