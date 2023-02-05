import java.util.Scanner;

public class uri1042 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2, valor3, min1, min2 = 0, min3 = 0;
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		valor3 = sc.nextInt();
		min1 = Math.min(valor1, Math.min(valor2, valor3));
		
		if (min1 == valor1) {
			min2 = Math.min(valor2, valor3);
			min3 = Math.max(valor2, valor3);		
		}
		
		if (min1 == valor2) {
			min2 = Math.min(valor1, valor3);
			min3 = Math.max(valor1, valor3);		
		}
		

		if (min1 == valor3) {
			min2 = Math.min(valor1, valor2);
			min3 = Math.max(valor1, valor2);		
		}
		
		System.out.println(min1);
		System.out.println(min2);
		System.out.println(min3);
		System.out.println("");
		System.out.println(valor1);
		System.out.println(valor2);
		System.out.println(valor3);
						
		sc.close();

	}

}
