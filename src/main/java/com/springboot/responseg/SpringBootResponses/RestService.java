package com.springboot.responseg.SpringBootResponses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestService {

	@RequestMapping(value="/get1", produces=MediaType.APPLICATION_JSON_VALUE) //produces=MediaType.APPLICATION_XML_VALUE
	public List<Kullanici> get1(){
		List<Kullanici> list = new ArrayList<Kullanici>();
		list.add(new Kullanici("Hasan", "Cerit"));
		list.add(new Kullanici("Deniz", "İnan"));
		list.add(new Kullanici("Yeliz", "Cerit"));
		
		return list; //[{"ad":"Hasan","soyad":"Cerit"},{"ad":"Deniz","soyad":"İnan"},{"ad":"Yeliz","soyad":"Cerit"}]
					 //JSON list olarak döndürdü
	}
	
	@GetMapping(value ="/get2" ,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseType get2(){
		List<Kullanici> list = new ArrayList<Kullanici>();
		list.add(new Kullanici("Hasan", "Cerit"));
		list.add(new Kullanici("Deniz", "İnan"));
		list.add(new Kullanici("Yeliz", "Cerit"));
		
		ResponseType rt = new ResponseType(list, "Ek");
		
		return rt; //{"list":[{"ad":"Hasan","soyad":"Cerit"},{"ad":"Deniz","soyad":"İnan"},{"ad":"Yeliz","soyad":"Cerit"}],"ek":"Ek"}
	}			//SON nesnesi olarak döndürdü
	
	
	@GetMapping(value ="/get3" ,produces=MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> get3() {
	    HashMap<String, String> map = new HashMap<>();
	    map.put("key", "value");
	    map.put("foo", "bar");
	    map.put("aa", "bb");
	    return map; //{"aa":"bb","foo":"bar","key":"value"}
	    			//JSON Nesnesi
	}
	
	@GetMapping(value ="/get4" ,produces=MediaType.APPLICATION_JSON_VALUE)
	public Kullanici get4(){
		return new Kullanici("Hasan","Cerit");//{"ad":"Hasan","soyad":"Cerit"}
											  //JSON Nesnesi
	}
	
	@GetMapping(value ="/get5" ,produces=MediaType.APPLICATION_JSON_VALUE)
	public String get5(){
		return "Hasan"; //Hasan
						//String
	}	

}
