# spending-tracker

Track spending habits of users with Spring Boot + Angular stack.

🌟 Project Idea: Customer Spending Tracker
🎯 Objective
A web-based application to track and analyze a customer’s spending habits across various categories like groceries, utilities, travel, etc., with visual dashboards, alerts, and predictive insights.

🏗️ Big Picture Architecture (High-Level)

[ AngularJS Frontend ] <===> [ Spring Boot Backend - REST APIs ]
|
v
[ Microservices Layer ]
/ | \
 [ Spending Service ] [ Analytics Service ] [ Notification Service ]
\_**\_\_\_**|****\_****/
|
[ PostgreSQL / Oracle DB ]
|
[ Data Integration Layer ]
|
[ AWS Cloud Services / Azure Equivalent ]
