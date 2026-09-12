package banco;

public class ContaPoupanca extends ContaBancaria {

    private int diaRendimento;

    // Construtor usando super()
    public ContaPoupanca(int numeroConta, String nomeCliente, double saldoInicial, int diaRendimento) {
        super(numeroConta, nomeCliente, saldoInicial);
        this.diaRendimento = diaRendimento;
    }

    // Método para aplicar percentual de rendimento (ex: 0.05 para 5%)
    public void calcularNovoSaldo(double taxaRendimento) {
        if (taxaRendimento > 0) {
            double rendimento = getSaldo() * taxaRendimento;
            // Atualiza o saldo usando o método setSaldo protegido da superclasse
            setSaldo(getSaldo() + rendimento);
            System.out.printf("Rendimento aplicado! Novo saldo: R$ %.2f (Ganho de R$ %.2f)\n", getSaldo(), rendimento);
        } else {
            System.out.println("Taxa de rendimento inválida.");
        }
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }
}