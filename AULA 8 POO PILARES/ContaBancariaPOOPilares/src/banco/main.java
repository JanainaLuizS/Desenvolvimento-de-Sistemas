package banco;

public class main {

	    public static void main(String[] args) {

	        System.out.println("==================================================");
	        System.out.println("        TESTES: CONTA POUPANÇA (ATIVIDADE 10)");
	        System.out.println("==================================================");

	        ContaPoupanca poupanca = new ContaPoupanca(1001, "Carlos Silva", 1000.00, 10);
	        poupanca.consultarSaldo();

	        // Teste 1: Depósito válido
	        System.out.println("\n--- 1. Depósito em Conta Poupança ---");
	        poupanca.depositar(500.00);

	        // Teste 2: Saque em conta poupança
	        System.out.println("\n--- 2. Saque em Conta Poupança ---");
	        poupanca.sacar(200.00);

	        // Teste 3: Aplicação de rendimento (ex: 1% de juros)
	        System.out.println("\n--- 3. Aplicação do Rendimento ---");
	        poupanca.calcularNovoSaldo(0.01);
	        poupanca.consultarSaldo();


	        System.out.println("\n==================================================");
	        System.out.println("        TESTES: CONTA ESPECIAL (ATIVIDADE 10)");
	        System.out.println("==================================================");

	        // Conta Especial com R$ 500.00 de saldo e R$ 1000.00 de limite
	        ContaEspecial especial = new ContaEspecial(2002, "Mariana Souza", 500.00, 1000.00);
	        especial.consultarSaldo();

	        // Teste 4: Saque utilizando somente o saldo
	        System.out.println("\n--- 4. Saque dentro do Saldo ---");
	        especial.sacar(300.00); // Sobram 200 de saldo
	        especial.consultarSaldo();

	        // Teste 5: Saque utilizando parte do limite
	        System.out.println("\n--- 5. Saque utilizando Limite ---");
	        especial.sacar(600.00); // Usa os 200 de saldo + 400 do limite (saldo fica -400)
	        especial.consultarSaldo();

	        // Teste 6: Tentativa de saque acima de (saldo + limite)
	        System.out.println("\n--- 6. Tentativa de Saque Acima do Limite Total ---");
	        // Saldo atual: -400 | Limite: 1000 | Disponível total = 600
	        especial.sacar(800.00); // Deve ser recusado!
	        especial.consultarSaldo();

	        // Tentativa de acesso direto ao saldo (Atividade 8):
	        // especial.saldo = 5000.0; // Se você desconmentar essa linha, o Java DARÁ ERRO DE COMPILAÇÃO!
	    }
	}