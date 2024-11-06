package avaliacao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Teste {
	
	private Map<Integer, Questionario> questionarioMap;	

	public Teste() {
		this.questionarioMap = new HashMap<>();
	}

	public void adicinarValor(Integer sequencia, Questionario questionario) {
		questionarioMap.put(sequencia, questionario);
	}
	
	public String realizarProva (Integer sequencia) {	
		if(!questionarioMap.isEmpty()) {			
			System.out.println(questionarioMap.get(sequencia).getQuestao() + questionarioMap.get(sequencia).getAlternativas());
	
		}else {
			System.out.println("Formulário vazio.");
		}
		return questionarioMap.get(sequencia).getRespostaGabarito();
	}	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Teste teste = new Teste();
	   
		teste.adicinarValor(1, new Questionario("Questão 1",  "\n" + "Alternativa A" + "\n" + "Alternativa B"+ "\n" + "Alternativa C"+ 
				"\n" + "Alternativa D"+ "\n" + "Alternativa E"+ "\n", "B"));    
		teste.adicinarValor(2, new Questionario("Questão 2",  "\n" + "Alternativa A" + "\n" + "Alternativa B"+ "\n" + "Alternativa C"+ 
				"\n" + "Alternativa D"+ "\n" + "Alternativa E"+ "\n", "E")); 
		teste.adicinarValor(3, new Questionario("Questão 3",  "\n" + "Alternativa A" + "\n" + "Alternativa B"+ "\n" + "Alternativa C"+ 
				"\n" + "Alternativa D"+ "\n" + "Alternativa E"+ "\n", "A")); 
		teste.adicinarValor(4, new Questionario("Questão 4",  "\n" + "Alternativa A" + "\n" + "Alternativa B"+ "\n" + "Alternativa C"+ 
				"\n" + "Alternativa D"+ "\n" + "Alternativa E"+ "\n", "A")); 
		teste.adicinarValor(5, new Questionario("Questão 5",  "\n" + "Alternativa A" + "\n" + "Alternativa B"+ "\n" + "Alternativa C"+ 
				"\n" + "Alternativa D"+ "\n" + "Alternativa E"+ "\n", "D")); 	
		teste.adicinarValor(6, new Questionario("Questão 6",  "\n" + "Alternativa A" + "\n" + "Alternativa B"+ "\n" + "Alternativa C"+ 
				"\n" + "Alternativa D"+ "\n" + "Alternativa E"+ "\n", "C"));
		teste.adicinarValor(7, new Questionario("Questão 7",  "\n" + "Alternativa A" + "\n" + "Alternativa B"+ "\n" + "Alternativa C"+ 
				"\n" + "Alternativa D"+ "\n" + "Alternativa E"+ "\n", "C"));
		teste.adicinarValor(8, new Questionario("Questão 8",  "\n" + "Alternativa A" + "\n" + "Alternativa B"+ "\n" + "Alternativa C"+ 
				"\n" + "Alternativa D"+ "\n" + "Alternativa E"+ "\n", "E"));
		teste.adicinarValor(9, new Questionario("Questão 9",  "\n" + "Alternativa A" + "\n" + "Alternativa B"+ "\n" + "Alternativa C"+ 
				"\n" + "Alternativa D"+ "\n" + "Alternativa E"+ "\n", "D"));
		teste.adicinarValor(10, new Questionario("Questão 10",  "\n" + "Alternativa A" + "\n" + "Alternativa B"+ "\n" + "Alternativa C"+ 
				"\n" + "Alternativa D"+ "\n" + "Alternativa E"+ "\n", "B"));		
				
		System.out.println("Vamos iniciar o questionário. Selecione uma alternativa.");	
		
		int controle = 0;
		String comparaString = null;
	
		for(Integer i = 1; i <= 10; i++) {	
			
			comparaString = teste.realizarProva(i);
			String resposta = scan.nextLine();
			
			if(comparaString.equals(resposta)) {
				controle++;
			}			
		}
		if(controle >= 7) {
			System.out.println("Parabéns você foi aprovado.");
		}else {
			System.out.println("Estudo mais vagabundo.");
		}		
	    scan.close();
	  }
}