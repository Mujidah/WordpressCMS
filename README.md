# wordpress-selenium-testsuite
Please View in raw/blame format

#### NOTE:
1.	Assignment was done using a Windows PC.
2.	File Directories/Path are written in Windows format.
3.	Browser Drivers are for Windows.
4.	If project is going to be run on a Mac PC, please download the MAC version of the browser drivers, and include them in the driver folder.

If project is going to be run on a Windows PC, please download the windows version of the browser drivers, and include them in the driver folder.

#### Pre-requisites:
• Java v8 JDK and/or higher versions. Verify if Java is installed on your machine by executing javac or java –version on your console. 
• Eclipse 
• Maven. Verify if maven is installed using your system by running mvn –v OR install Maven on your machine, if not installed. 
• Git

#### Creating a local copy of my project
1.	Navigate to this repository https://github.com/Mujidah/WordpressCMS/, click Clone or Download button to download the assignment as a project.
2.	Copy Github URL displayed.
3.	Launch command prompt on Windows PC.
4.	Navigate to the folder where project is to be saved locally by typing this command cd Desktop, for example.
5.	Create an actual local copy of the project by running “git clone Github URL ”, where URL is the link from Step 2 above.

#### Launching Project
1.	Launch Eclipse
2.	Click File on the menu
3.	Click Import >> Maven >> Existing Maven Projects
4.	Navigate to folder where project was cloned/downloaded (i.e. project directory)
5.	Select project folder
6.	Click Next and follow other instructions
7.	Once project has fully opened, open the pom.xml file, replace source and target versions in the properties tag with the exact Java version you have on your machine.
For example, if you have JDK v10, 
<maven.compiler.target>10</maven.compiler.target> 
<maven.compiler.source>10</maven.compiler.source>
8.	Ensure all dependencies are downloaded successfully by clicking Maven Tool Windows on the top right of the IntelliJ IDE, click Refresh icon. 
Note, If there is a pop-up to import dependencies, ensure to click `Enable auto-import` to automatically download all required dependencies for the project.

#### Running Tests
Using your console, navigate to the folder where project is saved locally by typing this command cd Desktop\WordpressCMS, run mvn test –P testng OR mvn test to execute all test suites. Note that, testng in mvn test –P testng refers to the exact name of the testng.xml file.

#### View Test Reports
After executing all tests, you can either view test result on the terminal where test was run OR using the Eclipse’s console located at the bottom part of the IDE 
OR
1.	Navigate to project folder, select `target` folder
2.	Select `surefire-reports`
3.	Open `index.html` or `emailable-report.html` to launch a web view of the test report.



#### ABOUT TEST
##### Test Approach
I created independent tests for each feature, as well as different test methods for each test cases.
 
##### Framework choice
I used Selenium Webdriver framework with Page Object Model design written in Java, with TestNG and Maven.

##### Tests covered

I created positive and few negative test cases due to limited time. 
Automated Test Results - 
Login suites: Passed, 
Register suites: Passed, 
Create Post suites: Passed


##### Decisions I made and why I choose this solution 
I chose the Page Object Model for easy maintenance so that for cases when some elements are changed, one can easily change only a class that has the specific element, rather than having to change them on every line of test code where they have been used. 

I also created every test method independently so that no method depends on any other to run. 

Also, I chose to have a configuration file called, data.properties which contain the browser type and base URL, so that one can easily change these parameters without having to manipulate the test codes. This way, the test scripts can be easily maintained.

TestNG was also chosen as the test framework for easy test management. TestNG provides an additional annotation support through the use of tags to control when tests can be run. It also provides a flexibility of deciding which test methods are to run, by including or excluding the test methods just before they are run. 
Lastly, TestNG provides better styling reporting option in HTML and XML formats. 

Maven was also used for collaboration and maintenance, so that this project can be easily built/started in different environments. Collaborators can easily work on the project without bothering about different versions of dependencies.

Logging test steps - I also printed out results of every tests to the console for easier troubleshooting.

I also chose to create a `Reusable method` package which contains reusable methods, for example, log in and log out methods that can be reused across all test suites.
