package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joe on 4/19/2016.
 */
public class MyComment {
    private long commentID;
    private int commentThumbs;
    private String title;
    private Comment comment;
    private List<MyComment> subComments;

    public MyComment() {
        this.subComments = new ArrayList<MyComment>();
    }

    public MyComment(String title, Comment comment) {
        this.commentID = comment.getId();
        this.commentThumbs = comment.getThumb();
        this.title = title;
        this.comment = comment;
        this.subComments = new ArrayList<MyComment>();
    }

    public long getCommentID() {
        return commentID;
    }

    public int getCommentThumbs() {
        return commentThumbs;
    }

    public String getTitle() {
        return title;
    }

    public Comment getComment() {
        return comment;
    }

    public List<MyComment> getSubComments() {
        return subComments;
    }
}
