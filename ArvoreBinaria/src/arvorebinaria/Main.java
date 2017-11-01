package arvorebinaria;

public class Main {

    public static void main(String args[]) {
        ArvoreBinaria tree = new ArvoreBinaria();
        No arvore = new No(10);
        tree.inserir(arvore, 9);
        tree.inserir(arvore, 7);
        tree.inserir(arvore, 30);
        tree.inserir(arvore, 15);
        tree.inserir(arvore, 12);
        tree.inserir(arvore, 40);
        tree.inserir(arvore, 39);
        tree.inserir(arvore, 42);

        System.out.println("\nPré-ordem: ");
        tree.preOrdem(arvore);

        System.out.println("\nIn-ordem");
        tree.inOrdem(arvore);

        System.out.println("\nPós-ordem: ");
        tree.posOrdem(arvore);
        
        tree.remove(arvore, 39);
        
        System.out.println("\nIn-ordem após a remoção:");
        tree.inOrdem(arvore);        
    }
}
