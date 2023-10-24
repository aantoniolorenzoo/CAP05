import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número que desee para obtener su tabla de multiplicar: ");
        int a = Integer.parseInt(System.console().readLine());
        for (int i = 1; i <=10;i+=1){
            int resultado = a * i;
                System.out.println(resultado);
        }
    sc.close();
    }
}
