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
    System.out.println(n);
    n.remove();
    System.out.println(n);
    n.remove();
    System.out.println(n);
  }
}
