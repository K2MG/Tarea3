import java.util.Scanner;
public class Tarea3 {

	public static void main(String[] args) {
		int a=0;
		System.out.println("Ingrese un n�mero:");
		Scanner S = new Scanner(System.in);
		a=S.nextInt();
		if (a%2==0){
			System.out.println("El n�mero es par.");
		}else{
			System.out.print("El n�mero es impar.");
		}
		
	}

}
