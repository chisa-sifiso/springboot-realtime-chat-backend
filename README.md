<h1 align="center">Spring Boot Real-Time Chat Backend</h1>

<p align="center">
    <b>A real-time chat application backend built with Spring Boot and WebSocket.</b>
</p>

<hr />

<h2>📖 Features</h2>
<ul>
    <li>Real-time messaging using WebSocket</li>
    <li>STOMP protocol for message communication</li>
    <li>Scalable and lightweight backend</li>
</ul>

<h2>🚀 Getting Started</h2>
<ol>
    <li>Clone this repository:
        <pre><code>git clone https://github.com/chisa-sifiso/springboot-realtime-chat-backend.git</code></pre>
    </li>
    <li>Open the project in your favorite IDE (IntelliJ, Eclipse, etc.).</li>
    <li>Run the application:
        <pre><code>./mvnw spring-boot:run</code></pre>
    </li>
    <li>Access the frontend (served at <code>http://localhost:8080</code>).</li>
</ol>

<h2>🔧 Configuration</h2>
<p>
    Make sure to configure the application properties in <code>src/main/resources/application.properties</code> if you're adding database support.
</p>

<h2>💻 Technologies Used</h2>
<ul>
    <li><b>Spring Boot</b> - Backend framework</li>
    <li><b>Spring WebSocket</b> - Real-time messaging</li>
    <li><b>STOMP Protocol</b> - Subscribing to and publishing messages</li>
</ul>

<h2>📂 Project Structure</h2>
<pre>
.
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.chat
│   │   │       ├── config        # WebSocket configuration
│   │   │       ├── controller    # Chat message controller
│   │   │       ├── model         # Chat message model
│   │   │       └── Application.java # Main application class    
└── pom.xml                       # Maven dependencies
</pre>

<h2>👩‍💻 Contributing</h2>
<p>Contributions are welcome! Please fork this repository and submit a pull request.</p>
<h1>developed by Sifiso Vinjwa</h1>

<h2>📜 License</h2>
<p>This project is licensed under the <b>MIT License</b>.</p>
<h2>Developer</h2>
<h1>Sifiso Vinjwa</h1>
<h2>📧 Contact</h2>
<p>For any inquiries or issues, feel free to contact <a href="mailto:>sifisovinjwa1@gmail.com">sifisovinjwa1@gmail.com</a>.</p>
