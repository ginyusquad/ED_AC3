package ex2_3.testes;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import ex2_3.sources.LinkedTree;
import ex2_3.sources.NodePositionList;
import ex2_3.sources.Position;
import ex2_3.sources.PositionList;
import ex2_3.sources.TreeNode;
import ex2_3.sources.TreePosition;

public class LinkedTreeTest {
	
	
	@Test
	public void test() {
		
		TreePosition<String> raiz;
		Position<Position<String>> p, s;
		PositionList<Position<String>> filhos;
		LinkedTree<String> arvore = criarArvoreT();
		System.out.println(arvore.parentheticRepresentation(arvore, arvore.root()));
		System.out.println(arvore.toStringPostorder(arvore, arvore.root()));
	
		assertFalse(arvore.isEmpty());
		assertEquals(4, arvore.height1(arvore), "Altura da Árvore");
		assertEquals(4, arvore.height2(arvore, arvore.root()), "Altura da Árvore");
		assertEquals("[Eletronics R'Us, P&D, Vendas, Internacional, Canadá, América do Sul, "
					+ "Ultramar, África, Europa, Ásia, Austrália, Nacional, Compras, Manufatura, TV, CD, Tuner]",
		arvore.toString(), "Pré-ordem da Árvore T ");
		
		
		raiz = arvore.root();
		filhos = raiz.getChildren();
		p = filhos.first();
		assertEquals("P&D", p.element().element(), "P&D");
		assertTrue(arvore.isExternal(p.element()));
		assertEquals(raiz, arvore.parent(p.element()), "Deve ser a raiz");
	
		s = filhos.next(p);
		assertEquals("Vendas", s.element().element(), "Vendas");
		assertTrue(arvore.isInternal(s.element()));
		assertEquals(1, arvore.depth(arvore, s.element()), "");
	
		arvore.replace(p.element(), "Pesquisa e Desenvolvimento");
		assertEquals("[Eletronics R'Us, Pesquisa e Desenvolvimento, Vendas, Internacional, Canadá, América do Sul, "
					+ "Ultramar, África, Europa, Ásia, Austrália, Nacional, Compras, Manufatura, TV, CD, Tuner]",
		arvore.toString(), "Pré-ordem da Árvore T ");
		assertTrue(arvore.isRoot(raiz));
	
		arvore.swapElements(p.element(), s.element());
		assertEquals("[Eletronics R'Us, Vendas, Pesquisa e Desenvolvimento, Internacional, Canadá, América do Sul, "
					+"Ultramar, África, Europa, Ásia, Austrália, Nacional, Compras, Manufatura, TV, CD, Tuner]",
		arvore.toString(), "Pré-ordem da Árvore T ");
		
		arvore.diskSpace(arvore, raiz);//162 Bytes
		
		/* assertEquals( 162, arvore.diskSpace(arvore, raiz));
		/* Cuidado os bytes das strings podem mudar conforme o pc e a versoa da javavm
		 * muda também(Ainda mais se vc estiver usando um openjdk ou uma graalvm) */ 
		
	}

	private TreeNode<String> criarFilho(TreeNode<String> p, String n) {
		
		PositionList<Position<String>> filho;
		TreeNode<String> aux;
		filho = p.getChildren();
		aux = new TreeNode<String>();
		aux.setElement(n);
		aux.setParent(p);
		aux.setChildren(new NodePositionList<Position<String>>());
		filho.addLast(aux);
		
		return aux;
	}

	public LinkedTree<String> criarArvoreT() {
		
		LinkedTree<String> T = new LinkedTree<String>();
		TreeNode<String> raiz, v, m, i, u;
		
		T.addRoot("Eletronics R'Us");
		raiz = (TreeNode<String>) T.root();
		raiz.setChildren(new NodePositionList<Position<String>>());
		
		criarFilho(raiz, "P&D");
		v = criarFilho(raiz, "Vendas");
		criarFilho(raiz, "Compras");
		m = criarFilho(raiz, "Manufatura");
	
		i = criarFilho(v, "Internacional");
		criarFilho(v, "Nacional");
	
		criarFilho(i, "Canadá");
		criarFilho(i, "América do Sul");
		u = criarFilho(i, "Ultramar");
	
		criarFilho(u, "África");
		criarFilho(u, "Europa");
		criarFilho(u, "Ásia");
		criarFilho(u, "Austrália");
	
		criarFilho(m, "TV");
		criarFilho(m, "CD");
		criarFilho(m, "Tuner");
		
		return T;
	}	
}