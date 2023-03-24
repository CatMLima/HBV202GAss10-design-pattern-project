package is.hi.hbv202g.ass9.composite;

import is.hi.hbv202g.ass9.composite.*;

import java.util.*;

public class PlusComposite implements MathExpression {
    int result = 0;

    private List<MathExpression> children = new ArrayList<MathExpression>();

    public void add(MathExpression mathExpression){
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
}
