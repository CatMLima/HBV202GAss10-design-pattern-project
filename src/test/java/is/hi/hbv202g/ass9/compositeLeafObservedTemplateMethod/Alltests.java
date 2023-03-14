package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MixedCompositeObserverTest.class, MultiplyCompositeObserverTest.class, MultiplyCompositeTest.class,
		NumberLeafObservedTest.class, NumberLeafTest.class, PlusCompositeObserverTest.class, PlusCompositeTest.class })
public class Alltests {
}
