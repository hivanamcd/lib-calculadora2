package com.gcm;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestesCalculadora {

	private Calculadora c;

	@Before
	public void setUp() throws Exception {
		c = new Calculadora();
	}

	@Test
	public void testeSoma() {
		assertEquals((Object)c.soma(1, 1), (Object)Float.valueOf("2"));

	}

	@Test
	public void testeDividir() {
		assertEquals((Object)c.divisao(10, 5), (Object)Float.valueOf("2"));
	}

	@Test
	public void testeMultiplicar() {
		assertEquals((Object)c.multiplicacao(2, 3), (Object)Float.valueOf("6"));
	}

	@Test
	public void testeSubtrair() {
		assertEquals((Object)c.subtracao(1, 1), (Object)Float.valueOf("0"));
		
	}

}