package iterator.implJava;

import iterator.implJava.AVL.ArvoreAVL;

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

        for (String dado : arvore) {
            System.out.print(dado + " | ");
        }
        // Saída: Três | Cinco | Sete | Dez | Quinze | Vinte | Vinte e Cinco |

        System.out.println("\n\n--- Iterador Pré-Ordem ---");
        for (String dado : arvore.preOrdem()) {
            System.out.print(dado + " | ");
        }
        // Saída: Dez | Cinco | Três | Sete | Vinte | Quinze | Vinte e Cinco |

        System.out.println("\n\n--- Iterador Pós-Ordem ---");
        for (String dado : arvore.posOrdem()) {
            System.out.print(dado + " | ");
        }
        // Saída: Três | Sete | Cinco | Quinze | Vinte e Cinco | Vinte | Dez |
    }
}
