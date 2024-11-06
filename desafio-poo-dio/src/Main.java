import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Scanner;

import avaliacao.Questionario;
import avaliacao.Teste;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
        
        
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
			System.out.println("Estude mais vagabundo.");
		}		
	    scan.close();
        

    }
}