/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeNode;

/**
 *
 * @author ASUS
 */
public class BinaryTreeApps {
         public static void main(String[] args) {  
        BinaryTree tree = new BinaryTree();
    
        TreeNode node;
    
        node = new TreeNode('D');
        tree.insert(node);
    
        node = new TreeNode('B');
        tree.insert(node);
    
        node = new TreeNode('A');
        tree.insert(node);
    
        node = new TreeNode('C');
        tree.insert(node);
    
        node = new TreeNode('F');
        tree.insert(node);
    
        node = new TreeNode('E');
        tree.insert(node);
    
        node = new TreeNode('G');
        tree.insert(node);
    
        System.out.print("Traversal dengan preorder : ");
        tree.preOrder();
        System.out.print("\nTraversal dengan postorder : ");
        tree.postOrder();
        System.out.print("\nTraversal dengan inorder : ");
        tree.inOrder();
        System.out.println();
        
        System.out.println("");
        System.out.println("Sutrisno");
    }   
}
