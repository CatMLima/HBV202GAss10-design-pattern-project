package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PlusCompositeTest {

	private PlusComposite plusComposite;

	@Before
	public void createPlusComposite() {
		plusComposite = new PlusComposite();
	}

	@Test
	public void testEmptyPlusComposite() {
		assertEquals(0, plusComposite.getResult());
	}

	@Test
	public void testOneElementPlusComposite() {
		NumberLeaf number2 = new NumberLeaf(2);

		plusComposite.add(number2);
		assertEquals("A plus composite consisting only of leaf with value 2 should return 2",
				2, plusComposite.getResult());
	}

	@Test
	public void testTwoElementPlusComposite() {
		NumberLeaf number1 = new NumberLeaf(1);
		NumberLeaf number2 = new NumberLeaf(2);

		plusComposite.add(number1);
		plusComposite.add(number2);
		assertEquals("A plus composite consisting of leafs with values 1 and 2 should return 3",
				3, plusComposite.getResult());
	}

	@Test
	public void testNestedPlusComposite() {
		NumberLeaf number1 = new NumberLeaf(1);
		NumberLeaf number2 = new NumberLeaf(2);

		plusComposite.add(number1);
		plusComposite.add(number2);

		PlusComposite plusComposite2 = new PlusComposite();
		plusComposite2.add(plusComposite);
		plusComposite2.add(plusComposite);

		assertEquals("A plus composite consisting two further plus composites, each consisting of leafs with values " +
				"1 and 2 should return (1+2)+(1+2)=6", 6, plusComposite2.getResult());
	}

}