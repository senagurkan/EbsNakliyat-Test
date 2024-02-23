@Test
  Feature: Ebs Mobil Test

    #Yapıldı
    Scenario: Yönetici tarafında sürücü eklerken telefon kısmına harf girilmeyecek.
      When Yönetici girişine tıkla
      When Surucu ekleye tıkla
      When Telefon Numarasina Harf Gir
      Then Rakam, Harf ve Boşluk Hatası Yakala

    #Yapıldı
    Scenario: Yönetici tarafında sürücü eklerken araç kapasitesine negatif değer girilmediği test edilecek.
      When Yönetici girişine tıkla
      When Surucu ekleye tıkla
      When Arac kapasitesine negatif deger gir
      Then Rakam, Harf ve Boşluk Hatası Yakala

   #Yapıldı ---yavaş
    Scenario: Ana ekranda yönetici butonuna basınca dört seçenek çıktığı test edilecek.
      When Yönetici girişine tıkla
      Then Surucu ekle buton kontrol
      Then İlanları gör buton kontrol
      Then Suruculer buton kontrol
      Then Giriş ekranına geri dön

    #Yapıldı
    Scenario: Yönetici tarafındaki sürücü ekleme ekranında sürücü adı kısmına rakam girilmeyecek.
      When Yönetici girişine tıkla
      When Surucu ekleye tıkla
      When Sürücü adına rakam ekle
      Then Rakam, Harf ve Boşluk Hatası Yakala

    #Yapıldı  -- yavaş
    Scenario: Ana ekranda kullanıcı butonuna basınca üç seçeneğin çıktığı test edilecek
      When Kullanıcı girişine tıkla
      Then Araç bul buton kontrol
      Then Siparişlerimi görüntüle buton kontrol
      Then Giriş ekranına geri dön

    #Yapıldı
    Scenario: Kullanıcı tarafında ihtiyaçlar tanımlanırken eşya sayısına negatif bir değer girilmeyecek
      When Kullanıcı girişine tıkla
      When Araç bula tıkla
      When Eşya sayısına negatif deger gir
      Then Boşluk Hatası Yakala

      #Yapıldı
    Scenario: Sürücü ekle butonuna tıklandığında sürücü ekleme ekranı gelecek
      When Yönetici girişine tıkla
      When Surucu ekleye tıkla
      Then Surucu ekleme sayfa kontrol

   #Yapıldı
    Scenario: Sürücü eklerken kriterler boş bırakıldığında hata verecek
      When Yönetici girişine tıkla
      When Surucu ekleye tıkla
      When Boş alan bırak
      Then Rakam, Harf ve Boşluk Hatası Yakala

    #Yapıldı
    Scenario: Araç bul sayfasında kriterler boş bırakıldığında hata verecek
      When Kullanıcı girişine tıkla
      When Araç bula tıkla
      When arac boş alan bırak
      Then Boşluk Hatası Yakala

        #Yapıldı
    Scenario: Kullanıcı tarafında Araç Bul butonuna basına Araç bulma ekranına gidecek.
      When Kullanıcı girişine tıkla
      When Araç bula tıkla
      Then Araç bul sayfa kontrol
      




