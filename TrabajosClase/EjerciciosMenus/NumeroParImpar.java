import java.util.Scanner;

public class NumeroParImpar {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String opcion="";

        System.out.println("=== NÚMERO PAR o IMPAR ===");
        System.out.println();

        do {
            System.out.print("Introduce numero: ");
            int numero = sc.nextInt();

            String resultado = (numero % 2 == 0) ? "El numero " + numero + " es par" : "El numero " + numero + " es impar";
            //Creo que no has explicado aun los operadores ternarios, me he adelantado un poquito para hacerle mas sencillo

            System.out.println(resultado);

            System.out.println("¿Quieres continuar? (si/no)");
            opcion=sc.next().toLowerCase().trim();

        } while (!opcion.equals("no"));
    }
}
