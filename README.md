# 🎓 Curriculum Record Manager (CRM)

## Project Overview

The **Curriculum Record Manager (CRM)** is a console-based Java application designed to manage student and course records for an educational institute. It serves as a practical demonstration of core Java SE principles, including Object-Oriented Programming (OOP), modern file I/O with NIO.2, the Streams API, and foundational design patterns.

The application allows an administrator to perform the following actions through a command-line interface:
* **Manage Students**: Add, update, and list students.
* **Manage Courses**: Add, search, and list courses.
* **Manage Instructors**: Add instructors and assign them to courses.
* **Handle Enrollment**: Enroll and unenroll students in courses, applying business rules like credit limits.
* **Grades & Transcripts**: Assign grades, compute GPA, and print student transcripts.
* **File Utilities**: Import/Export data from/to CSV-like files and create timestamped backups.

***

## 🚀 How to Run

### Prerequisites
* **Java Development Kit (JDK)**: Version 17 or higher.

### Command-Line Instructions
1.  **Clone the Repository**
    ```bash
    git clone https://github.com/aishaifrah23/curriculum-record-manager.git
    cd curriculum-record-manager/src
    ```
2.  **Compile the Project** (From the root `CRM` directory)
    ```bash
    javac edu/crm/cli/CRMApp.java edu/crm/config/*.java edu/crm/domain/*.java edu/crm/service/*.java edu/crm/io/*.java edu/crm/util/*.java
    ```
3.  **Run the Application**
    ```bash
   java edu.crm.cli.CRMApp
    ```

***

## ☕ The Evolution of Java

* **1995**: Java 1.0 is released by Sun Microsystems, introducing the "Write Once, Run Anywhere" philosophy.
* **2004**: **Java 5 (Tiger)** is a major release, adding significant language features like Generics, Enums, and Annotations.
* **2014**: **Java 8** marks a revolutionary change, introducing Lambda Expressions, the Stream API, and a new Date/Time API (`java.time`).
* **2021**: **Java 17** is released as the current primary LTS version, bringing further refinements like sealed classes and pattern matching.

***

## ⚖️ Java ME vs. SE vs. EE

| Feature | Java ME (Micro Edition) | Java SE (Standard Edition) | Java EE (Enterprise Edition) -> Jakarta EE |
| :--- | :--- | :--- | :--- |
| **Purpose** | Small, resource-constrained devices (e.g., embedded systems). | General-purpose desktop, server, and console applications. | Large-scale, distributed, web-based enterprise applications. |
| **Core API** | A small subset of the Java SE API. | The core Java platform (`java.lang`, `java.util`, etc.). | Extends Java SE with APIs for the web (Servlets, JPA, etc.). |
| **Example Use** | SIM cards, early mobile phone apps. | **This CRM project**, desktop apps like IntelliJ IDEA. | E-commerce websites, banking systems. |

***

## 🏗️ Java Architecture: JDK, JRE, & JVM

The Java platform consists of three core components that work together.


* **JVM (Java Virtual Machine)**: An abstract machine that provides the runtime environment to execute Java bytecode. It translates bytecode into native machine code.
* **JRE (Java Runtime Environment)**: A software package containing everything needed to *run* a compiled Java application. It includes the JVM and the Java Class Library.
* **JDK (Java Development Kit)**: The complete software development kit for developers. It includes the JRE, a **compiler** (`javac`), a **debugger** (`jdb`), and other tools.

**In simple terms**: You use the **JDK** to write code. To run that code, a machine needs the **JRE**. The **JRE** then uses the **JVM** to execute the code.

***

## 💻 Installation and Setup

### Windows JDK Installation
1.  **Download**: Get the JDK installer from [Oracle](https://www.oracle.com/java/technologies/downloads/) or [Adoptium (OpenJDK)](https://adoptium.net/).
2.  **Install**: Run the installer.
3.  **Set Environment Variables**: Set the `JAVA_HOME` system variable to your JDK path (e.g., `C:\Program Files\Java\jdk-17`) and add `%JAVA_HOME%\bin` to your `Path` variable.
4.  **Verify**: Open a new Command Prompt and run `java -version`.

    

###### 💻 VS Code IDE Setup
1. **Download**: Install [Visual Studio Code](https://code.visualstudio.com/).
2. **Extensions**: Open the Extensions view (`Ctrl+Shift+X`) and install the **"Extension Pack for Java"** by Microsoft.
3. **Open Project**: Go to `File` -> `Open Folder` and select the `CRM` directory.
4. **Run Application**: Open `src/edu/crm/cli/CRMApp.java` and click the **Run** button (play icon) at the top right, or press **F5**.
    

***

## 🗺️ Syllabus Topic Mapping

This table maps key Java concepts to their implementation within the CRM project.

| Concept/Topic | File(s) / Package | Example / Method / Line Reference |
| :--- | :--- | :--- |
| **Packages** | `edu.crm.*` | Project organized into logical packages (`cli`, `domain`, etc.). |
| **OOP: Encapsulation** | `Person.java` | `private` fields with `public` getters and setters. |
| **OOP: Inheritance** | `Student.java` | `public class Student extends Person { ... }` |
| **OOP: Abstraction** | `Person.java`, `StudentService.java` | `public abstract class Person`, `public interface StudentService` |
| **OOP: Polymorphism** | `CRMApp.java` | A `Person` reference can hold a `Student` or `Instructor` object. |
| **Design Pattern: Singleton**| `config/DataStore.java` | `private static instance;`, `private DataStore()`, `getInstance()` |
| **Design Pattern: Builder**| `domain/Course.java` | Static nested `Builder` class for `Course` object creation. |
| **Control Flow (if, switch)**| `cli/CRMApp.java` | `if (choice == 1)`, `switch (choice)` in all menu methods. |
| **Loops (while, for-each)** | `cli/CRMApp.java` | `while (running)` main loop, `forEach` used for printing lists. |
| **Enums with Constructors** | `domain/Grade.java` | `Grade(double gradePoint)` constructor and `gradePoint` field. |
| **Interfaces** | `service/CourseService.java` | Defines the contract for course-related business logic. |
| **Exception Handling** | `cli/CRMApp.java` | Service calls in menus are wrapped in `try-catch` blocks. |
| **Custom Exceptions** | `exception/StudentNotFoundException.java` | Custom exception for specific business errors. |
| **File Input / Parsing** | `io/DataImporter.java` | **`Files.lines().skip(1).map(line -> line.split(","))` to read CSV.** |
| **NIO.2 (File Output)** | `io/DataExporter.java` | Use of `Path`, `Paths`, `Files.write()`, and `Files.copy()`. |
| **Streams API** | `service/EnrollmentServiceImpl.java` | `.stream().filter(...).collect(...)` for data processing. |
| **Date/Time API** | `domain/Person.java` | Use of `LocalDate` for birth dates and `LocalDateTime` for timestamps. |
| **Recursion** | `util/RecursiveFileUtils.java` | `calculateDirectorySize()` method calls itself for subdirectories. |

***

## 💡 Notes

### Enabling Assertions
Assertions are used to verify program invariants. To enable them, use the `-ea` flag when running from the command line.
```bash
# Example of running with assertions enabled
java -cp bin -ea edu.crm.cli.CRMApp

