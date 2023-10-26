public class Ejercicio13 {
    public static void main(String[] args) {
            System.out.print("Introduce un número: ");
            int positivos= 0;
            int negativos =0;
        for (int i=1;i<10;i++){
            int valor = 0;
            boolean correcto = false;
            while(!correcto){
                try{
                    valor = Integer.parseInt(System.console().readLine());
                    correcto = true;

                } catch(Exception e){
                    System.out.println("No le he entendido.");
                }
            }
            /*ternario */
            negativos += (valor<0)?1:0;
            positivos += (valor>0)?1:0;
            
            
        }
        System.out.printf("Ha introducido %d positivos y %d negativos:",positivos,negativos);
    }
    
}
