import java.util.Locale;
import java.util.Scanner;

public class CalculadoraSalario {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcion;
        String menu="";

        System.out.println("=== CALCULADORA SALARIO ===");
        System.out.println();

        do {
            System.out.print("Indique las horas realizadas esta semana: ");
            int hora = sc.nextInt();
            System.out.println();

            System.out.println("Indique a que clase perteneces: ");
            System.out.println("Clase A");
            System.out.println("Clase B");
            System.out.println("Clase C");
            System.out.println("Clase D");
            System.out.print("Respuesta: ");
            opcion = sc.next().toLowerCase().charAt(0);

            switch (opcion) {
                case 'a':
                    System.out.println("La clase A cobra 25€ la hora por lo tanto cobraras: " + (hora * 25) + "€");
                    break;
                case 'b':
                    System.out.println("La clase B cobra 20€ la hora por lo tanto cobraras: " + (hora * 20) + "€");
                    break;
                case 'c':
                    System.out.println("La clase C cobra 15€ la hora por lo tanto cobraras: " + (hora * 15) + "€");
                    break;
                case 'd':
                    System.out.println("La clase D cobra 10€ la hora por lo tanto cobraras: " + (hora * 10) + "€");
                    break;
                default:
                    System.out.println("Esa opcion no es correcta");
            }
            System.out.println("¿Quieres salir?(si/no)");
            menu= sc.next().toLowerCase().trim();

        } while(!menu.equals("si"));
    }
}
