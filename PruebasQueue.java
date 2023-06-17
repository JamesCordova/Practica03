public class PruebasQueue{
  public static void main(String[] args){
    PriorityQueueHeap<Integer> nums = new PriorityQueueHeap<Integer>();
    nums.enqueue(20);
    nums.enqueue(50);
    nums.enqueue(10);
    nums.enqueue(60);
    nums.dequeue();
    nums.dequeue();
    int n1 = nums.front();
    int n2 = nums.back();
    System.out.println("front: " + n1 + "\tback: " + n2);

    System.out.print(": " + nums);

  }
}
