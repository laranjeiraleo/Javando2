import java.util.Scanner;

public class uri1044 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, resultado;
		
		A = sc.nextInt();
		B= sc.nextInt();
		resultado = B % A;
		
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		}
		
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		
		sc.close();
	
	}

}
