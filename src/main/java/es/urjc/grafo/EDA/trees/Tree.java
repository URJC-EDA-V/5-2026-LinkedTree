package es.urjc.grafo.EDA.trees;

import es.urjc.grafo.EDA.utils.Position;

/**
 * An interface for a tree where nodes can have an arbitrary number of children.
 *
 * @param <E> Element stored in tree nodes.
 */
public interface Tree<E> extends Iterable<Position<E>> {

    /**
     * Returns whether the tree is empty.
     *
     * @return true if empty, false otherwise.
     */
    boolean isEmpty();


    /**
     * Returns the number of elements that are contained within the tree.
     *
     * @return the size of the tree.
     */
    int size();

    /**
     * Returns the root of the tree.
     *
     * @return
     */
    Position<E> root();

    /**
     * Returns the parent of a given node.
     *
     * @param position
     * @return
     */
    Position<E> parent(Position<E> position);

    /**
     * Returns an iterable collection of the children of a given node.
     *
     * @param position
     * @return
     */
    Iterable<? extends Position<E>> children(Position<E> position);

    /**
     * Returns whether a given node is internal.
     *
     * @param position
     * @return
     */
    boolean isInternal(Position<E> position);

    /**
     * Returns whether a given node is external.
     *
     * @param position
     * @return
     */
    boolean isLeaf(Position<E> position);

    /**
     * Returns whether a given node is the root of the tree.
     *
     * @param position
     * @return
     */
    boolean isRoot(Position<E> position);
}