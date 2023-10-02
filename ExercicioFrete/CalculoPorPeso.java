package ExercicioFrete;

public class CalculoPorPeso implements CalculoFrete {
	
	@Override
	public double calcular(double peso, double altura, double largura, double preco) {
		return peso * 2.0;
	}
}