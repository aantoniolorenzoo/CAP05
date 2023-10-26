import javax.swing.JOptionPane;

public class Ejercicio89 {
    public static void main(String[] args) {
        String clave="Juan";
        String pass="";

        while(clave.equals(pass)==false){
            
            pass=JOptionPane.showInputDialog("Introduzca la contraseña para acceder, porfavor");
            if (clave.equals(pass)==false){
                System.out.println("Contraseña incorrecta");
            }
        }
        System.out.println("Contraseña correcta. Acceso permitido");
    
}
}
