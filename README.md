## Spring boot Security🚀🚀

1 . Spring security is  a framework that provides authentication, authorization and protection agains common attacks. With first class support for security both web and reactive apps, 
is the de-facto standard for security spring-based application.

2. Spring boot provides a spring-boot-starter-security started that agregation spring security-related dependencies together.

3. Depreciated
   - WebSecurityConfigurerAdapter
   - EnableGlobalMethodSecurity
   - antMatchers
   - authorizeRequest

##Spring boot Auto-Configuration for Srping Security 
- Spring-boot-starter-security starter that agregates spring security-related dependecies together.
- Enable Spring security default configuration , which creates a servlet filter as a bean named spring SecurityFilterChain. It provides default login form for you.
- Creates default user with a username as "user" and a randomly generated password that is logged to the console (Ex: 675f687f6f77f6d87d67d6d7)
- Spring boot provides properties to customize default user's name and password.
- Protects the password storage with BCrypt algorithm.
- CSRF attack prevention(enable by default)
- If spring security is on the classpath , spring boot automatically boot secures all Http endpoints with basic authentication.
