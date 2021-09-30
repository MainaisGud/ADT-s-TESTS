import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;

public class QueueListTest 
{
	private QueueList Q_LL;
	
	@Before
	public void InitializeQUEUElIST()
	{
		Q_LL = new QueueList();
	}
	
	@Test
	public void enqueueTest()
	{
		int [] ExpectedQueue= {8,1,2,2,17};
	
		QueueList.enqueue(8);
		QueueList.enqueue(1);
		QueueList.enqueue(2);
		QueueList.enqueue(2);
		QueueList.enqueue(17);
		
		for (int i=0; i < QueueList.size; i++)
		{
			assertEquals(ExpectedQueue[i], QueueList.dequeue());
		}
	}
	
	@Test
	public void EnqueueTest2()
	{
		int [] UnexpectedQueue= {3,6,9,12,15};
	
		QueueList.enqueue(8);
		QueueList.enqueue(1);
		QueueList.enqueue(2);
		QueueList.enqueue(2);
		QueueList.enqueue(17);
		
		for (int i=0; i < QueueList.size; i++)
		{
			assertNotEquals(UnexpectedQueue[i], QueueList.dequeue());
		}
	}
	
	@Test
	public void DequeueTest()
	{
		int [] ExpectedDequeueResult= {8,1,2,2,17};
		
		QueueList.enqueue(8);
		QueueList.enqueue(1);
		QueueList.enqueue(2);
		QueueList.enqueue(2);
		QueueList.enqueue(17);
		
		assertEquals(ExpectedDequeueResult[0], QueueList.dequeue());
	}
	
	@Test
	public void DequeueTest2()
	{
		int [] UnexpectedDequeueResult= {3,6,9,12,15};
		
		QueueList.enqueue(8);
		QueueList.enqueue(1);
		QueueList.enqueue(2);
		QueueList.enqueue(2);
		QueueList.enqueue(17);
		
		assertNotEquals(UnexpectedDequeueResult[0], QueueList.dequeue());
	}

}
