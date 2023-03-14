package is.hi.hbv202g.ass9.compositeLeafObservedByTopLevelComposite;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumberLeafObservedTest implements Observer {

	private int lastObservedResult;
	private NumberLeaf number1;
	
	@Before
	public void setUp() {
		number1 = new NumberLeaf(1);
	}
	
	@Test
	public void testAttachAndUpdateAfterSetValue() {
		number1.attach(this);
		number1.setValue(3);

		assertEquals(3, lastObservedResult);
	}

	@Override
	public void update() {
		lastObservedResult=number1.getResult();
	}
}
