package StepDefinitions;
import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;


    public class YatirimHesaplamaSteps {

        private double yatırımTutari;
        private double faizOrani;
        private double sure;
        private double sonuc;

        @Given("Kullanıcı yatırım tutarını {string} TL olarak girer")
        public void kullanici_yatirim_tutarini_girer(String tutar) {
            yatırımTutari = Double.parseDouble(tutar);
        }

        @Given("Faiz oranını {string} olarak girer")
        public void faiz_oranini_girer(String oran) {
            faizOrani = Double.parseDouble(oran.replace("%", "")) / 100;
        }

        @Given("Süreyi {string} yıl olarak girer")
        public void sureyi_yil_olarak_girer(String yil) {
            sure = Double.parseDouble(yil);
        }

        @When("Kullanıcı hesapla butonuna tıklar")
        public void kullanici_hesapla_butonuna_tiklar() {
            // Hesaplama
            sonuc = yatırımTutari * (1 + (faizOrani * sure));
        }

        @Then("Yatırımın 1 yıl sonraki değeri {string} TL olmalıdır")
        public void yatirimin_1_yil_sonraki_degeri_olmalidir(String beklenenSonuc) {
            assertEquals(Double.parseDouble(beklenenSonuc), sonuc, 0.01);
        }
    }


public class GunlukGiderTakibiSteps {

    private double yemekGideri;
    private double ulasimGideri;
    private double kahveGideri;
    private double toplamGider;

    @Given("Kullanıcı yemek giderini {string} TL olarak girer")
    public void kullanici_yemek_giderini_girer(String yemek) {
        yemekGideri = Double.parseDouble(yemek);
    }

    @Given("Ulaşım giderini {string} TL olarak girer")
    public void ulasim_giderini_girer(String ulasim) {
        ulasimGideri = Double.parseDouble(ulasim);
    }

    @Given("Kahve giderini {string} TL olarak girer")
    public void kahve_giderini_girer(String kahve) {
        kahveGideri = Double.parseDouble(kahve);
    }

    @When("Kullanıcı toplam gideri hesapla butonuna tıklar")
    public void kullanici_toplam_gideri_hesapla_butonuna_tiklar() {
        // Hesaplama
        toplamGider = yemekGideri + ulasimGideri + kahveGideri;
    }

    @Then("Toplam gider {string} TL olmalıdır")
    public void toplam_gider_olmalidir(String beklenenToplam) {
        assertEquals(Double.parseDouble(beklenenToplam), toplamGider, 0.01);
    }
}


public class YillikYatirimHesaplamaSteps {

    private double yatırımTutari;
    private double faizOrani;
    private double sure;
    private double sonuc;

    @Given("Kullanıcı yatırım tutarını {string} TL olarak girer")
    public void kullanici_yatirim_tutarini_girer(String tutar) {
        yatırımTutari = Double.parseDouble(tutar);
    }

    @Given("Faiz oranını {string} olarak girer")
    public void faiz_oranini_girer(String oran) {
        faizOrani = Double.parseDouble(oran.replace("%", "")) / 100;
    }

    @Given("Süreyi {string} yıl olarak girer")
    public void sureyi_yil_olarak_girer(String yil) {
        sure = Double.parseDouble(yil);
    }

    @When("Kullanıcı hesapla butonuna tıklar")
    public void kullanici_hesapla_butonuna_tiklar() {
        // Hesaplama
        sonuc = yatırımTutari * (1 + (faizOrani * sure));
    }

    @Then("Yatırımın 1 yıl sonraki değeri {string} TL olmalıdır")
    public void yatirimin_1_yil_sonraki_degeri_olmalidir(String beklenenSonuc) {
        assertEquals(Double.parseDouble(beklenenSonuc), sonuc, 0.01);
    }
}
