package Date210902;

class Car {
	String carNum;
	int inTime;
	int outTime;

	public Car(String carNum, int inTime, int outTime) {
		this.carNum = carNum;
		this.inTime = inTime;
		this.outTime = outTime;

	}

	void prn() {
		int fee;
		fee = (outTime - inTime) * 2000;
		System.out.println("차량번호 : " + carNum);
		System.out.println("입고시간 : " + inTime + "시");
		System.out.println("출고시간 : " + outTime + "시");
		System.out.println("주차요금 : " + fee + "원");
		System.out.println();
	}
}

public class CarEx {

	public static void main(String[] args) {
		Car c1 = new Car("143저 7094", 3, 5);
		Car c2 = new Car("30마 3889", 1, 11);
		Car c3 = new Car("45육 2784", 2, 3);

		c1.prn();
		c2.prn();
		c3.prn();

	}

}
