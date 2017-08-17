/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import conversores.Conversor;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConversorTest {

    @Test
    public void testBinToDec() {
        final String valor = "11010";
        final int conversao = Conversor.binToDec(valor);
        assertTrue(conversao == 26);
    }
    
    @Test
    public void testBinToHex() {
        final String valor = "11010";
        final String conversao = Conversor.binToHex(valor);
        assertTrue(conversao.equals("1a"));
    }
    
    @Test
    public void testBinToOct() {
        final String valor = "11010";
        final String conversao = Conversor.binToOct(valor);
        assertTrue(conversao.equals("32"));
    }
    
    @Test
    public void testDecToBin() {
        final int valor = 26;
        final String conversao = Conversor.decToBin(valor);
        assertTrue(conversao.equals("11010"));
    }
    
    @Test
    public void testDecToHex() {
        final int valor = 26;
        final String conversao = Conversor.decToHex(valor);
        assertTrue(conversao.equals("1a"));
    }
    
    @Test
    public void testDecToOct() {
        final int valor = 26;
        final String conversao = Conversor.decToOct(valor);
        assertTrue(conversao.equals("32"));
   
    }
    
    @Test
    public void testHexToBin() {
        final String valor = "1a";
        final String conversao = Conversor.hexToBin(valor);
        assertTrue(conversao.equals("11010"));
    }
    
    @Test
    public void testHexToDec() {
        final String valor = "1a";
        final int conversao = Conversor.hexToDec(valor);
        assertTrue(conversao == 26);
    }
    
    @Test
    public void testHexToOct() {
        final String valor = "1a";
        final String conversao = Conversor.hexToOct(valor);
        assertTrue(conversao.equals("32"));
    }
    
    @Test
    public void testOctToBin() {
        final String valor = "32";
        final String conversao = Conversor.octToBin(valor);
        assertTrue(conversao.equals("11010"));
    }
    
    @Test
    public void testOctToDec() {
        final String valor = "32";
        final int conversao = Conversor.octToDec(valor);
        assertTrue(conversao == 26);
    }
    
    @Test
    public void testOctToHex() {
        final String valor = "32";
        final String conversao = Conversor.octToHex(valor);
        assertTrue(conversao.equals("1a"));
    }
    
    
            
}
