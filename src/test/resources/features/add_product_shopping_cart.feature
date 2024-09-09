#Author: Carolina Munoz
# encoding: utf-8
  
Feature: add product shopping car
   as a user in the petStore app
   i want to add products to the cart
   to buy it

  Background:
    Given user is in the app petStore

  Scenario Outline: add product
    And search for <name> product
    When user add the shopping cart
    Then verify product is added to the cart <description>

    Examples:
      |name       |description       |
      |Bulldog    |Male Adult Bulldog|

  Scenario Outline: delete product in cart
    When search for <name> product in cart
    And add the shopping cart and delete
    Then verify message <description>

    Examples:
      |name       |description        |
      |Bulldog    |Your cart is empty.|

