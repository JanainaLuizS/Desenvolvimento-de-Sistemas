package consumo;

public class Eletrodomestico {

    // 1. Atributos
    private String nome;
    private double potenciaWatts;
    private double horasPorDia;

    // 2. Construtores
    // Construtor sem parâmetros (padrão)
    public Eletrodomestico() {
    }

    // Construtor com os três parâmetros
    public Eletrodomestico(String nome, double potenciaWatts, double horasPorDia) {
        this.nome = nome;
        this.potenciaWatts = potenciaWatts;
        this.horasPorDia = horasPorDia;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPotenciaWatts() {
        return potenciaWatts;
    }

    public void setPotenciaWatts(double potenciaWatts) {
        this.potenciaWatts = potenciaWatts;
    }

    public double getHorasPorDia() {
        return horasPorDia;
    }

    public void setHorasPorDia(double horasPorDia) {
        this.horasPorDia = horasPorDia;
    }

    // 3. Métodos de Cálculo

    // Consumo Diário em Wh
    public double consumoDiarioWh() {
        return this.potenciaWatts * this.horasPorDia;
    }

    // Consumo Mensal em Wh (Reutiliza o consumo diário)
    public double consumoMensalWh() {
        return consumoDiarioWh() * 30;
    }

    // Consumo Anual em Wh (Reutiliza o consumo mensal)
    public double consumoAnualWh() {
        return consumoMensalWh() * 12;
    }

    // Gasto Mensal em R$ (Converte Wh para kWh dividindo por 1000)
    public double gastoMensal(double precoKwh) {
        double consumoMensalKwh = consumoMensalWh() / 1000.0;
        return consumoMensalKwh * precoKwh;
    }

    // 4. Método para Exibir o Relatório
    public void exibirRelatorio(double precoKwh) {
        System.out.println("==========================================");
        System.out.println("       RELATÓRIO DE CONSUMO ENERGÉTICO   ");
        System.out.println("==========================================");
        System.out.println("Aparelho: " + this.nome);
        System.out.println("Potência: " + this.potenciaWatts + " W");
        System.out.println("Uso Diário: " + this.horasPorDia + " h");
        System.out.println("------------------------------------------");
        
        // Chamando os métodos de cálculo diretamente no relatório
        System.out.printf("Consumo Diário: %.0f Wh\n", consumoDiarioWh());
        System.out.printf("Consumo Mensal: %.0f Wh (%.1f kWh)\n", consumoMensalWh(), (consumoMensalWh() / 1000.0));
        System.out.printf("Consumo Anual : %.0f Wh (%.1f kWh)\n", consumoAnualWh(), (consumoAnualWh() / 1000.0));
        System.out.println("------------------------------------------");
        System.out.printf("Tarifa aplicada: R$ %.2f por kWh\n", precoKwh);
        System.out.printf("CUSTO MENSAL ESTIMADO: R$ %.2f\n", gastoMensal(precoKwh));
        System.out.println("==========================================\n");
    }
}