import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;

public class LinkedListTest 
{
	private LinkedList Singly;
	
	@Before
	public void InitializeLinkedList()
	{
		Singly = new LinkedList();
	}
	
	@Test
	public void PushFrontTest() 
	{
		int[] ExpectedList = {17,2,2,1,8};

		LinkedList.pushFront(8);
		LinkedList.pushFront(1);
		LinkedList.pushFront(2);
		LinkedList.pushFront(2);
		LinkedList.pushFront(17);
		
		for (int i=0; i < LinkedList.size; i++)
		{
			assertEquals(ExpectedList[i], LinkedList.head.key);
			LinkedList.head = LinkedList.head.next;
		}
	}
	
	@Test
	public void PushFrontTest2() 
	{
		int[] UnexpectedList = {3,6,9,12,15};

		LinkedList.pushFront(8);
		LinkedList.pushFront(1);
		LinkedList.pushFront(2);
		LinkedList.pushFront(2);
		LinkedList.pushFront(17);
		
		for (int i=0; i < LinkedList.size; i++)
		{
			assertNotEquals(UnexpectedList[i], LinkedList.head.key);
			LinkedList.head = LinkedList.head.next;
		}
	}
	
	@Test
	public void PushBackTest() 
	{
		int[] ExpectedList = {8,1,2,2,17};
		
		LinkedList.pushBack(8);
		LinkedList.pushBack(1);
		LinkedList.pushBack(2);
		LinkedList.pushBack(2);
		LinkedList.pushBack(17);
		
		for (int i=0; i < LinkedList.size; i++)
		{
			assertEquals(ExpectedList[i], LinkedList.head.key);
			LinkedList.head = LinkedList.head.next;
		}
	}
	
	@Test
	public void PushBackTest2() 
	{
		int[] UnexpectedList = {3,6,9,12,15};
		
		LinkedList.pushBack(8);
		LinkedList.pushBack(1);
		LinkedList.pushBack(2);
		LinkedList.pushBack(2);
		LinkedList.pushBack(17);
		
		for (int i=0; i < LinkedList.size; i++)
		{
			assertNotEquals(UnexpectedList[i], LinkedList.head.key);
			LinkedList.head = LinkedList.head.next;
		}
	}
	
	@Test
	public void PopFrontTest() 
	{	
		int [] ExpectedListAfterPopFront = {2,2,17};
		
		LinkedList.pushBack(8);
		LinkedList.pushBack(1);
		LinkedList.pushBack(2);
		LinkedList.pushBack(2);
		LinkedList.pushBack(17);
		LinkedList.popFront();
		LinkedList.popFront();
		
		
		for (int i=0; i < LinkedList.size ;i++)
		{
			assertEquals(ExpectedListAfterPopFront[i], LinkedList.head.key);
			LinkedList.head = LinkedList.head.next;
		}
	}
	
	@Test
	public void PopFrontTest2() 
	{	
		int [] UnexpectedListAfterPopFront = {3,6,9};
		
		LinkedList.pushBack(8);
		LinkedList.pushBack(1);
		LinkedList.pushBack(2);
		LinkedList.pushBack(2);
		LinkedList.pushBack(17);
		LinkedList.popFront();
		LinkedList.popFront();
		
		
		for (int i=0; i < LinkedList.size ;i++)
		{
			assertNotEquals(UnexpectedListAfterPopFront[i], LinkedList.head.key);
			LinkedList.head = LinkedList.head.next;
		}
	}
	
	@Test
	public void PopBackTest() 
	{	
		int [] ExpectedListAfterPopFront = {17,2,2,};
		
		LinkedList.pushFront(8);
		LinkedList.pushFront(1);
		LinkedList.pushFront(2);
		LinkedList.pushFront(2);
		LinkedList.pushFront(17);
		LinkedList.popBack();
		LinkedList.popBack();
		
		
		for (int i=0; i < LinkedList.size ;i++)
		{
			assertEquals(ExpectedListAfterPopFront[i], LinkedList.head.key);
			LinkedList.head = LinkedList.head.next;
		}
	}
	
	@Test
	public void PopBackTest2() 
	{	
		int [] UnexpectedListAfterPopFront = {3,6,9};
		
		LinkedList.pushFront(8);
		LinkedList.pushFront(1);
		LinkedList.pushFront(2);
		LinkedList.pushFront(2);
		LinkedList.pushFront(17);
		LinkedList.popBack();
		LinkedList.popBack();
		
		
		for (int i=0; i < LinkedList.size ;i++)
		{
			assertNotEquals(UnexpectedListAfterPopFront[i], LinkedList.head.key);
			LinkedList.head = LinkedList.head.next;
		}
	}
	
	@Test
	public void PopTest() 
	{
		int[] ExpectedListAfterPop = {17,2,8};
		
		LinkedList.pushFront(8);
		LinkedList.pushFront(1);
		LinkedList.pushFront(2);
		LinkedList.pushFront(2);
		LinkedList.pushFront(17);
		
		LinkedList.pop(3);
		LinkedList.pop(1);
		
		
		for (int i=0; i < LinkedList.size; i++)
		{
			assertEquals(ExpectedListAfterPop[i], LinkedList.head.key);
			LinkedList.head = LinkedList.head.next;
		}
	}
	
	@Test
	public void PopTest2() 
	{
		int[] UnexpectedListAfterPop = {3,6,9};
		
		LinkedList.pushFront(8);
		LinkedList.pushFront(1);
		LinkedList.pushFront(2);
		LinkedList.pushFront(2);
		LinkedList.pushFront(17);
		
		LinkedList.pop(3);
		LinkedList.pop(1);
		
		
		for (int i=0; i < LinkedList.size; i++)
		{
			assertNotEquals(UnexpectedListAfterPop[i], LinkedList.head.key);
			LinkedList.head = LinkedList.head.next;
		}
	}
}
