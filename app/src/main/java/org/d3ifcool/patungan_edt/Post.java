package org.d3ifcool.patungan_edt;

import java.util.ArrayList;

/**
 * Created by Dian Suci Anggraeni on 3/15/2018.
 */

public class Post {
    private String postTitle;
    private long price;
    private String date;
    private int img;
    public ArrayList<Post> posts = new ArrayList<>();

    public Post(){}
    public Post(String postTitle, long price, String date, int img) {
        this.postTitle = postTitle;
        this.price = price;
        this.date = date;
        this.img = img;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getImg() {return img;}

    public void setImg(int img) {this.img = img;}

    public void addPost(Post newPost) {
        posts.add(newPost);
    }


    public ArrayList<Post> getPosts() {
        return posts;
    }
}

