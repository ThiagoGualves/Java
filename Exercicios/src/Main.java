import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Pitágoras

        Scanner scanner = new Scanner((System.in));
        CalcularPitagoras calcularPitagoras = new CalcularPitagoras();
        CalcularBhaskara calcularBhaskara = new CalcularBhaskara();
        ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
        CalcularImc calcularImc = new CalcularImc();

        System.out.println("Digite o valor do primeiro cateto: ");
        double cateto1 = scanner.nextDouble();

        System.out.println("Digite o valor do segundo cateto: ");
        double cateto2 = scanner.nextDouble();

        double hipotenusa = calcularPitagoras.calcular(cateto1, cateto2);
        System.out.println("Resultado da hipotenusa: " + hipotenusa);

        // Bhaskara

        System.out.println("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor de c: ");
        double c = scanner.nextDouble();

        double bhaskara = calcularBhaskara.calcular1(a, b, c);
        System.out.println("Resultado 1 da conta de Bhaskara: " + bhaskara);

        double bhaskara2 = calcularBhaskara.calcular2(a, b, c);
        System.out.println("Resultado 2 da conta de Bhaskara: " + bhaskara2);

        // Conversor

        System.out.println("Digite o valor da temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double conversor = conversorTemperatura.calcular3(celsius);
        System.out.println("Resultado da conversão de Celsius para Fahrenheit: " + conversor + "ºF");

        double conversor2 = conversorTemperatura.calcular4(celsius);
        System.out.println("Resultado da conversão de Celsius para Kelvin: " + conversor2 + "K");

        // IMC

        System.out.println("Digite o seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        double imc = calcularImc.calcular5(peso, altura);
        System.out.println("Resultado do IMC: " + imc);
        scanner.close();

    }
}