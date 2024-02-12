public class CalculadoraPrueba {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(5, 3, "suma");
        calc.calcular();
        System.out.println(calc.getResultado());
    }
}
