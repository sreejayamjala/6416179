// Using plain JPA
EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
EntityManager em = emf.createEntityManager();
EntityTransaction tx = em.getTransaction();
tx.begin();
em.persist(new Country("IN", "India"));
tx.commit();
em.close();
