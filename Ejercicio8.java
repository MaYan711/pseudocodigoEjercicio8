import java.util.*;

public class Ejercicio8 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		boolean sal = false;

		while (sal == false){
			System.out.println("Que desea hacer?");
			System.out.println("1. Generar un aleatorio");
			System.out.println("2. Salir");
			switch (sc.nextLine()){
				case "1":
					int num = (int)(Math.random() * 50) + 1;
					System.out.println(num + "es el numerp random");
					break;
				case "2":
					sal = true;
					break;
			}
		}
	}
}