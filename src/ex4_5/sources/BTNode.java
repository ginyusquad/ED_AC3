package ex4_5.sources;


public class BTNode<E> implements BTPosition<E> {

    private E element;
    private BTPosition<E> left, right, parent;

    public BTNode(E element, BTPosition<E> parent, BTPosition<E> left, BTPosition<E> right) {
        setElement(element);
        setParent(parent);
        setLeft(left);
        setRight(right);
    }

    public E element() {
        return element;
    }

    public void setElement(E elm) {
        element = elm;
    }

    public BTPosition<E> getLeft() {
        return left;
    }

    public void setLeft(BTPosition<E> elm) {
        left = elm;
    }

    public BTPosition<E> getRight() {
        return right;
    }

    public void setRight(BTPosition<E> elm) {
        right = elm;
    }

    public BTPosition<E> getParent() {
        return parent;
    }

    public void setParent(BTPosition<E> v) {
        parent = v;
    }
}
