# pulse-backend-kotlin

basically the kotlin version of the pulse backend, built with Ktor instead of Spring Boot. does the same thing just cleaner.

## how to run it

```bash
./gradlew run
```

server starts at `http://localhost:8080`

## available endpoints

| URL | what it does |
|-----|-------------|
| `GET /api/v1/media-data` | returns all media items |
| `GET /api/v1/media-data/{type}` | filter by type — video, audio, document or text |

## examples

get everything:
```
http://localhost:8080/api/v1/media-data
```

get only videos:
```
http://localhost:8080/api/v1/media-data/video
```

get only audio:
```
http://localhost:8080/api/v1/media-data/audio
```
