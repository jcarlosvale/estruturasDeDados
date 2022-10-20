package data.structures;

import java.util.LinkedList;

public class Tree {
    private int data;
    private Tree dir;
    private Tree esq;

    public Tree(int data) {
        this.data = data;
    }
    public void insert(int data) {
        insert(this, data);
    }

    private void insert(Tree tree, int data) {
        if (data > tree.data) {
            if (tree.dir == null) {
                tree.dir = new Tree(data);
            } else {
                insert(tree.dir, data);
            }
        } else {
            if (tree.esq == null) {
                tree.esq = new Tree(data);
            } else {
                insert(tree.esq, data);
            }
        }
    }

    public void preOrder() {
        preOrder(this);
    }

    private void preOrder(Tree tree) {
        if (tree != null) {
            System.out.println(tree.data);
            preOrder(tree.esq);
            preOrder(tree.dir);
        }
    }

    public void inOrder() {
        inOrder(this);
    }

    private void inOrder(Tree tree) {
        if (tree != null) {
            inOrder(tree.esq);
            System.out.println(tree.data);
            inOrder(tree.dir);
        }
    }

    public void posOrder() {
        posOrder(this);
    }

    private void posOrder(Tree tree) {
        if (tree != null) {
            posOrder(tree.esq);
            posOrder(tree.dir);
            System.out.println(tree.data);
        }
    }


    public void bfs() {
        LinkedList<Tree> fila = new LinkedList<>();

        fila.addFirst(this);

        while(!fila.isEmpty()) {
//            var no = fila.getFirst();

            var no = fila.removeFirst();

            //adicionar os filhos
            if (no.esq != null) fila.addLast(no.esq);
            if (no.dir != null) fila.addLast(no.dir);

            //consumir
            System.out.println(no.data);

            //remover da fila
//            fila.removeFirst();
        }
    }


    public static void main(String[] args) {
        var tree = new Tree(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);
        tree.insert(15);
        tree.insert(25);
//        System.out.println("--In Order---");
//        tree.inOrder();
//        System.out.println("--Pre Order---");
//        tree.preOrder();
//        System.out.println("--Pos Order---");
//        tree.posOrder();
        tree.bfs();
    }
}
