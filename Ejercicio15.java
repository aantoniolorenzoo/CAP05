public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        int num = Integer.parseInt(System.console().readLine());
        boolean esPrimo = true;
        if(num < 2){
            System.out.print("Un número menor que 2 no puede ser primo, introduzca otro número.");
        }
        else{
            for(int i=2;i<num;i++){
            if ((num % i)==0){
            esPrimo = false;
                }
            }
            if (esPrimo){
            System.out.print("El número introducido es primo. ");
            }else{
            System.out.print("El número introducido no es primo;");
            }
        }
    }
}
