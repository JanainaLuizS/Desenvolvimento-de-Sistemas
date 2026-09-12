package banco;


public class ContaEspecial extends ContaBancaria {

    private double limite;

    // Construtor usando super()
    public ContaEspecial(int numeroConta, String nomeCliente, double saldoInicial, double limite) {
        super(numeroConta, nomeCliente, saldoInicial);
        this.limite = limite;
    }

    // Sobrescrita do método sacar com regra de limite
    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do saque deve ser maior que zero.");
            return false;
        }

        // Regra de negócio: permite sacar até (saldo + limite)
        double saldoDisponivelComLimite = getSaldo() + limite;

        if (valor <= saldoDisponivelComLimite) {
            // Atualiza o saldo (pode ficar negativo se usar o limite)
            setSaldo(getSaldo() - valor);
            System.out.printf("Saque especial de R$ %.2f realizado com sucesso!\n", valor);
            return true;
        } else {
            System.out.printf("Erro: Saque de R$ %.2f excede o saldo + limite disponível (Máximo permitido: R$ %.2f).\n", 
                              valor, saldoDisponivelComLimite);
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }
}