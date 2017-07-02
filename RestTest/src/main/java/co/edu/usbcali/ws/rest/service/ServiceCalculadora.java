package co.edu.usbcali.ws.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.edu.usbcali.ws.rest.logic.CalculadoraLogica;
import co.edu.usbcali.ws.rest.vo.VOCalculadora;

@Path("/Calculadora")
public class ServiceCalculadora {
	
	private CalculadoraLogica calculadoraLogica = new CalculadoraLogica();
	
	@POST
	@Path("/sumar")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public VOCalculadora sumaNumeros(VOCalculadora vo){
		
		vo.setSbProcesado("No se procesó");
		
		int nuNum1 = vo.getNuNumero1();
		int nuNum2 = vo.getNuNumero2();
		int nuResultado;
		
		nuResultado = calculadoraLogica.suma(nuNum1, nuNum2);
		vo.setSbProcesado("Ok");
		
		vo.setNuResultado(nuResultado);
		
		return vo;
		
	}
	
	@POST
	@Path("/restar")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public VOCalculadora restaNumeros(VOCalculadora vo){
		
		vo.setSbProcesado("No se procesó");
		
		int nuNum1 = vo.getNuNumero1();
		int nuNum2 = vo.getNuNumero2();
		int nuResultado;
		
		nuResultado = calculadoraLogica.resta(nuNum1, nuNum2);
		vo.setSbProcesado("Ok");
		
		vo.setNuResultado(nuResultado);
		
		return vo;
		
	}
	
	@POST
	@Path("/multiplicar")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public VOCalculadora multiplicaNumeros(VOCalculadora vo){
		
		vo.setSbProcesado("No se procesó");
		
		int nuNum1 = vo.getNuNumero1();
		int nuNum2 = vo.getNuNumero2();
		int nuResultado;
		
		nuResultado = calculadoraLogica.multiplicacion(nuNum1, nuNum2);
		vo.setSbProcesado("Ok");
		
		vo.setNuResultado(nuResultado);
		
		return vo;
		
	}
	
	@POST
	@Path("/dividir")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public VOCalculadora divideNumeros(VOCalculadora vo){
		
		vo.setSbProcesado("No se procesó");
		
		int nuNum1 = vo.getNuNumero1();
		int nuNum2 = vo.getNuNumero2();
		int nuResultado;
		
		nuResultado = calculadoraLogica.division(nuNum1, nuNum2);
		vo.setSbProcesado("Ok");
		
		vo.setNuResultado(nuResultado);
		
		return vo;
		
	}

}
