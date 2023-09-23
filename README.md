# Árvore-Binária: 
No trabalho implementamos uma árvore binária de busca, que é uma estrutura de dados em que cada nó possui, no máximo, dois filhos, e a subárvore à esquerda contém valores menores que o nó, enquanto a subárvore à direita contém valores maiores, facilitando a busca eficiente de elementos.

<p align="center" width="100%">
  <img width="33%" src="https://user-images.githubusercontent.com/107360437/270016163-e0180ddf-b16f-4942-860c-c6756f44f95d.png">
</p>

# No projeto que realizamos sobre árvores binárias de busca, abordamos as seguintes funcionalidades:

1. Inserção de Novos Números:
Desenvolvemos um mecanismo para adicionar novos elementos à árvore, garantindo que a estrutura da árvore seja mantida de acordo com as propriedades de uma árvore binária de busca.

<p align="center" width="100%">
  <img width="33%" src="https://user-images.githubusercontent.com/107360437/270015946-9ab4a9ac-cdb0-4f8a-9af9-cbb08f1d8f23.png">
</p>

2. Remoção de Números:
 Implementamos um método para remover números da árvore, assegurando que a estrutura continue sendo uma árvore binária de busca válida após a operação.

<p align="center" width="100%">
  <img width="33%" src="https://user-images.githubusercontent.com/107360437/270015296-143ef007-a91f-4a26-afaa-82ee0bdbd616.png">
</p>

3. Busca de Elementos:
Criamos um algoritmo eficiente de busca, permitindo localizar elementos específicos na árvore com rapidez.

<p align="center" width="100%">
  <img width="33%" src="https://user-images.githubusercontent.com/107360437/270016118-f9a9af66-c900-4f47-90fe-13f1e843d9c3.png">
</p>

4. Impressão da Árvore:
Desenvolvemos uma função para imprimir a estrutura da árvore, facilitando a visualização e compreensão de sua organização.

<p align="center" width="100%">
  <img width="33%" src="https://user-images.githubusercontent.com/107360437/270016163-e0180ddf-b16f-4942-860c-c6756f44f95d.png">
</p>


# Como funciona o código:

# 1. Inserção de Novos Números(ARQUIVO):
   Modo em recursividade
   

# 2. Remoção de Números(ARQUIVO):

  São 3 situações de exclusão sendo, se há nenhum filho, se há 1 filho e se há 2 filhos.
   
  1.	Exclusão quando não há filhos:
	  •	Nesse caso, basta remover o nó da árvore. Não há filhos para se preocupar, então a exclusão é direta. O nó simplesmente é removido da árvore.
  
  2.	Exclusão quando há um filho:
	  •	Se o nó a ser excluído tem apenas um filho, o procedimento é um pouco mais complexo.
	  •	O nó a ser excluído é substituído pelo seu único filho.
	  •	A árvore ainda mantém a propriedade de árvore binária de busca, pois todos os elementos na subárvore esquerda (se existir) são menores que o nó pai, e todos os elementos na subárvore direita (se existir) são maiores.
	  •	O nó original é removido.

  3.	Exclusão quando há dois filhos:
	  •	Este é o caso mais complexo.
	  •	Primeiro, encontra-se o nó sucessor do nó a ser excluído. O sucessor é o menor elemento na subárvore direita do nó a ser excluído. Isso garante que o sucessor seja maior que todos os elementos na subárvore esquerda e menor que todos os elementos na subárvore direita do nó a ser excluído.
	  •	O valor do nó sucessor substitui o valor do nó a ser excluído.
	  •	Agora, o problema se reduz a excluir o nó sucessor, que pode ser tratado como um dos dois primeiros casos.

3. Busca de Elementos(ARQUIVO):
   // EXPLICAR LÓGICA
   
4. Impressão da Árvore(ARQUIVO):
   // EXPLICAR LÓGICA


Main.java:




# Exemplo de funcionamento:
1. Inserção de Novos Números:
   
   
2. Remoção de Números:
   
   
3. Busca de Elementos:
   
   
4. Impressão da Árvore:



