package tree;

import java.util.Comparator;

import sun.util.resources.CurrencyNames;

/*
 * Конспект:
 * Система заполнениея, например 
 * 					- число больше права, число меньше слева
 *															
 * .................10.......................................
 * ............./.......\...................................
 * ...........8..........12.................................
 * ........./..\..........................................
 * ........6....9...........................................
 * .........................................................
 * ........................................................
 * 															
 */

public class TreeShagoSet<OTHER_TYPE> implements ShagoSet<OTHER_TYPE> {
	private Comparator<OTHER_TYPE> comparator;
	private Node<OTHER_TYPE> root = null;

	public TreeShagoSet(Comparator<OTHER_TYPE> comparator) {
		this.comparator = comparator;
	}

	@Override
	public void add(OTHER_TYPE element) {
		Node newNode = new Node(element);

		if (root == null) {
			root = newNode;
			return;
		}

		Node<OTHER_TYPE> tempNode = root;
		while (true) {
			if (comparator.compare(element, tempNode.value) == 0) {
				return;
			}
			if (comparator.compare(element, tempNode.value) > 0) {
				if (tempNode.right == null) {
					tempNode.right = newNode;
					break;
				}
				tempNode = tempNode.right;

			} else {
				if (tempNode.left == null) {
					tempNode.left = newNode;
					break;
				}
				tempNode = tempNode.left;
			}
		}
	}

	@Override
	public void remove(OTHER_TYPE element) {
		

	}

	@Override
	public boolean contains(OTHER_TYPE element) {
		
		return false;
	}

	@Override
	public String toString() {
		if (root == null) {
			return null;
		}
		return toString(root);
	}

	private String toString(Node<OTHER_TYPE> currentNode) {
		if (currentNode == null) {
			return "";
		}
		return toString(currentNode.right) + currentNode.value.toString() + " " + toString(currentNode.left);

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
