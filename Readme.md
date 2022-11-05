# [Patika.Dev](https://www.patika.dev/tr) [A101](https://www.a101.com.tr/) Test Automation Practicum Project

- Subject: Adding a product to the cart on Hepsiburada.com 
- This project includes an E2E automation sample.

---------------------------------------------------------------- -----------------------------

# Used technologies:
- The project is written in Java programming language, and the Maven repository is used.
- Selenium TestNG Framework is used for the scenario.
- The project is logged with Apache log4j Dependices.
- The project applied to the Page Object Model Desing Pattern has been developed by OOP concepts.
- Extent Report and Allure Report technologies are used for reporting.
![alt text](https://static.wixstatic.com/media/850ae7_ce0ada348c5446629cbf47af4911ca20~mv2.png/v1/fill/w_740,h_555,al_c,q_90,usm_0.66_1.00_0.01,enc_auto/850ae7_ce0ada348c5446629cbf47af4911ca20~mv2.png)
---------------------------------------------------------------- ------------------------------
## Test Run
- 1-Open the Terminal (Mac) or Console (Windows) application on your device and enter the project's main folder. 
- 2- Run the command by typing mvn clean test.
---------------------------------------------------------------- --------------------------------
## Parallel & Cross Browser Test Run via Intellij
- Find src>java>Xsuites
- Right-click the ParallelTests.xml file and select Run.
- Tests will run in parallel.

- Find src>java>Xsuites
- Right-click on the CrossBrowserTests.xml file and select Run.
- Tests will run in Cross Browsers.

---------------------------------------------------------------- -----------------------------------------------
## Reporting
[Allure Report](https://docs.qameta.io/allure-report/)
- 1-Open the Terminal (Mac) or Console (Windows) application on your device and enter the project's main folder.
- 2- Run the command by typing mvn clean verify.
- 3-When the test run is finished, run the command by typing "allure open allure-results"
- 4-You can review the report from the platform that opens.

[Extent Report](https://www.extentreports.com/) 
- 1-Open the Terminal (Mac) or Console (Windows) application on your device and enter the project's main folder. 
- 2- Run the command by typing mvn clean verify.
- 3- When the test run is finished, you can examine the report by selecting suitable browser from \target\surefire-reports\A101-Test-Suite file.