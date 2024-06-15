package dataStructure;

// Definição da classe LinkedList
public class LinkedList {

    // Referência para o primeiro nó da lista ligada
    private Node head;

    // Referência para o último nó da lista ligada
    private Node tail;

    // Número de elementos na lista ligada
    private int length;

    // Definição da classe interna Node, que representa os nós da lista ligada
    class Node {

        // Informação que o nó armazena (no seu caso, uma String)
        String data;

        // Apontador para o próximo nó na lista ligada
        Node next;

        // Construtor da classe Node, que inicializa o nó com o dado fornecido
        Node(String data) {
            this.data = data;
        }

    }

    // Construtor da classe LinkedList, que cria uma lista ligada inicializada com um nó contendo o dado especificado
    public LinkedList(String data) {
        // Inicializa o comprimento da lista como 1
        length = 1;

        // Cria um novo nó com o dado fornecido
        Node newNode = new Node(data);

        // Define tanto head quanto tail para apontar para o novo nó criado
        head = newNode;
        tail = newNode;
    }

    // Método para obter o primeiro nó da lista
    public void getHead() {
        if (this.head == null) {
            System.out.println("Lista vazia");
        } else {
            System.out.println("Cabeça: " + head.data);
        }
    }

    // Método para obter o último nó da lista
    public void getTail() {
        if (this.head == null) {
            System.out.println("Lista vazia");
        } else {
            System.out.println("Cauda: " + tail.data);
        }
    }

    // Método para obter o tamanho da lista
    public void getLength() {
        System.out.println("Tamanho da lista: " + this.length);
    }

    // Método para esvaziar a lista (remover todos os elementos)
    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    // Método para imprimir todos os elementos da lista ligada
    public void print() {
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // Método para adicionar um novo nó no final da lista ligada
    public void append(String data) {
        Node newNode = new Node(data);
        if (length == 0) {
            // Se a lista estiver vazia, define tanto head quanto tail como o novo nó
            head = newNode;
            tail = newNode;
        } else {
            // Caso contrário, liga o novo nó ao final da lista e atualiza tail para o novo nó
            tail.next = newNode;
            tail = newNode;
        }

        length++; // Incrementa o tamanho da lista
    }

    // Método para remover e retornar o último nó da lista ligada
    public Node removeLast() {
        if (length == 0) return null; // Se a lista estiver vazia, retorna null

        Node pre = head;
        Node temp = null;

        // Percorre a lista até o penúltimo nó
        while (pre.next != tail) {
            pre = pre.next;
        }

        temp = tail; // Armazena o último nó em temp
        tail = pre; // Atualiza tail para o penúltimo nó
        tail.next = null; // Remove a referência para o antigo último nó

        length--; // Decrementa o tamanho da lista

        if (length == 0) {
            // Se a lista estiver vazia, define tanto head quanto tail como null
            head = null;
            tail = null;
        }

        return temp; // Retorna o nó removido
    }

    // Método para adicionar um novo nó no início da lista ligada
    public void prepend(String data) {
        Node newNode = new Node(data);

        if (length == 0) {
            // Se a lista estiver vazia, define tanto head quanto tail como o novo nó
            head = newNode;
            tail = newNode;
        } else {
            // Liga o novo nó ao início da lista e atualiza head para o novo nó
            newNode.next = head;
            head = newNode;
        }
        length++; // Incrementa o tamanho da lista
    }

    // Método para remover e retornar o primeiro nó da lista ligada
    public Node removeFirst() {
        if (length == 0) return null; // Se a lista estiver vazia, retorna null

        Node temp = head; // Armazena o primeiro nó em temp
        head = head.next; // Atualiza head para o próximo nó da lista
        temp.next = null; // Remove a referência para o antigo primeiro nó

        length--; // Decrementa o tamanho da lista

        if (length == 0) {
            // Se a lista estiver vazia, define tanto head quanto tail como null
            head = null;
            tail = null;
        }

        return temp; // Retorna o nó removido
    }

    // Método principal para testar a classe LinkedList
    public static void main(String[] args) {

        LinkedList list = new LinkedList("produto 1");
        list.append("produto 2");
        list.append("produto 3");

        list.prepend("produto 4");
        list.append("produto 5");

        System.out.println("----------");
        list.getHead();
        System.out.println("---------");
        list.getTail();
        System.out.println("----------");
        list.getLength();
        System.out.println("-----------");

        list.print();

        // Exemplo de utilização dos métodos de adição, remoção e impressão da lista ligada
    }

}
