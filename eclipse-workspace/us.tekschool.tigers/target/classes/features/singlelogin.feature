Feature: login to Tekschool Website

@singlelogin
Scenario: Login to Tekschool retail page with one user
Given I am on Tekschool retail page
When I click on my account link
And I click on login link
Then I enter my correct username and password
Then I click on login button
Then I logged into the Tekschool retail page