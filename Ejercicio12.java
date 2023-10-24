public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.print("Introduce un número para calcular la succesion Fibonacci: ");
        int n = Integer.parseInt(System.console().readLine());
        System.out.print("0 1");
        long n1 = 0;
        long n2 = 1;
        long aux;
        for (int i = 0; i<n; i++){
            aux = n1;
            n1 = n2;
            n2 = aux + n2;
            System.out.printf(" ",n2);
            i--;
        }
        
        System.out.println();
    }
}
