package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import static org.junit.Assert.*;
import org.junit.Test;

public class NumberLeafTest {

	@Test
	public void testNumberLeaf() {
		NumberLeaf number1 = new NumberLeaf(1);
		assertEquals("A leaf with value 1 should return 1", 1, number1.getResult());

		NumberLeaf number2 = new NumberLeaf(2);
		assertEquals("A leaf with value 2 should return 2", 2, number2.getResult());
	}

}
