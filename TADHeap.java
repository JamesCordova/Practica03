import java.util.ArrayList;

public class TADHeap<T extends Comparable<T>>{
  private ArrayList<T> heap;

  public TADHeap(){
    heap = new ArrayList<T>();
  }
  public void insert(T item){
    heap.add(item);
    int i = heap.size() - 1;
    int padre = padre(i); // obtenemos padre antes del bucle
    while( i > 1 && heap.get(i).compareTo(heap.get(padre)) > 0) {
      //intercambiamos con el padre
      cambiar(i, padre);
      i = padre; // pasariamos a evaluar el nodo del parent para saber si debemos cambiar al padre de este tambien
      padre = padre(i); // avanzamos
    }
  }
  public T remove(){
    return null;
  }
  private void cambiar(int i, int padre){
    T temp = heap.get(padre);
    heap.set(padre, heap.get(i));
    heap.set(i, temp);
  }

  private int padre(int i){
    return i/2;
  }

  public String toString(){
    String res = "";
    for(int i = 0; i < heap.size(); i++){
      res += heap.get(i) + " ";
    }
    return res;
  }

}
