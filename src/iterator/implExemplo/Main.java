package iterator.implExemplo;

import iterator.implExemplo.AVL.ArvoreAVL;

public class Main {
    public static void main(String[] args) {
        ArvoreAVL<String> arvore = new ArvoreAVL<>();
        arvore.inserir(10, "Dez");
        arvore.inserir(20, "Vinte");
        arvore.inserir(5, "Cinco");
        arvore.inserir(15, "Quinze");
        arvore.inserir(3, "Três");
        arvore.inserir(25, "Vinte e Cinco");
        arvore.inserir(7, "Sete");

        System.out.println("--- Iterador Padrão (Em-Ordem) ---");

        Iterator<String> iterador = arvore.createIterator();

        while (iterador.hasNext()) {
            String dado = iterador.next();
            System.out.print(dado + " | ");
        }


        System.out.println("\n\n--- Iterador Pré-Ordem ---");
        Iterator<String> iteradorPre = arvore.createIterator();

        while (iteradorPre.hasNext()) {
            String dado = iteradorPre.next();
            System.out.print(dado + " | ");
        }


        System.out.println("\n\n--- Iterador Pós-Ordem ---");
        Iterator<String> iteradorPos = arvore.createIterator();

        while (iteradorPos.hasNext()) {
            String dado = iteradorPos.next();
            System.out.print(dado + " | ");
        }
    }
}
