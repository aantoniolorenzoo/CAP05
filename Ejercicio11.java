public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        int a = Integer.parseInt(System.console().readLine());
        for (int i=a; i<a+5 ;i++){
            System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
            
        }
    }
}