package ejercicio20;
import javax.swing.JOptionPane;

public class BinarioADecimal {
    
    public static int ingresar_validar_positivo(){
    int num;
	do {
		num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero binario que desee convertir: ", "Ingreso de datos",1));
		if (num<0) {
		     JOptionPane.showMessageDialog(null, "El numero ingresado no puede ser negativo \nIntentelo nuevamente.", "Lea bien los daros", 0);
		}
	} while (num<0);
    
    return num;
    }
    
    public static int ingresar_validar_bin(){
	int binario, in, tmp, u_cifra;
	in = ingresar_validar_positivo();
	tmp = in;
	while (tmp>0) {
		// Verificacion de digitos binarios
		u_cifra = tmp%10;
		tmp = tmp/10;
		if (u_cifra>1) {
			JOptionPane.showMessageDialog(null, "El numero ingresado contiene digitos no binarios \nIntentelo nuevamente", "Error en los datos ingresados", 0);
			in = ingresar_validar_positivo();
			tmp = in;
		}
	}
	binario = in;
	return binario;
}
    
    public static void main(String[] args) {
        int bin, dec, tmp, u, x;
	bin = ingresar_validar_bin();
	tmp = bin;
	x = 1;
	dec = 0;
	// Conversion de binario a decimal mediante "divisiones sucesivas inversas"
	while (bin>0) {
		u = bin%10;
		bin = bin/10;
		dec = dec+(u*x);
		x = 2*x;
	}
	JOptionPane.showMessageDialog(null, "El numero binario "+tmp+" convertido a decimal es: "+dec, "Resultado", 1);
    }
}
