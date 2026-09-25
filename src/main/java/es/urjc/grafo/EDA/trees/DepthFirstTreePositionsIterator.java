package es.urjc.grafo.EDA.trees;

import es.urjc.grafo.EDA.lists.LinkedPositionalList;
import es.urjc.grafo.EDA.utils.Position;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DepthFirstTreePositionsIterator<T> implements Iterator<Position<T>> {

    // TODO

    public DepthFirstTreePositionsIterator(Tree<T> tree) {
        this(tree, tree.root());
    }

    public DepthFirstTreePositionsIterator(Tree<T> tree, Position<T> root) {
        // TODO
        throw  new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean hasNext() {
        // TODO
        throw  new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * This method visits the nodes of a tree by following a pre-order
     */
    @Override
    public Position<T> next() {
        // TODO
        throw  new UnsupportedOperationException("Not supported yet.");
    }

}
