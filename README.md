# Árvore-Binária: 
No trabalho implementamos uma árvore binária de busca, que é uma estrutura de dados em que cada nó possui, no máximo, dois filhos, e a subárvore à esquerda contém valores menores que o nó, enquanto a subárvore à direita contém valores maiores, facilitando a busca eficiente de elementos.

<p align="center" width="100%">
  <img width="33%" src="https://user-images.githubusercontent.com/107360437/270016163-e0180ddf-b16f-4942-860c-c6756f44f95d.png">
</p>

# funcionalidades do projeto:

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

# 1. Inserção de Novos Números(Tree.java):

O método insert em uma árvore binária verifica se o nó atual (place) é nulo, o que indicaria que é um ponto de inserção. Se for o caso, ele cria um novo nó com o valor a ser inserido. Caso contrário, compara o valor a ser inserido com o valor do nó atual e decide se deve percorrer a subárvore esquerda ou direita. Isso é feito de forma recursiva até encontrar um ponto de inserção vazio, onde o novo nó é adicionado. No final do processo, a árvore é modificada para incluir o novo nó no local apropriado.

<p align="center" width="100%">
  <img width="33%" src="https://cdn.discordapp.com/attachments/718425842409144351/1155255497780379699/image.png">
</p>
   

# 2. Remoção de Números(Tree.java):

  São 3 situações de exclusão sendo, se há nenhum filho, se há 1 filho e se há 2 filhos.
   
	  1. Cenário: Nó sem Filhos:
	
	  Caso o nó a ser removido não tenha filhos (current.left == null && current.right == null), ou seja, seja uma folha, a função removeNode retorna null, indicando que esse nó deve ser eliminado.
	
	  2. Cenário: Nó com Apenas um Filho
	
	  Se o nó a ser removido possui apenas um filho (seja à esquerda ou à direita), a função verifica qual lado está presente (current.left == null ou current.right == null) e retorna o filho não nulo. Isso faz com que o nó a ser removido seja 
          substituído pelo seu único filho, mantendo a estrutura da árvore correta.
	
	  3. Cenário: Nó com Dois Filhos
	
	  No caso mais complexo, em que o nó a ser removido possui dois filhos, a função procura o menor valor na subárvore direita (utilizando a função findSmallestValue). Esse menor valor substitui o valor do nó a ser removido, e em seguida, o mesmo 
	  procedimento é aplicado para remover o nó que continha o valor menor da subárvore direita.

A função remove simplesmente chama a função privada removeNode com a raiz da árvore e o valor a ser removido como argumentos. removeNode é recursiva, percorrendo a árvore até encontrar o nó a ser removido ou chegar a um ponto onde o nó é nulo, indicando que o valor não está presente na árvore. Ao final do processo, a raiz da árvore é atualizada com o resultado da exclusão. O método findSmallestValue auxilia na identificação do menor valor na subárvore direita, essencial para a exclusão de nós com dois filhos. Essa implementação garante a integridade da estrutura da árvore após as operações de exclusão.
  
<p align="center" width="100%">
  <img width="33%" src="https://cdn.discordapp.com/attachments/718425842409144351/1155256338960629810/image.png">
</p>

# 3. Busca de Elementos(Tree.java):

A função search encaminha a busca para a função privada searchNode, passando o nó raiz e o valor a ser procurado como argumentos. A função searchNode verifica se o nó atual é nulo, retornando false caso seja o caso, indicando que o valor não foi encontrado. Se o valor do nó atual for igual ao valor procurado, a função retorna true. Caso o valor procurado seja menor que o valor do nó atual, a busca é encaminhada para a subárvore esquerda. Por fim, se o valor procurado é maior ou igual, a busca é direcionada para a subárvore direita. Esse processo ocorre de forma recursiva, até que o valor desejado seja encontrado ou determinado como ausente na árvore.
       
<p align="center" width="100%">
  <img width="33%" src="https://cdn.discordapp.com/attachments/718425842409144351/1155256570704306217/image.png">
</p>   

# 4. Impressão da Árvore(Tree.java):

Ele finaliza o Scanner aberto e imprime a árvore atual, após isso ele finaliza o programa.

<p align="center" width="100%">
  <img width="33%" src="https://cdn.discordapp.com/attachments/718425842409144351/1155256748588937286/image.png">
</p>   

# Demais Arquivos

Main.java: É um programa interativo onde o usuário pode inserir, procurar e remover elementos em uma árvore binária. Após cada operação, a árvore é impressa de forma visualmente representativa no console, e o programa continua a aguardar novas ações do usuário até que a opção de finalizar seja escolhida.

Node.java: A classe Node representa um nó em uma estrutura de árvore binária, contendo um valor inteiro (info) e referências para os nós esquerdo (left) e direito (right). Além disso, o construtor inicializa o nó com o valor informado e define as referências como nulas.

Trunk.java: A classe Trunk é utilizada para representar a estrutura de um nó auxiliar em uma árvore de impressão, contendo uma referência ao nó anterior (prev) e uma string (str) que armazena a representação gráfica do tronco.


