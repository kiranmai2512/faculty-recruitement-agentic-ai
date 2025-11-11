# Faculty Recruitment & Talent Management (Spring Boot + Lombok + MySQL)

A minimal but functional starter to manage **Departments**, **Job Openings**, **Faculty**, and **Applications**.

## Features
- Spring Boot 3 + Java 17
- Lombok for boilerplate (`@Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor`)
- Spring Data JPA with MySQL
- Layered architecture (Controller → Service → Repository → Entity/DTO)
- Basic recruitment flow: create job, apply, shortlist, hire
- Sample endpoints with request validation

## Getting Started
1. Install Java 17, Maven, and MySQL.
2. Create a DB user or use root, then update `src/main/resources/application.properties`:
   ```properties
   spring.datasource.username=root
   spring.datasource.password=your_password
   ```
3. Run:
   ```bash
   mvn spring-boot:run
   ```
4. Open Swagger-like test with curl/HTTPie/Postman against `http://localhost:8080/api/...`

## Example Endpoints
- `POST /api/departments` – create department
- `POST /api/jobs` – create job opening
- `POST /api/applications` – apply for a job
- `PATCH /api/applications/{id}/status?value=SHORTLISTED` – update application status
- `POST /api/faculty` – add faculty (after hire)

## Notes
- This starter uses `ddl-auto=update` for convenience. For production, prefer Flyway/Liquibase migrations.
