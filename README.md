[![CI/CD](https://github.com/mcttn22/spring-api/actions/workflows/main.yml/badge.svg)](https://github.com/mcttn22/spring-api/actions/workflows/main.yml)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)

# Practice Spring Boot RESTful API

## Installation

1. Download the Repository with:

   - ```
     git clone https://github.com/mcttn22/spring-api.git
     ```
   -  Or by downloading as a ZIP file

2. Enter the project directory with:
   - ```
     cd spring-api
     ```

## Usage

Run API with:
- ```
  mvn spring-boot:run
  ```

Build and run fat jar of project and dependencies with:
- ```
  mvn package &&
  java -cp target/spring-api-fatjar.jar com.mcttn22.springapi.SpringApi
  ```

Interact with API with:
- ```
  curl http://localhost:8080/
  ```

## Development

Run tests with:
- ```
  mvn test
  ```


