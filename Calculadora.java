public class Calculadora {
    private int num1;
    private int num2;
    private double resultado;
    private String operacion;

    public Calculadora(int num1, int num2, String operacion) {
        this.num1 = num1;
        this.num2 = num2;
        this.operacion = operacion;
    }

    public void calcular() {
        switch (operacion) {
            case "suma":
                resultado = num1 + num2;
                break;
            case "multiplicar":
                resultado = num1 * num2;
                break;
            case "dividir":
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operación no válida");
                break;
        }
    }

    public double getResultado() {
        return resultado;
    }

    public void suma() {
        resultado = num1 + num2;
    }

    public void multiplicar() {
        resultado = num1 * num2;
    }
    
    public void dividir() {
        resultado = num1 / num2;
    }
}