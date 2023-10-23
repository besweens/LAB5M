public class myBinarySearchTree extends BinarySearchTree {

    private int size;

    public myBinarySearchTree() {
        super();
        size = 0;
    }

    @Override
    public void add(int value) {
        super.add(value);
        size++;
    }

    public int getSize() {
        return size;
    }
}
