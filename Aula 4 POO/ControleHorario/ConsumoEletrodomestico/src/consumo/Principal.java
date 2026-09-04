package consumo;

public class Principal {

    public static void main(String[] args) {
        
        // Definindo a tarifa fictícia
        double tarifa = 0.90;

        // 5. Instanciando o ventilador (100W, 8 horas)
        Eletrodomestico ventilador = new Eletrodomestico("Ventilador", 100.0, 8.0);

        // Exibe o primeiro relatório
        System.out.println(">>> PRIMEIRA MEDIÇÃO (8h diárias) <<<");
        ventilador.exibirRelatorio(tarifa);

        // Alterando o uso diário para 4 horas com o setter
        ventilador.setHorasPorDia(4.0);

        // Exibe o relatório atualizado
        System.out.println(">>> SEGUNDA MEDIÇÃO (4h diárias) <<<");
        ventilador.exibirRelatorio(tarifa);
    }
}
