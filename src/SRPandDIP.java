
/**
 * @author 전상훈
 * 
 * SRP(Single Responsibility Principle) 단일책임원칙 : 클래스는 단 하나의 책임만을 가져야 한다.
 * 
 * DIP(Dependency Inversion Principle) 의존성역전원칙 : 추상화에 의존해야 한다. (구체적인 것에 의존하면 수정이 복잡해지기 때문에)
 *
 */

abstract class 홀직원 {
	abstract void 청소(); //홀직원만 청소함
}
abstract class 종업원 extends 홀직원 {
	void 서빙() {
		System.out.println("서빙하기");
	}
	void 주문() {
		System.out.println("주문받기");
	}
}
abstract class 캐셔 extends 홀직원 {
	void 정산() {
		System.out.println("정산하기");
	}
	void 계산() {
		System.out.println("계산받기");
	}	
}
abstract class 요리사 {
	abstract void 요리(); //요리사가 무슨 요리를 할 지 모르니까 자식클래스가 구현
}
class 전상훈 extends 종업원{
	
	요리사 cook; //DIP(의존성 역전 원칙) : 특정요리사에 의존한다면 나중에 바뀔때 문제가 되지만, 추상화에 의존하여 그 위험성을 줄인다.

	@Override
	void 청소() {
		System.out.println("홀청소");
	}
	
}
class 황성호 extends 캐셔{

	@Override
	void 청소() {
		System.out.println("화장실청소");
	}
	
}
class 황의상 extends 요리사{

	@Override
	void 요리() {
		System.out.println("한식");
	}
	
}
class 이건창 extends 요리사{

	@Override
	void 요리() {
		System.out.println("양식");
	}
	
}
public class SRPandDIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
