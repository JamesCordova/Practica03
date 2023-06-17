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
    T raiz = heap.get(0); // La variable m lleva el máximo
    // a[1] = a[n--];
    T ult = heap.get(heap.size()); // tomamos el valor del ultimo item
    heap.set(0, ult); // reemplazamos el valor del primero con el ultimo item
    heap.remove(heap.size() - 1) // eliminamos el ultimo valor
    /* j = 1;
    while(2*j < n) { # mientras tenga algún hijo
      k = 2*j; # el hijo izquierdo
        if ( k+1 <= n && a[k+1] > a[k])
          k = k+1; # el hijo derecho es el mayor
            if ( a[j] > a[k])
              break; # es mayor que ambos hijos
                t = a[j];
      a[j] = a[k];
      a[k] = t;
      j = k; # lo intercambiamos con el mayor hijo
    }*/
    return null;
  }
  private void cambiar(int i, int padre){
    T temp = heap.get(padre);
    heap.set(padre, heap.get(i));
    heap.set(i, temp);
  }

  private int padre(int i){
    return (i - 1)/2;
  }

  public String toString(){
    String res = "";
    for(int i = 0; i < heap.size(); i++){
      res += heap.get(i) + " ";
    }
    return res;
  }

}
