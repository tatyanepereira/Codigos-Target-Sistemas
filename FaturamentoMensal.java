import java.util.Arrays;

public class FaturamentoMensal {

    public static void main(String[] args) {
        // vetor de faturamento diário (exemplo com 31 dias)
        double[] faturamentoDiario = { 22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258,
                46251.174, 11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0,
                35240.1826, 43829.1667, 18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 13220.495,
                8414.61 };

        // calcular o menor valor de faturamento diário
        double menorFaturamento = Arrays.stream(faturamentoDiario).min().getAsDouble();
        System.out.println("Menor faturamento diário: " + menorFaturamento);

        // calcular o maior valor de faturamento diário
        double maiorFaturamento = Arrays.stream(faturamentoDiario).max().getAsDouble();
        System.out.println("Maior faturamento diário: " + maiorFaturamento);

        // calcular a média mensal de faturamento
        double mediaMensal = Arrays.stream(faturamentoDiario).filter(f -> f > 0.0).average().getAsDouble();

        // calcular o número de dias em que o faturamento diário foi superior à média
        // mensal
        long diasAcimaDaMedia = Arrays.stream(faturamentoDiario).filter(f -> f > mediaMensal).count();
        System.out.println("Dias com faturamento diário acima da média: " + diasAcimaDaMedia);
    }
}
