package ejercicio16;
import javax.swing.JOptionPane;

public class NumeroAmstrong {
    public static void main(String[] args) {
	int cont;
        double suma, numero, cifra;
        JOptionPane.showMessageDialog(null, "Encontremos los numeros de Amstrong", "Bienvenido", 1);
         String respuesta = "Los números Amstron son \n";
	for (cont=1;cont<=9999;cont++) {
		numero= cont;
		suma= 0;
		while (numero!=0) {
			cifra = numero%10;
			suma = suma+(Math.pow(cifra,3));
			numero= (numero-cifra)/10;
		}
		if (suma==cont) {
                    String mensaje = "El numero: "+ cont + " es un numero de Amstrong";
                    JOptionPane.showMessageDialog(null, mensaje, "Resultado", 1);
		}
	}
        
        
    }
}
