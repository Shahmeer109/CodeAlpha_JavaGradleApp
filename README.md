# Java Gradle Application

This is a simple Java application built using **Gradle**. It demonstrates basic project structure, a simple greeting message, and a utility method to calculate the sum of numbers using a `List`.

---

## 📁 Project Structure

```

JavaGradleApp/
├── app/
│   ├── src/
│   │   ├── main/java/org/example/App.java
│   │   └── test/java/org/example/AppTest.java
├── build.gradle
├── settings.gradle
└── README.md

````

---

## 🚀 Features

- Simple Java console application
- Gradle build system
- Greeting message output
- Sum calculation using `List<Integer>`
- Basic unit testing setup

---

## 🛠️ Requirements

Make sure you have installed:

- Java 8 or higher
- Gradle (or use Gradle Wrapper if included)

Check versions:

```bash
java -version
gradle -version
````

---

## ▶️ How to Run the Project

### 1. Clone or download the project

```bash
git clone <your-repo-url>
cd JavaGradleApp
```

### 2. Build the project

```bash
gradle build
```

### 3. Run the application

```bash
gradle run
```

---

## 💡 Example Output

```
Hello World! This is a simple Java application built with Gradle.
Sum = 100
```

---

## 📌 Main Class

```java
package org.example;

import java.util.Arrays;
import java.util.List;

public class App {

    public String getGreeting() {
        return "Hello World! This is a simple Java application built with Gradle.";
    }

    public int sumList(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        App app = new App();

        System.out.println(app.getGreeting());

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        System.out.println("Sum = " + app.sumList(numbers));
    }
}
```

---

## 🧪 Running Tests

Run unit tests using:

```bash
gradle test
```

---

## 📚 Notes

* This project follows standard Gradle Java conventions
* Source code is located in `src/main/java`
* Test code is located in `src/test/java`
