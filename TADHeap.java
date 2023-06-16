import java.util.Arraylist;

public class TADHeap<T extends Comparable<T>>{
  private ArrayList<T> heap;

  public TADHeap(){
    heap = new ArrayList<T>();
  }
  public void insert(T item){
    heap.add(item);
    int i = heap.size() - 1;
    int padre = padre(i);
    while( i > 1 && heap.get(i).compareTo(heap.get(padre)) > 0) {
      //intercambiamos con el padre
      padre = i / 2;
      cambiar(i, padre)
    }
  }
  public T remove(){

  }
  private void cambiar(int i, int padre){
    T temp = heap.get(padre);
    heap.set(padre, heap.get(i));
    heap.set(i, temp);
  }

  private int padre(int i){
    return i/2;
  }

}
