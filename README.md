# REPOSITORY_MANAGER

Config Sonatype Nexus Repository Manager
-----------------------------------------------------

![image](https://user-images.githubusercontent.com/32607915/221814594-e990a508-0189-4c04-b444-2bdc6d869a00.png)

gradle-plugin: https://plugins.gradle.org/m2/

maven-central: https://repo1.maven.org/maven2/

mvnrepository: https://mvnrepository.com/artifact/org.apache.phoenix/phoenix-core/4.2.0.2.2.0.0-2041

![image](https://user-images.githubusercontent.com/32607915/221815035-c8fab19b-8ed6-4adf-b1b0-a4efc7ab9df0.png)



For Maven Need to update maven settings.xml file for 


servers:

		<server>
		 <id>imranmadbar-nexus-repoid</id>
		 <username>admin</username>
		 <password>admin123</password>
		</server>
mirrors:

		<mirror>
		 <id>imran-nexus</id>
		 <mirrorOf>*</mirrorOf>
		 <url>http://localhost:8081/repository/maven-public/</url>
		</mirror>
