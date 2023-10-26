public class Ejercicio20 {
    
    public static void piramide(int altura, String caracter){
        for (int i=1;i<=altura;i++){
            for (int j=1;j<=(altura-i);j++){
                System.out.print(" ");
            }
            System.out.print(caracter);
            if(i>1){
                for(int j=1;j<=(2*i-3);j++){
                    if(i!=altura)
                        System.out.print(" ");
                    else
                        System.out.print(caracter);
                }
                System.out.print(caracter);
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la pirámide: ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el caracter con el que desea que se pinte: ");
        String caracter = ""+System.console().readLine().charAt(0);
        piramide(altura, caracter);
    }
}
        