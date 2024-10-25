public class Operacion {
    double numero1;
    double numero2;
    double resultado;
    char operador;

    //métodos

    //asignación de valores
    public Operacion(double numero1, double numero2, char operador) {

        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operador = operador;
    }

    // formato para mostrar resultados
    public void mostrarResultado(){

        System.out.println(this.numero1+" "+this.operador+" "+this.numero2+" = "+this.resultado);

    }




}
