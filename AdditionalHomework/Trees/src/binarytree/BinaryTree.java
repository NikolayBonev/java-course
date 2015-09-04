package binarytree;

public class BinaryTree<T extends Comparable<T>> {

	private static class BinaryTreeNode<T>{
		
		private BinaryTreeNode<T> leftChild;
		private BinaryTreeNode<T> rightChild;
		private T value;
		
		public BinaryTreeNode(T value){
			this(value, null, null);
		}
		
		public BinaryTreeNode(T value, BinaryTreeNode<T> leftChild, BinaryTreeNode<T> rightChild){
			this.leftChild = leftChild;
			this.rightChild = rightChild;
			setValue(value);
		}

		public T getValue() {
			return this.value;
		}

		public void setValue(T value) {
			if(value != null){
				this.value = value;
			}
		}
		
		public void setLeftChild(BinaryTreeNode<T> leftChild) {
			this.leftChild = leftChild;
		}

		public void setRightChild(BinaryTreeNode<T> rightChild) {
			this.rightChild = rightChild;
		}

		public BinaryTreeNode<T> getLeftChild() {
			return this.leftChild;
		}

		public BinaryTreeNode<T> getRightChild() {
			return this.rightChild;
		}

		@Override
		public int hashCode() {
			return this.value.hashCode();
		}
	
		@Override
		public String toString() {
			return this.value.toString();
		}
		
		@Override
	    public boolean equals(Object obj) {
	        @SuppressWarnings("unchecked")
			BinaryTreeNode<T> other = (BinaryTreeNode<T>) obj;
	        
	        if(this.hashCode() == other.hashCode()){
	        	return true;
	        }
	        
	        return false;
	    }
	}
	
	private BinaryTreeNode<T> root;
	
	public BinaryTree(){
		this.root = null;
	}
	
	public BinaryTree(T value){
		if (value == null){
              throw new IllegalArgumentException("Cannot insert null value!");
        }
		
		if(this.root == null){
			this.root = new BinaryTreeNode<T>(value);
		}
	}
	
	public void addBinaryTreeNode(T value){
		
		BinaryTreeNode<T> node = new BinaryTreeNode<T>(value);
		
		addBinaryTreeNode(value, this.root, node);
		
	}
	
	private void addBinaryTreeNode(T value, BinaryTreeNode<T> root, BinaryTreeNode<T> node){
		
		if(this.root == null){
			this.root = node;
		}else{
			int compare = root.getValue().compareTo(node.getValue());
			
			if(compare > 0 && root.getLeftChild() == null){
				root.setLeftChild(node);
				
			}else if(compare > 0 && root.getLeftChild() != null){
				addBinaryTreeNode(value, root.getLeftChild(), node);
				
			}else if(compare < 0 && root.getRightChild() == null){
				root.setRightChild(node);
				
			}else if(compare < 0 && root.getRightChild() != null){
				addBinaryTreeNode(value, root.getRightChild(), node);
			}
		}
	}
	
	public void printBinaryTreePreOrder(){
		
		if(this.root == null){
			System.out.println("There are no elements in the tree!");
			return;
		}
		
		printBinaryTreePreOrder(this.root);
	}
	
	private void printBinaryTreePreOrder(BinaryTreeNode<T> root){
		
		if(root.getLeftChild() != null){
			printBinaryTreePreOrder(root.getLeftChild());
		}
		
		System.out.print(root.getValue() + " ");
		
		if(root.getRightChild() != null){
			printBinaryTreePreOrder(root.getRightChild());
		}
	}
	
	public void printBinaryTreeInOrder(){
		
		if(this.root == null){
			System.out.println("There are no elements in the tree!");
			return;
		}
		
		printBinaryTreeInOrder(this.root);
	}
	
	private void printBinaryTreeInOrder(BinaryTreeNode<T> root){
		
		System.out.print(root.getValue() + " ");
		
		if(root.getLeftChild() != null){
			printBinaryTreeInOrder(root.getLeftChild());
		}
				
		if(root.getRightChild() != null){
			printBinaryTreeInOrder(root.getRightChild());
		}
	}
}