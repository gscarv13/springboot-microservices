package br.com.gscarv13.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.gscarv13.exception.UnsupportedMathOperationException;
import br.com.gscarv13.converters.NumberConverter;
import br.com.gscarv13.calculator.Calculator;

@RestController
public class MathController {
	
	private Calculator calc = new Calculator();
	
	@RequestMapping(value="sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(
			@PathVariable("numberOne") String numberOne,
			@PathVariable("numberTwo") String numberTwo
			) throws Exception {
		
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			 throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return calc.sum(numberOne, numberTwo);
	}
	
	@RequestMapping(value="sub/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sub(
			@PathVariable("numberOne") String numberOne,
			@PathVariable("numberTwo") String numberTwo 
			) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			 throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		
		return calc.sub(numberOne, numberTwo);
	}
	
	@RequestMapping(value="multi/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double multi(
			@PathVariable("numberOne") String numberOne,
			@PathVariable("numberTwo") String numberTwo
			) throws Exception {
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		
		return calc.multi(numberOne, numberTwo);
	}
	
	@RequestMapping(value="div/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double div(
			@PathVariable("numberOne") String numberOne,
			@PathVariable("numberTwo") String numberTwo
			) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		if(NumberConverter.convertToDouble(numberTwo) == 0) {
			throw new UnsupportedMathOperationException("Division by zero is not allowed");
		}
		
		
		return calc.div(numberOne, numberTwo);
	}
	
	@RequestMapping(value="mid/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double mid(
			@PathVariable("numberOne") String numberOne,
			@PathVariable("numberTwo") String numberTwo
			) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		

		
		return calc.mid(numberOne, numberTwo);
	}
	
	@RequestMapping(value="sqrt/{numberOne}", method=RequestMethod.GET)
	public Double sqrt(
			@PathVariable("numberOne") String numberOne
			) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}

		
		return calc.sqrt(numberOne);
	}
	
}
	