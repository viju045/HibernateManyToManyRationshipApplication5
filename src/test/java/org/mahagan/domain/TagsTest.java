package org.mahagan.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class TagsTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Tags}
     *   <li>{@link Tags#setName(String)}
     *   <li>{@link Tags#setPosts(Set)}
     *   <li>{@link Tags#setTagsId(int)}
     *   <li>{@link Tags#getName()}
     *   <li>{@link Tags#getPosts()}
     *   <li>{@link Tags#getTagsId()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Tags actualTags = new Tags();
        actualTags.setName("Name");
        HashSet<Posts> posts = new HashSet<>();
        actualTags.setPosts(posts);
        actualTags.setTagsId(1);
        assertEquals("Name", actualTags.getName());
        assertSame(posts, actualTags.getPosts());
        assertEquals(1, actualTags.getTagsId());
    }
}

