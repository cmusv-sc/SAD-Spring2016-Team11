package models;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * Created by Joe on 4/25/2016.
 */
public interface Feedback {
    JsonNode make(ObjectNode node);
}
