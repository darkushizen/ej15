package Model;
import java.util.Scanner;
public class Edad {
	
	public static String validar() {
		String texto = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un n�mero");
		int edad = sc.nextInt();
		if(edad>=0&&edad<=4) {
			texto = "peque��n";
		}
		if(edad>=5&&edad<=10) {
			texto = "ni�o";
		}
		if(edad>=11&&edad<=40) {
			texto = "adolescente";
		}
		if(edad>=41&&edad<=80) {
			texto = "talludito";
		}
		sc.close();
		return texto;
	}

}
