package is.hi.hbv202g.ass9.composite;

import static org.junit.Assert.*;
import org.junit.Test;

public class CompositeTest {

	@Test
	public void testNumberLeaf() {
		NumberLeaf number1 = new NumberLeaf(1);
		assertEquals(1, number1.getResult());

		NumberLeaf number2 = new NumberLeaf(2);
		assertEquals(2, number2.getResult());
	}

	@Test
	public void testEmptyPlusComposite() {
		PlusComposite plusComposite = new PlusComposite();
		assertEquals(0, plusComposite.getResult());
	}

	@Test
	public void testOneElementPlusComposite() {
		NumberLeaf number1 = new NumberLeaf(1);

		PlusComposite plusComposite = new PlusComposite();
		plusComposite.add(number1);
		assertEquals(1, plusComposite.getResult());
	}
	
	@Test
	public void testTwoElementPlusComposite() {
		NumberLeaf number1 = new NumberLeaf(1);
		NumberLeaf number2 = new NumberLeaf(2);

		PlusComposite plusComposite = new PlusComposite();
		plusComposite.add(number1);
		plusComposite.add(number2);
		assertEquals(3, plusComposite.getResult());
	}

	@Test
	public void testOneElementMultiplyComposite() {

		NumberLeaf number2 = new NumberLeaf(2);

		MultiplyComposite multiplyComposite = new MultiplyComposite();
		multiplyComposite.add(number2);
		assertEquals(2, multiplyComposite.getResult());
	}

	public void testTwoElementMultiplyComposite() {

		NumberLeaf number2 = new NumberLeaf(2);
		NumberLeaf number4 = new NumberLeaf(4);

		MultiplyComposite multiplyComposite = new MultiplyComposite();
		multiplyComposite.add(number2);
		multiplyComposite.add(number4);
		assertEquals(8, multiplyComposite.getResult());
	}

	

	@Test
	public void testMixedPlusMultiplyComposites() {

		NumberLeaf number1 = new NumberLeaf(1);
		NumberLeaf number2 = new NumberLeaf(2);
		NumberLeaf number4 = new NumberLeaf(4);

		PlusComposite plusComposite = new PlusComposite();
		plusComposite.add(number1);
		plusComposite.add(number2);

		MultiplyComposite multiplyComposite = new MultiplyComposite();
		multiplyComposite.add(number4);
		multiplyComposite.add(plusComposite);
		assertEquals(12, multiplyComposite.getResult());
	}
}
