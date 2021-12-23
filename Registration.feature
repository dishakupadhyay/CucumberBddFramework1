Feature: Nopcommerce Registration
  Background:
    Given User open browser And Enter Url

    # Simple Data driven without Example Keyword

  Scenario: Nopcommerce Registration Test
    Then User click on Register button(link)
    And User is on registration page and Verify the Register page Title
    Then User select Male/Female accordingly for gender
    Then User Enter "Disha" and "Upadhyay" as FirstName and Last Name accordingly
    Then User Enter "14" for Day
    And User Enter "October" for Month
    And User Enter "1989" for Year
    And User Enter "dishatrivedi14@gmail.com" as Email
    Then User Enter "Unify Testing" for Company Name
    And User Enter "Unify123" for Password
    When User Enter "Unify123" for confirm password field And Click on Register
    Then User should receive "Your registration completed" message