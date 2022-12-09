public class BinaryTree<T> implements BinaryTreeInterface<T> {

    public BinaryNode<T> root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(T rootData) {
        root = new BinaryNode<>(rootData);
    }

    public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree) {

        initializeTree(rootData, leftTree, rightTree);
    }

    @Override
    public void setRootData(T rootData) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setTree(T rootData, BinaryTreeInterface<T> leftTree, BinaryTreeInterface<T> rightTree) {

        initializeTree(rootData, (BinaryTree<T>) leftTree, (BinaryTree<T>) rightTree);

    }

    private void initializeTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree) {

        // root = new BinaryNode<>(rootData);

        // if (leftTree != null) {
        // root.setLeftChild(leftTree.root);
        // root.setRightChild(rightTree.root);
        // }

        // if (rightTree != null) {
        // root.setRightChild(rightTree.root);
        // }

        if ((leftTree != null) && (!leftTree.isEmpty())) {
            root.setLeftChild(leftTree.root);
        }

        if ((rightTree != null) && (!rightTree.isEmpty())) {

            if (rightTree != leftTree) {
                root.setRightChild(rightTree.root);
            } else {
                root.setRightChild(rightTree.root.copy());
            }
        }
        if ((leftTree != null) && (leftTree != this)) {
            leftTree.clear();
        }
        if ((rightTree != null) && (rightTree != this)) {
            rightTree.clear();
        }

    }

    private void clear() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

}
