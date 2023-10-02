package ExercicioFrete;

public class CalculoPorPreco implements CalculoFrete {
    @Override
    public double calcular(double peso, double altura, double largura, double preco) {
        if (preco > 500.0) {
            return 0.0;
        } else {
            return 20.0;
        }
    }
}
