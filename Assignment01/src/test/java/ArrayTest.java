import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;


public class ArrayTest
{
	private Array arr;
	
	@Before
	public void initializeArray()
	{
		arr = new Array();
	}


	@Test
	public void InsertTest() 
	{
		int[] ExpectedArray = {8,15,12,2000,5,17};
		
		Array.insert(8, 0);
		Array.insert(12, 1);
		Array.insert(2000, 2);
		Array.insert(5, 3);
		Array.insert(17, 4);
		Array.insert(15, 1);
		
		for(int i=0; i<Array.size; i++)
		{
			assertEquals(ExpectedArray[i], Array.array[i]);
		}
	}
	
	
	@Test
	public void InsertTest2() 
	{
		int[] UnexpectedArray = {6,12,15,2,4,7}; 
		
		Array.insert(8, 0);
		Array.insert(12, 1);
		Array.insert(2000, 2);
		Array.insert(5, 3);
		Array.insert(17, 4);
		Array.insert(15, 1);
		
		for(int i=0; i<Array.size; i++)
		{
			assertNotEquals(UnexpectedArray[i], Array.array[i]);
		}
	}
	
	
	@Test 
	public void DeleteTest()
	{
		int[] ExpectedArray = {8,15,12,2000,17};
		
		Array.insert(8, 0);
		Array.insert(12, 1);
		Array.insert(2000, 2);
		Array.insert(5, 3);
		Array.insert(17, 4);
		Array.insert(15, 1);
		
	    Array.delete(4);
		
		for(int i=0; i<Array.size; i++)
		{
			assertEquals(ExpectedArray[i], Array.array[i]);
		}
		
	}
	
	
	@Test 
	public void DeleteTest2()
	{
		int[] UnexpectedArray = {6,12,15,2,13,21};
		
		Array.insert(8, 0);
		Array.insert(12, 1);
		Array.insert(2000, 2);
		Array.insert(5, 3);
		Array.insert(17, 4);
		Array.insert(15, 1);
		
	    Array.delete(4);

		for(int i=0; i<Array.size; i++)
		{
			assertNotEquals(UnexpectedArray[i], Array.array[i]);
		}
		
	}
	
	
	@Test
	public void LinearSearchTest()
	{
		Array.insert(8, 0);
		Array.insert(12, 1);
		Array.insert(2000, 2);
		Array.insert(5, 3);
		Array.insert(17, 4);
		Array.insert(15, 1);
		assertTrue(Array.linearSearch(17));
	}
	
	@Test
	public void LinearSearchTest2()
	{
		Array.insert(8, 0);
		Array.insert(12, 1);
		Array.insert(2000, 2);
		Array.insert(5, 3);
		Array.insert(17, 4);
		Array.insert(15, 1);
		assertFalse(Array.linearSearch(25));
	}
	
	@Test
	public void BubbleSortTest()
	{
		int[] ExpectedArray = {5,8,12,15,17,2000};
		
		Array.insert(8, 0);
		Array.insert(12, 1);
		Array.insert(2000, 2);
		Array.insert(5, 3);
		Array.insert(17, 4);
		Array.insert(15, 1);
		
		Array.bubbleSort();
		
		for(int i=0; i<Array.size; i++)
		{
			assertEquals(ExpectedArray[i], Array.array[i]);
		}
	}
	
	@Test
	public void BubbleSortTest2()
	{
		int[] UnexpectedArray = {6,13,14,11,9,20};
		
		Array.insert(8, 0);
		Array.insert(12, 1);
		Array.insert(2000, 2);
		Array.insert(5, 3);
		Array.insert(17, 4);
		Array.insert(15, 1);
		
		Array.bubbleSort();
		
		for(int i=0; i<Array.size; i++)
		{
			assertNotEquals(UnexpectedArray[i], Array.array[i]);
		}
	}
	
	@Test
	public void BinarySearchTest()
	{
		Array.insert(8, 0);
		Array.insert(12, 1);
		Array.insert(2000, 2);
		Array.insert(5, 3);
		Array.insert(17, 4);
		Array.insert(15, 1);
		assertTrue(Array.binarySearch(8, 0, 6));	
	}
	
	@Test
	public void BinarySearchTest2()
	{
		Array.insert(8, 0);
		Array.insert(12, 1);
		Array.insert(2000, 2);
		Array.insert(5, 3);
		Array.insert(17, 4);
		Array.insert(15, 1);
		assertFalse(Array.binarySearch(19, 0, 6));	
	}
}
