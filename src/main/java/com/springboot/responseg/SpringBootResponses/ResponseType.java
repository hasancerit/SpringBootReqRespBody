package com.springboot.responseg.SpringBootResponses;

import java.util.ArrayList;
import java.util.List;

public class ResponseType {
private List<Kullanici> list = new ArrayList<Kullanici>();
private String ek;
public List<Kullanici> getList() {
	return list;
}
public void setList(List<Kullanici> list) {
	this.list = list;
}
public String getEk() {
	return ek;
}
public void setEk(String ek) {
	this.ek = ek;
}
public ResponseType(List<Kullanici> list, String ek) {

	this.list = list;
	this.ek = ek;
}


}
