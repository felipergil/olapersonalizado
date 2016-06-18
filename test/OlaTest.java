/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felipe Rodrigues Gil 248543
 */
public class OlaTest {
    @Test
    public void testDizerola(){
        Ola ola = new Ola();
        
        assertEquals("Olá Felipe", ola.dizerOla("Felipe","PT"));
        assertEquals("Hallo Felipe", ola.dizerOla("Felipe","AL"));
        assertEquals("Hola Felipe", ola.dizerOla("Felipe","ES"));
        assertEquals("Bonjour Felipe", ola.dizerOla("Felipe","FR"));
        assertEquals("Hello Felipe", ola.dizerOla("Felipe","IN"));
        assertEquals("Kon'nichiwa Felipe", ola.dizerOla("Felipe","JP"));
    }
}
    

   
    

