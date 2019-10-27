package cn.rocker.bstree;

import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author rocker
 * @date 2019/10/26 10:50
 * @since V1.0
 */
public class TestCase {

    @Test
    public void testPreOrderTraverse() {
        BSTree<Integer> integerBSTree = new BSTree<>();
        int[] nums = {5, 3, 6, 8, 4, 2};
        for (int num : nums) {
            integerBSTree.add(num);
        }

//        integerBSTree.preOrder();
//        System.out.println();
//        integerBSTree.preOrderNR();
//        System.out.println();
//        integerBSTree.inOrder();
//        System.out.println();
//        integerBSTree.postOrder();
//        System.out.println();
//        System.out.println(integerBSTree);
        integerBSTree.levelOrder();

    }

    @Test
    public void testRemoveMin() {
        BSTree<Integer> integerBSTree = new BSTree<>();
        Random random = new Random();
        int n = 1000;
        for (int i = 0; i < n; i++) {
            integerBSTree.add(random.nextInt(10000));
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!integerBSTree.isEmpty()) {
            list.add(integerBSTree.removeMin());
        }
        System.out.println(list);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) > list.get(i)) {
                throw new IllegalArgumentException("error!");
            }
        }
        System.out.println("removeMin test completed!");
    }

}
