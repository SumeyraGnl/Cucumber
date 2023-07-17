Feature:US1015_Tripandway title testi

  Scenario: TC01 Kullanici tripendway sayfasinin title'nin dogru oldugunu kontrol eder

    Given Kullanici "trpwayUrl" anasayfaya gider
    Then Title'in "Tripandway"  icerdigini test eder
    Then Anasayfa da logini tiklayabilmeli
    Then Sayfayi kapatir
