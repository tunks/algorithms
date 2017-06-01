/**
 *
 *  450. Delete Node in a BST
 *    Given a root node reference of a BST and a key, delete the node with the given key 
 *    in the BST. Return the root node reference (possibly updated) of the BST.
 *    
 *    Basically, the deletion can be divided into two stages:
 *    
 *    Search for a node to remove.
 *    If the node is found, delete the node.
 *    Note: Time complexity should be O(height of tree).
 *    
 *    Example:
 *    
 *    root = [5,3,6,2,4,null,7]
 *    key = 3
 *    
 *        5
 *       / \
 *      3   6
 *     / \   \
 *    2   4   7
 *    
 *    Given key to delete is 3. So we find the node with value 3 and delete it.
 *    
 *    One valid answer is [5,4,6,2,null,null,7], shown in the following BST.
 *    
 *        5
 *       / \
 *      4   6
 *     /     \
 *    2       7
 *    
 *    Another valid answer is [5,2,6,null,4,null,7].
 *    
 *        5
 *       / \
 *      2   6
 *       \   \
 *        4   7
 *
 */
import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public TreeNode deleteNode(TreeNode root, int key) {
		if (root == null) {
			return null;
		}
		if (key == root.val) {
			return removeRoot(root);
		} else if (key < root.val) {
			root.left = deleteNode(root.left, key);
			return root;
		} else {
			root.right = deleteNode(root.right, key);
			return root;
		}
	}
	
	public TreeNode removeRoot(TreeNode root) {
		if (root.left == null) {
			return root.right;
		} else if (root.right == null) {
			return root.left;
		}
		TreeNode node = root.right;
		while (node.left != null) {
			if (node.left.left == null) {
				TreeNode temp = node.left;
				node.left == null;
				temp.left = root.left;
				temp.right = root.right;
				return temp;
			}
			node = node.left;
		}
		root.right.left = root.left;
		return root.right;
	}
}














