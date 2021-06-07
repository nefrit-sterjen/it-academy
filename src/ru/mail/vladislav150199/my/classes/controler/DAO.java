package ru.mail.vladislav150199.my.classes.controler;

import java.util.ArrayList;
import java.util.List;

public class DAO {
    static List<Post> posts;
    static{
        posts = new ArrayList<>();
        posts.add(new Post(1,"hello"));
        posts.add(new Post(2,"world"));
        posts.add(new Post(3,"people"));
    }

    public static List<Post> getPosts() {
        return posts;
    }

    public static void deletePost(int id) {
        for (Post p : posts) {
            if (p.getId() == id) {
                posts.remove(p);
            }
        }
    }
}
