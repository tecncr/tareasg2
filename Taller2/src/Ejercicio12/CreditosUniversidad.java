package Ejercicio12;
import javax.swing.JOptionPane;

public class CreditosUniversidad {
    public static void main(String[] args) {
    	int creditos, total;
        String curso;
        
        creditos = 0;
	total = 0;

	JOptionPane.showMessageDialog(null, "Este es un programa que valida los creditos matriculados.", "Bienvenido", 1);

	do {
            curso = JOptionPane.showInputDialog(null, "Ingrese el nombre del curso en el que desea matricularse\no ingrese x para detener el ingreso de cursos:", "Ingreso de cursos", 3);
            if (!(curso.equals("x"))) {
                creditos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de créditos del curso:", "Ingreso de créditos", 3));
		if (total+creditos>22) {
                    JOptionPane.showMessageDialog(null, "No se pudo matricular en el curso " + curso + "\nporque al hacerlo excederia el máximo de creditos permitidos (22).", "Límite de créditos excedido", 2);
                } else {
                    total += creditos;
		}
            }
	} while (total<22 && !(curso.equals("x")));

	JOptionPane.showMessageDialog(null, "El total de los creditos matriculados es: " + total, "Créditos matriculados", 1);
    }
}