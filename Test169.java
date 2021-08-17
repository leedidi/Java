/*=======================================
  ■■■ 자바의 기본 입출력(I/O) ■■■
========================================*/

// OutputStream 실습

import java.io.OutputStream;
import java.io.IOException;

public class Test169
{
	public static void main(String[] args) throws IOException
	{	
		// System.in  : 자바의 표준 입력 스트림
		// System.out : 자바의 표준 출력 스트림

		OutputStream out = System.out;
		//@ 밖으로 내보내는 수도꼭지 틈


		byte[] ch = new byte[3];

		ch[0] = 65;		// A
		ch[1] = 97;		// a
		ch[2] = 122;	// z

		out.write(ch);	//-- 밖으로 내보낼 데이터(변수)를 스트림에 기록
						//@ 물줄기에 종이배 띄우는 것!

		out.flush();	//-- 기록된 스트림을 내보내는(밀어내는) 기능을 수행
						//   지금은 Buffer 를 활용하지 않고 있는 상황이기 때문에
						//   생략이 가능한 코드
						//   (Buffered 되어 있는 스트림(stream)일 경우 생략 불가)
						//@ like 주사기 쭉 밀어서 안의 약품 내보내는 것 처럼!
		out.close();	//-- 출력 스트림(물줄기)에 대한 리소스 반납
						//   (out 스트림을(수도꼭지를) 잠가버린 상황)
						//@ 수도꼭지 잠금

		System.out.println("절대적인 신뢰를 갖고 있는 구문...");
		//@ 출력 안됨! 왜냐면 수도꼭지를 잠궈서...!
		//-- 『out.close()』를 작성한 이후 출력되지 않는 구문
		//    출력되는 스트림(물줄기)을 닫았기 때문에...


	}
}