package db;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entity.User;

public class Connection {
	private static Connection instance;
	private SessionFactory factory;
	private Connection() {
		StandardServiceRegistry registry = new  StandardServiceRegistryBuilder().configure().build();
		Metadata metadata = new MetadataSources(registry)
				.addAnnotatedClass(User.class)
				.getMetadataBuilder().build();
		factory = metadata.getSessionFactoryBuilder().build();	
	}
	public static Connection getInstance() {
		if(instance == null) {
			instance = new Connection();
		}
		return instance;
	}
	public SessionFactory getSessionFactory() {
		return factory;
	}
	
}
