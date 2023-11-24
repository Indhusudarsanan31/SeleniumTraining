@Feature1
Feature: To validate the login functionality of facebook application 

Scenario: To validate login with validate username and invalid password
Given To launch the chrome browser and maximize window
When To launch the url of the facebook application
And To pass valid user name in email field
And To click the login button
And To check weather navigate to the home page or not
Then To close the browser

Scenario Outline: To validate the positive and negative combination of login functionality
Given User has to launch the browser and maximize the window
And User has to hit the facebook url
And User has to pass the data "<emaildatas>"in email field
And User has to pass the data "<passworddatas>"in password field
And User has to click the login button
Then user has to close the browser

Examples:
|emaildatas  |passworddatas|
|indhu       |31012000     |
|sindhu      |15012002     |
|ammu        |10101996     |
|sudarsanan  |30051996     |
|shankar     |13122000     |
|indhuja     |12345678     |
|indhushankar|98765432     |

