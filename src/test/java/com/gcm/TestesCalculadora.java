package com.gcm;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.gcm.Calculadora;

public class TestesCalculadora {

	private Calculadora c;

	@Before
	public void setUp() throws Exception {
		c = new Calculadora();
	}

	@Test
	public void testeSoma() {
		for(int i = -1; i < 2; i++) {
			for(int j = -1; j < 2; i++) {
				int actual = i+j;
				assertEquals(c.soma(i, j), actual);
			}
		}

	}

	@Test
	public void testeDivisao() {
		for(int i = -1; i < 2; i++) {
			for(int j = -1; j < 2; i++) {
				int actual = i/j;
				assertEquals(c.divisao(i, j), actual);
			}
		}
	}

	@Test
	public void testeMultiplicacao() {
		for(int i = -1; i < 2; i++) {
			for(int j = -1; j < 2; i++) {
				int actual = i*j;
				assertEquals(c.multiplicacao(i, j), actual);
			}
		}
	}

	@Test
	public void testeSubtraicao() {
		for(int i = -1; i < 2; i++) {
			for(int j = -1; j < 2; i++) {
				int actual = i-j;
				assertEquals(c.subtracao(i, j), actual);
			}
		}
	}

}
