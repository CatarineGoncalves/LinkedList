# LinkedList em Java

## Introdução
Em Java, LinkedList é uma estrutura de dados que implementa uma lista ligada. Uma lista ligada é uma estrutura de dados linear onde cada elemento (nó) é um objeto separado que contém um valor (ou dados) e uma referência (ou link) para o próximo elemento na sequência.

# Características Principais de uma LinkedList

1- Estrutura de Nós Encadeados:

Cada elemento na lista é representado por um objeto Node (ou No no seu exemplo), que contém os dados a serem armazenados e um ponteiro para o próximo nó na sequência.

2- Flexibilidade na Inserção e Remoção

A lista ligada permite inserções e remoções eficientes de elementos em qualquer posição, uma vez que apenas os links entre os nós precisam ser ajustados, sem a necessidade de realocação de memória como em arrays.

3- Acesso Sequencial

O acesso aos elementos na lista ligada é sequencial, começando pelo primeiro nó (cabeça) e seguindo os links para o próximo nó até o último (calda).

4- Não Contígua em Memória

Diferentemente de arrays, os nós de uma lista ligada não estão armazenados em posições contíguas de memória. Cada nó pode estar localizado em qualquer parte da memória, ligado apenas pelos ponteiros.

## Tipos de Lista Ligada

1- Simplesmente Encadeada: Cada nó possui apenas um ponteiro para o próximo nó.

2- Duplamente Encadeada: Cada nó possui um ponteiro para o próximo nó e um ponteiro para o nó anterior.

3- Circular: O último nó aponta de volta para o primeiro nó, formando um ciclo.

## Vantagens e Desvantagens

1- Vantagens

Flexibilidade na inserção e remoção de elementos.

Utilização eficiente de memória para inserções dinâmicas.

2-  Desvantagens

Acesso sequencial, o que pode ser menos eficiente para acesso aleatório comparado a arrays.

Uso de mais memória do que arrays para armazenar referências adicionais entre os nós.

# Utilização em Java

Em Java, a classe LinkedList é parte da biblioteca padrão (java.util) e implementa a interface List. Ela fornece métodos para adicionar, remover, acessar e manipular elementos na lista ligada de maneira eficiente. É frequentemente utilizada quando é necessária uma estrutura de dados dinâmica que suporte operações eficientes de inserção e remoção.
