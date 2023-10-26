public class piramideInvertida {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la pirámide: ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el caracter, con el que desees crear la pirámide: ");
        String caracter =""+System.console().readLine().charAt(0);
        for (int i=altura;i>=1;i--){
            for(int j=1;j<=(2*altura-i-1);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}
