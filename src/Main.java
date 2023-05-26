public class Main {
    public static void main(String[] args) {
        BST<Integer, Integer> bst = new BST<>();
        for (int i = 5; i < 10; i++){
            bst.put(i, i);
        }
        for (int i = 0; i < 5; i++){
            bst.put(i, i);
        }
        System.out.println(bst.contains(3));
    }
}