

# 🚀 Selenium 4.x Learning & Implementation Repository

This repository is dedicated to learning and implementing **Selenium 4.x Web Automation** concepts from scratch. It follows structured notes and assignments from *The Testing Academy (Pramod Sir)* and documents my journey toward mastering Selenium automation.

---

## 📌 Learning Goals

* Build a strong foundation in **Selenium WebDriver** and its ecosystem.
* Implement automation for **real-world web applications**.
* Learn **best practices** in test automation (frameworks, design patterns, CI/CD integration).
* Gain hands-on experience with **assignments, projects, and case studies**.

---

## 📚 Topics to be Covered

### 🔰 Basics

* What is Selenium & Where NOT to use it
* Selenium vs Playwright vs Cypress
* WebDriver Architecture (before vs after Selenium 4)
* Browser drivers setup & usage

### ⚙️ Selenium Core

* WebDriver, ChromeDriver, RemoteWebDriver
* Navigation commands (`get`, `navigate.to`, `back`, `forward`, `refresh`)
* Locators (ID, Name, ClassName, CSS, XPath, LinkText, PartialLinkText)
* Handling HTML forms, checkboxes, radio buttons, alerts

### 🧭 Advanced Locators

* XPath (absolute, relative, functions, axes)
* CSS selectors (attributes, nth-child, etc.)
* Relative Locators (Selenium 4 feature)

### ⏳ Synchronization

* Implicit Wait
* Explicit Wait (ExpectedConditions)
* Fluent Wait

### 🖱️ Web Interactions

* Actions class (mouse, keyboard, drag & drop)
* Handling windows, tabs, iframes
* File uploads & downloads

### 🗂️ Working with Data

* Apache POI (Data Driven Testing)
* Property file readers
* Excel-driven test cases

### 🏗️ Frameworks & Patterns

* Page Object Model (POM)
* Page Factory
* TestNG Integration
* Logging with Log4j
* Allure Reports

### 🌐 Grid & Cloud

* Selenium Grid 3 vs 4
* Running tests on Docker Grid
* Running tests on BrowserStack / Cloud providers

### 🔒 Advanced Topics

* Handling Dynamic Elements
* Handling SVG & Shadow DOM
* JavaScript Executor
* Relative Locators in depth

### 🛠️ CI/CD & Deployment

* Jenkins job setup
* Running Selenium Tests on AWS
* Parallel and Cross-browser execution

---

## 📝 Assignments & Projects

* Automate Login Page of **VWO.com**
* Capture invalid login error messages
* Dropdowns, alerts, and table handling
* Heatmap & iframe handling for **VWO.com**
* Data-driven testing project using **Apache POI**
* Mini CRM Automation (OrangeHRM)
* Final Framework:

    * POM based
    * TestNG + Maven
    * Allure Report
    * Config properties
    * Cloud/Grid support

---

## ⚒️ Tech Stack

* **Language:** Java
* **Build Tool:** Maven
* **Testing Framework:** TestNG
* **Automation:** Selenium 4.x
* **Reports:** Allure
* **Logging:** Log4j2
* **CI/CD:** Jenkins / GitHub Actions
* **Others:** Apache POI, Docker, BrowserStack

---

## 📂 Repository Structure (Planned)

```
selenium-learning/
│── docs/                  # Notes, reference materials
│── src/test/java/         # Test classes
│   ├── basics/            # First scripts, navigation, locators
│   ├── waits/             # Synchronization examples
│   ├── actions/           # Mouse, keyboard, windows, iframes
│   ├── datadriven/        # Apache POI, property readers
│   ├── framework/         # POM, PageFactory, Utils
│   ├── assignments/       # VWO & project assignments
│── src/test/resources/    # Config, test data, log4j2.properties
│── pom.xml                # Maven dependencies
│── README.md              # This file
```

---

## 🚦 Progress Tracking

* [ ] Basics setup & first script
* [ ] Locators practice
* [ ] Waits & synchronization
* [ ] Advanced interactions
* [ ] Data driven testing
* [ ] Framework implementation
* [ ] Grid & Docker setup
* [ ] Jenkins CI/CD integration

---

## 📖 References

* [Selenium Official Docs](https://www.selenium.dev/documentation/)
* [SelectorsHub](https://selectorshub.com/)
* [Apache POI](https://poi.apache.org/)
* [The Testing Academy](https://thetestingacademy.com/)

---


