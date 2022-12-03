package estival.pol.dam.mp06.uf1.aea3.controller;

import estival.pol.dam.mp06.uf1.aea3.model.domain.Cotxe;
import estival.pol.dam.mp06.uf1.aea3.model.service.CotxeService;
import estival.pol.dam.mp06.uf1.aea3.view.FormulariCotxeView;
import estival.pol.dam.mp06.uf1.aea3.view.ConsoleOutputView;

public class CotxeController {

	private CotxeService cotxeService = new CotxeService();
	private ConsoleOutputView consoleOutputView = new ConsoleOutputView();

	public void carSerializatio() {
		FormulariCotxeView cotxeView = new FormulariCotxeView();
		try {
			Cotxe cotxe = cotxeView.getCotxe();
			cotxeService.serializatio(cotxe);
			consoleOutputView.show("\nObjecte (Cotxe) serialitzat correctament.\n", false);
		} catch (Exception e) {
			consoleOutputView.show(e.getMessage(), true);
		}
	}

	public void carDeserializatio() {
		try {
			Cotxe cotxe = cotxeService.deserializatio();
			consoleOutputView.show(cotxe.toString(), false);
		} catch (Exception e) {
			consoleOutputView.show(e.getMessage(), true);
		}
	} 
} 