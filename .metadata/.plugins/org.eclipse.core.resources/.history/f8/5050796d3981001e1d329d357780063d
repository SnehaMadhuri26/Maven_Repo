import filesRequired.Payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonPath js=new JsonPath(Payload.CoursePrice());
		
		//1. Print No of courses returned by API
		int count=js.getInt("courses.size()");
		System.out.println(count);

        //2.Print Purchase Amount
		int PurchaseAmount=js.getInt("dashboard.purchaseAmount");
		System.out.println(PurchaseAmount);
		
        //3. Print Title of the first course
		String firstTitleName=js.getString("courses[0].title");//or we can use get  method
		System.out.println(firstTitleName);
		
		//4. Print All course titles and their respective Prices
		for(int i=0;i<count;i++) {
			String CourseTiiltes=js.get("courses["+i+"].title");
			System.out.println(CourseTiiltes);
			System.out.println(js.get("courses[+"+i+"].price").toString());
		}
		//5. Print no of copies sold by RPA Course
		System.out.println("no.of copies present for RPA Course");
		for(int i=0;i<count;i++) {
			String CourseTiiltes=js.get("courses["+i+"].title");
			if(CourseTiiltes.equalsIgnoreCase("RPA"))
			{
			
			System.out.println(js.get("courses[+"+i+"].copies").toString());
			break;
		}


	}System.out.println("*************************");
		//6. Verify if Sum of all Course prices matches with Purchase Amount
		int sum=0;
		for(int i=0;i<count;i++)
		{
			int Cprice=js.getInt("courses["+i+"].price");
			int Copies=js.getInt("courses["+i+"].copies");
			int Tprice=Cprice * Copies;
			//System.out.println(Tprice);
			sum=sum+Tprice;
		}
		System.out.println(sum);
		
		if(sum==PurchaseAmount) {
			System.out.println("Sum of all Course prices matches with Purchase Amount");
		}
		else {
			System.out.println("Sum of all Course prices not matching with Purchase Amount");
		}
		}

}
