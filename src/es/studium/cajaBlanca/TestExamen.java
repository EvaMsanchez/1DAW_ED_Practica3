package es.studium.cajaBlanca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestExamen
{

	@Test
	void testMensajeCamino1()
	{
		String resultadoEsperado = "Ya eres mayor de edad";
		String resultadoReal = Examen.mensaje(18);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testMensajeCamino2()
	{
		String resultadoEsperado = "Ya puedes jubilarte";
		String resultadoReal = Examen.mensaje(67);
		
		assertEquals(resultadoEsperado, resultadoReal); 
	}
	
	@Test
	void testMensajeCamino3()
	{
		String resultadoEsperado = "No pasa nada";
		String resultadoReal = Examen.mensaje(10);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	
	@Test
	void testValidarCamino1()
	{
		boolean resultadoEsperado = true;
		boolean resultadoReal = Examen.validar("11222333A");
				
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testValidarCamino2()
	{
		boolean resultadoEsperado = false;
		boolean resultadoReal = Examen.validar("445566S"); 
				
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
}


