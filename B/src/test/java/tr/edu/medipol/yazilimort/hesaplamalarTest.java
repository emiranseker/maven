package tr.edu.medipol.yazilimort;

import static org.junit.Assert.*;

import org.junit.Test;

public class hesaplamalarTest {

	@Test
	public void testFaktoriyelrec() {
	int sonuc = hesaplamalar.faktoriyelrec(5);
	assertEquals(120, sonuc);
	}

	@Test
	public void testFaktoriyelloop() {
		int sonuc = hesaplamalar.faktoriyelloop(5);
		assertEquals(120, sonuc);
	}
	@Test
	public void testtopla() {
		int sonuc = hesaplamalar.topla(3,4);
		assertEquals(7, sonuc);
		
	}
	@Test
	public void testcikart() {
		int sonuc = hesaplamalar.cikart(5,4);
		assertEquals(1, sonuc);
		
	}
	public void testcarpma() {
		int sonuc = hesaplamalar.carpma(5,4);
		assertEquals(20, sonuc);
		
	}
	
	
	
	
}
