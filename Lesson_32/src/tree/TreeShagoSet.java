package tree;

import java.util.Comparator;

/*
 * Конспект:
 * Система заполнениея, например 
 * 					- число больше права, число меньше слева
 *															
 * .................9.......................................
 * ............./.......\...................................
 * ...........7..........11.................................
 * ........./........../....\...............................
 * ........6..........10....33..............................
 * ...........................\.............................
 * ............................22...........................
 * 															
 */

public class TreeShagoSet<OTHER_TYPE> implements ShagoSet<OTHER_TYPE> {
	private Comparator<OTHER_TYPE> comparator;
	private Node<OTHER_TYPE> root = null;

	@Override
	public void add(OTHER_TYPE element) {
		Node newNode = new Node(element);

		if (root == null) {
			root = newNode;
			return;
		}

		Node<OTHER_TYPE> tempNode = root;
		while(tempNode.left !=null && tempNode.right !=null){
			if (comparator.compare(element, root.value) == 0) {
				return;
			}
			if (comparator.compare(element, root.value) > 0) {
				if(tempNode==null){tempNode.right=newNode;}
				tempNode = tempNode.right;
				break;
			} else {
				if(tempNode==null){tempNode.left=newNode;}
				tempNode = tempNode.left;
				break;
			}
		}

	}

	@Override
	public void remove(OTHER_TYPE element) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(OTHER_TYPE element) {
		// TODO Auto-generated method stub
		return false;
	}

	static private class Node<OTHER_TYPE> {
		public OTHER_TYPE value;
		public Node<OTHER_TYPE> left;
		public Node<OTHER_TYPE> right;

		public Node(OTHER_TYPE value) {
			this.value = value;
		}
	}

}
