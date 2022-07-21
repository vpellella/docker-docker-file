# docker-docker-file
All docker projects for practice


## Building image using docker file

1. Navigate to the location in terminal where Dockerfile is located

2. Run below command to create a image
    ```sh
    docker build -t vineelpellella/redis .
    ```    
3. Run below command to start the container
    ```sh
    docker run vineelpellella/redis
    ```
    use -d to the above command to run in detached mode.
    ```sh
    docker run -d vineelpellella/redis-server
    ```
4. To view logs of a running container use
    ```sh
    docker logs <container-name/id>
    ```
    use -f to the above command to follow the logs
    ```sh
    docker logs -f <container-name/id>
    ```
5. To stop the running container
    ```sh
    docker stop <container-name/id>
    ```
6. To start a container
    ```sh
    docker start <container-name/id>
    ```
7. To remove a container
    ```sh
    docker rm <container-name/id> or docker container rm <container-name/id>
    ```
    use -f to remove a container that is already running
    ```sh
    docker rm -f <container-name/id> or docker container rm -f <container-name/id>
    ```
8. To remove a image
    ```sh
    docker image rm vineelpellella/redis
    ```
    use -f to remove a image having a container that is already running
    ```sh
    docker image rm -f vineelpellella/redis
    ```
