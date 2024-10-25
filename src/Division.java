public class Division extends Operacion{
    double division=0;

    public Division(double numero1, double numero2, char operador) {
        super(numero1, numero2, operador);

        this.division= numero1/numero2;
        this.resultado = this.division;
    }

}
