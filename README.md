# springy ![GCI Badge](https://img.shields.io/badge/Google%20Code%20In-JBoss%20Community-red?style=flatr&labelColor=fdb900&link=https://codein.withgoogle.com/organizations/jboss-community/)
![Docker Pull Count](https://img.shields.io/docker/pulls/reaganiwadha/springy)
![Screenshot of Springy](https://raw.githubusercontent.com/reaganiwadha/springy/raw/master/screenshot.png?raw=true)

Springy is a Java Springboot Application that can be easily deployed on a Wildfly Server

## Endpoints

### RootEndpoint 
This endpoint is a check to whether the server is running or not
```bash
http localhost:8080/springy/
```
```bash
HTTP/1.1 200 OK
Connection: keep-alive
Content-Length: 30
Content-Type: text/plain;charset=UTF-8
Date: Tue, 14 Jan 2020 13:37:24 GMT

The springy server is running!
```

### HelloEndpoint
This endpoint will say hello to you!
```bash
http localhost:8080/springy/hello
```
```bash
HTTP/1.1 200 OK
Connection: keep-alive
Content-Length: 6
Content-Type: text/plain;charset=UTF-8
Date: Tue, 14 Jan 2020 13:38:42 GMT

Hello!
```
### HelloNameEndpoint
This endpoint will say hello to you! This time with a name

```bash
http localhost:8080/springy/hello/melunian
```
```bash
HTTP/1.1 200 OK
Connection: keep-alive
Content-Length: 11
Content-Type: text/plain;charset=UTF-8
Date: Tue, 14 Jan 2020 13:39:54 GMT

Hello melunian
```

## Deploying springy on Wildfly server using Docker
You can build the docker image by yourself or you can use the premade docker image on Docker Hub

### Using Pre-Built Image

You can use the prebuilt image from [Docker Hub](https://hub.docker.com/repository/docker/reaganiwadha/springy)

```
docker pull reaganiwadha/springy:latest
docker run -p 8080:8080 -it reaganiwadha/springy
```

### Building your own Docker Image
Or you can also build the image from the source code
```
docker build -t springy:1.0 .
docker run -p 8080:8080 -it springy
```

