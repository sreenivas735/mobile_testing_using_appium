@mobile_test
Feature: verify the working of mobile application
  @signup_login
  Scenario: verify the login and logout functionality of mobile application
    When click login button user able to see the login page
    Then user click signup button and enter username "vasu735@gmail.com" and password "vasudev735" and confirm password "vasudev735"
    And click the signup button and take screenshot "signup" verify user successfully login "You successfully signed up!"
    When click the login button and enter username "vasu735@gmail.com" and password "vasudev735"
    Then click the login button and take screenshot "login" verify user successfully login "You are logged in!"
