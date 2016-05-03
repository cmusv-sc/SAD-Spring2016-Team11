package models;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * Created by Joe on 4/25/2016.
 */
public class FeedbackMaker {
    private Feedback comment;
    private Feedback suggestion;

    public FeedbackMaker() {
        comment = new Comment();
        suggestion = new Suggestion();
    }

    public JsonNode createComment(ObjectNode node) {
        return comment.make(node);
    }

    public JsonNode createSuggestion(ObjectNode node) {
        return suggestion.make(node);
    }
}
