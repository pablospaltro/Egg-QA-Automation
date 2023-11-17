Feature: look for one character
  get the name of the character and search for it on wikipedia web page.

  Scenario Outline: Check wikipedia article displayed for Star Wars Characters
    Given I am an user at the Wikipedia WebPage requesting SW character
    When I search the requested character <name> on Wikipedia search page
    Then I should be able to see the article page correctly displayed for the requested <name> character

    Examples:
      | name|
      | 1   |
      | 2   |
      | 3   |
      | 4   |
      | 5   |
