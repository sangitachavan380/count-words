# Count Words Assignment

## Description
This Java application reads a text file and applies the following business rules:
- Counts and displays the number of words that start with "M" or "m".
- Lists all words longer than 5 characters.

## Technologies Used
- Java 17
- Maven
- JUnit 5

## Project Structure
```
count-words/
├── src/
│   ├── main/java/com/sangita/wordprocessor/CountWords.java
│   └── test/java/com/sangita/wordprocessor/CountWordsTest.java
├── pom.xml
└── input.txt
```

## Build Instructions
Run the following command to compile and package the project:
```bash
mvn clean package
```

## Run Instructions
To run the application using a sample input file:
```bash
java -jar target/count-words-0.0.1-SNAPSHOT.jar input.txt
```

Make sure to replace `input.txt` with the full path to your file if it's not in the root folder.

## Test Instructions
Run unit tests with:
```bash
mvn test
```


