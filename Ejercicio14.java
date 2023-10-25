public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.print("Introduce la base de un número: ");
        int base = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce un exponente: ");
        int exponente = Integer.parseInt(System.console().readLine());
        double potencia = 1;
        if (exponente == 0 ){
            System.out.print("Todo numero elevado a 0 es = a 1");
        }
        if (exponente != 0){ 
            for (int i = 0; i<exponente;i++){
            potencia*=base;
            }
        }
        System.out.println(base +"^" + exponente+ "="+potencia);
        

    }
}
