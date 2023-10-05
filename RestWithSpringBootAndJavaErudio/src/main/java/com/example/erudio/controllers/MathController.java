package com.example.erudio.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.erudio.converters.NumberConverter;
import com.example.erudio.exceptions.UnsupportedMathOperationException;
import com.example.erudio.math.SimpleMath;

@RestController
public class MathController {

	private SimpleMath math = new SimpleMath();

	// Mapeia a URL para o método quando uma solicitação GET é feita
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		// Verifica se numberOne e numberTwo são númericos, se não forem, lança uma exceção
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value as a variable");
		}
		//Retorna a soma dos números após a conversão
		return math.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sub(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		// Verifica se numberOne e numberTwo são númericos, se não forem, lança uma
		// exceção
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value as a variable");
		}
		//Retorna a subtração dos números após a conversão
		return math.sub(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/divi/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double divi(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		// Verifica se numberOne e numberTwo são númericos, se não forem, lança uma exceção
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value as a variable");
		}
		//Retorna a divisão dos números após a conversão
		return math.divi(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/multi/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double multi(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		// Verifica se numberOne e numberTwo são númericos, se não forem, lança uma exceção
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value as a variable");
		}
		//Retorna a multiplicação dos números após a conversão
		return math.multi(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/media/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double media(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		// Verifica se numberOne e numberTwo são númericos, se não forem, lança uma exceção
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value as a variable");
		}
		//Retorna a soma dos números e os divide para se obter a media após a conversão
		return math.media(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/sqrt/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sqrt(@PathVariable(value = "numberOne") String numbe,
			@PathVariable(value = "numberTwo") String number) throws Exception {
		// Verifica se numberOne e numberTwo são númericos, se não forem, lança uma exceção
		if (!NumberConverter.isNumeric(number)) {
			throw new UnsupportedMathOperationException("Please set a numeric value as a variable");
		}
		//Retorna a raiz quadrada dos números e os divide para se obter a media após a conversão
		return math.sqrt(NumberConverter.convertToDouble(number));
	}

}
