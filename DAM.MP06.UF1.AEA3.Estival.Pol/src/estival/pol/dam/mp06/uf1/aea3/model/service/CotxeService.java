package estival.pol.dam.mp06.uf1.aea3.model.service;

import estival.pol.dam.mp06.uf1.aea3.model.configuration.Settings;
import estival.pol.dam.mp06.uf1.aea3.model.domain.Cotxe;
import estival.pol.dam.mp06.uf1.aea3.model.repository.FitxersTextRepository;

public class CotxeService {

	private FitxersTextRepository binarySerialization = new FitxersTextRepository();

	public void serializatio(Cotxe car) {
		Cotxe.validateCar(car);
		binarySerialization.objectSerializatio(car, Settings.CARS_FILE);
	}

	public Cotxe deserializatio() {
		return (Cotxe) binarySerialization.objectDeserializatio(Settings.CARS_FILE);
	}
}