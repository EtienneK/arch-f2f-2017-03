1.  Run local instance of Postgres inside of Docker inside
    a bash window:
```
docker run --rm -e \
  POSTGRES_PASSWORD=password \
  -p 5432:5432 \
  postgres
```

2.  Open a new Bash window,
    create a Spring Boot application and build it:
```
spring init -d=data-jpa,data-rest,data-rest-hal,security,postgresql,h2,lombok
unzip demo.zip -d demo
cd demo
./mvnw clean package
```

3.  Initialise git repo:
```
git init
git add .
git commit -m "Initial commit"
```

4.  Create static password for demo user `user` by adding
    the following line to
    `src/main/resources/application.properties`:
```
security.user.password=password
```

5.  Set up Postgres Database connection in
    `src/main/resources/application.properties`

```
spring.jpa.database=postgresql
spring.datasource.url=${JDBC_DATABASE_URL}
spring.jpa.hibernate.ddl-auto=update
```

> For local connections, use this connection string: `jdbc:postgresql://localhost:5432/postgres?user=postgres&password=password`

6.  Create test properties in bash:
```
mkdir src/test/resources
touch src/test/resources/application.properties
```

7.  Set up H2 Database connection in
    `src/test/resources/application.properties`
```
spring.jpa.database=h2
spring.datasource.url=
spring.jpa.hibernate.ddl-auto=update
```
