# Spring MVC 4 Restful Demo

### Supported operations
1. Create an employee
   ```
   PUT /spring-mvc-restful-demo/api/employee
   Content-Type: application/json
   Body: {"id": 9527, "name": "Bohu Tang"}
   ```

2. Get an employee
   ```
   GET /spring-mvc-restful-demo/api/employee/9527
   ```

3. Get all employees
   ```
   GET /spring-mvc-restful-demo/api/employee
   ```

4. Update an employee
   ```
   POST /spring-mvc-restful-demo/api/employee/9527
   Body: Xingchi Zhou
   ```

5. Delete an employee
   ```
   DELETE /spring-mvc-restful-demo/api/employee/9527
   ```
