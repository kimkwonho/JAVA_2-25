package sec01.exam04;

public class Outter {
	//자바 버전 7 이전
	public void method1(final int arg)
	{
		final int localVariable = 1;
		//arg = 100;
		//localVariable = 100; //final 필드 값 변경 불가.
		
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	//자바 버전 8 이후
	public void method2(int arg)
	{
		int localVariable = 1;
		//arg = 100;
		//localVariable = 100; //final "특성"을 가졌기에 값 변경 불가.
		
		class Inner {
			public void method() {
			int result = arg + localVariable;
			}
		}
	}

}
