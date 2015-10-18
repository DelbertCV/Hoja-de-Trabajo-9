/**
 * 
 * Jonathan Aguirre, 14349
 * Yosemite Melendez, 14413
 * Delbert Custodio, 14246
 * 
 * 
 * Obtenido en Internet por medio de Google Search buscando
 * "NombreDeLaClase".java seguida de "Duane Bailey".
 * 
 *  
 * Propiedad del autor Duane A. Bailey
 * 
 */

import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;

public class BinarySearchTree<E extends Comparable<E>>  implements OrderedStructure<E>{ 
	
	protected BinaryTree<E> root;
	protected final BinaryTree<E> EMPTY = new BinaryTree<E>();
	protected int count;
	protected Comparator<E> ordering;
	
	public BinarySearchTree()
	// post: constructs an empty binary search tree
	{
	this(new NaturalComparator<E>());
	}
	public BinarySearchTree(Comparator<E> alternateOrder)
	// post: constructs an empty binary search tree
	{
	root = EMPTY;
	count = 0;
	ordering = alternateOrder;
	}
	
	protected BinaryTree<E> locate(BinaryTree<E> root, E value)
	// pre: root and value are non-null
	// post: returned: 1 - existing tree node with the desired value, or
	// 2 - the node to which value should be added
	{
	E rootValue = root.value();
	BinaryTree<E> child;
	// found at root: done
	if (rootValue.equals(value)) return root;
	// look left if less-than, right if greater-than
	if (ordering.compare(rootValue,value) < 0)
	{
	child = root.right();
	} else {
	child = root.left();
	}
	// no child there: not in tree, return this node,
	// else keep searching
	if (child.isEmpty()) {
	return root;
	} else {
	return locate(child, value);
	}
	}
	
	public boolean contains(E value)
	// post: returns true iff val is a value found within the tree
	{
	if (root.isEmpty()) return false;
	BinaryTree<E> possibleLocation = locate(root,value);
	return value.equals(possibleLocation.value());
	}
	
	public void add(E value)
	// post: adds a value to binary search tree
	{
	BinaryTree<E> newNode = new BinaryTree<E>(value,EMPTY,EMPTY);
	// add value to binary search tree
	// if there's no root, create value at root
	if (root.isEmpty())
	{
	root = newNode;
	} else {
	BinaryTree<E> insertLocation = locate(root,value);
	E nodeValue = insertLocation.value();
	// The location returned is the successor or predecessor
	// of the to-be-inserted value
	if (ordering.compare(nodeValue,value) < 0) {
	insertLocation.setRight(newNode);
	} else {
	if (!insertLocation.left().isEmpty()) {
	// if value is in tree, we insert just before
	predecessor(insertLocation).setRight(newNode);
	} else {insertLocation.setLeft(newNode);
	}
	}
	}
	count++;
	}
	protected BinaryTree<E> predecessor(BinaryTree<E> root)
	{
	if(!root.isEmpty()) System.out.println( "No predecessor to middle value.");;
	if(!root.left().isEmpty()) System.out.println( "Root has left child.");;
	BinaryTree<E> result = root.left();
	while (!result.right().isEmpty()) {
	result = result.right();
	}
	return result;
	}
	protected BinaryTree<E> removeTop(BinaryTree<E> topNode)
	// pre: topNode contains the value we want to remove
	// post: we return an binary tree rooted with the predecessor of topnode.
	{
	// remove topmost BinaryTree from a binary search tree
		
		BinaryTree<E> left = topNode.left();
		BinaryTree<E> right = topNode.right();
		// disconnect top node
		topNode.setLeft(EMPTY);
		topNode.setRight(EMPTY);
		// Case a, no left BinaryTree
		// easy: right subtree is new tree
		if (left.isEmpty()) { return right; }
		// Case b, no right BinaryTree
		// easy: left subtree is new tree
		if (right.isEmpty()) { return left; }
		// Case c, left node has no right subtree
		// easy: make right subtree of left
		BinaryTree<E> predecessor = left.right();
		if (predecessor.isEmpty())
		{
		left.setRight(right);
		return left;
		}
		// General case, slide down left tree
		// harder: successor of root becomes new root
		// parent always points to parent of predecessor
		BinaryTree<E> parent = left;
		while (!predecessor.right().isEmpty())
		{
		parent = predecessor;
		predecessor = predecessor.right();
		}
		// Assert: predecessor is predecessor of root
		parent.setRight(predecessor.left());
		predecessor.setLeft(left);
		predecessor.setRight(right);
		return predecessor;
		}

	public int size() {
		
		return 0;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	

	public Enumeration elements() {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object remove(E value) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/*public Iterator<E> iterator()
	// post: returns iterator to traverse BST
	{
	return root.inorderIterator();
	}*/
}

	