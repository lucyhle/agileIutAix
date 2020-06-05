package iut.aix.agile;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import iut.aix.agile.ReverseInteger;

public class ReverseIntegerTest {

	@Test
	public void reverseShouldReturn321() {
		//Test 1
		assertEquals(321, ReverseInteger.reverse(13));
	}
	
	@Test
	public void reverseShouldReturn21() {
		assertEquals(21, ReverseInteger.reverse(120));
	}
}
