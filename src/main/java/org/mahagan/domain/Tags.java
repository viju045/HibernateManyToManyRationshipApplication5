/**
 * Created By VijayKumar Moohite
 * Date : 7/5/2023
 * Time : 10:31 AM
 * Project : ManyToManyRelationshipApplicationHB5
 **/

package org.mahagan.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tags")
public class Tags {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tagsId;
    private String name;
    @ManyToMany(cascade = CascadeType.ALL)
    Set<Posts>posts = new HashSet<>();

    public int getTagsId() {
        return tagsId;
    }

    public void setTagsId(int tagsId) {
        this.tagsId = tagsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Posts> getPosts() {
        return posts;
    }

    public void setPosts(Set<Posts> posts) {
        this.posts = posts;
    }
}
