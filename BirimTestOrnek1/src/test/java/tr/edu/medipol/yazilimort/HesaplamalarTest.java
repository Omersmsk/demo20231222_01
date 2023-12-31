package tr.edu.medipol.yazilimort;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamalarTest {

	@Test
	public void testFaktoriyelRec() {
		int sonuc = Hesaplamalar.faktoriyelRec(5);
		assertEquals(120,sonuc);
	}

	@Test
	public void testFaktoriyelLoop() {
		int sonuc = Hesaplamalar.faktoriyelLoop(5);
		assertEquals(120, sonuc);
	}
	@Test
    public void testTopla() {
        int sonuc = Hesaplamalar.topla(3, 5);
        assertEquals(8, sonuc);
    }

    @Test
    public void testCikart() {
        int sonuc = Hesaplamalar.cikart(10, 5);
        assertEquals(5, sonuc); 
    }

    @Test
    public void testCarp() {
        int sonuc = Hesaplamalar.carp(3, 5);
        assertEquals(15, sonuc);
    }
	
}
