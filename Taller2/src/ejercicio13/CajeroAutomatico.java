package ejercicio13;
import javax.swing.JOptionPane;

public class CajeroAutomatico {
    
   public static boolean confirmar(String pregunta){
        boolean confirmado = false;
        int resultado = JOptionPane.showConfirmDialog(null, pregunta, "Confirmación", JOptionPane.YES_NO_OPTION);
        if (resultado == JOptionPane.YES_OPTION){
            confirmado = true;
        } else if (resultado == JOptionPane.NO_OPTION){
            confirmado = false;
        }
        return confirmado;
    }
   
   public static boolean otraOperacion(){
       boolean otraop = confirmar("¿Desea realizar otra operación?");
       return otraop;
   }
        
   public static int menu(){
       int opcion;
        String mensaje_menu = "Bienvenido a su Cajero Automático\n" +
                       "Seleccione una opción del menú:\n" +
                       "1. Retirar\n" + "2. Ver saldo\n" + "3. Depositar\n" + "4. Salir\n" +
                       "Ingrese el número de la opción seleccionada:";
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje_menu, "Menú principal", 1));
            if (opcion!=1 && opcion!=2 && opcion!=3 && opcion!=4){
                JOptionPane.showMessageDialog(null, "La opción ingresada es inválida.\nInténtelo nuevamente.", "Opción inválida", 2);
            }
        } while (opcion!=1 && opcion!=2 && opcion!=3 && opcion!=4);
        return opcion;
   }
   
    public static void main(String[] args) {
	float saldo = 2000f;
        boolean mantenerSesion = true;
        int opcionMenu;
        do{
            opcionMenu = menu();
            switch(opcionMenu){
                case 1 -> {
                    float montoRetiro = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el monto del retiro:", "Retiro",3));
                    if (montoRetiro <= saldo){
                        boolean confirmacion = confirmar("¿Desea realizar un retiro de S/ "+montoRetiro+"?\nSu nuevo saldo será: S/ "+ (saldo-montoRetiro));
                        if (confirmacion){
                            saldo -= montoRetiro;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No cuenta con saldo suficiente para realizar esta operación", "Saldo insuficiente", 0);                       
                    }
                    mantenerSesion = otraOperacion();
                }
                case 2 -> {
                    JOptionPane.showMessageDialog(null, "Su saldo actual es: S/ "+saldo, "Saldo", 1);
                    mantenerSesion = otraOperacion();
                }
                case 3 -> {
                    float montoDeposito = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el monto del depósito:", "Depósito",3));
                    boolean confirmacion = confirmar("¿Desea realizar un depósito de S/ "+montoDeposito+"?\nSu nuevo saldo será: S/ "+ (saldo+montoDeposito));
                    if (confirmacion){
                        saldo += montoDeposito;
                    }
                    mantenerSesion = otraOperacion();
                }
                case 4 -> mantenerSesion = false;
            }
        } while (mantenerSesion == true);
        JOptionPane.showMessageDialog(null, "Gracias por usar su cajero automático.\nHasta luego.", "Fin de la sesión",1);
    }
}
