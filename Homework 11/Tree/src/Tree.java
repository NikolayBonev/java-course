import java.util.ArrayList;

public class Tree<T> {
	
	private int count = 0;
	private class TreeNode<T>{
		private T value;
		private boolean hasParent;
		private ArrayList<TreeNode<T>> children;
		
		public TreeNode(T value){
			if (value == null) {
				throw new IllegalArgumentException("Cannot insert null value!");
            }
			
			this.value = value;
			this.children = new ArrayList<TreeNode<T>>();
		}

		public T getValue() {
			return this.value;
		}
		
		public void addChild(TreeNode<T> child){
			if (child == null) {
                throw new IllegalArgumentException("Cannot insert null value!");
            }
			
			if (child.hasParent) {
                throw new IllegalArgumentException("The node already has a parent!");
            }
			
			child.hasParent = true;
            this.children.add(child);
		}
		
		public TreeNode<T> getChild(int index) {
            return this.children.get(index);
        }
		
		public int getChildrenCount() {
            return this.children.size();
        }
		
	}
	
	private TreeNode<T> root;
	
	public Tree(T item){
		if(item == null){
			throw new IllegalArgumentException("Cannot insert null value!");
		}
		
		this.root = new TreeNode<T>(item);
	}

	public Tree(T value, Tree<T> ...children){
        this(value);
       
        for (Tree<T> child : children) {
            this.root.addChild(child.root);
        }
    }
	
	public TreeNode<T> getRoot() {
		return root;
	}
	
	public ArrayList<TreeNode<T>> getChildNodes(){
        if (this.root != null)
        {
            return this.root.children;
        }      
        return new ArrayList<TreeNode<T>>();
    }
	
	private void printDFS(TreeNode<T> root, String spaces) {
        if (this.root == null) {
          return;
        }
           
        System.out.println(spaces + root.getValue());
         
        TreeNode<T> child = null;
        for (int i = 0; i < root.getChildrenCount(); i++) {
            child = root.getChild(i);
            printDFS(child, spaces + "   ");
        }
    }
	
	public void printDFS() {
        this.printDFS(this.root, new String());
    }
	
	private int searchElement(TreeNode<T> node, T element) {
        if (node == null) {
        	count--;
        	return 0;
        }
        
		if(node.getValue().equals(element)){
			return 1;
		}
		
		int res = 0;
        TreeNode<T> child = null;
        for (int i = 0; i < node.getChildrenCount(); i++) {
            child = node.getChild(i);
            count++;
            res= searchElement(child, element);
            if(res != 0){
            	return 1;
            }
        }
        
        count--;
        
        return res;
    }
   
	public int searchElement(T element) {
		if(this.searchElement(this.root, element) == 0){
			return -1;
		}
		
		return this.count;
        
    }

}
