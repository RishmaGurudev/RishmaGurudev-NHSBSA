# RishmaGurudev-NHSBSA
# Java, Selenium, and Cucumber Framework Setup

This guide provides step-by-step instructions for setting up a Java, Selenium, and Cucumber framework for automated testing. Additionally, it explains how to clone a Java repository to get started with test automation.

## Prerequisites

Before you begin, ensure you have the following prerequisites installed on your system:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- An Integrated Development Environment (IDE) [Eclipse](https://www.eclipse.org/downloads/)
- [Apache Maven](https://maven.apache.org/download.cgi)
- [Git](https://git-scm.com/downloads)

## Step 1: Install Java Development Kit (JDK)

1. Download and install the latest version of JDK from the official Oracle website or an OpenJDK distribution.

2. Set up the JAVA_HOME environment variable with the path to your Java installation. Ensure that you've added the "bin" directory to your system's PATH variable.

## Step 2: Install an Integrated Development Environment (IDE)

Choose an IDE based on your preference. Popular options include IntelliJ IDEA and Eclipse. Download and install the IDE of your choice.

## Step 3: Install Apache Maven

1. Download Apache Maven from the official website.

2. Follow the installation instructions for your operating system to set up Maven. Make sure to add Maven's "bin" directory to your system's PATH.

## Step 4: Clone the Repository

To get started with test automation, you'll need a Java project or repository. If you already have one, skip this step. If not, you can clone a sample Java repository from GitHub:

## Step 5:  Set Up a Selenium and Cucumber Project

1. Open your chosen IDE (e.g., Eclipse).

2. Create a new Maven project and import the cloned repository into the project.

3. Configure your project's POM (Project Object Model) file to include dependencies for Selenium, Junit and Cucumber. Add these dependencies to the <dependencies> section of your POM file.

## Step 6: Run Tests

### 1. Scenario 1: Test Case Automation Approach

- Feature File present at : src/test/resources/Features/ManualAutomation.feature 
- Run the Script : src/test/java/AutomationRecursive/TestManualAutomaionRunner.java
- Output: target/JUnit/TestManualAutomation.xml; also refer to console.

### 2. Scenario 2: Fully Automated Approach
- Feature File present at : src/test/resources/Features/Demo.feature 
- Run the Script : src/test/java/AutomationRecursive/TestRunner1.java
- Output: target/JUnit/report.xml; also refer to console.

