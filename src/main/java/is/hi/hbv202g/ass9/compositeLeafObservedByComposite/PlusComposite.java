package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import is.hi.hbv202g.ass9.composite.MathExpression;

import java.util.*;

public class PlusComposite implements MathExpression, Observer {

    int lastObservedResult = 0;

    private List<MathExpression> children = new ArrayList<MathExpression>();

    public void add(MathExpression mathExpression){
        children.add(mathExpression);
    }
    @Override
    public int getResult() {
        int result = 0;
        int pointer = 0;
        int size = children.size();
        while (pointer < size){
            result+= children.get(pointer).getResult();
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
