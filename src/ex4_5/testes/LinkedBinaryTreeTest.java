package ex4_5.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import ex4_5.sources.BTNode;
import ex4_5.sources.LinkedBinaryTree;
import ex4_5.sources.Position;

// 4. Implemente e teste o TAD Árvore Binária conforme slides de 15 a 26
public class LinkedBinaryTreeTest {

	@Test
	public void test() {
		LinkedBinaryTree<String> T = criaArvore();
		
		Position<String> raiz = T.root();		
		assertEquals("SD", T.root().element());
				
		// Teste do Exercicio 4 :
		assertEquals(true ,T.hasLeft(raiz));
		assertEquals(true ,T.hasRight(raiz));		
		assertEquals("Sistemas", T.left(raiz).element());
		assertEquals("Digitais", T.right(raiz).element());	
		
		Position<String> incorreto = T.right(raiz);		
		assertEquals(true ,T.hasLeft(incorreto));
		assertEquals(true ,T.hasRight(incorreto));		
		assertEquals("Ciencia", T.left(incorreto).element());
		assertEquals("Computação", T.right(incorreto).element());
		
		Position<String> incorreto1 = T.right(incorreto);		
		assertEquals(true ,T.hasLeft(incorreto1));
		assertEquals(true ,T.hasRight(incorreto1));		
		assertEquals("Redes", T.left(incorreto1).element());
		assertEquals("Estrutura de Dados", T.right(incorreto1).element());
		
		// Teste do Exercicio 5 :
		LinkedBinaryTree<String> Arvore5A = criarArvore5();
		Position<String> raiz5A = Arvore5A.root();
		
		// b) binaryPreorder conforme slide 31.
		assertEquals("*++-7111*/352**19-232917", Arvore5A.binaryPreorder(Arvore5A, raiz5A));
		// c) binaryPostorder conforme slide 32.
		assertEquals("711-1+35/2*+192329-*17**", Arvore5A.binaryPostorder(Arvore5A, raiz5A));
		// e) inorder conforme slide 43.
		assertEquals("7-11+1+3/5*2*19*23-29*17", Arvore5A.inorder(Arvore5A, raiz5A));
		// h) eulerTour conforme slide 51.
		assertEquals("*++-777-111111-+111++*/333/555/*222*+***191919*-232323-292929-**171717**", Arvore5A.eulerTour(Arvore5A, raiz5A));
		// i) printExpression conforme slide 53.
		assertEquals("((((7-11)+1)+((3/5)*2))*((19*(23-29))*17))", Arvore5A.printExpression(Arvore5A, raiz5A));
		// j) Método para contar os nodos esquerdos e externos de uma árvore binária.
		assertEquals(4, Arvore5A.countLeft(Arvore5A));
		// k) Método para contar os nodos direitos e externos de uma árvore binária.
		assertEquals(6, Arvore5A.countRight(Arvore5A));
		
	}

	public LinkedBinaryTree<String> criaArvore() {
		LinkedBinaryTree<String> T = new LinkedBinaryTree<String>();
		BTNode<String> raiz, a, b;
		
		T.addRoot("SD");
		raiz = (BTNode<String>) T.root();
		T.insertLeft(raiz, "Sistemas");
		a = (BTNode<String>) T.insertRight(raiz, "Digitais");
		
		T.insertLeft(a, "Ciencia");
		b = (BTNode<String>) T.insertRight(a, "Computação");	
		
		T.insertLeft(b, "Redes");
		T.insertRight(b, "Estrutura de Dados");		
		return T;
	}
	
	public LinkedBinaryTree<String> criarArvore5() {
		
		LinkedBinaryTree<String> arvore = new LinkedBinaryTree<String>();
		// Criando os positions v0, v1, v2, v3, v4, v5, v6, v7 
		BTNode<String> raiz, v0, v1, v2, v3, v4, v5, v6, v7;
		
		// Criando Elementos internos
		arvore.addRoot("*");
		raiz = (BTNode<String>) arvore.root();
		v0 = (BTNode<String>) arvore.insertLeft(raiz, "+");
		v1 = (BTNode<String>) arvore.insertLeft(v0, "+");
		arvore.insertRight(v1, "1");
		// Criando Elementos internos
		v3 = (BTNode<String>) arvore.insertRight(v0, "*");
		arvore.insertRight(v3, "2");
		v4 = (BTNode<String>) arvore.insertLeft(v3, "/");
		arvore.insertLeft(v4, "3");
		arvore.insertRight(v4, "5");
		v2 = (BTNode<String>) arvore.insertLeft(v1, "-");
		arvore.insertLeft(v2, "7");
		arvore.insertRight(v2, "11");
		// Criando Elementos internos
		v5 = (BTNode<String>) arvore.insertRight(raiz, "*");
		arvore.insertRight(v5, "17");
		v6 = (BTNode<String>) arvore.insertLeft(v5, "*");
		arvore.insertLeft(v6, "19");
		v7 = (BTNode<String>) arvore.insertRight(v6, "-");
		arvore.insertLeft(v7, "23");
		arvore.insertRight(v7, "29");
		
		return arvore;
	}	
}