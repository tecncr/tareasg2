package ejercicio18;
import javax.swing.JOptionPane;

public class Capicuas {
    
    public static int ingresar_validar_positivo(String var_name) {
            int num;
            do {
                num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de "+var_name+":", "Ingreso de datos", 3));
                if (num<0) {
                    JOptionPane.showMessageDialog(null, "El valor de "+var_name+" no puede ser negativo.\nInténtelo nuevamente.", "Dato inválido", 0);
                }
            } while (num<0);
            return num;
    }
    
    public static int obtener_inverso(int num) {
            int a, inverso, res;
            a = num;
            inverso = 0;
            while (a>0) {
                    res = a%10;
                    inverso = inverso*10+res;
                    a = (int)(a/10);
            }
            return inverso;
        }
    
    public static void main(String[] args) {
        int a, b, n, np_linea = 0;
        JOptionPane.showMessageDialog(null, "Este programa muestra los numeros capicúas entre a y b.", "Bienvenido", 1);
        a = ingresar_validar_positivo("a");
        b = ingresar_validar_positivo("b");
        String mensaje = "Los numeros capicúas entre " + a + " y " + b + " son:\n";
        for (n=a; n<=b; n++) {
            if (n==obtener_inverso(n)) {
                mensaje += (n + ", ");
                // Insertando salto de linea cada 8 numeros
                // para una correcta visualizacion
                np_linea = np_linea+1;
                if (np_linea==8) {
                    mensaje += "\n";
                    np_linea = 0;
                }
            }
        }
        mensaje += "fin.";
        JOptionPane.showMessageDialog(null, mensaje, "Resultado", 1);
       
    }
}
