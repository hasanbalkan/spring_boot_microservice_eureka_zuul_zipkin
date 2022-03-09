# Some of used technologies

Spring Boot, Docker, Spring Cloud, Netflix Eureka, Netflix Zuul API Gateway Rabbitmq, Zipkin, H2

# To run project

Execute "mvn clean install" command for each project one by one.<br>
Execure "docker-compose -f docker-compose.yml up -d" command in projects home path.

# To test and monitor aplication

### Eureka url

http://localhost:8761/

### Zipkin url

http://localhost:9411/zipkin/

### Rabbitmq url

http://localhost:15672/
user : guest
pass : guest

## Application url and test content

GET : http://localhost:8000/price-calculate/productId/1/quantity/2

GET : http://localhost:8001/price/productId/1

Predefined products under :  .\product-price-service\src\main\resources\data.sql<br>
    insert into product_price(id,product_id,price) values(1,1,15);<br>
    insert into product_price(id,product_id,price) values(2,2,17);<br>
    insert into product_price(id,product_id,price) values(3,3,22);<br>
    insert into product_price(id,product_id,price) values(4,4,21);<br>
    insert into product_price(id,product_id,price) values(5,5,39);<br>
