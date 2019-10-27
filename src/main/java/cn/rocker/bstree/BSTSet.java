package cn.rocker.bstree;

import cn.rocker.interfaces.Set;

/**
 * @author rocker
 * @date 2019/10/25 17:56
 * @since V1.0
 */
public class BSTSet<E extends Comparable<E>> implements Set<E> {

    private BSTree bsTree;

    public BSTSet(){
        this.bsTree = new BSTree();
    }

    @Override
    public void add(E e) {
//        bsTree.a
    }

    @Override
    public void remove(E e) {

    }

    @Override
    public boolean contains(E e) {
        return false;
    }

    @Override
    public int getSize() {
        return bsTree.size();
    }

    @Override
    public boolean isEmpty() {
        return bsTree.isEmpty();
    }
}
