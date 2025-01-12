Feature: Yatırım hesaplaması

  Scenario: Kullanıcı, %5 faiz oranı ile 100 TL'lik bir yatırım yaparak yatırımının 1 yıl sonraki değerini hesaplamak istiyor.
    Given Kullanıcı yatırım tutarını "100" TL olarak girer
    And Faiz oranını "%5" olarak girer
    And Süreyi "1" yıl olarak girer
    When Kullanıcı hesapla butonuna tıklar
    Then Yatırımın 1 yıl sonraki değeri "105" TL olmalıdır
Feature: Günlük Gider Takibi

  Scenario: Kullanıcı, yemek, ulaşım ve kahve giderlerini girer ve toplam gideri hesaplamak ister.
    Given Kullanıcı yemek giderini "20" TL olarak girer
    And Ulaşım giderini "10" TL olarak girer
    And Kahve giderini "5" TL olarak girer
    When Kullanıcı toplam gideri hesapla butonuna tıklar
    Then Toplam gider "35" TL olmalıdır
Feature: Yıllık Yatırım Hesaplaması

  Scenario: Kullanıcı, %4 faiz oranı ile 200 TL'lik bir yatırım yaparak yatırımının 1 yıl sonraki değerini hesaplamak istiyor.
    Given Kullanıcı yatırım tutarını "200" TL olarak girer
    And Faiz oranını "%4" olarak girer
    And Süreyi "1" yıl olarak girer
    When Kullanıcı hesapla butonuna tıklar
    Then Yatırımın 1 yıl sonraki değeri "208" TL olmalıdır
