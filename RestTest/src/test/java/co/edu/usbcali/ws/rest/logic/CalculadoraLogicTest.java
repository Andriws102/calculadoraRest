package co.edu.usbcali.ws.rest.logic;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class CalculadoraLogicTest {
	
	private CalculadoraLogica calculadora = new CalculadoraLogica();
	
	@Test
	public void sumarTest(){
		int nuNum1 = 1;
		int nuNum2 = 5;
		
		int nuRes = calculadora.suma(nuNum1, nuNum2);
		
		assertTrue(nuRes == 6);
	}
	
	@Test
	public void restarTest(){
		int nuNum1 = 10;
		int nuNum2 = 5;
		
		int nuRes = calculadora.resta(nuNum1, nuNum2);
		
		assertTrue(nuRes == 5);
	}
	
	@Test
	public void multiplicarTest(){
		int nuNum1 = 2;
		int nuNum2 = 5;
		
		int nuRes = calculadora.multiplicacion(nuNum1, nuNum2);
		
		assertTrue(nuRes == 10);
	}
	
	@Test
	public void dividirTest(){
		int nuNum1 = 4;
		int nuNum2 = 2;
		
		int nuRes = calculadora.division(nuNum1, nuNum2);
		
		assertTrue(nuRes == 2);
	}
}
