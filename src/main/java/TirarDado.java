import java.util.Random

@WebService(serviceName = "TirarDado")
public class TirarDado {
	@WebMethod(operationName = "roll")
	private int roll() {
		Random rd = new Random();
		int res = rd.nextInt(6) + 1;
		return res;
	}
	
	@WebMethod(operationName = "get")
	public int sacarRes() {
		return roll();
	}
}
