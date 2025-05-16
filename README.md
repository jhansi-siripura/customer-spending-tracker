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
