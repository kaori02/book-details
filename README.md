# Book Details

This is an implementation of **graphql-java** official [tutorial](https://www.graphql-java.com/tutorials/getting-started-with-spring-boot/).

## Prerequisites

1. [Docker](https://docs.docker.com/get-docker/)
2. [Docker Compose](https://docs.docker.com/compose/install/)
3. [Docker configured as non-root user](https://docs.docker.com/engine/install/linux-postinstall/#manage-docker-as-a-non-root-user)
4. MongoDB shell

## How to Run

```sh
docker-compose up
```

### Initialization

**On the first run**, here is something that you need to do:

- Initialize MongoDB

  ```sh
  mongo --host 192.168.200.10 -u "kaori02" -p "kaori02" --authenticationDatabase "admin" < init-mongo.js
  ```

## How to Stop

You can stop the service by simply press **ctrl+c**, then run the command below:

```sh
docker-compose down
```
