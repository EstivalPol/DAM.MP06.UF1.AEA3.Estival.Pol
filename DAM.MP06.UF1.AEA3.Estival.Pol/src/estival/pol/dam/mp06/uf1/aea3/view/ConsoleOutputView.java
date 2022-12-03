package estival.pol.dam.mp06.uf1.aea3.view;

public class ConsoleOutputView {

	public void show(String message, boolean isError) {
		if (isError) {
			System.err.println(message);
		} else {
			System.out.println(message);
		}
	}
}