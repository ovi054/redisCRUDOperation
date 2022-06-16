# redisCRUDOperation

A simple CRUD operation with Redis. REST API's is used to create, read, update and delete object in Employee class. Graddle is used here.

Firtly, Redis downloaded for windows from here:
https://github.com/microsoftarchive/redis/releases/tag/win-3.2.100

Then unzip the downloaded folder. And run the redis-server.exe. The properties of redis server(Port: 6379) is written in "application.properties" of the spring boot project to connect it with Redis.

You can use POSTMAN to insert, delete, update or delete data using REST operation.

Run redis-cli.exe to check the data of redis. Use redis command to check it. for example: "keys *" to check all the keys. "HGETALL Employee:1" to see hash object of a employee class with id 1.
Redis commands details are here: https://www.tutorialspoint.com/redis/redis_hashes.htm

More details in this post that can help: https://medium.com/@ankitkumargupta/quick-start-spring-rest-api-with-redis-7b54994f0e3f
