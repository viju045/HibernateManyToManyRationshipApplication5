package org.mahagan.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class PostsTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Posts}
     *   <li>{@link Posts#setDescription(String)}
     *   <li>{@link Posts#setLast_Update_Date(String)}
     *   <li>{@link Posts#setPostId(int)}
     *   <li>{@link Posts#setPost_Date(String)}
     *   <li>{@link Posts#setTags(Set)}
     *   <li>{@link Posts#setTitle(String)}
     *   <li>{@link Posts#getDescription()}
     *   <li>{@link Posts#getLast_Update_Date()}
     *   <li>{@link Posts#getPostId()}
     *   <li>{@link Posts#getPost_Date()}
     *   <li>{@link Posts#getTags()}
     *   <li>{@link Posts#getTitle()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Posts actualPosts = new Posts();
        actualPosts.setDescription("The characteristics of someone or something");
        actualPosts.setLast_Update_Date("2020-03-01");
        actualPosts.setPostId(1);
        actualPosts.setPost_Date("2020-03-01");
        HashSet<Tags> tags = new HashSet<>();
        actualPosts.setTags(tags);
        actualPosts.setTitle("Dr");
        assertEquals("The characteristics of someone or something", actualPosts.getDescription());
        assertEquals("2020-03-01", actualPosts.getLast_Update_Date());
        assertEquals(1, actualPosts.getPostId());
        assertEquals("2020-03-01", actualPosts.getPost_Date());
        assertSame(tags, actualPosts.getTags());
        assertEquals("Dr", actualPosts.getTitle());
    }
}

