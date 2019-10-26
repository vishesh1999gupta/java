package generictree;

import java.util.ArrayList;
import java.util.Scanner;

public class generictree {
    Scanner scn = new Scanner(System.in);

    private class node {
        int data;
        ArrayList<node> children = new ArrayList<>();
    }

    private node root;

    public generictree() {
        root = null;
        root = construct(root, -1);
    }

    private node construct(node nn, int i) {
        if (nn == null) {
            System.out.println("enter data for root");
        } else {
            System.out.println("enter data for " + i + "th child of " + nn.data);
        }
        node newnode = new node();
        newnode.data = scn.nextInt();
        System.out.println("enter no of children of " + newnode.data);
        int n = scn.nextInt();
        for (int k = 0; k < n; k++) {
            node child = construct(newnode, k);
            newnode.children.add(child);
        }
        return newnode;
    }

    public void display() {
        System.out.println("------------------------");
        display(root);
        System.out.println("------------------------");
    }

    private void display(node nn) {
        if (nn == null) {
            return;
        }
        String str;
        str = nn.data + "->";
        for (node node : nn.children) {
            str += node.data + ",";
        }
        System.out.println(str + ".");
        for (node node : nn.children) {
            display(node);
        }
    }

    public int size() {
        return size(root);
    }

    private int size(node nn) {
        if (nn == null) {
            return 0;
        }
        int sum = 0;
        for (node node : nn.children) {
            sum += size(node);
        }
        return sum + 1;
    }

    public int max() {
        return max(root, Integer.MIN_VALUE);
    }

    private int max(node nn, int max) {

        for (node node : nn.children) {
            int s = max(node, max);
            if (s > max) {
                max = s;
            }
        }
        if (max > nn.data) {
            return max;
        } else return nn.data;
    }
    public boolean find(int data){
        return find(root,data);
    }

    private boolean find(node nn, int data) {

        if(nn.data==data){
            return true;
        }
        for(node node:nn.children){
            if(find(node,data)){
                return true;
            }
        }
        return false;
    }
    public int height(){
        return height(root);
    }

    private int height(node nn) {

        int max=-1;
        for(node node:nn.children){
            int h=height(node);
            if(h>max){
                max=h;
            }
        }
        return max+1;
    }
    public void mirror(){
        mirror(root);
    }

    private void mirror(node nn) {
         int p2=nn.children.size()-1;
         int p1=0;
         while(p1<p2){
             node temp=nn.children.get(p1);
             nn.children.set(p1,nn.children.get(p2));
             nn.children.set(p2,temp);
             p1++;
             p2--;
         }
         for(node node:nn.children){
             mirror(node);
         }
    }
    public void printatlevel(int lvl){
        printatlevel(root,lvl,0);
    }

    private void printatlevel(node nn, int lvl,int cl) {

        if(cl==lvl){
            System.out.print(nn.data+" ");
            return;
        }
        for(node node:nn.children){
            printatlevel(node,lvl,cl+1);
        }

    }
    public void linearize(){
        linearize(root);
    }

    private void linearize(node nn) {
        for(node node:nn.children){
            linearize(node);
        }
        while(nn.children.size()>1){
            node temp=nn.children.remove(1);
            node tail=gettail(nn.children.get(0));
            tail.children.add(temp);
        }
    }

    private node gettail(node node) {
        node temp=node;
        while(temp.children.size()!=0){
            temp=temp.children.get(0);
        }
         return temp;

    }
    public void preorder(){
        preorder(root);
    }

    private void preorder(node nn) {
        System.out.println(nn.data+" ");
        for(node node:nn.children){
            preorder(node);
        }
    }
}

