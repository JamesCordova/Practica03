public class Test{
  public static void main(String[] args){
    TADHeap<Integer> n = new TADHeap<Integer>();
    n.insert(12);
    n.insert(2);
    n.insert(42);
    n.insert(22);
    n.insert(19);
    n.insert(1);
    n.insert(6);
    n.insert(10);
    n.remove(2);
    n.remove(22);
    n.remove(10);
    n.remove(6);
    n.remove(2);
    System.out.println(n);
  }
}
