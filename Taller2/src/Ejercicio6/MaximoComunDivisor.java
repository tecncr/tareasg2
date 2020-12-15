package Ejercicio6;
import javax.swing.JOptionPane;

public class MaximoComunDivisor {
    public static int ingresar_validar(String orden) {
	int numero_ingresado;
	do {
            numero_ingresado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el "+orden+" número: ", "Ingreso de datos", 3));
            if (numero_ingresado<1) {
		JOptionPane.showMessageDialog(null, "El número ingresado no es válido.\nPor favor ingrese un número mayor o igual a 1.", "Número inválido", 2);
            }
	} while (numero_ingresado<1);
	return numero_ingresado;
    }
    
    public static int calcular_mcd(int num1, int num2, int num3) {
       int mcd = 1;
       int min = Math.min(num1, Math.min(num2, num3)); //Calculando número más pequeño que será el límite del MCD
       for (int i=1; i<=min; i++){
           if (num1%i == 0 && num2%i == 0 && num3%i == 0){
               mcd = i;
           }
       }
       return mcd;
    }
    
    public static void main(String[] args) {
	int a, b, c;
	JOptionPane.showMessageDialog(null, "Este es un programa que calcula el Máximo Común Divisor de tres números.", "Bienvenido", 1);
	a = ingresar_validar("primer");
	b = ingresar_validar("segundo");
	c = ingresar_validar("tercer");
        
        JOptionPane.showMessageDialog(null, "El MCD de "+a+", "+b+" y "+c+" es: "+calcular_mcd(a, b, c), "Resultado de MCD", 1);
    }
}
