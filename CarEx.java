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
		System.out.println("������ȣ : " + carNum);
		System.out.println("�԰�ð� : " + inTime + "��");
		System.out.println("���ð� : " + outTime + "��");
		System.out.println("������� : " + fee + "��");
		System.out.println();
	}
}

public class CarEx {

	public static void main(String[] args) {
		Car c1 = new Car("143�� 7094", 3, 5);
		Car c2 = new Car("30�� 3889", 1, 11);
		Car c3 = new Car("45�� 2784", 2, 3);

		c1.prn();
		c2.prn();
		c3.prn();

	}

}
