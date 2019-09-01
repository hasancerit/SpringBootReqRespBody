package com.springboot.responseg.SpringBootResponses;

import java.util.HashMap;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
@org.springframework.stereotype.Controller
public class Controller {
	
	@PostMapping(value = "/senduser1")
	public String kullaniciAl1(@RequestBody Kullanici kullanici){ //Gelen Post Request'in Body'sinde bulunan JSON verisi ile kullaniciyi cektik
		System.out.println("Kullanici İsim:" + kullanici.getAd());
		System.out.println("Kullanici Soyisim:" + kullanici.getSoyad());
		
		return "bos.html";
	}
	
	
	/*Response Entity RestController Sinifinda Olmasa da olur*/ 
	@GetMapping(value ="/get6" ,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> get6(){
	    HashMap<String, String> map = new HashMap<>();
	    map.put("key", "value");
	    map.put("foo", "bar");
	    map.put("aa", "bb");
	    
	    HttpHeaders headers = new HttpHeaders();
	    headers.add("Custom-Header", "foo");
	    
		return new ResponseEntity<>(map,headers,HttpStatus.ACCEPTED);
	}
}
