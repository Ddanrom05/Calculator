public class Suma extends Operacion{
    double suma;
    char operador ='+';

    public Suma(double numero1, double numero2, char operador) {
        super(numero1, numero2, operador);
        this.suma = numero1 + numero2;
        this.resultado = this.suma;
    }

}
