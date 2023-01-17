@tag
Feature: Open Cart application End to End flow

  @tc01
  Scenario: Adding product to the cart
    Given I am a customer landing on Opencart page
    And I click on the currency <currency1>
    And I click on components dropdown
    And I click on the component <components>
    And I click on the filter <filter>
    And I click on the products <products>
    And I click on the CTA Add to Cart

    Examples: 
      | currency1  | components 					| filter  		 | products										|
      | EUR 			 | Show all components  | Monitors (2) |	Samsung SyncMaster 941BW	|
     
  @tc02
  Scenario: Browse back to previous page
    Given I am a customer landing on Opencart page
    And I click on cameras dropdown
    And I click on the product <camera>
    And I click on the Home button

    Examples: 
      | camera  		|
      |canon EOS 5D |
      