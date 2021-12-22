/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binarysearchtree;

/**
 *
 * @author alimdursun
 */
public class BinaryTree {
    private TreeNode root;
    
    public BinaryTree(){
        root=null;
    }
    
    public TreeNode getRoot(){
        return root;
    }
    
    public void preOrder(TreeNode localRoot){
        if(localRoot!=null){
            localRoot.displayNode();
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }
    
    public void inOrder(TreeNode localRoot){
        if(localRoot!=null){
            inOrder(localRoot.leftChild);
            localRoot.displayNode();
            inOrder(localRoot.rightChild);
        }
    }
    
    public void postOrder(TreeNode localRoot){
        if(localRoot!=null){
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            localRoot.displayNode();
        }
    }
    
    public void insert(int newData){
        TreeNode newNode=new TreeNode();
        newNode.data=newData;
        if(root==null){
            root=newNode;
        }else{
            TreeNode current=root;
            TreeNode parent;
            while(true){
                parent=current;
                if(newData<current.data){
                    current=current.leftChild;
                    if(current==null){
                        parent.leftChild=newNode;
                        return;
                    }
                }else{
                    current=current.rightChild;
                    if(current==null){
                        parent.rightChild=newNode;
                        return;
                    }
                }
            }
        }
    }
}
