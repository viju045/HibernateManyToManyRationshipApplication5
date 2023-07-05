/**
 * Created By VijayKumar Moohite
 * Date : 7/5/2023
 * Time : 10:30 AM
 * Project : ManyToManyRelationshipApplicationHB5
 **/

package org.mahagan.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
//This is my Fifth ManyToMany mapping relationship application in hibernate.
@Entity
@Table(name = "posts")
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int postId;
    private String title;
    private String description;
    private  String post_Date;
    private  String last_Update_Date;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "posts_tags",joinColumns = {@JoinColumn(name="postId")},
            inverseJoinColumns = {@JoinColumn(name="tagsId")})
    Set<Tags>tags = new HashSet<>();

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPost_Date() {
        return post_Date;
    }

    public void setPost_Date(String post_Date) {
        this.post_Date = post_Date;
    }

    public String getLast_Update_Date() {
        return last_Update_Date;
    }

    public void setLast_Update_Date(String last_Update_Date) {
        this.last_Update_Date = last_Update_Date;
    }

    public Set<Tags> getTags() {
        return tags;
    }

    public void setTags(Set<Tags> tags) {
        this.tags = tags;
    }
}
