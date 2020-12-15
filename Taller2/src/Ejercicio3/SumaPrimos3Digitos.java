package Ejercicio3;
import javax.swing.JOptionPane;

public class SumaPrimos3Digitos {
    public static void main(String[] args) {
    
        int a, b, num_div_prop, np_linea;
        np_linea = 0;

        JOptionPane.showMessageDialog(null, "Este es un programa que calcula todos los numeros primos de 3 digitos.", "Bienvenido", 1);

        String respuesta = "Los números primos de 3 dígitos son: \n";
        
        for (a=100; a<=999; a++) {
            num_div_prop = 0;
            for (b=1; b<=Math.floor(a/2)+1; b++) {
            // Trabajando con divisores propios para reducir consumo de recursos
                if (a%b==0) {
                    num_div_prop+=1;
                }
            }

            if (num_div_prop==1) {
                respuesta += (a + ", ");
                // Insertando salto de linea cada 12 numeros
                // para una correcta visualizacion
		np_linea += 1;
		if (np_linea==12) {
                    respuesta += "\n";
                    np_linea = 0;
		}
            }
        }
        respuesta += "fin.";
        JOptionPane.showMessageDialog(null, respuesta, "Resultados", 1);
    }
}