import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;

public class DoublyLinkedListTest 
{
	private DoublyLinkedList D_LL;
	
	@Before
	public void InitializeDoublyLinkedList()
	{
		D_LL = new DoublyLinkedList();
	}
	
	
	@Test
	public void PushFrontTest() 
	{
		int[] ExpectedList = {17,2,2,1,8};

		DoublyLinkedList.pushFront(8);
		DoublyLinkedList.pushFront(1);
		DoublyLinkedList.pushFront(2);
		DoublyLinkedList.pushFront(2);
		DoublyLinkedList.pushFront(17);
			
		for (int i=0;i<DoublyLinkedList.size;i++)
		{
			assertEquals(ExpectedList[i], DoublyLinkedList.head.key);
			DoublyLinkedList.head = DoublyLinkedList.head.next;
		}
	}
	
	@Test
	public void PushFrontTest2() 
	{
		int[] UnexpectedList = {3,6,9,12,15};

		DoublyLinkedList.pushFront(8);
		DoublyLinkedList.pushFront(1);
		DoublyLinkedList.pushFront(2);
		DoublyLinkedList.pushFront(2);
		DoublyLinkedList.pushFront(17);
			
		for (int i=0;i<DoublyLinkedList.size;i++)
		{
			assertNotEquals(UnexpectedList[i], DoublyLinkedList.head.key);
			DoublyLinkedList.head = DoublyLinkedList.head.next;
		}
	}
	
	@Test
	public void PushBackTest() 
	{
		int[] ExpectedList = {8,1,2,2,17};

		DoublyLinkedList.pushBack(8);
		DoublyLinkedList.pushBack(1);
		DoublyLinkedList.pushBack(2);
		DoublyLinkedList.pushBack(2);
		DoublyLinkedList.pushBack(17);
		
		for (int i=0;i<DoublyLinkedList.size;i++)
		{
			assertEquals(ExpectedList[i], DoublyLinkedList.head.key);
			DoublyLinkedList.head = DoublyLinkedList.head.next;
		}
	}
	
	@Test
	public void PushBackTest2() 
	{
		int[] UnexpectedList = {3,6,9,12,15};

		DoublyLinkedList.pushBack(8);
		DoublyLinkedList.pushBack(1);
		DoublyLinkedList.pushBack(2);
		DoublyLinkedList.pushBack(2);
		DoublyLinkedList.pushBack(17);
		
		for (int i=0;i<DoublyLinkedList.size;i++)
		{
			assertNotEquals(UnexpectedList[i], DoublyLinkedList.head.key);
			DoublyLinkedList.head = DoublyLinkedList.head.next;
		}
	}
	
	@Test
	public void PopFrontTest() 
	{
		
		int[] ExpectedListAfterPopFront = {2,2,17};
		
		DoublyLinkedList.pushBack(8);
		DoublyLinkedList.pushBack(1);
		DoublyLinkedList.pushBack(2);
		DoublyLinkedList.pushBack(2);
		DoublyLinkedList.pushBack(17);
		
		DoublyLinkedList.popFront();
		DoublyLinkedList.popFront();
		
		for (int i=0; i < DoublyLinkedList.size; i++)
		{
			assertEquals(ExpectedListAfterPopFront[i], DoublyLinkedList.head.key);
			DoublyLinkedList.head = DoublyLinkedList.head.next;
		}
	}
	
	@Test
	public void PopFrontTest2() 
	{
		
		int[] UnexpectedListAfterPopFront = {3,6,9};
		
		DoublyLinkedList.pushBack(8);
		DoublyLinkedList.pushBack(1);
		DoublyLinkedList.pushBack(2);
		DoublyLinkedList.pushBack(2);
		DoublyLinkedList.pushBack(17);
		
		DoublyLinkedList.popFront();
		DoublyLinkedList.popFront();
		
		for (int i=0; i < DoublyLinkedList.size; i++)
		{
			assertNotEquals(UnexpectedListAfterPopFront[i], DoublyLinkedList.head.key);
			DoublyLinkedList.head = DoublyLinkedList.head.next;
		}
	}
	
	@Test
	public void PopBackTest() 
	{
		
		int[] ExpectedListAfterPopBack = {17,2,2};
		
		DoublyLinkedList.pushFront(8);
		DoublyLinkedList.pushFront(1);
		DoublyLinkedList.pushFront(2);
		DoublyLinkedList.pushFront(2);
		DoublyLinkedList.pushFront(17);
		
		DoublyLinkedList.popBack();
		DoublyLinkedList.popBack();
		
		for (int i=0; i < DoublyLinkedList.size;i++)
		{
			assertEquals(ExpectedListAfterPopBack[i], DoublyLinkedList.head.key);
			DoublyLinkedList.head = DoublyLinkedList.head.next;
		}
	}
	
	@Test
	public void PopBackTest2() 
	{
		
		int[] UnexpectedListAfterPopBack = {3,6,9};
		
		DoublyLinkedList.pushFront(8);
		DoublyLinkedList.pushFront(1);
		DoublyLinkedList.pushFront(2);
		DoublyLinkedList.pushFront(2);
		DoublyLinkedList.pushFront(17);
		
		DoublyLinkedList.popBack();
		DoublyLinkedList.popBack();
		
		for (int i=0; i < DoublyLinkedList.size;i++)
		{
			assertNotEquals(UnexpectedListAfterPopBack[i], DoublyLinkedList.head.key);
			DoublyLinkedList.head = DoublyLinkedList.head.next;
		}
	}
	
}
