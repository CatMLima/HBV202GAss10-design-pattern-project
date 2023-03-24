package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import is.hi.hbv202g.ass9.composite.MathExpression;

public class NumberLeaf extends Observable implements MathExpression {
    int result;

    public NumberLeaf(int number){
        this.result = number;
    }

    @Override
    public int getResult() {
        return result;
    }

    public void setValue(int number){
        result = number;
        notifyObservers();
    }
}
