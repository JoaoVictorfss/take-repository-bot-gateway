package com.takeRepositoryBotGateway.api.takeRepositoryBotGateway.data.model;

import lombok.Data;

@Data
public class OwnerInfo {
    private Integer id;
    private String avatar_url;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getAvatar_url() { return avatar_url; }

    public void setAvatar_url(String avatar_url) { this.avatar_url = avatar_url; }

    @Override
    public String toString() {
        return "OwnerInfo{" +
                "id=" + id +
                ", avatar_url='" + avatar_url + '\'' +
                '}';
    }
}
