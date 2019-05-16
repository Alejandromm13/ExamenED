package ExamenED.UD5_UD6;

public class DNI {

	private Object dni;

	public boolean validar() {

		String letraMayuscula = "";
		String dni = null;

		if (dni.length() != 9 || Character.isLetter(((String) this.dni).charAt(8)) == false) {
			return false;
		}

		letraMayuscula = (((String) this.dni).substring(8)).toUpperCase();

		if (soloNumeros() == true && letraDNI().equals(letraMayuscula)) {
			return true;
		} else {
			return false;
		}

	}

	private boolean soloNumeros() {
		int i, j = 0;
		String numero = "";
		String miDNI = "";
		String[] unoNueve = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

		for (i = 0; j < ((String) this.dni).length() - 1; i++) {
			numero = ((String) this.dni).substring(i, i + 1);

			for (j = 0; j < unoNueve.length; j++) {
				if (numero.equals(unoNueve[j])) {
					miDNI += unoNueve[j];
				}
			}
		}

		if (miDNI.length() != 8) {
			return false;
		} else {
			return true;
		}
	}

	private String letraDNI() {
		int miDNI = Integer.parseInt(((String) this.dni).substring(0, 8));
		int resto = 0;
		String miLetra = "";
		String[] asignacionLetra = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S",
				"Q", "V", "H", "L", "C", "K", "E" };

		resto = miDNI % 23;
		miLetra = asignacionLetra[resto];

		return miLetra;
	}
}
