public class QueueQ2   
{    
  private int maxSize;  
  private int[] queueArray;  
  private int front;  
  private int rear;  
  private int currentSize;  
  
  //Constructor  
  public QueueQ2(int size)  
  {  
    this.maxSize = size;  
    this.queueArray = new int[size];  
    front = 0;  
    rear = -1;  
    currentSize = 0;  
  }  
  //inserting element 
  public void insert(int item)  
  {  
    //checking if queue is full 
    if(isQueueFull())  
    {  
      System.out.println("Queue is full!");  
      return;  
    }  
    if(rear == maxSize - 1)  
{  
      rear = -1;  
    }  
    //incrementing rear for insertion  
    queueArray[++rear] = item;  
    currentSize++;  
    System.out.println("Item added to queue: " + item);  
  }  
  //Delete operation    
  public int delete()  
  {  
    //checking if queue is empty or not  
    if(isQueueEmpty())  
    {  
      throw new RuntimeException("Queue is empty");  
    }  
     
    int temp = queueArray[front++];  
    if(front == maxSize)  
    {  
      front = 0;  
    }  
    currentSize--;  
    return temp;  
  }  
  //peak operation      
  public int peek()  
  {  
    return queueArray[front];  
  }  
  //full queue   
  public boolean isQueueFull()  
  {  
    return (maxSize == currentSize);  
  }      
  //Empty Operation  
  public boolean isQueueEmpty()  
{  
    return (currentSize == 0);  
  }  
  //Main code 
  public static void main(String[] args)   
  {  
    QueueQ2 queue = new QueueQ2(10);  
    queue.insert(2);  
    queue.insert(3);  
    queue.insert(29); 
    queue.insert(39); 
    System.out.println("Item deleted from queue: " + queue.delete());  
    System.out.println("Item deleted from queue: " + queue.delete());  
    queue.insert(5);      
    System.out.println("Item deleted from queue: " + queue.delete());      
  }  
}