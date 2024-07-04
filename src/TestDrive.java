import com.nrru.se65.jd65001.HumanBeing;

public class TestDrive {

	public static void main(String[] args) {
		HumanBeing hb = new HumanBeing();
		hb.setHeight(157);
		hb.setWeight(45);
		hb.calculateBMI();
		System.out.println(hb.analyzeBmi());
	}

}
