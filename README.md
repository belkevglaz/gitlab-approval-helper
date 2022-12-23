### Run 

1. Build application
```shell
./gradlew build buildFatJar --no-daemon
```
2. Build docker image
```shell
docker build -t gitlab-helper . 
```
3. Run container
```shell
docker run -d -p 4000:4000 gitlab-helper
```