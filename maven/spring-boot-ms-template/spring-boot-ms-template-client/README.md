# Overview

Maven module which contains all the client code that accesses external HTTP service or other Micro-services REST API calls. Core Applications service layer should consume the client code beans same as database repository classes.

Flow in terms of internal layer as follows
```
- Controler ---> Service ---> Client Consumer Bean
```
Ensure to add Health checks for all third party REST API's and expose it with Spring Actuator module.
