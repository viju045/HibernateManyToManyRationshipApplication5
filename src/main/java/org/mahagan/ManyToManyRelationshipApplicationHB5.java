package org.mahagan;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.mahagan.domain.Posts;
import org.mahagan.domain.Tags;
;import java.util.HashSet;
import java.util.Set;

public class ManyToManyRelationshipApplicationHB5 {
    public static void main(String[] args) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory =  metadata.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction tsx = session.beginTransaction();

        Posts posts = new Posts();
        posts.setTitle("Birthday");
        posts.setDescription("Birthday wish to my Friend");
        posts.setPost_Date("9-2-2023");
        posts.setLast_Update_Date("3-7-2023");

        Tags tags = new Tags();
        tags.setName("Happy Birthday Vijay @viju45_");
        Tags tags1 = new Tags();
        tags1.setName("#Brother");
        Tags tags2 = new Tags();
        tags2.setName("#BadyBoy");

        posts.getTags().add(tags);
        tags.getPosts().add(posts);

        posts.getTags().add(tags1);
        tags1.getPosts().add(posts);

        posts.getTags().add(tags2);
        tags2.getPosts().add(posts);

        session.persist(posts);
        tsx.commit();
        session.close();

        System.out.println("Data Inserted ok!");
    }
}