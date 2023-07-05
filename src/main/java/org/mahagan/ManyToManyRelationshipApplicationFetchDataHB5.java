/**
 * Created By VijayKumar Moohite
 * Date : 7/5/2023
 * Time : 10:30 AM
 * Project : ManyToManyRelationshipApplicationHB5
 **/

package org.mahagan;

import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.mahagan.domain.Posts;
import org.mahagan.domain.Tags;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ManyToManyRelationshipApplicationFetchDataHB5 {
    public static void main(String[] args) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory =  metadata.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction tsx = session.beginTransaction();

        TypedQuery query = session.createQuery("from Posts posts");
        List<Posts>list = query.getResultList();
        Iterator<Posts>iterator = list.listIterator();

        while(iterator.hasNext()) {
            Posts posts = iterator.next();
            System.out.println("*******************  Posts Details  **********************");
            System.out.println(posts.getTitle()+"-"+posts.getDescription()+"-"+posts.getPost_Date()+"-"+posts.getLast_Update_Date());

            Set<Tags>set = posts.getTags();
            Iterator<Tags>iterator1 = set.iterator();
            while(iterator1.hasNext())
            {
                Tags tags = iterator1.next();
            System.out.println("************************  Tags Details ************************");
            System.out.println(tags.getName());
            }
        }
        session.close();
        System.out.println("Data Fetched Ok!");
    }
}
