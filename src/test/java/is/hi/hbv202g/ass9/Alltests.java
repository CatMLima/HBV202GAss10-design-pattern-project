package is.hi.hbv202g.ass9;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ is.hi.hbv202g.ass9.composite.Alltests.class,
		is.hi.hbv202g.ass9.compositeLeafObservedByComposite.Alltests.class,
		is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod.Alltests.class })
public class Alltests {
}
