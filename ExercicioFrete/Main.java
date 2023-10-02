package ExercicioFrete;

public class Main {
	public static void main(String[] args) {
        CalculoFrete calculoPeso = new CalculoPorPeso();
        CalculoFrete calculoDimensoes = new CalculoPorDimensoes();
        CalculoFrete calculoPreco = new CalculoPorPreco();

        CalculadoraFrete calculadoraPeso = new CalculadoraFrete(calculoPeso);
        CalculadoraFrete calculadoraDimensoes = new CalculadoraFrete(calculoDimensoes);
        CalculadoraFrete calculadoraPreco = new CalculadoraFrete(calculoPreco);

        Produto p1 = new Produto(30, 20, 10, 700);
        Produto p2 = new Produto(20, 15, 30, 500);
        Produto p3 = new Produto(5, 5, 30, 200);

        System.out.println("Frete produto 1 = " + calculadoraPeso.calcularCustoEnvio(p1.getPeso(), p1.getAltura(),
                p1.getLargura(), p1.getPreco()));
        System.out.println("Frete produto 2 = " + calculadoraDimensoes.calcularCustoEnvio(p2.getPeso(), p2.getAltura(),
                p2.getLargura(), p2.getPreco()));
        System.out.println("Frete produto 3 = " + calculadoraPreco.calcularCustoEnvio(p3.getPeso(), p3.getAltura(),
                p3.getLargura(), p3.getPreco()));
    }
}

