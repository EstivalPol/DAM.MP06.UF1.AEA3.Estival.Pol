package estival.pol.dam.mp06.uf1.aea3.view;

import estival.pol.dam.mp06.uf1.aea3.model.domain.Cotxe;

public class FormulariCotxeView {

	public Cotxe getCotxe() {
		ConsoleInputView consoleInputView = new ConsoleInputView();

		String numberPlate = consoleInputView.getString("- Introdueix la matrícula: ");
		String carBrand = consoleInputView.getString("- Introdueix la marca: ");
		String carModel = consoleInputView.getString("- Introdueix el model: ");
		String chasisNumber = consoleInputView.getString("- Introdueix el número del xassís: ");

		return new Cotxe(numberPlate, carBrand, carModel, chasisNumber);
	}
}