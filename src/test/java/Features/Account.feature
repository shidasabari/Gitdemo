Feature: Portal Application


Scenario: Home page default Login
Given User is on NetBanking Landing page
When User login into application with "Sidhu" and "Pass"
Then Home page is populated
And Cards displayed are "true"


Scenario: Home page default Login
Given User is on NetBanking Landing page
When User login into application with "Sabari" and "pass"
Then Home page is populated
And Cards displayed are "False"

Scenario: Home page default Login
Given User is on NetBanking Landing page
When User sign up with following details
|Mark|123|Mark@yopmail.com|987654321|
Then Home page is populated
And Cards displayed are "False"


Scenario Outline: Home page default Login
Given User is on NetBanking Landing page
When User login in to application with <Username> and <Password>
Then Home page is populated
And Cards displayed are "True"

Examples:
|Username|Password|
|User1   |Pass    |   
|User2   |Pass    |   
|User3   |Pass    |
