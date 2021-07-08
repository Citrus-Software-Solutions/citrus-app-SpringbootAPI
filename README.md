<p align="center">
  <h1 align="center"/>Citrus App Spring Boot API</h1>
</p>

## Description

Citrus App is a job finder app created and developed by Citrus Software Solutions.

<p>This repository contain our API developed in the <a href="https://spring.io/projects/spring-boot" target="_blank">Spring Boot</a> framework using CLEAN or Hexagonal Architecture.</p>

## Installation & Requirements

* [Java 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
* [Spring Boot](https://spring.io/tools)
* [Maven](https://maven.apache.org/download.cgi)
* [PostgreSQL 13](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads)
* [Eclipse IDE 2021-06](https://www.eclipse.org/downloads/)
* [Postman](https://www.postman.com/)

* Please check that you have properly instaleld Java [java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) in your pc. Run the following commands to check your Java version:
sh
java -version

Check that your System Envuiroment Variable is working
bash
echo $JAVA_HOME

(This should give back the directory of your java jdk)

* Check that you have installed [Maven](https://maven.apache.org/download.cgi) properly:
sh
mvn -v


* Install the lastest version of [Postman](https://www.postman.com/). This will be necesary if you want to try the API without using the front end implementation.

* Install PostgreSQL 13, its needed for the correct usage of the spring/java dependencies. And also is needed for local testing.

## Running the app

1. Download a Zip or Clone the repository into your system.
2. Open the project folder with Eclipse as a "Proyect".
3. Using the [Spring Tools 4](https://marketplace.eclipse.org/content/spring-tools-4-aka-spring-tool-suite-4) do the following steps in order in the IDE:
    Rightclick your project-> Maven -> Update Maven Project -> Select All ->Force Update of Snapshots/Releases->Ok
4. Start the Database connection
5. Open your CMD/Windows Power Shell and enter in your Project Directory.
6. Run the following command inside of the directory:
bash
mvn clean dependency:resolve

7. Run the following command:

mvn clean compile

8. Start the project directly in your IDE with "Right click -> Run as -> Spring app" or using the following command:
bash
mvn spring-boot:run

9. (Optiona) You can test the API functionality using [postmant](https://www.postman.com/) and [postgreSQL](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads)

10. (Optional) If you need to create a new version of the API's jar to export it, run in the cmd:

mvn clean package
## Test
- You can test the application within the eclipse IDE with: «Rigthclick->Run as ->JUnit Test».
- You can also use mvn command lines to test the program:

bash
# run all unit test
$ mvn test

# run a single test class
$ $mvn -Dtest=TestApp1 test

# run a single test method from a test class
$mvn -Dtest=TestApp1#methodname test

# run all test method that match pattern 'TestHello*' from a test class
$mvn -Dtest=testApp1#testHello* test

# run all test method that match pattern 'TestHello*' and 'testMagic*'from a test class
$mvn -Dtest=testApp1#testHello*+testMagic* test


## Routes

* [Routes and endpoints](https://docs.google.com/document/d/1JcTT2CHUaDCkFoKkd_NRmqmBzVGW7hJf53aKvgqzCto/edit?usp=sharing)

## Citrus BackEnd Developers

<table align="center">
  <tbody><tr>
    <td align="center"><a href="https://github.com/ImMamey" rel="nofollow"><img src="https://avatars.githubusercontent.com/u/32584037?v=4" width="150px;" alt="" style="max-width:100%;"><br><sub><b>Victor Vásquez</b></sub></a><br><a href="https://github.com/Citrus-Software-Solutions/citrus-app-SpringbootAPI/commits?author=ImMamey" title="Commits"><g-emoji class="g-emoji" alias="book" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/1f4d6.png">📖</g-emoji></a></td>
    <td align="center"><a href="https://github.com/cafesaro"><img src="https://avatars.githubusercontent.com/u/33528930?v=4" width="150px;" alt="" style="max-width:100%;"><br><sub><b>Carlos Sanchéz</b></sub></a><br><a href="https://github.com/Citrus-Software-Solutions/citrus-app-SpringbootAPI/commits?author=cafesaro" title="Documentation"><g-emoji class="g-emoji" alias="book" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/1f4d6.png">📖</g-emoji></a></td>
    <td align="center"><a href="https://github.com/Mariosor12" rel="nofollow"><img src="https://avatars.githubusercontent.com/u/55864049?v=4" width="150px;" alt="" style="max-width:100%;"><br><sub><b>Mario Avena</b></sub></a><br><a href="https://github.com/Citrus-Software-Solutions/citrus-app-SpringbootAPI/commits?author=Mariosor12" title="Documentation"><g-emoji class="g-emoji" alias="book" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/1f4d6.png">📖</g-emoji></a></td>
        <td align="center"><a href="https://github.com/marianangelic" rel="nofollow"><img src="https://avatars.githubusercontent.com/u/56178993?v=4" width="150px;" alt="" style="max-width:100%;"><br><sub><b>Mariana Rodríguez</b></sub></a><br><a href="https://github.com/Citrus-Software-Solutions/citrus-app-SpringbootAPI/commits?author=marianangelicb" title="Documentation"><g-emoji class="g-emoji" alias="book" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/1f4d6.png">📖</g-emoji></a></td>
  </tr>
</tbody></table>

Everyone is welcome to contribute code via pull requests, to file issues on GitHub, to fix bugs that people have filed, to add to our documentation, or to help out in any other way.

## References

[Eclipse Spring Tools 4.11.0.RELEASE](https://marketplace.eclipse.org/content/spring-tools-4-aka-spring-tool-suite-4)

---


[TM Terminal 10.2](https://marketplace.eclipse.org/content/tm-terminal) 

---


[API's practices](https://www.vinaysahni.com/best-practices-for-a-pragmatic-restful-api#requirements)

---

[Example Implementation of a Hexagonal Architecture](https://github.com/thombergs/buckpal/tree/f5a9be50771e77ca66a153bc83c383b32cab738e)

---

[Hexagonal Architecture with Spring Data Example](https://github.com/refactorizando-web/spring-data-hexagonal-architecture)

---

[Validation in Spring Boot](https://www.baeldung.com/spring-boot-bean-validation)

---

[Spring REST Validation Example](https://mkyong.com/spring-boot/spring-rest-validation-example/) 

---

[Implementing Validation for RESTful Services with Spring Boot](https://www.vinaysahni.com/best-practices-for-a-pragmatic-restful-api#requirements)

---

[Complete Guide to Validation With Spring Boot](https://reflectoring.io/bean-validation-with-spring-boot/)

---

[Testing in Spring Boot](https://www.baeldung.com/spring-boot-testing)

---

[Spring Boot CRUD REST APIs Validation Example](https://www.javaguides.net/2018/09/spring-boot-crud-rest-apis-validation-example.html)

---

[SpringBootHibernateJPA](https://github.com/minnela/SpringBootHibernateJPA/tree/master/src/main/java/com/covid/info) 

---

[Spring Boot — Accessing Data with JPA Hibernate and PostgreSQL](https://medium.com/analytics-vidhya/spring-boot-accessing-data-with-jpa-hibernate-and-postgresql-af68386363a4)

---

[Connecting to Heroku Postgres from Spring Boot](https://stackoverflow.com/questions/33633243/connecting-to-heroku-postgres-from-spring-boot/49978310)

---

[Spring Boot Tutorial for Beginners (Java Framework)](https://www.youtube.com/watch?v=vtPkZShrvXQ&t=202s)
