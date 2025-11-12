Feature: Contact Us functionality

  Scenario Outline: Communication message sending process
    Given Navigate to the Homepage
    Then Click on the Contact Us button
    Then Verify Contact text
    Then Enter name "<name>"
    Then Enter email "<email>"
    Then Enter subject "<subject>"
    Then Enter message "<message>"
    Then Click on the Send Message Button
    Then Click on the Alert Button

    Examples:
      | name  | email           | subject     | message                    |
      | ahmet | ahmet@gmail.com | kredi kartı | bilgilerimi kabul etmiyor. |