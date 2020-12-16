package ejercicio9;
import javax.swing.JOptionPane;

public class DivisoresDeNumeroTresmil{
    public static void main(String[] args) {
        int numero = 0;
        String mensaje = "Los divisores de ";
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entre 0 y 3000", "Cálculo de divisores", 1));
            if (numero > 3000 || numero < 0){
                JOptionPane.showMessageDialog(null, "El número ingresado está fuera de rango", "Número inválido", 2);
            }
        } while (numero > 3000 || numero < 0);
        mensaje += numero + " son:\n";
            for(int i = 1 ; i <=numero ; i++){
                if(numero%i==0){
                    mensaje += i + "\n";
                }
            }
        JOptionPane.showMessageDialog(null, mensaje, "Resultado de la operación", 1);
    }
    
}
