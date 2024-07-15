# CheckMarks Project

This is a Java web application for managing student marks, developed using JSP, Servlets, and the Apache Tomcat server.

## Project Structure

```
CheckMarks Project/
│
├── .gitignore
├── .metadata/
│   ├── .lock
│   ├── .log
│   ├── version.ini
│   └── .mylyn/
│       └── repositories.xml.zip
├── Demo/
│   ├── .classpath
│   ├── .gitignore
│   ├── .project
│   ├── .settings/
│   ├── build/
│   │   └── classes/
│   │       └── com/yash/
│   │           ├── loginCheck.class
│   │           ├── loginServlet.class
│   │           ├── marksServlet.class
│   │           └── model/Student.class
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com/yash/
│           │       ├── loginCheck.java
│           │       ├── loginServlet.java
│           │       ├── marksServlet.java
│           │       └── model/Student.java
│           └── webapp/
│               ├── home.jsp
│               ├── login.jsp
│               ├── showStudent.jsp
│               └── WEB-INF/
│                   ├── lib/
│                   │   ├── jstl-1.2.jar
│                   │   └── mysql-connector-j-8.4.0.jar
│                   └── META-INF/
│                       └── MANIFEST.MF
├── Servers/
│   ├── .project
│   ├── .settings/
│   │   ├── org.eclipse.core.resources.prefs
│   │   └── org.eclipse.wst.server.core.prefs
│   └── Tomcat v9.0 Server at localhost-config/
│       ├── catalina.policy
│       ├── catalina.properties
│       ├── context.xml
│       ├── server.xml
│       ├── tomcat-users.xml
│       └── web.xml
```

## Tech Stack

- **Java**: Programming language used for developing the application.
- **JSP (JavaServer Pages)**: For creating dynamic web pages.
- **Servlets**: For handling request and response processing.
- **Apache Tomcat**: Web server and servlet container.
- **MySQL**: Database management system for storing student data.
- **JSTL (JavaServer Pages Standard Tag Library)**: For using common tags in JSP.
- **Maven**: Dependency management and build automation tool (optional).

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Tomcat 9
- Maven (optional, for managing dependencies)
- MySQL database

## Setup

### Database Configuration

1. Create a MySQL database named `studentDB`.
2. Create a table `students` with the following structure:

   ```sql
   CREATE TABLE students (
       id INT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(100) NOT NULL,
       marks INT NOT NULL
   );
   ```

3. Update the database connection details in the `loginServlet.java` and `marksServlet.java` files:

   ```java
   String url = "jdbc:mysql://localhost:3306/studentDB";
   String user = "yourUsername";
   String password = "yourPassword";
   ```

### Running the Application

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/checkmarks-project.git
   ```

2. Import the project into your IDE (e.g., Eclipse or IntelliJ IDEA) as a Maven or Java project.

3. Deploy the `Demo` folder on your Apache Tomcat server.

4. Start the Tomcat server and navigate to `http://localhost:8080/Demo/login.jsp` to access the application.

## Usage

- **Login Page** (`login.jsp`): Enter your credentials to log in.
- **Home Page** (`home.jsp`): View the home page after logging in.
- **Show Student Page** (`showStudent.jsp`): Display student details and their marks.

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a pull request.

## Contact

For any questions or suggestions, please contact `tyash6843@gmail.com`.
