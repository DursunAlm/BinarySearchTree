/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarysearchtree;

/**
 *
 * @author alimdursun
 */
public class BinarySearchTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinaryTree tree=new BinaryTree();
        int []sayilar={7,5,1,8,3,6,0,9,4,2};
        for(int i=1;i<(sayilar.length);++i){
            int sayi=sayilar[i];
            tree.insert(sayi);
        }
        
        tree.inOrder(tree.getRoot());
        tree.preOrder(tree.getRoot());
        tree.postOrder(tree.getRoot());
    }
    
}
