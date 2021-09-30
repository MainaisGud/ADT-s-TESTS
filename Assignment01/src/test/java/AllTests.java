import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArrayTest.class, CircularLinkedListTest.class, DoublyLinkedListTest.class, LinkedListTest.class,
		QueueArrayTest.class, QueueListTest.class, StackArrayTest.class, StackListTest.class })
public class AllTests {

}
