package TestFramework;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.response.Response;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Basic {

	@Test(priority=1)
	public void Test()
	{
		// TODO Auto-generated method stub
		//Base url or host
		
		System.out.println("API Called");
		RestAssured.baseURI="http://cms-services-qa.dev.cf.private.springer.com";
		
		given().
		param("secondary_id","WJUR-D-19-01191").log().all().
		
		when().
		get("/search").
		
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		body("_links[8].href",equalTo("http://cms-services-qa.dev.cf.private.springer.com/2fad4d16-8066-4974-83e9-406e8bab9211/enrich_article")).and().
		header("Content-Type","application/json;charset=UTF-8").log().body();
		
		
		
		System.out.println("API Call End");
	}

}
