package ejercicio2;
import javax.swing.JOptionPane;

public class SumaDeNumerosImpares {
    public static void main(String[] args) {
        int i, n, sumaimp;
        JOptionPane.showMessageDialog(null,"Sumemos numero impares", "Bienvenido", 1 );
        n = Integer.parseInt(JOptionPane.showInputDialog (null, "¿Hasta que numero quiere que llegue la suma?","Inserte numero" , 3));
	sumaimp = 0;
	while (n<0) {
                JOptionPane.showMessageDialog(null,"No puede ser numero negativo", "Positivo", 2 );
                JOptionPane.showMessageDialog(null,"Por favor ingrese un numero positivo", "Positivo", 1 );
		n = Integer.parseInt(JOptionPane.showInputDialog (null, "¿Hasta que numero quiere que llegue la suma?","Inserte numero" , 3));
	}
	for (i=1;i<=n;i++) {
		if (i%2>0) {
			sumaimp = sumaimp+i;
		}
	}
        
	String mensaje = "La suma es: "+sumaimp;
                 JOptionPane.showMessageDialog(null, mensaje, "Resultado", 1);
    }
}
