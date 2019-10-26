package generictree;

public class generictreeclient {
    //10 3 20 2 50 0 60 0 30 0 40 2 70 0 80 0
    public static void main(String[] args) {
        generictree tree=new generictree();
        tree.display();
        System.out.println(tree.size());
        System.out.println(tree.max());
        System.out.println(tree.find(80));
        System.out.println(tree.height());
//        tree.mirror();
//        tree.display();
        tree.printatlevel(3);
//        tree.linearize();
//        tree.display();
        tree.preorder();
    }
}
