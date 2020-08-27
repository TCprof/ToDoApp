package com.tomcordall.webbackend.data;

import org.springframework.data.annotation.Id;


public class ToDo {
    @Id
    private String id;

    private String content;

    private Boolean completed;

    public ToDo(String content , Boolean completed) {
        this.content = content;
        this.completed=completed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getCompleted(){
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
