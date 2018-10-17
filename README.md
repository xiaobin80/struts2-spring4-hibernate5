Struts2 Spring JPA
===============

Projects based on springBootJpa.
    
[demo jpa](https://github.com/xiaobin80/demo-jpa-spring-boot2-mysql)


	/**
	 * Built with MyEclipse 2017 Stable 2.0
	 * JTA(Atomikos-Hibernat4) + JPA
	 */
	 
.        
|____src        
| |____main        
| | |____java        
| | | |____com.example.demo    
| | |____resources    
| | | |____META-INF    
| | | | |____persistence.xml    
| | | |____applicationContext.xml    
| | | |____dataAccessContext-jta.xml    
| | | |____jdbc.properties    
| | | |____log4j2.xml    
| | | |____struts.xml     
| | |        
| | |____webapp        
| | | |____views       
| | | |____WEB-INF        
| | | | |____web.xml        
| | | |____index.html        
|____pom.xml        
        

Prepare:    
    1. Environment
    Set Maven(M2_home) in System variables.    
    1) Create an M2_HOME System Variable.    
    2) Add%M2_HOME%\bin; to your PATH variable.    
    
    2. Import Project    
    1) Open ME    
    2) Import->Maven->Existing Maven Projects    

Step 1: war       
    1) mvn clean    
    2) mvn compile
    3) mvn package    
    

Step 2:    
     http://localhost:8080/struts2-spring-jpa-0.0.2-SNAPSHOT/index    
     http://localhost:8080/struts2-spring-jpa-0.0.2-SNAPSHOT/home    
     http://localhost:8080/struts2-spring-jpa-0.0.2-SNAPSHOT/userSingle?userId={id}    
     [userList - struts2_tags](http://localhost:8080/struts2-spring-jpa/userList)    
     http://localhost:8080/struts2-spring-jpa-0.0.2-SNAPSHOT/userDel?userId={id}    
     http://localhost:8080/struts2-spring-jpa-0.0.2-SNAPSHOT/userInsert    
     http://localhost:8080/struts2-spring-jpa-0.0.2-SNAPSHOT/userUpdate?userName={value}&userId={id}    
     http://localhost:8080/struts2-spring-jpa-0.0.2-SNAPSHOT/trainList?month={number}&trainNum={number}    
             
