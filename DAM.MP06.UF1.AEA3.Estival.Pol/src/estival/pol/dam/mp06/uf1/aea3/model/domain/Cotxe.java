package estival.pol.dam.mp06.uf1.aea3.model.domain;

import java.io.Serializable;

public class Cotxe implements Serializable {

	private String numberPlate;
	private String carBrand;
	private String carModel;
	private String chasisNumber;

	public Cotxe(String numberPlate, String carBrand,
		String carModel, String chasisNumber) {
		this.numberPlate = numberPlate;
		this.carBrand = carBrand;
		this.carModel = carModel;
		this.chasisNumber = chasisNumber;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}

	public String getNumberPlate() {
		return numberPlate;
	}
	
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	
	public String getCarBrand() {
		return carBrand;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setChasisNumber(String chasisNumber) {
		this.chasisNumber = chasisNumber;
	}

	public String getChasisNumber() {
		return chasisNumber;
	}

	@Override
	public String toString() {
		return String.format("Cotxe:\n- Matrícula: %s\n- Marca: %s\n- Model: %s\n- Número xassís: %s",
			numberPlate, carBrand, carModel, chasisNumber);
	}

	public static void validateCar(Cotxe car) {

		if (car == null) {
			throw new RuntimeException("El objecte (Cotxe) no ha inicialitzat.");
		}

		String[] propietats = new String[4],
			nomPropietats = {"Matrícula", "Marca", "Model", "Número xassís"};

		propietats[0] = car.getNumberPlate();
		propietats[1] = car.getCarBrand();
		propietats[2] = car.getCarModel();
		propietats[3] = car.getChasisNumber();

		for (int i = 0; i < propietats.length; i++) {
			if (propietats[i] == null || propietats[i].equals("")) {
				throw new RuntimeException("La propietat: " + nomPropietats[i] + "no és vàlida.");
			}
		}

	}
}