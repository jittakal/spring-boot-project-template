# Overview 

Spring boot micro-services maven project parent pom. This POM is the common parent project for all the micro-services. The parent of this POM project is Spring boots starter parent project. This POM should include all the variable under ```<properties> </properties>``` tag and all child project should use defined variable in this POM project. 

Sample code block to use it as a parent in micro-serivces POM project as follows ...
```
	<parent>
		<groupId>io.jittakal</groupId>
		<artifactId>spring-boot-ms-parent</artifactId>
		<version>0.0.1-SNAPSHOT</version>
		<relativePath /> 
	</parent>
```