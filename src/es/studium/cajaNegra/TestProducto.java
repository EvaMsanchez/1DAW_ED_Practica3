package es.studium.cajaNegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestProducto
{

	@Test
	void testAplicarDescuento1()
	{
		Producto p = new Producto();
		p.setPrecio(10.0);
		p.aplicarDescuento(20);
		double resultadoReal = p.getPrecio();
		double resultadoEsperado = 8.0;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void testAplicarDescuento2()
	{
		Producto p = new Producto();
		p.setPrecio(40.0);
		//p.aplicarDescuento(-10); -- No se ejecuta porque se ha introducido un valor no válido.
		double resultadoReal = p.getPrecio();
		double resultadoEsperado = 40.0; //El valor del atributo no se modifica.
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void testAplicarDescuento3()
	{
		Producto p = new Producto();
		p.setPrecio(25.0);
		//p.aplicarDescuento(120); -- No se ejecuta porque se ha introducido un valor no válido.
		double resultadoReal = p.getPrecio();
		double resultadoEsperado = 25.0; //El valor del atributo no se modifica.
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	
	@Test
	void testSetPrecio1()
	{
		Producto p = new Producto();
		p.setPrecio(120.0);
		double resultadoReal = p.getPrecio();
		double resultadoEsperado = 120.0;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void testSetPrecio2()
	{
		Producto p = new Producto();
		//p.setPrecio(-50.0); -- No se ejecuta porque se ha introducido un valor no válido.
		double resultadoReal = p.getPrecio();
		double resultadoEsperado = 0.0; //El valor del atributo no se modifica.
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	
	@Test
	void testSetIVA1()
	{
		Producto p = new Producto();
		p.setIVA(21);
		double resultadoReal = p.getIVA();
		double resultadoEsperado = 21;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void testSetIVA2()
	{
		Producto p = new Producto();
		p.setIVA(10);
		double resultadoReal = p.getIVA();
		double resultadoEsperado = 10;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void testSetIVA3()
	{
		Producto p = new Producto();
		p.setIVA(4);
		double resultadoReal = p.getIVA();
		double resultadoEsperado = 4;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void testSetIVA4()
	{
		Producto p = new Producto();
		//p.setIVA(8); -- No se ejecuta porque se ha introducido un valor no válido.
		double resultadoReal = p.getIVA();
		double resultadoEsperado = 21; //El valor del atributo no se modifica.
		
		assertEquals(resultadoReal, resultadoEsperado);
	}

}


