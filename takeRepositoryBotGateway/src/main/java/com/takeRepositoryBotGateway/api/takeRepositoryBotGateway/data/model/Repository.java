package com.takeRepositoryBotGateway.api.takeRepositoryBotGateway.data.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Repository {
    private String image;
    private String title;
    private String subTitle;
}
