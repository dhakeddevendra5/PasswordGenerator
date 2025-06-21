<h1 align="center">🔐 Password Generator</h1>
<p align="center">
  <img src="https://img.icons8.com/fluency/96/password1.png" alt="Password Icon" />
</p>

<p align="center">
  A simple and secure web-based password generator built with <strong>Spring Boot</strong>.
</p>

<hr>

<h2>🚀 Features</h2>
<ul>
  <li>✅ Strong password generation</li>
  <li>✅ Fully customizable options (length, types)</li>
  <li>✅ Lightweight REST API</li>
  <li>✅ Easy integration into other apps</li>
</ul>


<hr>

<h2>🚀 Demo Screenshots</h2>

<div class="slider-container">
  <div class="slider-wrapper" id="sliderWrapper">
    <img src="https://raw.githubusercontent.com/dhakeddevendra5/PasswordGenerator/master/PasswordGenerator/Screenshot%202025-05-10%20145642.png" alt="Screenshot 1" />
    <img src="https://raw.githubusercontent.com/dhakeddevendra5/PasswordGenerator/master/PasswordGenerator/Screenshot%202025-05-10%20145706.png" alt="Screenshot 2" />
    <img src="https://raw.githubusercontent.com/dhakeddevendra5/PasswordGenerator/master/PasswordGenerator/Screenshot%202025-05-10%20145732.png" alt="Screenshot 3" />
    <img src="https://raw.githubusercontent.com/dhakeddevendra5/PasswordGenerator/master/PasswordGenerator/Screenshot%202025-05-10%20145740.png" alt="Screenshot 4" />
  </div>
</div>



<hr>

<h2>📦 API Overview</h2>

<pre><code>POST /api/generate</code></pre>

<h4>🔧 Request Body:</h4>
<pre><code>{
  "length": 12,
  "includeUppercase": true,
  "includeLowercase": true,
  "includeNumbers": true,
  "includeSpecial": true
}</code></pre>

<h4>📤 Sample Response:</h4>
<pre><code>{
  "password": "A2f@kLp9#Zx1"
}</code></pre>

<hr>

<h2>🛠️ Tech Stack</h2>
<img src="https://skillicons.dev/icons?i=spring,java,maven,postman,git,docker" alt="Tech Stack Icons" />

<ul>
  <li>Java 17+</li>
  <li>Spring Boot 3+</li>
  <li>Maven / Gradle</li>
  <li>Postman for testing</li>
</ul>

<hr>

<h2>💻 Run Locally</h2>
<p><strong>Clone & Navigate</strong></p>
<pre><code>git clone https://github.com/your-username/password-generator-springboot.git
cd password-generator-springboot</code></pre>

<p><strong>Build & Run</strong></p>
<pre><code>./mvnw spring-boot:run</code></pre>

<p><strong>Or with Gradle:</strong></p>
<pre><code>./gradlew bootRun</code></pre>

<hr>

<h2>🐳 Docker</h2>
<img src="https://img.icons8.com/color/48/docker.png" alt="Docker Icon"/>
<pre><code>docker build -t password-generator .
docker run -p 8080:8080 password-generator</code></pre>

<hr>

<h2>🗂 Folder Structure</h2>
<img src="https://img.icons8.com/fluency/48/folder-invoices.png" alt="Folder Icon"/>
<pre><code>
src/
 └── main/
     ├── java/
     │    └── com.example.demo/
     │         ├── controller/
     │         ├── service/
     │         ├── model/
     │         └── PasswordGeneratorApplication.java
     └── resources/
          ├── application.properties
</code></pre>

<hr>

<h2>🌐 Live Preview (Optional)</h2>
<p><i>Include a deployed URL if available</i></p>
<pre><code>https://your-deployed-url.com</code></pre>

<hr>

<h2>🤝 Connect With Me</h2>
<p>
  <a href="https://www.linkedin.com/in/devendra-dhaked-98b14624a/">
    <img src="https://img.icons8.com/color/48/linkedin.png" alt="LinkedIn" />
  </a>
  <a href="mailto:dhakeddevendra5@gmail.com">
    <img src="https://img.icons8.com/color/48/gmail-new.png" alt="Email" />
  </a>
</p>

<hr>

<h2>📜 License</h2>
<p>MIT License - Feel free to use and modify.</p>
