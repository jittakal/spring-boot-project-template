# Overview

Spring boot micro-serivces projects application maven module. It adds dependecies for spring boot all essential libraries and dependecies for 'project-api' and 'project-client'

It is recommded to follow three layers as follows

```
- Controllers  ---> Service |---> Repository 
                            |---> Client Component
```

Few recommendations:
- Logger is based on logback as it is default in Spring boot.
- OpenAPI Specification v3 originally known as Swagger Specification.