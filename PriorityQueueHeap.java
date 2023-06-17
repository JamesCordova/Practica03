public class PriorityQueueHeap<T extends Comparable<T>>{
  private TADHeap<T> heap;

  public PriorityQueueHeap(){
    heap = new TADHeap<T>();
  }

  public void enqueue(T item){
    heap.insert(item);
  }

  public T dequeue(){
    return heap.remove();
  }

  public T Front() {
    return heap.MayorPrioridad();
  }

    public T Back() {
    return heap.MenorPrioridad();
  }

}
