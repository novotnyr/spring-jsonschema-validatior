package com.github.novotnyr.springframework.web.jsonschema;

/**
 * Indicates a general JSON Schema handling exception.
 */
public class JsonSchemaException extends RuntimeException {

    public JsonSchemaException() {
        super();
    }

    public JsonSchemaException(String msg) {
        super(msg);
    }

    public JsonSchemaException(String message, Throwable cause) {
        super(message, cause);
    }

    public JsonSchemaException(Throwable cause) {
        super(cause);
    }
}