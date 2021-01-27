FROM openjdk:11
EXPOSE 8080
ADD target/pizza-toppings.jar pizza-toppings.jar
ENTRYPOINT ["java","-jar","/pizza-toppings.jar"]