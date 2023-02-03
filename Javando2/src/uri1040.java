import java.util.Locale;
import java.util.Scanner;

public class uri1040 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float N1, N2, N3, N4, media, N5, mediaFinal;
		
		N1 = sc.nextFloat();
		N2 = sc.nextFloat();
		N3 = sc.nextFloat();
		N4 = sc.nextFloat();
		
		media = (N1 * 2f + N2 * 3f + N3 * 4f + N4 * 1f) / 10f;
		
		
		if (media >= 7.0) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno aprovado.");
		}
		
		else if (media < 5.0) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno reprovado.");
		}
		
		else {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno em exame.");
			N5 = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f%n", N5);
			mediaFinal = (N5 + media) / 2;
			
			if (mediaFinal >= 5.0) {
				System.out.println("Aluno aprovado.");
				System.out.printf("Media final: %.1f%n", mediaFinal);
			}
			else if (mediaFinal <= 4.9) {
				System.out.println("Aluno reprovado.");
				System.out.printf("Media final: %.1f%n", mediaFinal);
				
			}
			
		}
		
		sc.close();
	}

}
