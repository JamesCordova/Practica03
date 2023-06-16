public class PriorityQueueHeap<T extends Comparable<T>>{
  private TADHeap<T> heap;

  public PriorityQueueHeap(){
    heap = new TADHeap<T>();
  }
}
