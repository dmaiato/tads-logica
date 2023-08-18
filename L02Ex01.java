import java.util.Scanner;

public class L02Ex01 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		float metros = in.nextFloat();

		float conversao;
		conversao = metros*100;

		System.out.println(conversao);

	}
}