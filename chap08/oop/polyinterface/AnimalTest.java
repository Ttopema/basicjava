package chap08.oop.polyinterface;

public class AnimalTest {
	public static void main(String[] args) {
		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3);

		Chicken cheatableChicken = new Chicken(5);
		// 위에서 생성한 Chicken Object 가 Cheatable 하다면 fly 함수를 호출합니다.
		if (cheatableChicken instanceof Cheatable) {
			cheatableChicken.fly();
		}
		for (int i = 1; i <= 3; i++) {
			System.out.println(i + "시간 후");
//			dog.run(i);
			dog.run(1);
//			chicken.run(i);
			chicken.run(1);
//			cheatableChicken.run(i);
			cheatableChicken.run(1);
		
			System.out.println("개의 이동거리 = " + dog.distance);
			System.out.println("닭의 이동거리 = " + chicken.distance);
			System.out.println("날으는 닭의 이동거리 = " + cheatableChicken.distance);

		}
	}
}
