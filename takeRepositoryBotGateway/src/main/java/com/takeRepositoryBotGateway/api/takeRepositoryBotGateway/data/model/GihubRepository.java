package com.takeRepositoryBotGateway.api.takeRepositoryBotGateway.data.model;

import lombok.Data;

import java.util.Date;

@Data
public class GihubRepository {
    private Integer id;
    private String full_name;
    private String description;
    private Date created_at;
    private OwnerInfo owner;
    private String language;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getFullName() { return full_name; }

    public void setFullName(String full_name) { this.full_name = full_name; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public Date getCreated_at() { return created_at; }

    public void setCreatedAt(Date created_at) { this.created_at = created_at; }

    public OwnerInfo getOwner() { return owner; }

    public void setOwner(OwnerInfo owner) { this.owner = owner; }

    public String getLanguage() { return language; }

    public void setLanguage(String language) { this.language = language; }

    @Override
    public String toString() {
        return "GihubRepository{" +
                "id=" + id +
                ", full_name='" + full_name + '\'' +
                ", description='" + description + '\'' +
                ", created_at=" + created_at +
                ", owner=" + owner +
                    ", language='" + language + '\'' +
            '}';
    }
}
