package is.hi.hbv202g.ass9.compositeLeafObservedByTopLevelComposite;

import static org.junit.Assert.*;
import org.junit.Test;

public class MixedCompositeObserverTest {

	@Test
	public void testMixedPlusMultiplyCompositesObserver() {

		NumberLeaf number1 = new NumberLeaf(1);
		NumberLeaf number2 = new NumberLeaf(2);
		NumberLeaf number4 = new NumberLeaf(4);

		PlusComposite plusComposite = new PlusComposite();
		plusComposite.add(number1);
		plusComposite.add(number2);

		MultiplyComposite multiplyComposite = new MultiplyComposite();
		multiplyComposite.add(number4);
		multiplyComposite.add(plusComposite);

		number1.attach(multiplyComposite);
		number2.attach(multiplyComposite);
		number4.attach(multiplyComposite);

		number1.setValue(3); // This will cause stuff printed on the screen: this is not tested.
	
		assertEquals(20, multiplyComposite.getLastObservedResult());
	}
}
