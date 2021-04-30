
<h1 align="center"> Take Repository Bot Gateway </h1>

<p align="center">
  <img src="https://img.shields.io/static/v1?label=java&message=language&color=red&style=plastic&logo=JAVA"/>
  <img src="https://img.shields.io/static/v1?label=spring&message=framework&color=green&style=plastic&logo=SPRING"/>
  <img src="http://img.shields.io/static/v1?label=license&message=MIT&color=green&style=plastic"/>
  <img src="http://img.shields.io/static/v1?label=status&message=completed&color=red&style=plastic"/>
</p>

> Status: Completed :heavy_check_mark:


## Description:star:
<p align="justify">
The Take Repository Bot Gateway is an API that returns information from some Take repositories on Github to a chatbot, through an integration with the public Github API.
</p>

## Dependencies
  - Swagger
  - Spring Boot 
  - Maven
  - Java 8

### Running
 ``` $ git clone https://github.com/JoaoVictorfss/take-repository-bot-gateway.git
     $ cd take-repository-bot-gateway/takeRepositoryBotGateway
     $ mvn clean install
     $ mvn clean package
     $ java -jar target/takeRepositoryBotGateway-0.0.1-SNAPSHOT.jar
 ```
 > Access the url in the browser: http://localhost:8080/take-repository-bot-gateway/repository

### Testing the application
 > Access the swagger: http://localhost:8080/swagger-ui.html#/swaggertake-repository-bot-gateway/repository
 
 <p align="center">
  <img src="https://github.com/JoaoVictorfss/take-repository-bot-gateway/blob/master/swagger.png"/>
 </p>
 <p>
  response example: 
 
 ```
    {
    "data": [
      {
        "image": "https://avatars.githubusercontent.com/u/4369522?v=4",
        "title": "takenet/blip-sdk-csharp",
        "subTitle": "The C# SDK for the blip.ai bot platform"
      },
      {
        "image": "https://avatars.githubusercontent.com/u/4369522?v=4",
        "title": "takenet/blip-client-testing-csharp",
        "subTitle": "A host to create acceptance tests for chatbots created using BLiP C# SDK (https://github.com/takenet/messaginghub-client-csharp)"
      },
      {
        "image": "https://avatars.githubusercontent.com/u/4369522?v=4",
        "title": "takenet/async-samples",
        "subTitle": "Samples for the Take's C# async coding training"
      },
      {
        "image": "https://avatars.githubusercontent.com/u/4369522?v=4",
        "title": "takenet/blip-task-utils",
        "subTitle": "Some useful tasks for your bot"
      },
      {
        "image": "https://avatars.githubusercontent.com/u/4369522?v=4",
        "title": "takenet/blip-CLI",
        "subTitle": "BLiP command-line (CLI) tool, used for managing data of BLiP's bots. blip-CLI helps to make easy and quickly your development flow and the execution of some repetitive tasks."
      }
    ],
    "errors": []
  }
  ```
 
 

## Licença 
The [MIT License](https://github.com/JoaoVictorfss/take-repository-bot-gateway/blob/master/LICENSE) (MIT)

  Copyright :copyright: 2021 - Take Repository Bot Gateway
