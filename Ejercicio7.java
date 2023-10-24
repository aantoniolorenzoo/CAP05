import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de 4 cifras para poder acceder a la caja fuerte: ");
        int combinacion = sc.nextInt();
        
        for (int i = 4; i >= 0; i--) {
            if (combinacion == 1234) { 
                System.out.print("La caja se ha abierto satisfactoriamente");
                break; 
            } else {
                System.out.println("Lo siento, esa no es la combinación");
                if (i > 0) {
                    System.out.println("Te queda " + i + " oportunidades");
                    System.out.println("Introduzca la combinación de nuevo: ");
                    combinacion = sc.nextInt(); 
                } else {
                    System.out.println("Se han agotado las oportunidades. La caja fuerte se bloquea.");
                }
            }
        }
        sc.close();
    }
}

