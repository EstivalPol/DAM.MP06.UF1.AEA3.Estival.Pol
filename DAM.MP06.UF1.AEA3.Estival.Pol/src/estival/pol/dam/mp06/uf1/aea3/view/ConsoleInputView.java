package estival.pol.dam.mp06.uf1.aea3.view;

import java.util.Scanner;

public class ConsoleInputView {

	private Scanner sc = new Scanner(System.in);

	public String getString(String message) {
		System.out.print(message);
		return sc.nextLine();
	}
} 