Feature: US1016_Tripandway coklu kullanım


  Scenario Outline: TC02 Tripandway coklu header test

    Given Kullanici "trpwayUrl" anasayfaya gider
    Then Kullanici "<aranacakUrun>" headeri tiklar

    And Sayfayi kapatir

    Examples:
      | aranacakUrun |
      | sevices      |
      | destinations |


