public class Multiplicacion extends Operacion{
    double multiplicacion;

    public Multiplicacion(double numero1, double numero2, char operador) {
        super(numero1, numero2, operador);
        this.multiplicacion = numero1 * numero2;
        this.resultado = this.multiplicacion;
    }

}
