package core;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



import io.github.bonigarcia.wdm.WebDriverManager;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;



public class Base {



/*In base Class we basically do three things:
* we create an instance of webDriver
*/
public static WebDriver driver;


// Properties class belongs to java.utils package
// properties is a subclass of Hashtable (we can store data in key and value)
// properties class we can also use to store our test data
public static Properties properties;

// It is a reliable, fast and flexible logging framework (APIS)
// loggers: it is responsible for capturing logging info
// appenders: it is responsible for publishing logging info to different destination
// layouts: it is responsible for formating logging information

// Logger is a framework, it is used for different purposes
// In Testing we use it instead of System.out.println, it will print the result in the console.
// not only will it run our test, it will also store the tests.
// logger will be in our output folder
public static Logger logger;


// we will store the path to property.properties file
public static String propertyPath = ".\\src\\test\\resources\\input\\property.properties";

// we will store the path to log4j.properties file
public static String log4jPath = ".\\src\\test\\resources\\input\\log4j.properties";

public Base() {
try {
/*
* read the property.properties file so we wrote method to read the data from property.properties file
* and to make sure we handle both of the exceptions we surrounded our method with try/catch block
*/
BufferedReader reader = new BufferedReader(new FileReader(propertyPath));
properties = new Properties();
properties.load(reader);

} catch (FileNotFoundException e) {
e.printStackTrace();
} catch(IOException e) {
e.printStackTrace();
}

logger = Logger.getLogger("logger_File");
PropertyConfigurator.configure(log4jPath);
}

// we will write a method to get the url from property.properties file
public static String getUrl() {
String url = properties.getProperty("url");
return url;
}

// we will write a method to get our browser from property.properties file
public static String getBrowser() {
String browser = properties.getProperty("browser");
return browser;
}

// we will write a method to launch the browser:
public static void openBrowser() {
driver.get(getUrl());
}

//we will close one/all of the browsers opened by selenium
public static void tearDown() {
driver.close();
driver.quit();
}

public static void browser() {
String browserName = getBrowser();
switch(browserName) {

case "chrome" :
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
break;
case "firefox" :
WebDriverManager.firefoxdriver().setup();
driver = new FirefoxDriver();
break;
case "edge" :
WebDriverManager.edgedriver().setup();
driver = new EdgeDriver();
break;

default :
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
}

driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}



}