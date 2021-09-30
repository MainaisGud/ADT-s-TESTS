import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;

public class QueueArrayTest 
{
	private QueueArray Q_arr; 
	
	@Before
	public void InitializeQueueArray()
	{
		Q_arr = new QueueArray(5);
	}

	@Test
	public void EnqueueTest()
	{
		int [] ExpectedQueue= {8,1,2,2,17};
		
		QueueArray.enqueue(8);
		QueueArray.enqueue(1);
		QueueArray.enqueue(2);
		QueueArray.enqueue(2);
		QueueArray.enqueue(17);
		
		for (int i=0; i < QueueArray.size; i++)
		{
			assertEquals(ExpectedQueue[i], QueueArray.dequeue());
		}
	
	}
	
	@Test
	public void EnqueueTest2()
	{
		int [] UnexpectedQueue = {3,6,9,12,15};
		
		QueueArray.enqueue(8);
		QueueArray.enqueue(1);
		QueueArray.enqueue(2);
		QueueArray.enqueue(2);
		QueueArray.enqueue(17);
		
		for (int i=0; i < QueueArray.size; i++)
		{
			assertNotEquals(UnexpectedQueue[i], QueueArray.dequeue());
		}
	}
	
	@Test
	public void DequeueTest()
	{
		int [] ExpectedDequeueResult= {8,1,2,2,17};
		
		QueueArray.enqueue(8);
		QueueArray.enqueue(1);
		QueueArray.enqueue(2);
		QueueArray.enqueue(2);
		QueueArray.enqueue(17);
		
		for (int i=0; i < QueueArray.size; i++)
		{
			assertEquals(ExpectedDequeueResult[i], QueueArray.dequeue());
		}
	}
	
	@Test
	public void DequeueTest2()
	{
		int [] UnexpectedDequeueResult= {3,6,9,12,15};
		
		QueueArray.enqueue(8);
		QueueArray.enqueue(1);
		QueueArray.enqueue(2);
		QueueArray.enqueue(2);
		QueueArray.enqueue(17);
		
		for (int i=0; i < QueueArray.size; i++)
		{
			assertNotEquals(UnexpectedDequeueResult[i], QueueArray.dequeue());
		}
	}
}
