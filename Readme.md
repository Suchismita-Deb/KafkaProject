The project SpringbootKafkaConsumerDemo and SpringbootKafkaProducerDemo are the sample of the producer and consumer project.

Start the producer project and postman.

POST URL: http://localhost:9090/publish
Body - json.
```json
{
  "wild":{
    "value": true
  },
  "detail": {
    "name": "Tiger",
    "color": "Orange",
    "animalType": "Wild1"
  }
}
```

In the console of producer there will be the message and in the consumer will see the consumed message.