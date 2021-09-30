import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;


public class StackListTest 
{
	private StackList St_list;
	
	@Before 
	public void initializeStackList()
	{
		St_list = new StackList(); 
	}

	
	@Test
	public void PushTest() 
	{
		int [] ExpectedStack= {17,2,2,1,8};	
			
		StackList.push(8);
		StackList.push(1);
		StackList.push(2);
		StackList.push(2);
		StackList.push(17);
			
		for (int i=0; i < StackList.getSize(); i++)
		{
			assertEquals(ExpectedStack[i], StackList.top());
			StackList.pop();
		}
	}
	
	@Test
	public void PushTest2() 
	{
		int [] UnexpectedStack= {3,6,9,12,15};	
			
		StackList.push(8);
		StackList.push(1);
		StackList.push(2);
		StackList.push(2);
		StackList.push(17);
			
		for (int i=0; i < StackList.getSize(); i++)
		{
			assertNotEquals(UnexpectedStack[i], StackList.top());
			StackList.pop();
		}
	}
	
	@Test
	public void TopTest() 
	{
		StackList.push(8);
		StackList.push(1);
		StackList.push(2);
		StackList.push(2);
		StackList.push(17);
		
		assertEquals(17,StackList.top());
	}
	
	@Test
	public void TopTest2() 
	{
		StackList.push(8);
		StackList.push(1);
		StackList.push(2);
		StackList.push(2);
		StackList.push(17);
		
		assertNotEquals(8,StackList.top());
	}

	@Test
	public void popTest()
	{
		int [] ExpectedPopResult= {17,2,2,1,8};

		StackList.push(8);
		StackList.push(1);
		StackList.push(2);
		StackList.push(2);
		StackList.push(17);
		
	
		for (int i=0; i < StackList.getSize(); i++)
		{
			assertEquals(ExpectedPopResult[i],StackList.pop());
		}
	}
	
	@Test
	public void popTest2()
	{
		int [] UnexpectedPopResult= {3,6,9,12,15};

		StackList.push(8);
		StackList.push(1);
		StackList.push(2);
		StackList.push(2);
		StackList.push(17);
		
	
		for (int i=0; i < StackList.getSize(); i++)
		{
			assertNotEquals(UnexpectedPopResult[i],StackList.pop());
		}
	}
}
