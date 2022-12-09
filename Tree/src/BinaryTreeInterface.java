public interface BinaryTreeInterface<T> extends TreeIteratorInterface<T>, TreeInterface<T> {

    public void setRootData(T rootData);

    public void setTree(T rootData, BinaryTreeInterface<T> leftTree, BinaryTreeInterface<T> rightTree);

}
