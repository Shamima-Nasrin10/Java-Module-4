package testbinarysearch;

class TreeNode<E> {

    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;
            TreeNode<E> root;

    public TreeNode() {
    }

    public TreeNode(E e) {
        element = e;
    }
    
        @Override
    public String toString() {
        return "TreeNode{" + "element=" + element + ", left=" + left + ", right=" + right + '}';
    }

}
