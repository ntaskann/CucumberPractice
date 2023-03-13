@gp1
Feature: Amazon Search

  Scenario: TC01_amazon_iphone_arama
    Given amazon sayfasina gidilir
    When amazon sayfasinda iphone aratilir
    Then sayfa basliginin iphone icerdigini test eder
    And sayfa kapatilir

  Scenario: TC02_amazon_selenium_arama
    Given amazon sayfasina gidilir
    When amazon sayfasinda selenium aratilir
    Then sayfa basliginin selenium icerdigini test eder
    And sayfa kapatilir

  Scenario: TC03_amazon_java_arama
    Given amazon sayfasina gidilir
    When amazon sayfasinda java aratilir
    Then sayfa basliginin java icerdigini test eder
    And sayfa kapatilir

