# How to create spring boot OAuth2 Resource Server

[![Java: 17](https://img.shields.io/badge/Java-17+-green)](#)
[![Spring Boot: 3.0](https://img.shields.io/badge/Spring--Boot-3.0+-red)](#)
[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)

[![OneMinuteProgramming](https://img.shields.io/badge/OneMinuteProgramming-_-red?style=social&logo=youtube)](http://www.youtube.com/channel/UC7T7MMEhY8zYd6ekbDRdIhw?sub_confirmation=1)
[![YouTube Channel Subscribers](https://img.shields.io/youtube/channel/subscribers/UC7T7MMEhY8zYd6ekbDRdIhw?style=social)](http://www.youtube.com/channel/UC7T7MMEhY8zYd6ekbDRdIhw?sub_confirmation=1)
[![YouTube Channel Views](https://img.shields.io/youtube/channel/views/UC7T7MMEhY8zYd6ekbDRdIhw?style=social)](http://www.youtube.com/channel/UC7T7MMEhY8zYd6ekbDRdIhw?sub_confirmation=1)

[![YouTube Video](https://img.youtube.com/vi/bElJjuKs_Vo/0.jpg)](https://www.youtube.com/watch?v=bElJjuKs_Vo)

## Prerequisites
- JDK 17+
- Gradle 7.3+
- Oauth2 Authorization Server up and running (https://github.com/OneMinuteProgramming/spring-boot-authorization-server) 

## Build for source
```shell
gradle clean bootJar
```

## Run the application
```shell
java -jar ./build/libs/spring-boot-resource-server-0.0.1-SNAPSHOT.jar
```

## Test the application
```shell
# Get all product
curl -L -i -X GET 'localhost:8090/product' -H 'Authorization: Bearer <token>' 

# Add a product
curl -L -i -X POST 'localhost:8090/product' -H 'Content-Type: application/json' -H 'Authorization: Bearer <token>' --data-raw '{"id": "003", "name": "gpt-4" }'
```
