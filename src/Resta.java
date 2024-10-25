public class Resta extends Operacion{
    double resta;

    public Resta(double numero1, double numero2, char operador) {
        super(numero1, numero2, operador);
        this.resta = numero1 - numero2;
        this.resultado = this.resta;
    }

}
