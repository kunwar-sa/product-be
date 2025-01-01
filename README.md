# Spring Boot backend

## Prerequisites

Ensure these version for seamless execution of the spring boot backend

1. Java 17
2. Spring Boot 3.4.1
3. Maven 3.8.6
4. H2 in-memory database
5. Postman (for testing the APIs)

## Steps to execute

1. Clone this github repository `https://github.com/kunwar-sa/product-be.git`
2. Open the command prompt, powershell or terminal(linux, mac) in product folder inside cloned repository
3. Run `mvn spring-boot:run`
4. Go to `http://localhost:8080/h2-console` on browser to access the database console

## Database connection

1. Select the `Saved Setting` and `Setting Name` as `Generic H2 Embedded`
2. Select the `Driver Class` as `org.h2.Driver`
3. Select the `JDBC URL` as `jdbc:h2:file:./productsdb` (This is important)
4. Enter the `Username` as `sa` and leave password field empty
5. Click on `Connect`
6. Run a test query to see all the loaded products `Select * from Product;`

## How the app works

The Spring Boot app contains 3 APIs

1. GET `http://localhost:8080/products/search?keyword=mascara`
   This api takes the keyword as a request parameter and returns all the matching products which contain that particular keyword

2. GET `http://localhost:8080/products/review?ids=385,386`
   This api takes a list of ids as a request parameter and returns all the reviews which have those Ids.

3. GET `http://localhost:8080/products/searchById?id=1`
   This api takes a single product id as a request parameter and returns the product matching that id
   This api is not integrated to the angular frontend.

No method body is required in any of the above apis.

Once the spring boot app is running, open Postman.  
And create a GET request and use the above URLs as they are to make an API call  
to the H2 database and see the results
