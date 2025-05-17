# 💸 Customer Spending Tracker

[![GitHub stars](https://img.shields.io/github/stars/jhansi-siripura/customer-spending-tracker?style=social)](https://github.com/jhansi-siripura/customer-spending-tracker/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/jhansi-siripura/customer-spending-tracker?style=social)](https://github.com/jhansi-siripura/customer-spending-tracker/network)
[![GitHub issues](https://img.shields.io/github/issues/jhansi-siripura/customer-spending-tracker)](https://github.com/jhansi-siripura/customer-spending-tracker/issues)
[![GitHub license](https://img.shields.io/github/license/jhansi-siripura/customer-spending-tracker)](https://github.com/jhansi-siripura/customer-spending-tracker/blob/main/LICENSE)

---

## 🎯 Objective

A web-based application to help users:

- Track spending across categories (Groceries, Utilities, Travel, etc.)
- Analyze monthly and yearly trends
- Visualize data with charts
- Get alerts and insights on overspending
- Plan future budgets with predictive analytics

---

## 🏗️ Architecture Diagram

```text
[ AngularJS Frontend ] <===> [ Spring Boot Backend (REST APIs) ]
                                 |
                          [ Microservices Layer ]
                             /     |      \
            [ Spending Service ][ Analytics Service ][ Notification Service ]
                                 |
                            [ PostgreSQL / Oracle DB ]
                                 |
                        [ Data Integration Layer ]
                                 |
                  [ AWS Cloud Services / Azure Equivalent ]
```

🚀 Tech Stack
| Layer | Technology |
| ------------ | -------------------------- |
| Frontend | AngularJS |
| Backend | Spring Boot (Java) |
| Database | PostgreSQL / Oracle |
| Cloud | AWS / Azure |
| Architecture | Microservices |
| APIs | RESTful APIs |
| Monitoring | Spring Actuator (optional) |

📂 Folder Structure (Coming Soon)

```text
/frontend                --> AngularJS App
/backend                 --> Spring Boot App
/spending-service        --> Microservice for tracking spends
/analytics-service       --> Microservice for insights & reports
/notification-service    --> Alerts/Email/SMS logic
/docs                    --> Design, Requirements, API Specs
```

🔮 Future Features
🔔 Spending alerts based on thresholds

📊 Pie/bar charts for visual spend analysis

🔍 Searchable and filterable spend logs

🤖 Predictive analysis for future budgeting

📥 Excel/PDF export of reports

📧 Email notifications for daily/weekly summaries

👉 Make sure Lombok is installed in Eclipse: download `lombok.jar` from https://projectlombok.org/download and run `java -jar lombok.jar` to install it into Eclipse (required for @Data and other annotations to work).

🔍 API Documentation
This project includes interactive API documentation using Swagger UI via Springdoc OpenAPI.

Base URL (local): http://localhost:8080

Swagger UI: http://localhost:8080/swagger-ui.html

OpenAPI Spec JSON: http://localhost:8080/v3/api-docs

Example Endpoints:
Method Endpoint Description
POST /api/expenses/user/{userId} Add a new expense for user
GET /api/expenses/user/{userId} Get all expenses by user

📦 How to Use
Start the Spring Boot application.

Visit /swagger-ui.html in your browser.

Expand an endpoint and click "Try it out" to test.

Fill the request body and path params.

Click Execute to submit and view response.

👩‍💻 Author
Jhansi Siripura
🔗 GitHub
📬 jhansisiripura@gmail.com
