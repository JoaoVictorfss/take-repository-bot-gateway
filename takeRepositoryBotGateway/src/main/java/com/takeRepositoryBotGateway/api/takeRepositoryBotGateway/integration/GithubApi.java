package com.takeRepositoryBotGateway.api.takeRepositoryBotGateway.integration;


import com.takeRepositoryBotGateway.api.takeRepositoryBotGateway.data.constants.PathConstants;
import com.takeRepositoryBotGateway.api.takeRepositoryBotGateway.data.model.GihubRepository;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(url = "${github.domain}", name = "githubService")
public interface GithubApi {
    @RequestMapping(PathConstants.GITHUB_PATH)
    List<GihubRepository>findRepositories();
}
