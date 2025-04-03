# HookHub - Angling Community Platform

## Overview
**HookHub** is an innovative platform designed for anglers worldwide, combining smart gear integration, real-time data, and a vibrant community experience. It features a Spring Boot backend, a PostgreSQL database, and a React-based frontend. Key functionalities include tracking catches, analyzing sensor data, sharing community posts, trading used gear in a marketplace, and gamification through points.

- **Domain**: [hook-hub.com](https://hook-hub.com)
- **Backend**: Spring Boot
- **Frontend**: React with TypeScript
- **Database**: PostgreSQL 15
- **RepositoryURL**: [github.com](https://github.com/NiklasGanske/HookHub)

## Technologies
- **Backend**:
  - Spring Boot 3.2.4
  - Java 17
  - Maven
  - Dependencies: `spring-boot-starter-web`, `spring-boot-starter-data-jpa`, `postgresql`, `lombok`, `spring-boot-starter-security`, `spring-boot-starter-validation`, `jackson-databind`, `spring-boot-starter-actuator`
- **Frontend**:
  - React 18 with TypeScript
  - TanStack Query (data fetching)
  - Zustand (state management)
  - React Router (navigation)
  - Tailwind CSS (styling)
  - shadcn/ui (UI components)
  - Node.js 18+
- **Database**: PostgreSQL 15
- **DevOps**: Docker Compose, Git

## Prerequisites
- Java 17 or higher
- Maven
- Node.js 18 or higher
- npm or yarn
- Docker and Docker Compose
- Git
- IDE (e.g., IntelliJ IDEA, VS Code)

## Database Structure

```plaintext
+----------------+      +----------------+      +----------------+
|     User       | 1:n  |      Gear      | n:n  |   SensorData   |
|----------------| <----|----------------| <----|----------------|
| id (PK)        |      | id (PK)        |      | id (PK)        |
| username       |      | userId (FK)    |      | gearId (FK)    |
| email          |      | type           |      | type           |
| location       |      | sensorId       |      | value          |
| skillLevel     |      | status         |      | timestamp      |
| points         |      +----------------+      +----------------+
+----------------+
       | 1:n
       |
       v
+----------------+      +----------------+      +----------------+
|     Catch      | 1:n  |      Post      | 1:n  | MarketplaceItem|
|----------------| <----|----------------|      |----------------|
| id (PK)        |      | id (PK)        |      | id (PK)        |
| userId (FK)    |      | userId (FK)    |      | userId (FK)    |
| species        |      | content        |      | gearId (FK)    |
| weight         |      | catchId (FK)   |      | price          |
| length         |      | createdAt      |      | condition      |
| location       |      +----------------+      | status         |
| timestamp      |                             +----------------+
| gearId (FK)    |
+----------------+
```

## Contributing
We welcome contributions to HookHub! To contribute:

HookHub is a private project, and contributions are limited to individuals explicitly invited by the project owner, Niklas Ganske. If you are interested in collaborating, please reach out directly via the contact details below. Unauthorized contributions are not accepted at this time.

## License
This project is proprietary and all rights are reserved by Niklas Ganske. No part of this software may be copied, modified, distributed, or used without explicit permission from the owner.

## Contact
For questions, feedback, or collaboration inquiries, feel free to reach out:
- **GitHub**: [NiklasGanske](https://github.com/NiklasGanske)
- **Email**: Contact me via GitHub Issues or a direct message on GitHub (no public email provided).

Maintained by Niklas Ganske.