# wildphoto-server

Backend for wildphoto.by project

## How to run?
#### Clone this repo
```
$ git clone https://github.com/Mikita-Kharitonau/wildphoto-server.git
$ cd wildphoto-server
```

#### Build docker image
```
$ ./gradlew build docker
```
Verify, that image was successfully created:
```
$ docker images
REPOSITORY                                      TAG                 IMAGE ID            CREATED             SIZE
wildphoto-server                                0.0.1-SNAPSHOT      1684986b634d        12 hours ago        144MB
```

#### Run services (Spring Boot application + mysql database) with docker-compose
```
$ docker-compose up
```
Verify, that services was successfully started:
```
$ docker ps
CONTAINER ID        IMAGE                                                  COMMAND                  CREATED             STATUS              PORTS                                                      NAMES
e06c33f6aac3        wildphoto-server:0.0.1-SNAPSHOT                        "java -Djava.securit…"   20 minutes ago      Up 2 minutes                                                                   wildphoto-server_wildphoto-server_1
93863dbce16d        mysql                                                  "docker-entrypoint.s…"   16 hours ago        Up 2 minutes        33060/tcp, 0.0.0.0:3340->3306/tcp                          wildphoto-server_db_1
```

And try to run this test request:

GET http://localhost:8080/api/photos

should return:
```json
[
    {
        "id": 1,
        "src": "photos/thumbnails/Черный аист.jpg",
        "title": "Черный аист",
        "author": "Никита Харитонов",
        "commentsCount": 1,
        "likesCount": 0,
        "dislikesCount": 0
    },
    {
        "id": 2,
        "src": "photos/thumbnails/DSC_1522к.jpg",
        "title": "Грация",
        "author": "Никита Харитонов",
        "commentsCount": 0,
        "likesCount": 0,
        "dislikesCount": 0
    },
    ...   
]
```