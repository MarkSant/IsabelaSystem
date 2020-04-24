package aplication;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Program {

	public static void main(String[] args) {
	
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("courseJdbc");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
	
			//find
			//Cliente cliente = entityManager(Cliente.class, 1);
			
			Cliente cliente = new Cliente(2, "Maria");
		
			entityManager.getTransaction().begin(); //inicia a transacao para certeza q dara certo
			entityManager.persist(cliente);
			//entityManager.flush() -faz com que a persistencia aconteca,mesmo sem iniciar a transacao
			entityManager.getTransaction().commit();//termina  transacao
			
			entityManager.remove(
			
			entityManager.close();
			entityManagerFactory.close();
			
	}

}
