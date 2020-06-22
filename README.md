iOS Calendar & Weather API Automation

This project is based on Page Objects model and caters for both mobile and API test automation. 

Further Improvements:
1. A bit of redundant code can be removed
2. Hard coding of inputs needs to be parameterised

The project was designed on Mac OS Mojave using IntelliJ Idea 2019 community edition.

Dependencies:
Java 8 Lambda etc.
Selenium 3.141.59
Maven for dependency management

Setup
Corresponding drivers are required for the tests to run successfully.

Clone the repo
git clone https://github.com/preetparikh/Java_Automation.git

Project structure and compiler settings for IntelliJ
In Project Structure settings > Modules > Sources - Select language level 8 and click apply.
In IDE settings/preferences > Build, Execution, Deployment > Compiler > Java Compiler - Make sure Project Bytecode version is set to 8

How to Run:

Once project is cloned and set up, right click on feature files and run as a feature.
For Mobile: Make sure Appium is running on server 127.0.0.1:4723
