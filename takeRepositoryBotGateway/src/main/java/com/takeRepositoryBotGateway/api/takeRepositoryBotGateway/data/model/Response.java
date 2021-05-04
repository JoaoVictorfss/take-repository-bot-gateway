package com.takeRepositoryBotGateway.api.takeRepositoryBotGateway.data.model;


import java.util.ArrayList;
import java.util.List;


public class Response {
    private List<Repository> data;
    private List<String> errors;

    public List<Repository> getData() { return data; }

    public void setData(List<Repository> data) { this.data = data; }

    public List<String> getErrors() {
        if (this.errors == null) {
            this.errors = new ArrayList<String>();
        }
        return errors;
    }

    public void setErrors(List<String> errors) { this.errors = errors; }
}
