package tr.edu.medipol.yazilimaraclari.abdullahyazicioglu;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.*;

import tr.edu.medipol.yazilimaraclari.abdullahyazicioglu.MuhasebeProgrami.Ucret;

public class ucretHesaplaTest {
	@Test
	public void testucretHesapla() {
		int s1 = 5;
		int s2 = 25;
		Ucret ucretHesaplasonuc = MuhasebeProgrami.ucretHesapla(s1, s2);
		assertEquals(125, ucretHesaplasonuc.ucret);
	}
}