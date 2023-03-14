package is.hi.hbv202g.ass9.compositeTemplateMethod;

import static org.junit.Assert.*;
import org.junit.Test;

public class NumberLeafTest {

	@Test
	public void testNumberLeaf() {
		NumberLeaf number1 = new NumberLeaf(1);
		assertEquals(1, number1.getResult());

		NumberLeaf number2 = new NumberLeaf(2);
		assertEquals(2, number2.getResult());
	}

}
