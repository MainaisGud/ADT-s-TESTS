import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;

public class StackArrayTest 
{
	private StackArray St_arr;
	
	@Before
	public void InitializeStackArray()
	{
		St_arr = new StackArray();
	}
	
	@Test
	public void PushTest() 
	{
		int [] ExpectedStack= {8,1,2,2,17};	
			
		StackArray.push(8);
		StackArray.push(1);
		StackArray.push(2);
		StackArray.push(2);
		StackArray.push(17);
			
		for (int i=0; i < StackArray.size; i++)
		{
			assertEquals(ExpectedStack[i], StackArray.array[i]);
		}
	}
	
	@Test
	public void PushTest2() 
	{
		int [] UnexpectedStack= {3,6,9,12,15};	
			
		StackArray.push(8);
		StackArray.push(1);
		StackArray.push(2);
		StackArray.push(2);
		StackArray.push(17);
			
		for (int i=0; i < StackArray.size; i++)
		{
			assertNotEquals(UnexpectedStack[i], StackArray.array[i]);
		}
	}
	
	@Test
	public void PopTest()
	{
		int [] ExpectedPopResult= {17,2,2,1,8};
		
		StackArray.push(8);
		StackArray.push(1);
		StackArray.push(2);
		StackArray.push(2);
		StackArray.push(17);
		
		for (int i=0; i<StackArray.size; i++)
		{
			assertEquals(ExpectedPopResult[i], StackArray.pop());
		}
	}
	
	@Test
	public void PopTest2()
	{
		int [] UnexpectedPopResult= {3,6,9,12,15};
		
		StackArray.push(8);
		StackArray.push(1);
		StackArray.push(2);
		StackArray.push(2);
		StackArray.push(17);
		
		for (int i=0; i<StackArray.size; i++)
		{
			assertNotEquals(UnexpectedPopResult[i], StackArray.pop());
		}
	}

}
