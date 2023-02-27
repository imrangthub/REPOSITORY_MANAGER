# REPOSITORY_MANAGER
Spring with Sonatype Nexus Repository Manager


Need to update maven settings.xml file for 



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
