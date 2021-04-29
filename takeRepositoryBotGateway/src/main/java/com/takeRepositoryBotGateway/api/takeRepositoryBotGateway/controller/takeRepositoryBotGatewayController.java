package com.takeRepositoryBotGateway.api.takeRepositoryBotGateway.controller;

import com.takeRepositoryBotGateway.api.takeRepositoryBotGateway.data.constants.PathConstants;
import com.takeRepositoryBotGateway.api.takeRepositoryBotGateway.data.model.GihubRepository;
import com.takeRepositoryBotGateway.api.takeRepositoryBotGateway.data.model.RepositoryDto;
import com.takeRepositoryBotGateway.api.takeRepositoryBotGateway.data.model.Response;
import com.takeRepositoryBotGateway.api.takeRepositoryBotGateway.integration.GithubApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/${server.domain}")
@CrossOrigin(origins = "*")
public class takeRepositoryBotGatewayController {
    private static final Logger LOG = LoggerFactory.getLogger(takeRepositoryBotGatewayController.class);

    @Autowired
    GithubApi githubApiClient;

    @GetMapping(value = PathConstants.REPOSITORY_PATH)
    public Response getFiveTakeRepositories() {
        LOG.info("try searching repositories");

        try{
            List<GihubRepository> repositoriesFromGH = this.githubApiClient.findRepositories();

            repositoriesFromGH = repositoriesFromGH
                    .stream()
                    .filter(repository -> repository.getLanguage() != null && repository.getLanguage().equalsIgnoreCase("C#"))
                    .collect(Collectors.toList());

            LOG.info("Data found: {}", repositoriesFromGH);

            return makeResponse(repositoriesFromGH);
        }catch (Exception e){
            LOG.info("Error when searching repositories");

            Response response = new Response();
            response.getErrors().add(e.getMessage());

            return response;
        }
    }

    private Response makeResponse(List<GihubRepository> repositories) {
        Response response = new Response();
        List<RepositoryDto> mappedRepositories = new ArrayList<>();

        repositories.sort(Comparator.comparing(GihubRepository::getCreated_at));

        repositories.forEach((repository) -> {
            RepositoryDto newRepositoryResponse = new RepositoryDto();

            newRepositoryResponse.setTitle(repository.getFull_name());
            newRepositoryResponse.setSubTitle(repository.getDescription());
            newRepositoryResponse.setImage(repository.getOwner().getAvatar_url());
            mappedRepositories.add(newRepositoryResponse);
        });
        response.setData(mappedRepositories);

        return response;
    }
}
