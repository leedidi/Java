/*=========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - 문자열 관련 클래스
  - 캐릭터 셋(CharacterSet)
===========================================*/

/*
■ 캐릭터 셋(Character Set)

   ○ 유니코드(unicode)
      국제 표준으로 제정된 2바이트계의 만국 공통의 국제 문자부호체계
	  (UCS : Universal Code System)를 말한다.
	  애플컴퓨터, IBM, 마이크로소프트 등이 컨소시엄으로 설립한
	  유니코드(Unicode)가 1990년에 첫 버전을 발표하였고,
	  ISO/IEC JTC1 에서 1995년 국제 표준으로 제정하였다.
	  공식 명칭은 ISO/IEC 10646-1(Universal Multiple_Octet Coded Character Set)이다.

	  데이터의 교환을 원활헤가 하기 위하여 문자 1개에 부여되는 값을
	  16비트로 통일하였다.
	  코드의 1문자 다 영어는 7비트, 비영어는 8비트,
	  한글이나 일본어는 16비트의 값을 가지게 되는데
	  이들을 모두 16비트로 통일한 것이다.


   ○ UTF-8 과 UTF-16
      
	  UTF-8 과 UTF-16 의 차이를 한 마디로 표현하자면
	  문자를 표현할 때의 단위가 다르다는 것이다.
	  UTF-8은 8비트의 가변장 멀티바이트에서 문자를 표현하고
	  UTF-16은 16비트의 가변장 멀티바이트에서 문자를 표현한다.

	  - UTF-8(8bit UCS Transformation Format) //@ ★1 기억하기
	    웹에서 기본적으로 사용하는 코드.
		UCS-2로 정의되는 문자 집합을 이용하여
		기술된 문자열을 바이트열로 변환하는 방식의 1개 1문자를
		1~6바이트 가변장 멀티바이트로 변환한다.

	  - UTF-16(16bit UCS Transformation Format) //@ ★2 기억하기
	    자바의 기본 코드.
		자바에서는 문자 하나를 저장하면 바이트 수는 영문자이든, 한글문자이든 2바이트를 차지하게 된다.
		UCS-2로 정의되는 문자 집합을 이용하여
		기술된 문자열에 UCS-4의 일부의 문자를 채워넣기 위한 인코딩 방식.
		UTF-8과 병용할 수 있다.
		UCS-2로 이용할 수 있는 문자수를 대폭 늘릴 수 있다.


	※ 자바단에서는 UTF-16을 사용하고 웹에서는 UTF-8을 사용하기 때문에
	   경우에 따라 변환해야 하는 상황이 발생할 수 있다.



■ 문자 코드의 종류

	○ KSC5601
	   한글 완성형 표준(한글 2,350자 표현).
	   한국공업표준 정보처리분야(C)의 5601번 표준안.

	○ KSC5636
	   영문자에 대한 표준.
	   한국공업표준 정보처리분야(C)의 5636번 표준안.
	   기존 ASCII Code 에서 역슬래스(\)를 원(￦) 표시로 대체.

	○ EUC-KR(MS949)  //@ ★3 기억하기 ms : microsoft!
	   Bell-Laboratories 에서 유닉스 상에서 영문자 이외의 문자를
	   지원하기 위해 제안한 확장 유니코드(Extend UNIX Code) 중
	   한글 인코딩 방식.
	   영문은 KSC5636으로 처리하고, 한글은 KSC5601로 처리.
	   즉, EUC-KR(MS949) = KSC5636 + KSC5601.

	○ UTF-8
	   영문과 숫자는 1바이트, 한글은 3바이트로 표현.
	   (웹에서 많이 사용. UTF-8 형식으로 JSP 를 작성할 때에는
	    파일도 UTF-8 형식으로 저장해야 한다.)

	○ UTF-16
	   자바 기본 문자 코드.
	   영문과 숫자는 1바이트, 한글은 2바이트로 표현.

	○ ISO-8859-1
	   서유럽 언어 표기에 필요한 US-ASCII 에 없는
	   94개의 글자의 순차적 나열.


*/

import java.io.UnsupportedEncodingException;

