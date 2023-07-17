@trp
Feature: US1017_Services icerik testi




  Scenario: TC03 International Tour ogesinin aktif oldugunu test edebilmeli

    Given Kullanici "trpwayUrl" anasayfaya gider
    When Services sekmesine tiklar
    When Kullanici "International Tour" sekmesine tiklar
    When Kullanici "International Tour" sekmesinin aktif oldugunu test eder
    And  Sayfayi kapatir

    Scenario: TC04 Adventure Tour ogesinin aktif oldugunu test edebilmeli

      Given Kullanici "trpwayUrl" anasayfaya gider
      When Services sekmesine tiklar
      When Kullanici "Adventure Tour" sekmesine tiklar
      When Kullanici "Adventure Tour" sekmesinin aktif oldugunu test eder
      And  Sayfayi kapatir

  Scenario: TC05 Culture Tour ogesinin aktif oldugunu test edebilmeli

    Given Kullanici "trpwayUrl" anasayfaya gider
    When Services sekmesine tiklar
    When Kullanici "Culture Tour" sekmesine tiklar
    When Kullanici "Culture Tour" sekmesinin aktif oldugunu test eder
    And  Sayfayi kapatir

  Scenario: TC06 Bussiness Tour ogesinin aktif oldugunu test edebilmeli

    Given Kullanici "trpwayUrl" anasayfaya gider
    When Services sekmesine tiklar
    When Kullanici "Bussiness Tour" sekmesine tiklar
    When Kullanici "Bussiness Tour" sekmesinin aktif oldugunu test eder
    And  Sayfayi kapatir

  Scenario: TC07 Health Tour ogesinin aktif oldugunu test edebilmeli

    Given Kullanici "trpwayUrl" anasayfaya gider
    When Services sekmesine tiklar
    When Kullanici "Health Tour" sekmesine tiklar
    When Kullanici "Health Tour" sekmesinin aktif oldugunu test eder
    And  Sayfayi kapatir

  Scenario: TC08 Religious Tour ogesinin aktif oldugunu test edebilmeli

    Given Kullanici "trpwayUrl" anasayfaya gider
    When Services sekmesine tiklar
    When Kullanici "Religious Tour" sekmesine tiklar
    When Kullanici "Religious Tour" sekmesinin aktif oldugunu test eder
    And  Sayfayi kapatir





