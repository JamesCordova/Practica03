import java.util.Arraylist;

public class TADHeap<T extends Comparable<T>>{
  private ArrayList<T> heap;

  public TADHeap(){
    heap = new Arraylist<T>();
  }
  public void insert(){
    a[++n] = x;
    T temp;
    for(j=n; j>1 && a[j]>a[j/2]; j/=2) {
      //intercambiamos con el padre
      temp = a[j];
      a[j] = a[j/2];
      a[j/2] = temp;
    }
  }
  public T remove(){

  }

}
