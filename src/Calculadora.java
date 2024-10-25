import java.util.Scanner;
public class Calculadora {
    public static void main(String []args) {
        double n1, n2;
        int opcion;

        do {
            menuOperaciones();
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();

            if (opcion==5) break;

            //entrada de datos
            System.out.println("Ingresa el primer número: ");
            n1=sc.nextDouble();
            System.out.println("Ingresa el segundo número: ");
            n2=sc.nextDouble();

            switch (opcion){
                case 1: //suma
                    Suma sum = new Suma(n1,n2,'+');
                    sum.mostrarResultado();
                    break;
                case 2://resta
                    Resta res = new Resta(n1,n2,'-');
                    res.mostrarResultado();
                    break;
                case 3://multiplicacion
                    Multiplicacion mul = new Multiplicacion(n1,n2,'*');
                    mul.mostrarResultado();
                    break;
                case 4://division
                    if (n2==0){
                        System.out.println("Error. No se puede dividir.");
                    } else {
                        Division div = new Division(n1,n2,'/');
                        div.mostrarResultado(); // considerar el caso cuando no se puede dividrir.
                    }

                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }

        } while (opcion!=5);


    }

    //menu de operaciones
    private static void menuOperaciones() {

        System.out.println("Elige una operación: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Apagar");
    }
}
