public class Ejercicio16 {
    public static void main(String[] args) {
        System.out.print("Introduce un número que sea positivo y entero porfavor: ");
        int numero = Integer.parseInt(System.console().readLine());
        int numero1 = numero + 1 ;
        int aux;
        for (int i = numero; i <100;i++){
            aux = numero;
            numero = numero1;
            numero1 = aux+numero1;

        System.out.print(" "+numero1);
        
        }
    }
}
