Web Uygulaması Test Otomasyonu (Selenium ile)

Bu proje, Selenium WebDriver kullanarak bir web uygulamasının fonksiyonel testlerini otomatikleştirmeyi amaçlamaktadır. Testler, çeşitli kullanıcı etkileşimlerini (Kredi hesabı,döviz dönüşümü) test eder ve web uygulamasının beklenen şekilde çalışıp çalışmadığını doğrular.

Başlarken
Bu bölüm, projeyi yerel bilgisayarınızda nasıl çalıştıracağınıza dair adım adım talimatları içermektedir.

Gereksinimler
Java 8 veya daha yeni sürümü
Maven (Bağımlılık yönetimi için)
Selenium WebDriver (Web tarayıcı otomasyonu için)
IDE (Eclipse, IntelliJ IDEA vb.)
WebDriver (Test etmek için Chrome, Firefox, Safari gibi tarayıcıların WebDriver'ları)
JDK (Java Development Kit)
Kurulum
Java ve Maven'ı Yükleyin:

Java 8 veya daha yeni sürümünü yükleyin.
Maven'ı yükleyin ve kurulumun doğru olduğundan emin olun.
Projenin İndirilmesi:
Git kullanarak projeyi bilgisayarınıza klonlayın:
git clone https://github.com/tugcecaglar07/calculator.git
Proje Bağımlılıklarını Yükleyin:

Maven kullanarak bağımlılıkları yükleyin:
mvn clean install
Tarayıcı WebDriver'larını İndirin:

İlgili tarayıcılar için ChromeDriver, GeckoDriver (Firefox için) veya SafariDriver'ı indirmeniz gerekir.
WebDriver’ları tarayıcınızla uyumlu olacak şekilde indirip, işletim sisteminizin PATH değişkenine ekleyin.

Testleri Çalıştırma
Testleri Çalıştırın:

Testleri çalıştırmak için aşağıdaki Maven komutunu kullanabilirsiniz:

mvn test

Test Sonuçlarını Kontrol Edin:

Testlerin başarıyla çalıştığını görmek için test sonuçlarını terminal veya IDE'nizde görüntüleyebilirsiniz.

Test Senaryoları
Projede yer alan test senaryoları şunlardır:

Yatırım hesaplaması Testi:

Kullanıcı, %5 faiz oranı ile 100 TL'lik bir yatırım yaparak yatırımının 1 yıl sonraki değerini hesaplamak.

Günlük Gider Takibi Testi:

Kullanıcı, yemek, ulaşım ve kahve giderlerini girer ve toplam gideri hesaplamak ister.

Yıllık Yatırım Hesaplaması Testi:

Kullanıcı, %4 faiz oranı ile 200 TL'lik bir yatırım yaparak yatırımının 1 yıl sonraki değerini hesaplamak istiyor.

Proje Yazarları
Tuğçe Çağlar



