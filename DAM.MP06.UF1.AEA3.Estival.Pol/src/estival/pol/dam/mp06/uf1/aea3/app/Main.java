package estival.pol.dam.mp06.uf1.aea3.app;

import estival.pol.dam.mp06.uf1.aea3.controller.CotxeController;

public class Main {
	public static void main(String[] args) {

		CotxeController iniciApp = new CotxeController();

		iniciApp.carSerializatio();
		iniciApp.carDeserializatio();

	}
}