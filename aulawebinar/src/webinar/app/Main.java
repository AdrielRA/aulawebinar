package webinar.app;

import java.util.*;
import javax.persistence.EntityManager;

import webinar.dao.InstrutorDao;
import webinar.dao.JPAUtil;
import webinar.model.*;

public class Main {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		
		/*Endereco endereco = new Endereco("João Sei Lá",  "Mutuca");
		
		Aluno aluno = new Aluno();
		aluno.setNome("Adriel Ricardo");
		aluno.setMatricula("204385181");
		aluno.setEmail("adriel@gmail.com");
		aluno.setEndereco(endereco);
		
		em.getTransaction().begin();
		em.persist(endereco);
		em.persist(aluno);		
		em.getTransaction().commit();
		
		
		aluno = new Aluno("123456","Fulano", new Endereco("R. Sei Lá", "Alfenas"), "fulano@gmail.com");
		em.getTransaction().begin();
		em.persist(aluno);		
		em.getTransaction().commit();
		
		Instrutor instrutor = new Instrutor("Chaves", new Endereco("R. Instrutores", "Varginha"), "chaves@gmail.com", 15000, Formacao.JEDI);
		Instrutor instrutor2 = new Instrutor("Tiririca", new Endereco("R. dos Amadores", "São Paulo"), "tiririca@gmail.com", 2000, Formacao.ESPECIALISTA);
	
		List<Instrutor> instrutores = new ArrayList();
		instrutores.add(instrutor);
		instrutores.add(instrutor2);
		
		Seminario seminario = new Seminario("JOIN", 101, 55, instrutores);
		
		em.getTransaction().begin();
		em.persist(instrutor);
		em.persist(instrutor2);
		em.persist(seminario);		
		em.getTransaction().commit();*/
		
		/*Seminario seminariocon = em.find(Seminario.class, 2);
		Aluno alunocon = em.find(Aluno.class, 3);
		
		InscricaoSeminario inscricao = new InscricaoSeminario(alunocon, seminariocon);
		inscricao.setDatainscricao("20/10/2020");
		
		em.getTransaction().begin();
		em.persist(inscricao);	
		em.getTransaction().commit();*/
		
		List<Instrutor> instrutores = new InstrutorDao().getAllByFormacao(Formacao.JEDI);
		for(Instrutor instrutor : instrutores) {
			System.out.println(instrutor.getNome());
		}
		
		em.close();
		
		JPAUtil.shutdown();
	}

}
