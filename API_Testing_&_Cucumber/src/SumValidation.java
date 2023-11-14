import org.junit.Assert;
import org.junit.Test;

import io.restassured.path.json.JsonPath;
import restAssured_Class.Payload;

public class SumValidation {

	
	public static void main(String[] args)
	{
		int sum = 0;
		JsonPath js=new JsonPath(Payload.CoursePrice());
		int count=	js.getInt("courses.size()");
		for(int i=0;i<count;i++)
		{
			int price=js.getInt("courses["+i+"].price");
			int copies=js.getInt("courses["+i+"].copies");
			int amount = price * copies;
			System.out.println(amount);
			sum = sum + amount;
			
		}
		System.out.println(sum);
		int purchaseAmount =js.getInt("dashboard.purchaseAmount");
		Assert.assertEquals(sum, purchaseAmount);
		
	}
}
