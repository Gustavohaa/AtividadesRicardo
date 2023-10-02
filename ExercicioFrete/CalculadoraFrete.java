package ExercicioFrete;

public class CalculadoraFrete {
	private CalculoFrete calculoFrete;

	public CalculadoraFrete(CalculoFrete calculoFrete) {
		this.calculoFrete = calculoFrete;
	}

	public double calcularCustoEnvio(double peso, double altura, double largura, double preco) {
		return calculoFrete.calcular(peso, altura, largura, preco);
	}
}
