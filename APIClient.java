package week4.day1;

public class APIClient {


	public void SendRequest(String endPoint) {


		System.out.println(endPoint);
		// TODO Auto-generated method stub

	}

	public void SendRequest(String enddPoint,String requestBody, boolean requestStatus ) {
		// TODO Auto-generated method stub
		System.out.println(enddPoint);
		System.out.println(requestBody);
		System.out.println("Request status - " + requestStatus);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		APIClient overLoad = new APIClient();

		overLoad.SendRequest("Print the end point");
		overLoad.SendRequest("Print the end points", "Print the request body", true);

	}

}
 	