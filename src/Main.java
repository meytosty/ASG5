public class Main {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST();
        int i = 0;
        while (i < 15) {
            bst.put(i, "Value " + i);
            i++;
        }
        Iterable it = bst.iterator();
        for(Object el: it) {
            System.out.println(el);
        }
    }
}