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
    T ult = heap.get(heap.size() - 1); // tomamos el valor del ultimo item
    heap.set(0, ult); // reemplazamos el valor del primero con el ultimo item
    heap.remove(heap.size() - 1); // eliminamos el ultimo valor
    int j = 1; // sera el padre por donde empezar
    while(2 * j < heap.size() - 1) { // mientras tenga algún hijo
      int k = 2 * j; // el hijo izquierdo
      if ( k + 1 <= heap.size() && heap.get(k + 1).compareTo(heap.get(k)) > 0) //Si el derecho es mayor al izquierdo
        k++; // el hijo derecho es el mayor, entonces tomamos el el derecho a modificar
      if ( heap.get(j).compareTo(heap.get(k)) > 0) // j el padre, comparado con el mayor de sus hijos
        break; // la posicion es correcta el padre es el mayor
      /* t = a[j];
      a[j] = a[k]; // cambiar valores
      a[k] = t; */
      cambiar(k, j); // cambiamos valores
      j = k; // lo intercambiamos con el mayor hijo
    }
    return raiz;
  }
  private int search(T item){
    // para aprovechar el HEAP utilizaremos el compareTo
    int i = 0;
    int j = heap.size() - 1;
    while(i < j){
      int ind = i * 2;
      int comp = item.compareTo(heap.get(ind))
      if( comp == 0){
        return ind;
      }
      else if(comp > 0){
        j = ind - 1;
      }
      else{
        i = ind + 1;
      }
    }
    return -1;
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
