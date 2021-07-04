# Citrus App: SpringbootAPI

«SpringBootAPI» is the nest API for the back end procedures and functions of "Citrus" APP.


### Built with

* [Java 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
* [Spring Boot](https://spring.io/tools)
* [Maven](https://maven.apache.org/download.cgi)
* [PostgreSQL 13](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads)
* [Eclipse IDE 2021-06](https://www.eclipse.org/downloads/)
* [Postman](https://www.postman.com/)


## Getting Started

Please make sure to have all the previouse mentioned technologies properly installed, with their respective Eviroment Variables if needed:

### Prerequisites


* Please check that you have properly instaleld Java [java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) in your pc. Run the following commands to check your Java version:
```sh
java -version
```
Check that your System Envuiroment Variable is working
```bash
echo $JAVA_HOME
```
(This should give back the directory of your java jdk)

* Check that you have installed [Maven](https://maven.apache.org/download.cgi) properly:
```sh
mvn -v
```

* Install the lastest version of [Postman](https://www.postman.com/). This will be necesary if you want to try the API without using the front end implementation.

* Install PostgreSQL 13, its needed for the correct usage of the spring/java dependencies. And also is needed for local testing.

### Instalation
1. Download a Zip or Clone the repository into your system.
2. Open the project folder with Eclipse as a "Proyect".
3. Using the [Spring Tools 4](https://marketplace.eclipse.org/content/spring-tools-4-aka-spring-tool-suite-4) do the following steps in order in the IDE:
    Rightclick your project-> Maven -> Update Maven Project -> Select All ->Force Update of Snapshots/Releases->Ok
4. Start the Database connection
5. Open your CMD/Windows Power Shell and enter in your Project Directory.
6. Run the following command inside of the directory:
```bash
mvn clean dependency:resolve
```
7. Run the following command:
```
mvn clean compile
```
8. Start the project directly in your IDE with "Right click -> Run as -> Spring app" or using the following command:
```bash
mvn spring-boot:run
```
9. (Optiona) You can test the API functionality using [postmant](https://www.postman.com/) and [postgreSQL](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads)

10. (Optional) If you need to create a new version of the API's jar to export it, run in the cmd:
```
mvn clean package
```
## Usage

For the correct usage of this api please read our [Documentation](https://lucid.app/lucidchart/invitations/accept/inv_27ec144e-7ccf-4e62-9d1f-02b0bfe96e3f)

## Roadmap

See the [open issues](https://github.com/Citrus-Software-Solutions/citrus-app-SpringbootAPI/issues) for a list of proposed features (and known issues).

## Routes
* [Routes and endpoints](https://docs.google.com/document/d/1JcTT2CHUaDCkFoKkd_NRmqmBzVGW7hJf53aKvgqzCto/edit?usp=sharing)

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
* [MIT](https://choosealicense.com/licenses/mit/)

## Aknowledges
* [Eclipse Spring Tools 4.11.0.RELEASE](https://marketplace.eclipse.org/content/spring-tools-4-aka-spring-tool-suite-4)
* [TM Terminal 10.2](https://marketplace.eclipse.org/content/tm-terminal) 
* [API's practices](https://www.vinaysahni.com/best-practices-for-a-pragmatic-restful-api#requirements)
