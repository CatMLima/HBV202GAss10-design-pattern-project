package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import is.hi.hbv202g.ass9.composite.MathExpression;

import java.util.*;

public class MultiplyComposite implements MathExpression, Observer {
    private List<MathExpression> children = new ArrayList<MathExpression>();

    int lastObservedResult = 0;
    public void add(MathExpression mathExpression){
        children.add(mathExpression);
    }

    @Override
    public int getResult() {
        int result = 1;
        int pointer = 0;
        int size = children.size();
        while (pointer < size){
            result *= children.get(pointer).getResult();
            pointer++;
        }
        return result;
    }

    @Override
    public void update() {
        lastObservedResult = getResult();
        System.out.println(lastObservedResult);
    }
    public int getLastObservedResult(){
        return lastObservedResult;
    }
}
