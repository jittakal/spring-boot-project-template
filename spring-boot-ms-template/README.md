# Overview

The spring boot template micro-service POM project, whose parent project should be spring-boot-ms-parent POM project.

```
-- Spring boot starters parent
   |--> Spring boot Micro-service parent
        |---> Spring boot mirco-services application project
```

It is parent project of type POM for identified micro-services and it is multi-module maven project. It is recommended to separate projects into atleast two or three maven modules such as <mark style="background-color: lightblue">project-api</mark>, <mark style="background-color: lightblue">project-application</mark> and <mark style="background-color: lightblue">project-client</mark>.

|Maven Module |Purpose| 
--- | ---
| project-api | It should contains all the request and response object used to define the serivces. Other micro-serives can include project-api maven module dependecy those are acting like consumer |
| project-application | Core project holds Application, Configuration, COntroller, Services and Repository classes |
| project-client | It should contains all the client REST API consumers which consumers other micro-services or external third party micro-services |

Standard package naming conventions for reference as follows ...
* io.jittakal.myapplication - groupId
    - api - Request and Response contract classes
    - controller - Controller classes - REST API
    - service - Serivce layer classes
    - repository - Database access classes 
    - client - Rest client classes
    - MyApplication - Spring boot main class
    - MyApplicationConfiguration - Spring boot configuration class

'project-application' maven module will have dependency on the 'project-api' and 'project-client' maven modules.
