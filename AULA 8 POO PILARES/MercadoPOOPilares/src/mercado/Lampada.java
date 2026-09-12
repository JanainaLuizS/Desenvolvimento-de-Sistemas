package mercado;

public class Lampada {

    // 1. Atributos privados (Impede alteração direta de fora da classe)
    private String marca;
    private int potenciaWatts;
    private double preco;
    private boolean led;
    private boolean ligada;

    // 2. Construtor SEM parâmetros (Valores padrão)
    public Lampada() {
        this.marca = "Genérica";
        this.potenciaWatts = 10;
        this.preco = 5.00;
        this.led = true;
        this.ligada = false; // Sempre começa desligada
    }

    // 3. Construtor COM parâmetros (Sobrecarga)
    public Lampada(String marca, int potenciaWatts, double preco, boolean led) {
        this.marca = marca;
        this.setPotenciaWatts(potenciaWatts); // Usa o setter para reaproveitar validações
        this.setPreco(preco);
        this.led = led;
        this.ligada = false;
    }

    // Métodos de Ação (Comportamento)
    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void mostrarEstado() {
        System.out.println("Lâmpada " + marca + " (" + potenciaWatts + "W): " + (ligada ? "LIGADA" : "DESLIGADA"));
    }

    public void exibirDados() {
        System.out.println("------------------------------------------");
        System.out.println("Marca: " + marca);
        System.out.println("Potência: " + potenciaWatts + "W");
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("Tecnologia LED: " + (led ? "Sim" : "Não"));
        System.out.println("Estado: " + (ligada ? "LIGADA" : "DESLIGADA"));
        System.out.println("------------------------------------------");
    }

    // --- GETTERS E SETTERS ---

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotenciaWatts() {
        return potenciaWatts;
    }

    public void setPotenciaWatts(int potenciaWatts) {
        if (potenciaWatts > 0) {
            this.potenciaWatts = potenciaWatts;
        } else {
            System.out.println("Aviso: Potência deve ser maior que zero!");
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Aviso: O preço não pode ser negativo!");
        }
    }

    public boolean isLed() {
        return led;
    }

    public void setLed(boolean led) {
        this.led = led;
    }

    // Apenas Getter para "ligada" (sem Setter público para proteger a regra de negócio)
    public boolean isLigada() {
        return ligada;
    }
}