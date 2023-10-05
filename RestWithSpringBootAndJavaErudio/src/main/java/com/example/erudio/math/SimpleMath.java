package com.example.erudio.math;

public class SimpleMath {
	
	public Double sum( Double numberOne, Double numberTwo) {
		//Retorna a soma dos números após a conversão
		return numberOne + numberTwo;
		
	}

    public Double sub( Double numberOne, Double numberTwo) {
		//Retorna a subtrai dos números após a conversão
		return numberOne - numberTwo;
		
	}

    public Double multi( Double numberOne, Double numberTwo) {
		//Retorna a multiplica dos números após a conversão
		return numberOne * numberTwo;
		
	}

    public Double divi( Double numberOne, Double numberTwo) {
		//Retorna a divide dos números após a conversão
		return numberOne / numberTwo;
		
	}

    public Double media( Double numberOne, Double numberTwo) {
		//Retorna a divide dos números após a conversão
		return numberOne + numberTwo / 2;
	}
	
    public Double sqrt( Double number) {
	    // Cria um mapa para retornar os valores das raízes quadradas separadamente
	    return Math.sqrt(number);
	}
	
}
