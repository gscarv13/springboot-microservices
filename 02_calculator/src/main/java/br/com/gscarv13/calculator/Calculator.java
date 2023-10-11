package br.com.gscarv13.calculator;

import br.com.gscarv13.converters.NumberConverter;

public class Calculator {
	public Double sum(String numberOne, String numberTwo ) {
		return NumberConverter.convertToDouble(numberOne) + NumberConverter.convertToDouble(numberTwo);
	}

	public Double sub(String numberOne, String numberTwo ) {
		return NumberConverter.convertToDouble(numberOne) - NumberConverter.convertToDouble(numberTwo);
	}
	
	public Double multi(String numberOne, String numberTwo ) {
		return NumberConverter.convertToDouble(numberOne) * NumberConverter.convertToDouble(numberTwo);
	}
	
	public Double div(String numberOne, String numberTwo ) {
		return NumberConverter.convertToDouble(numberOne) / NumberConverter.convertToDouble(numberTwo);
	}
	
	public Double mid(String numberOne, String numberTwo ) {
		return (NumberConverter.convertToDouble(numberOne) + NumberConverter.convertToDouble(numberTwo)) / 2;
	}
	
	public Double sqrt (String numberOne) {
		return (Math.sqrt(NumberConverter.convertToDouble(numberOne)));
	}
}
