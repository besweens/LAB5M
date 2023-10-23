
public class myBinarySearchTree extends BinarySearchTree {

    private int size;

    public myBinarySearchTree() {
        super();
        size = 0;
    }

    
    private void add(int node, Node<Integer> root) {
    	
    	if(node==null) {
    		
    	}
    	
    	
    	
    }
    @Override
    public boolean add(int value) {
        
    	add(value);
    		
    		size++;
    		return true;
   	
    	}
        
    

    public int getSize() {
        return size;
    }
}
