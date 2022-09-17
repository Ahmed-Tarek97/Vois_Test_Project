# Vois_Test_Project
this project is built based on Page Object Model(POM), using Intellij as IDE, chrome webdriver, Selenium and Maven.

There are 5 pages:

1- HomePage --> directory to home page(starting point) & initilization of other pages directory

2- CreateAccountPage --> Script to create a new account and fill all data required

3- LoginPage --> Script to login 

4- DressSelectionPage --> Script to select summer dress and proceed to checkout

5- OrderHistoryPage --> Script to go through the order history

And, there are 5 Tests:

1- BaseTests --> include Setup for the chromedriver and BeforeClass/AfterClass methods and actions to take

2- CreateAccountTests --> Extends BaseTests, Test to check that account is created succesfully 

2- LoginTests --> Extends BaseTests, Test to check that account is Logged-in succesfully 

2- DressSelectionTests --> Extends LoginTests, Test to check that dress is bought succesfully 

2- OrderHistoryTests --> Extends DressSelectionTests, Test to check that bought item is in the order history
