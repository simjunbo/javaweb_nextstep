### https://github.com/simjunbo/web-application-server (3장 ~ 6장)
### https://github.com/simjunbo/jwp-basic (6장 ~ 12장)
### https://github.com/ronmamo/reflections (리플렉션)


# 용어정리
* 서블릿 : Controller, HttpRequest, HttpResponse를 추상화해 인터페이스로 정의해 놓은 표준.
* 서블릿 컨테이너 : 서블릿 컨테이너는 이 서블릿 표준에 대한 구협을 담당. (웹 서버)
* Embedded 톰캣 : jar 파일을 이용해서 톰캣서버를 실행할 수 있다.
* 서블릿의 한계를 (동적 html)를 극복하기 위해 등장한 것이 jsp
* JSP의 복잡도가 증가하면서 한계를 극복하기 위해 등장한 기술이 JSTL(JavaServer Pages Standard Tag Library)와 EL(Expression Language)
* 프론터 컨트롤러 패턴 : DispatcherServlet 처럼 각 컨트롤러의 앞에 모든 요청을 받아 작업을 위하는 방식
* 포워딩과 리다이렉트 : https://sdevstudy.tistory.com/26
* DAO(Data Access Object) : 데이터베이스에 대한 접근 로직 처리를 담당하는 객체
* if/else가 아닌 인터페이스를 통해 문제를 해결하는 것이 확장가능하고 깔끔한 코드를 구현할 수 있다.
* 멀티쓰레드 환경에서 객체가 공유된다고 해도 상태 값을 가지지 않으면 안전하다. (p.318)
* 서버측에서 사용자 정보를 쿠키 또는 세션을 통해 얻어야 하는 경우가 있는데 가급적 세션을(보안) 활용해 정보를 조회하자. (p.319)
* 상속의 경우 장점도 많지만 부모 클래스에 변경이 발생하면 자식 클래스에 영향을 미칠 수 있기 때문에 상속보다 조합(composition)을 사용하자.
* 계층형(layered) 아키텍처 : 컨트롤러, 서비스, DAO 구조의 웹 애플리케이션
* 의존관계란 객체 혼자 모든 일을 처리하기 힘들기 때문에 내가 해야 할 작업을 다른 객체에게 위임 (p.371)
* DI의 핵심은 인스턴스를 생성하는 책임과 사용하는 책임을 분리하는 것이다.
* 핵심적인 비지니스 로직 구현은 도메인 객체가 담당하는 것이 맞다.
* 서비스 레이어의 역할은 도메인 객체들이 비지니스로직을 구현할 수 있도록 도메인 객체를 조합하거나, 로직 처리를 완료했을 때의 상태값을 DAO를 활용해 
데이터베이스에 영구 저장하는 등의 역할을 담당 (p.392)
* 우리가 보통 service에 구현했던 방식은 절차지향적인 개발 방법이고, 이는 서비스 레이어와 복잡도를 증가시켜서 유지보수와 테스트하기 힘들어진다.
