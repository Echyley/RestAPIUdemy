package com.example.erudio.converters;

public class NumberConverter {
    public static Double convertToDouble(String strNumber) {
		if (strNumber == null)
			return 0D;
		// Substitui vírgulas por pontos para tratar números decimais em formato interna
		String number = strNumber.replaceAll(",", ".");
		// Verifica se a string após a substituição é numérica e a converte em Double
		if (isNumeric(number))
			return Double.parseDouble(number);
		return 0D;
	}

	public static boolean isNumeric(String strNumber) {
		if (strNumber == null)
			return false;
		// Substitui vírgulas por pontos para tratar números decimais em formato internacional
		String number = strNumber.replaceAll(",", ".");
		// Verifica se a string corresponde a um número válido por meio de uma expressão regular
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
