# Amazon sayfasında sql,samsung ve nokia aratıp sayfa başlıklarını her arama için test ediniz
#Aranacak kelimeleri config.properties dosyasından alınız

Feature:Amazonda kelime arama
@gp3
  Scenario: T01 Amazonda sql samsung ve nokia aramasi
    Given "amazonUrl" sayfasina gidilir
    Then kullanici sql ve samsung aramasi yapar basliklari test eder
    And sayfa kapatilir

