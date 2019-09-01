package com.springboot.responseg.SpringBootResponses;

public class Kullanici {
private String ad;
private String soyad;
public String getAd() {
	return ad;
}
public void setAd(String ad) {
	this.ad = ad;
}
public String getSoyad() {
	return soyad;
}
public void setSoyad(String soyad) {
	this.soyad = soyad;
}
public Kullanici(String ad, String soyad) {
	this.ad = ad;
	this.soyad = soyad;
}


}
