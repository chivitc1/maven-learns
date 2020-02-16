## Create multi-module project
 mvn archetype:generate \
 -DarchetypeGroupId=com.tbp \
 -DarchetypeArtifactId=java8-junit5-archetype \
 -DarchetypeVersion=1.0-SNAPSHOT  \
 -DgroupId=com.example       \
 -DartifactId=my-project      \
 -Dpackaging=pom \
 -DinteractiveMode=true

cd my-project/

  mvn archetype:generate \
 -DarchetypeGroupId=com.tbp \
 -DarchetypeArtifactId=java8-junit5-archetype \
 -DarchetypeVersion=1.0-SNAPSHOT  \
 -DgroupId=com.example       \
 -DartifactId=hello-core      \
 -DinteractiveMode=true \
 -Dversion=1.0-SNAPSHOT \
 -Dpackage=com.example.core

mvn clean install -pl hello-core

 -la ~/.m2/repository/com/example/

  mvn archetype:generate \
 -DarchetypeGroupId=com.tbp \
 -DarchetypeArtifactId=java8-junit5-archetype \
 -DarchetypeVersion=1.0-SNAPSHOT  \
 -DgroupId=com.example       \
 -DartifactId=hello-service      \
 -Dpackaging=pom \
 -DinteractiveMode=true \
 -Dversion=1.0-SNAPSHOT \
 -Dpackage=com.example.service

Add dependency hello-core to hello-service pom.xml dependencies:

...
	<dependency>
	  <groupId>com.example</groupId>
	  <artifactId>hello-core</artifactId>
	  <version>1.0-SNAPSHOT</version>
	</dependency>
</dependencies>

 mvn verify
 