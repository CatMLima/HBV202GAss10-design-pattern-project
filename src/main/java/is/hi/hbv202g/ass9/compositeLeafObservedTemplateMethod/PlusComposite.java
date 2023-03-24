package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import is.hi.hbv202g.ass9.composite.MathExpression;
import is.hi.hbv202g.ass9.compositeLeafObservedByComposite.Observer;

import java.util.*;

public class PlusComposite extends MixedComposite implements MathExpression, Observer {
    int result = 0;

    int lastObservedResult = 0;
    public PlusComposite(){
        result = 0;
    }

    private List<MathExpression> children = new ArrayList<MathExpression>();

    protected void add(MathExpression mathExpression){
        children.add(mathExpression);
    }
    @Override
    public int getResult() {
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
