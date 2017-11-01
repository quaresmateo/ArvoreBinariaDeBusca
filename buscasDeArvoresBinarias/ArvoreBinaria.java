package buscasDeArvoresBinarias;

public class ArvoreBinaria{
    
    // INSERIR ELEMENTO
    public void inserir(No no, int dado) {
        if (no != null) {
            if (dado < no.dado) {
                if (no.esquerda != null) {
                    inserir(no.esquerda, dado);
                } else {
                    System.out.println("  Inserindo " + dado + " a esquerda de " + no.dado);
                    no.esquerda = new No(dado);
                }
            } else if (dado > no.dado) {
                if (no.direita != null) {
                    inserir(no.direita, dado);
                } else {
                    System.out.println("  Inserindo " + dado + " a direita de " + no.dado);
                    no.direita = new No(dado);
                }
            }
        }
    }
    
    // REMOVER ELEMENTO
    public static No remove(No aux, int dado) {
        No p, p2, r = null;
        if (aux.dado == dado) {
            if (aux.esquerda == aux.direita) {
                return null;
            } else if (null == aux.esquerda) {
                return aux.direita;
            } else if (aux.direita == null) {
                return aux.esquerda;
            } else {
                p2 = aux.direita;
                p = aux.direita;
                while (p.esquerda != null) {
                    r = p;
                    p = p.esquerda;
                }
                aux.dado = p.dado;
                p = null;
                r.esquerda = null;
                return aux;
            }
        } else if (aux.dado < dado) {
            aux.direita = remove(aux.direita, dado);
        } else {
            aux.esquerda = remove(aux.esquerda, dado);
        }
        return aux;
    }

    // TIPOS DE BUSCAS
    public void preOrdem(No arvore) {
        if (arvore != null) {
            System.out.print(arvore.dado + " ");
            preOrdem(arvore.esquerda);
            preOrdem(arvore.direita);
        }
    }

    public void inOrdem(No arvore) {
        if (arvore != null) {
            inOrdem(arvore.esquerda);
            System.out.print(arvore.dado + " ");
            inOrdem(arvore.direita);
        }
    }

    public void posOrdem(No arvore) {
        if (arvore != null) {
            posOrdem(arvore.esquerda);
            posOrdem(arvore.direita);
            System.out.print(arvore.dado + " ");
        }
    }
}
