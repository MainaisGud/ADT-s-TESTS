import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;

public class CircularLinkedListTest 
{
	private CircularLinkedList C_LL;
	
	@Before
	public void InitializeCircularLinkedList()
	{
		C_LL = new CircularLinkedList();
	}
	
	@Test
	public void PushFrontTest() 
	{
		 
		int[] ExpectedList = {17,2,2,1,8};

		CircularLinkedList.pushFront(8);
		CircularLinkedList.pushFront(1);
		CircularLinkedList.pushFront(2);
		CircularLinkedList.pushFront(2);
		CircularLinkedList.pushFront(17);
		
		for (int i=0;  i < CircularLinkedList.size; i++)
		{
			assertEquals(ExpectedList[i], CircularLinkedList.head.key);
			CircularLinkedList.head = CircularLinkedList.head.next;
		}
	}
	
	@Test
	public void PushFrontTest2() 
	{
		 
		int[] UnexpectedList = {3,6,9,12,15};

		CircularLinkedList.pushFront(8);
		CircularLinkedList.pushFront(1);
		CircularLinkedList.pushFront(2);
		CircularLinkedList.pushFront(2);
		CircularLinkedList.pushFront(17);
		
		for (int i=0;  i < CircularLinkedList.size; i++)
		{
			assertNotEquals(UnexpectedList[i], CircularLinkedList.head.key);
			CircularLinkedList.head = CircularLinkedList.head.next;
		}
	}

	@Test
	public void PushBackTest() 
	{
		int[] ExpectedList = {8,1,2,2,17};

		CircularLinkedList.pushBack(8);
		CircularLinkedList.pushBack(1);
		CircularLinkedList.pushBack(2);
		CircularLinkedList.pushBack(2);
		CircularLinkedList.pushBack(12);
		
	for (int i=0; i < CircularLinkedList.size; i++)
	{
		assertEquals(ExpectedList[i], CircularLinkedList.head.key);
		CircularLinkedList.head = CircularLinkedList.head.next;
	}
	
	
	}
	
	@Test
	public void PushBackTest2() 
	{
		int[] UnexpectedList = {3,6,9,12,15};

		CircularLinkedList.pushBack(8);
		CircularLinkedList.pushBack(1);
		CircularLinkedList.pushBack(2);
		CircularLinkedList.pushBack(2);
		CircularLinkedList.pushBack(12);
		
	for (int i=0; i < CircularLinkedList.size; i++)
	{
		assertNotEquals(UnexpectedList[i], CircularLinkedList.head.key);
		CircularLinkedList.head = CircularLinkedList.head.next;
	}
	
	
	}
	
	@Test
	public void PopBackTest() 
	{
		
		int[] ExpectedListAfterPop= {17,2,2};
		
		CircularLinkedList.pushFront(8);
		CircularLinkedList.pushFront(1);
		CircularLinkedList.pushFront(2);
		CircularLinkedList.pushFront(2);
		CircularLinkedList.pushFront(17);
		
		CircularLinkedList.popBack();
		CircularLinkedList.popBack();
		
		for (int i=0; i < CircularLinkedList.size; i++)
		{
			assertEquals(ExpectedListAfterPop[i], CircularLinkedList.head.key);
			CircularLinkedList.head = CircularLinkedList.head.next;
		}
	
	
	}
	
	@Test
	public void PopFrontTest() 
	{
		
		int[] ExpectedResultAfterPop= {2,2,17};
		
		CircularLinkedList.pushBack(8);
		CircularLinkedList.pushBack(1);
		CircularLinkedList.pushBack(2);
		CircularLinkedList.pushBack(2);
		CircularLinkedList.pushBack(12);
		
		CircularLinkedList.popFront();
		CircularLinkedList.popFront();
		
		for (int i=0; i < CircularLinkedList.size;i++)
		{
			assertEquals(ExpectedResultAfterPop[i], CircularLinkedList.head.key);
			CircularLinkedList.head= CircularLinkedList.head.next;
		}
	
	}
}

