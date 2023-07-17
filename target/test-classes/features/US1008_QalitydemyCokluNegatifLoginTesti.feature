
  Feature: US1008 Toplu kullanici listesi ile negatif login testi

    @qd
    Scenario Outline: TC14 Kullanici listedeki kullanici bilgileri ile giris yapilamadigini test eder

      Given Kullanici "qdUrl" anasayfaya gider
      Then  ilk login linkine click yapar
      And user email olarak "<email>" girer
      And password olarak "<password>" girer
      When login butonuna basar
      Then giris yapilamadigini test eder

      Examples:
        | email | password|
        |abc@gmail.com|12345|
        |def@gmail.com|23157|
        |ghk@gmail.com|98310|




