import java.util.Scanner;

public class PrecioFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iva=0, promocion=0;
        String opcion="";

        System.out.println("=== CALCULADORA DE PRECIOS ===");
        System.out.println("");


        do {
            System.out.print("Introduzca la base imponible: ");
            int baseImponible = sc.nextInt();

            System.out.println("Eliga tipo de IVA");
            System.out.println("General");
            System.out.println("Reducido");
            System.out.println("Superreducido");
            System.out.print("Opción: ");
            String tipoiva = sc.next().toLowerCase();

            //Menús tipo de IVA
            switch (tipoiva) {
                case "general":
                    iva = 21;
                    break;
                case "reducido":
                    iva = 10;
                    break;
                case "superreducido":
                    iva = 4;
                    break;
                default:
                    System.out.println("No es un tipo de IVA");
            }

            double ivaproducto = (double) (iva * baseImponible) / 100;
            double precioiva = baseImponible + ivaproducto;

            System.out.println("Elige el código promocional: ");
            System.out.println("- nopro");
            System.out.println("- mitad");
            System.out.println("- meno5");
            System.out.println("- 5porc");
            System.out.print("Código promocional: ");
            String codpromocional = sc.next().toLowerCase();

            //Menús codigo promocional
            double precioCodigo = 0;
            switch (codpromocional) {
                case "nopro":
                    break;
                case "mitad":
                    promocion = 50;
                    precioCodigo = (precioiva * promocion) / 100;
                    break;
                case "meno5":
                    promocion = -5;
                    precioCodigo = precioiva + promocion;
                    break;
                case "5porc":
                    promocion = 5;
                    precioCodigo = (precioiva * promocion) / 100;
                    break;
                default:
                    System.out.println("Código promocional no valido");

            }
            double preciofinal = precioiva - precioCodigo;


            System.out.println("Base imponible: " + baseImponible + "€");
            System.out.println("IVA(" + iva + "%): " + ivaproducto + "€");
            System.out.println("Precio con IVA: " + precioiva + "€");
            System.out.println("Cód. promo. (" + codpromocional + "): -" + precioCodigo + "€");
            System.out.printf("TOTAL: " + preciofinal + "€");
            System.out.println("");

            System.out.println("¿Quieres continuar? (si/no)");
            opcion= sc.next().toLowerCase().trim();

        } while(!opcion.equals("no"));

    }
}
