package org.devexperts.Blog;

import java.awt.image.renderable.RenderableImage;
import java.util.Date;

public class Blog {

    private long id;
    private String title;
    private String text;
    private RenderableImage image;
    private Date publishedDate;

    private Comment comment;

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Blog() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public RenderableImage getImage() {
        return image;
    }

    public void setImage(RenderableImage image) {
        this.image = image;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }


}
