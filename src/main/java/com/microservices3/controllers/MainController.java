package com.microservices3.controllers;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/hello")
	public Object hello() throws IOException, JSONException {
		String endpoint1 = "http://localhost:8080/greeting";
		URL url1 = new URL(endpoint1);
		String endpoint2 = "http://localhost:8090/time";
		URL url2 = new URL(endpoint2);
		
		
		Scanner scan = new Scanner(url1.openStream());
	    String str = new String();
	    while (scan.hasNext())
	        str += scan.nextLine();
	    scan.close();
	    
	    Scanner scan2 = new Scanner(url2.openStream());
	    String str2 = new String();
	    while (scan2.hasNext())
	        str2 += scan2.nextLine();
	    scan2.close();
	 
	    // build a JSON object
	    JSONObject obj = new JSONObject(str);
	    JSONObject obj2 = new JSONObject(str2);
	    System.out.println(obj.toString());
	    System.out.println(obj2.toString());
		
		return url1; 
	}
}
