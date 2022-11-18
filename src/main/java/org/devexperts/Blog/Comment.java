package org.devexperts.Blog;

import java.util.Date;

public class Comment {

    private String commentText;
    private Date date;

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
