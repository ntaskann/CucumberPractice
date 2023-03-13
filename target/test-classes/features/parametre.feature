@Parametre
Feature: Parametre Amazon Search

  Background: Ortak adimlar
    Given "amazonUrl" sayfasina gidilir

    @Omer
  Scenario: TC01_amazon_iphone_arama
    When amazon sayfasinda "iphone" aratilir
    Then sayfa basliginin "iphone" icerdigini test eder
    And sayfa kapatilir

  Scenario: TC02_amazon_selenium_arama
    When amazon sayfasinda "selenium" aratilir
    Then sayfa basliginin "selenium" icerdigini test eder
    And sayfa kapatilir

  Scenario: TC03_amazon_java_arama
    When amazon sayfasinda "java" aratilir
    Then sayfa basliginin "java" icerdigini test eder
    And sayfa kapatilir