public class CalculadoraPrueba {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(5, 3, "suma");
        calc.calcular();
        System.out.println(calc.getResultado());
        
        calc = new Calculadora(5, 3, "resta");
        calc.calcular();
        System.out.println(calc.getResultado());

        calc = new Calculadora(5, 3, "multiplicar");
        calc.calcular();
        System.out.println(calc.getResultado());

        calc = new Calculadora(5, 3, "dividir");
        calc.calcular();
        System.out.println(calc.getResultado());
    }
}
