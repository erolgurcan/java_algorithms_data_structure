public class BinaryNode<T> {

    T data;

    BinaryNode leftChild;

    BinaryNode rightChild;

    public BinaryNode() {
        this(null);
    }

    public BinaryNode(T dataPortion) {
        this(dataPortion, null, null);
    }

    public BinaryNode(T dataPortion, BinaryNode<T> leftChild, BinaryNode<T> rightChild) {
        this.data = dataPortion;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinaryNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryNode newLeftChild) {
        this.leftChild = newLeftChild;
    }

    public BinaryNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryNode newRightChild) {
        this.leftChild = newRightChild;
    }

    public boolean hasLeftChild() {
        return leftChild != null;
    }

    public boolean hasRightChild() {
        return rightChild != null;
    }

    public boolean isLeaf() {
        return (leftChild == null) && (rightChild == null);
    }

    public BinaryNode<T> copy() {

        BinaryNode<T> newRoot = new BinaryNode<>(data);
        if (leftChild != null) {
            newRoot.setLeftChild(leftChild.copy());
        }
        if (rightChild != null) {
            newRoot.setRightChild(rightChild.copy());
        }
        return newRoot;
    }

    public int getHeight() {
        return getHeight(this);
    }

    private int getHeight(BinaryNode<T> node) {
        int height = 0;

        if (node != null) {
            height = 1 + Math.max(getHeight(node.getLeftChild()), getHeight(node.getRightChild()));
        }
        return height;
    }

    public void inorderTraverse() {
        inorderTraverse();
    }

    private void inorderTraverse(BinaryNode<T> node) {
        if (node != null) {
            inorderTraverse(node.getLeftChild());
            System.out.println(node.getData());
            inorderTraverse(node.getRightChild());
        }
    }
}
