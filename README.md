# Selenium Basics

## Explaining the code

### Add dependencies ###

```xml
  <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>3.141.59</version>
  </dependency>

  <dependency>
      <groupId>org.testng</groupId>
      <artifactId>testng</artifactId>
      <version>6.14.3</version>
      <scope>test</scope>
  </dependency>

  <dependency>
      <groupId>io.github.bonigarcia</groupId>
      <artifactId>webdrivermanager</artifactId>
      <version>3.4.0</version>
      <scope>test</scope>
  </dependency>

```

### Importing Packages ###

To get started, you need to import following two packages:

- org.openqa.selenium.*- contains the WebDriver class needed to instantiate a new browser loaded with a specific driver
- org.testng.* - TestNG is a testing framework that is capable of making Selenium tests easier to understand and of generating reports that are easy to understand

If your test needs more complicated actions such as accessing another class, taking browser screenshots, or manipulating external files, definitely you will need to import more packages.

<br>

### Instantiating objects and variables ###

  Normally, this is how a driver object is instantiated.

  A ChromeDriver class with no parameters means that the default Chrome profile will be launched by our Java program. The default Chrome   profile is similar to launching Chrome in safe mode (no extensions are loaded).

  For convenience, we saved the Base URL and the expected title as variables.

<br>

### Launching a Browser Session ###

WebDriver's get() method is used to launch a new browser session and directs it to the URL that you specify as its parameter.

<br>

### Get the Actual Page Title ###

The WebDriver class has the getTitle() method that is always used to obtain the page title of the currently loaded page.

<br>

### Compare the Expected and Actual Values ###

This portion of the code simply uses a basic Java if-else structure to compare the actual title with the expected one.

<br>

### Terminating a Browser Session ###

The "close()" method is used to close the browser window.

<br>

### Terminating the Entire Program ###

If you use this command without closing all browser windows first, your whole Java program will end while leaving the browser window open.
<br>

## TestNG

**TestNG is a testing framework that is capable of making Selenium tests easier to understand and of generating reports that are easy to understand**

The main advantages of TestNG over JUnit are the following.

- Annotations are easier to use and understand.
- Test cases can be grouped more easily.
- TestNG allows us to create parallel tests.
- The Console window in Eclipse generates a text-based result while the TestNG window is more useful because it gives us a graphical output of the test result plus other meaningful details such as:
- Runtimes of each method.
- The chronological order by which methods were executed
- TestNG is capable of generating HTML-based reports.
- Annotations can use parameters just like the usual Java methods.
