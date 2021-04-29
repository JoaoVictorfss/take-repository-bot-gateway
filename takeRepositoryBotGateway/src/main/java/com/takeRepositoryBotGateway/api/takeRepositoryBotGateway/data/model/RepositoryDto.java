package com.takeRepositoryBotGateway.api.takeRepositoryBotGateway.data.model;

import lombok.Data;

@Data
public class RepositoryDto {
    private String image;
    private String title;
    private String subTitle;

    public String getImage() { return image; }

    public void setImage(String image) { this.image = image; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getSubTitle() { return subTitle; }

    public void setSubTitle(String subTitle) { this.subTitle = subTitle; }

    @Override
    public String toString() {
        return "RepositoryDto{" +
                "image='" + image + '\'' +
                ", title='" + title + '\'' +
                ", subTitle='" + subTitle + '\'' +
                '}';
    }
}
