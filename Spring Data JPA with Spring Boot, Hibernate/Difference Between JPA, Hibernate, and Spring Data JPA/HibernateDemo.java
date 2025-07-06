// Using plain Hibernate
Configuration config = new Configuration().configure();
SessionFactory factory = config.buildSessionFactory();
Session session = factory.openSession();
Transaction tx = session.beginTransaction();
session.save(new Country("US", "United States"));
tx.commit();
session.close();
