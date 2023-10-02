package ExercicioFrete;

public class CalculoPorDimensoes implements CalculoFrete {
	
    @Override
    public double calcular(double peso, double altura, double largura, double preco) {
        return altura * largura;
    }
}