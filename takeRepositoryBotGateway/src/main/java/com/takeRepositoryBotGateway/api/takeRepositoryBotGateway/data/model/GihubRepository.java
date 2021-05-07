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
}
