#Author: Carolina Munoz
# encoding: utf-8
Feature: add product shopping car
   as a user in the petStore app
   i want to add products to the cart
   to buy it

  Scenario Outline: add product
    Given user is in the app petStore
    And search for <name> product
    When user add the shopping cart
    Then verify product is added to the cart <description>

    Examples:
      |name       |description       |
      |Bulldog    |Male Adult Bulldog|