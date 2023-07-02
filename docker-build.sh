./gradlew clean build
docker build -t salgu-auth:v1 .
docker rm -f salgu-auth
docker run -d -e PROFILE=dev -e DB_URL=192.168.35.187 --name salgu-auth -p 18082:18080 salgu-auth:v1