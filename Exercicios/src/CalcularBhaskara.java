public class CalcularBhaskara {

    public  double calcular1(double a, double b, double c) {
        return (-b + Math.sqrt((b * b) - 4 * a * c )) / 2 * a;
    }

    public  double calcular2(double a, double b, double c) {
        return (-b - Math.sqrt((b * b) - 4 * a * c )) / 2 * a;
    }
}
