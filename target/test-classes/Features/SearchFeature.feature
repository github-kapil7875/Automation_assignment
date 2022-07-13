Feature: Search Functionality of the Collection

  Scenario: Test Case 1- Click on Ontdek de collectie link
    Given User launch browser
    When User opens URL "https://www.vangoghmuseum.nl/nl"
    And User clicks on Ontdek de collectie link
    Then User should be on Collectie page 

  Scenario: Test Case 2- Search painting Het Gele Huis 
    Given User opens URL "https://www.vangoghmuseum.nl/nl/collectie"
    When User search the painting "Het Gele Huis"
    Then User should be on able to see more than "700" results

  Scenario Outline: Test Case 3- Detail verification of painting Het Gele Huis first element
    Given User opens URL "https://www.vangoghmuseum.nl/nl/collectie"
    When User search the painting "Het Gele Huis"
    And User click on first result
    Then User should be on able to verify "<F-nummer>","<JH-nummer>","<Inventarisnummer>"

    Examples: 
      | F-nummer | JH-nummer | Inventarisnummer |
      | F0464    | JH1589    | s0032V1962       |