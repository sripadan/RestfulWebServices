package com.naren.client;

//import com.sun.jersey.api.client.Client;
//import com.sun.jersey.api.client.ClientResponse;
//import com.sun.jersey.api.client.WebResource;
 
public class JSONServiceGetAndPost {
 
  public static void main(String[] args) {
	try {
 
//		Client client = Client.create();
// 
//		WebResource webResource = client
//		   .resource("http://localhost:8080/RESTfulExample/rest/json/metallica/get");
// 
//		ClientResponse response = webResource.accept("application/json")
//                   .get(ClientResponse.class);
// 
//		if (response.getStatus() != 200) {
//		   throw new RuntimeException("Failed : HTTP error code : "
//			+ response.getStatus());
//		}
// 
//		String output = response.getEntity(String.class);
// 
//		System.out.println("Output from Server .... \n");
//		System.out.println(output);
 
	  } catch (Exception e) {
 
		e.printStackTrace();
 
	  }
 
	
  
  
  
  try {
	  
//		Client client = Client.create();
//
//		WebResource webResource = client
//		   .resource("http://localhost:8080/RESTfulExample/rest/json/metallica/post");
//
//		String input = "{\"singer\":\"Metallica\",\"title\":\"Fade To Black\"}";
//
//		ClientResponse response = webResource.type("application/json")
//		   .post(ClientResponse.class, input);
//
//		if (response.getStatus() != 201) {
//			throw new RuntimeException("Failed : HTTP error code : "
//			     + response.getStatus());
//		}
//
//		System.out.println("Output from Server .... \n");
//		String output = response.getEntity(String.class);
//		System.out.println(output);

	  } catch (Exception e) {

		e.printStackTrace();

	  }

	}
}