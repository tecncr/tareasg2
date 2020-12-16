package ejercicio1;
import javax.swing.JOptionPane;

public class MinimoMaximoMedia {
    
    public static void main(String[] args) {
        int conteo, maximo, minimo, num, suma;
	float media;
	
        JOptionPane.showMessageDialog(null, "Programa que halla el maximo, minimo y la media de N numeros dados", "Bienvenido", 1);
        
	num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero positivo: ", "Ingreso de datos", 1));

	suma = 0;
	conteo = 0;
	media = 0;
	maximo = 0;
	minimo = 99999;

	if (num>0) {
		while (num>0) {
			if (num>maximo) {
				maximo = num;
			}
			if (num<minimo) {
				minimo = num;
			}
			conteo = conteo+1;
			suma = suma+num;
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "(El ingreso de datos se detendrá cuando ingrese un número negativo)\nIngrese un numero positivo: ", "Siga ingresando datos", 1));
		}
		media = suma/conteo;
                String mensaje = "El mayor número es: "+maximo;
                mensaje += "\nEl menor número es: "+minimo;
                mensaje += "\nEl promedio de los números es: "+media;
		JOptionPane.showMessageDialog(null, mensaje, "Resultados", 1);
	} else {
		if (num<0) {
                    JOptionPane.showMessageDialog(null, "Solo se admiten números positivos", "Número negativo inválido", 0);
		}
	}

    }
}
