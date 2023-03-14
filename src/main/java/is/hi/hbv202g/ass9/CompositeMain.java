package is.hi.hbv202g.ass9;

import is.hi.hbv202g.ass9.composite.*;

public class CompositeMain {

	public static void main(String[] args) {
		NumberLeaf number1 = new NumberLeaf(1);
		NumberLeaf number2 = new NumberLeaf(2);
		NumberLeaf number4 = new NumberLeaf(4);

		PlusComposite plusComposite = new PlusComposite();
		plusComposite.add(number1);
		plusComposite.add(number2);

		MultiplyComposite multiplyComposite = new MultiplyComposite();
		multiplyComposite.add(number4);
		multiplyComposite.add(plusComposite);

		System.out.println("The result of ("+number1.getResult()+"+"+number2.getResult()+")*"+number4.getResult()+" is: "+ multiplyComposite.getResult());	}
}
