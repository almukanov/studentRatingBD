package ru.almukanov.dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import ru.almukanov.classes.Grade;

import java.util.List;

public interface GradeDao {
    public List<Grade> select();

    class HibernateUtil {
        private static StandardServiceRegistry registry;
        private static SessionFactory sessionFactory;

        public static SessionFactory getSessionFactory() {

            if (sessionFactory == null) {
                try {
                    // Create registry
                    registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

                    // Create MetadataSources
                    MetadataSources sources = new MetadataSources(registry);

                    // Create Metadata
                    Metadata metadata = sources.getMetadataBuilder().build();

                    // Create SessionFactory
                    sessionFactory = metadata.getSessionFactoryBuilder().build();

                } catch (Exception e) {
                    e.printStackTrace();
                    if (registry != null) {
                        StandardServiceRegistryBuilder.destroy(registry);
                    }
                }
            }
            return sessionFactory;
        }



    }
}
