package br.com.numerosRomanos;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class NumerosRomanosTest {
    @Test
    public void converteNumeroTest(){
    	NumerosRomanos numerosRomanos = new NumerosRomanos();
    	
    	Assert.assertEquals(0, numerosRomanos.converteNumero("MMMMMMMMM"));
    	Assert.assertEquals(4999, numerosRomanos.converteNumero("MMMMDCCCCLXXXXVIIII"));
    	Assert.assertEquals(1, numerosRomanos.converteNumero("I"));
    	Assert.assertEquals(0, numerosRomanos.converteNumero(""));
//    	numerosRomanos.converteNumero("V");
//    	numerosRomanos.converteNumero("X");
//    	numerosRomanos.converteNumero("L");
//    	numerosRomanos.converteNumero("C");
//    	numerosRomanos.converteNumero("D");
//    	numerosRomanos.converteNumero("M");
//    	numerosRomanos.converteNumero("");
    }
}
