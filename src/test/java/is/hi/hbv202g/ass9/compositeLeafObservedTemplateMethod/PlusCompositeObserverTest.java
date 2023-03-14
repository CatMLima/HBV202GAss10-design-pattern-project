package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PlusCompositeObserverTest {

	private PlusComposite plusComposite;

	@Before
	public void createPlusComposite() {
		plusComposite = new PlusComposite();
	}

	@Test
	public void testOneElementPlusCompositeObserver() {
		NumberLeaf number1 = new NumberLeaf(1);
		plusComposite.add(number1);

		plusComposite.update(); // This will cause stuff printed on the screen: this is not tested.

		assertEquals("An observing plus composite should store in its lastObservedField the value 1 to which the observed " +
				"leaf was set", 1, plusComposite.getLastObservedResult());
	}

}
