# Sentiment API

Simple Spring Boot REST API to analyze sentiment from product reviews.

## Endpoint

POST /analyze

**Request:**
```json
{
  "review": "This product is amazing!"
}
```

**Response:**
```json
{
  "sentiment": "positive"
}
```

## Build and Run

```bash
./mvnw clean package
java -jar target/sentiment-api-0.0.1-SNAPSHOT.jar
```

## Docker

```bash
docker build -t sentiment-api .
docker run -p 8080:8080 sentiment-api
```

## Test

```bash
./mvnw test
```