public class Test137
{
	public static void main(String[] args) //throws UnsupportedEncodingException //@ 바깥으로 냅다 던짐
	{
		byte[] buf;
		String name = new String("송해덕");

		System.out.println("디폴트 캐릭터셋 : " + System.getProperty("file.encoding")); 
		//@ System.getProperty : 시스템으로부터 특정속성값을 얻어와 확인하는 메소드, ("file.encoding"): 파일의 인코딩 방식
		//--==>> 디폴트 캐릭터셋 : MS949

		// 『String.getBytes()』
		//  : 디폴트 캐릭터셋으로 바이트 배열을 반환하는 메소드
		
		buf = name.getBytes(); // 운영체제의 기본 인코딩 방식에 따라 ... (@데이터를 쪼갬)

		System.out.println("Length : " + buf.length);
		//--==>> Length : 6
		//@ "송해덕"은 byte, ms949 방식으로 자르면 6바이트!
		
		for (byte b : buf)
		{
			System.out.print("[" + b + "] ");
		}
		System.out.println();
		//--==>> [-68] [-37] [-57] [-40] [-76] [-10]
		//       ----------- ----------- ------------
		//           송           해          덕

		try
		{
			// 『UTF-8』으로 바이트 배열을 반환하는 메소드
			buf = name.getBytes("utf-8");	// 넘겨진 매개변수 인코딩 방식에 따라 ...
		
			//System.out.println("Length : " + buf.length());
			System.out.println("Length : " + buf.length);
			for (byte b : buf)
			{
				System.out.print("[" + b + "] ");
			}
			System.out.println();
			//--==>> [-20] [-122] [-95] [-19] [-107] [-76] [-21] [-115] [-107]
			///       ----------------- ------------------ -------------------
			
			// new String("이지영");
			// new String(바이트배열, 인코딩방식);
			// new String(buf, "utf-8");
			
			// utf-8 형태로 저장된 바이트 배열을
			// String 객체로 파라미터 값 utf-8을 부여하여 생성
			// → utf-8 기반으로 buf 바이트 배열을 합쳐
			//    문자열 객체 생성한 후 이름 출력
			System.out.println("Value 1 : " + new String(buf, "utf-8"));
			//--==>> Value 1 : 송해덕

			System.out.println();	// 개행

			// utf-8 형태로 저장된 바이트 배열을
			// String 객체로 파라미터 값 없이 생성
			// → 디폴트 캐릭터셋을(ms949) 기반으로 buf 바이트 배열을 합쳐
			//    문자열 객체 생성한 후 이름 출력		
			System.out.println("Value 2 : " + new String(buf));
			//@ 시스템 기본방식으로!
			//--==>> Value 2 : ?넚?빐?뜒

			System.out.println();	// 개행
			
			// <절대 하면 안되는 코드>
			//@@@@ 이렇게하면 안됨! 말도 안되는 코딩임! 변환이 아니라 생성 자체를 꼬아버리는 코딩
			//@@@@ (영어를 중국어로 번역하는게 아니라, 
			///     Like 영어를 읽어들이는 방법을 쓰고, 중국어로 글자를 쓴 것. 아예 잘못된 글자로 만들어짐)
			//@@@@ 부품별로 나눠서 구성된게 아니라, 박살이 나서 구성되어버림!
			//@@@@ 읽어들일때는 euc-kr 방식으로 읽고, 객체화시킬때는 utf-8로 읽는다는 의미.. 인코딩 방식 변화가 X
			String convert = new String(name.getBytes("euc-kr"), "utf-8");

			System.out.println("value 3 : " + convert);
			//--==>> value 3 : ?????
			//@ 한글 깨져버림

			buf = convert.getBytes();
			System.out.println("Length : " + buf.length);
			//--==>> Length : 5
			//@ 이미 복구불가능...엉망됨

			buf = convert.getBytes("utf-8");
			System.out.println("Length : " + buf.length);
			//--==>> Length : 14
			//@ 이미 복구불가능...엉망됨

		/*
		※ check~!!!

			euc-kr 을 utf-8로 변환하겠다는 의도로
			위와 같이 코딩을 해버리면
			이러한 변환으로 인해 바이트 배열이 깨져서
			euc-kr 이든... utf-8 이든...
			어떠한 바이트 배열로 읽어오든
			깨져있는 것을 확인할 수 있다.

			이미 깨져서 생성된 String 객체의 바이트 배열은
			어떤 방식으로든 복구가 불가능하다.

		*/
			
		}
		catch (UnsupportedEncodingException e)
		{
			System.out.println(e.toString()); //@ 폭발물 살펴보고 검토(해체,분석)할 필요 있을 때 사용!
		}



		// 『UTF-8』으로 바이트 배열을 반환하는 메소드
		//buf = name.getBytes("utf-8");	// 넘겨진 매개변수 인코딩 방식에 따라 ... (@데이터를 이방식대로 잘라라)
		//@UnsupportedEncodingException.. 지원하지 않는 인코딩때문에 컴파일에러 
		//  -> 1. throws unsupported 어쩌구 상단에 기재 (발견된 폭발물을 집밖으로 냅다 집어던짐. 지금 있는 집에 문제생기지 않도록)
		//	   2. try~catch() (구문 시도하는데, 만약 문제가 발견되게 되면 폭발물처리반 잡아서 오류잡아냄
		//                       -폭발물이 러시아산인지, 중국산인지, 폭발 기한은 언제인지... 파악해서 처리법대로 처리 가능)

	}
}
