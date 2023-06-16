import java.util.Arraylist;

public class TADHeap<T extends Comparable<T>>{
  private ArrayList<T> heap;

  public TADHeap(){
    heap = new ArrayList<T>();
  }
  public void insert(T item){
    heap.add(item);
    T temp;
    for(int i = heap.size(); i>1 && a[j]>a[j/2]; heap.get(i)) {
      //intercambiamos con el padre
      padre = i / 2;
      cambiar(i, padre)
    }
  }
  public T remove(){

  }
  private void cmabiar(int i, int padre){

  }

}
