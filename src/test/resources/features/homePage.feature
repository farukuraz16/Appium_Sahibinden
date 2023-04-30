@HomePage
Feature: Sahibinden

  @checkResult
  Scenario: Check Search Result
    Given user should see the Home Page
    When taps "Emlak" at Home Page
    When taps "Güvenlik Sistemleri" at Categories Page
    When taps "Takı, Mücevher & Altın" at Categories Page
    When taps "Kol Düğmesi" at Categories Page
    Then should see results on Result Page

  @CheckFilters
  Scenario: Check Filters
    Given user should see the Home Page
    When taps "Vasıta" at Home Page
    When cancel the search with photo
    When taps "Otomobil" at Categories Page
    When taps "Mazda" at Categories Page
    When taps "Lantis" at Categories Page
    When taps "1.8" at Categories Page
    When taps "Filtrele" at Result Page
    When taps "Fiyat" at Filter Page
    When send keys Max Price "200000" at Filter Page
    When taps "SONUÇLARI GÖSTER" button at Filter Page
    When taps "Sırala" button at Order Page
    When selects "Fiyata göre (Önce en yüksek)" button at Order Page
    Then should see the first car price is lower than or equals with "200,000 TL" at Result Page