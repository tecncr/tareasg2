package Ejercicio17;
import javax.swing.JOptionPane;

public class NumerosAmigos {

    public static int sumadivpropios(int num){
        int suma = 0;
        for (int a = 1; a <= Math.floor(num/2)+1; a++){
            if (num%a == 0){
                suma += a;
            }
        }
        return suma;
    }

    public static void main(String args[]){
        int n, div_i, div_j;
        JOptionPane.showMessageDialog(null, "Este es un programa que calcula numeros amigos hasta N", "Bienvenido", 1);
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "A continuación se le solicitará ingresar el valor de N.\nTenga en cuenta que mientras más grande sea mayor será el cálculo computacional\ny por ende esta operación podría tardar unos minutos y consumir recursos.\nIngrese el valor de N:", "Ingreso del valor de N", 3));
        String mensaje = "";
                
        for (int i=1; i<n; i++){
            div_i = sumadivpropios(i);
            for (int j=1; j<n; j++){
                div_j = sumadivpropios(j);
                if (div_i==j && div_j==i && i!=j && i<j){
                    mensaje += (i + " y " + j + " son amigos.\n");
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, mensaje, "Resultado de la operación", 1);
    }
}
