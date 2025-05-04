# nanoxAutomation

## Tech Stack
- Java 11
- Selenium WebDriver
- Cucumber
- TestNG
- Allure

## How to Run
```bash
mvn clean test
allure serve allure-results
```

## Structure
- `pages/` for Page Object classes
- `steps/` for step definitions
- `features/` for Gherkin files
- `runners/` for TestNG+Cucumber integration

## Features Covered
- Login
- Add to Cart
- Place Order
