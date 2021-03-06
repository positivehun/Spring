# Spring FrameWork
## 자바 플랫폼을 위한 애플리케이션 프레임워크
### 웹사이트를 개발하기 위한 여러 서비스 제공
### 스프링은 하나의 거대한 생태계
### 프레임워크 뿐만 아니라 클라우드 데이터 보안 등 다양한 기능 제공
### 다른 프레임워크에 비해 가볍고 확장성이 뛰어남
### 다양한 플러그인 제공, 개발 생산성 높음

# Spring AOP(Aspect-Oriented Programming)
## AOP-핵심 기능과 부가 기능
### 애플리케이션 로직은 크게 핵심기능과 부가기능으로 나눌 수 있음
### 핵심기능 = 해당 객체가 제공하는 고유의 기능
### 부가기능 = 핵심기능을 보조하기 위해 제공되는 기능
### 부가기능을 여러곳에 적용하려면 번거로움, 이 문제를 해결하기위해 애스펙트(aspect)

## AOP-애스펙트(Aspect)
### 부가그낭과 부가기능을 어디에 적용할지 정의한 모듈(관점)
### 관점지향 프로그래밍
### AOP를 사용하면 핵심기능과 부가기능이 코드상 완전히 분리되어있음

## 부가기능 로직 추가시점
### 컴파일 시점
#### -.java소스코드를 컴파일러에 사용해서 .class를 만드는 시점에 부가기능 로직을 추가할수 있다
#### -부가기능 코드가 핵심기능이 있는 컴파일된 코드 주변에 실제로 붙는다
### 클래스 로딩 시점
#### -자바를 실행하면 언어는 .class파일을 자바가상머신(JVM)내부클래스 로더에 보관
#### -중간에서 .class파일을 조작한다음 JVM에 적재
#### -자바언어는 .class를 JVM에 저장하기 전에 조작할 수 있는 기능을 제공
### 런타임 시점
#### -런타임 시점은 컴파일도 끝나고, 클래스 로더에 클래스도 다 올라가 이미 자바가 실행되고 난 다음을 의미
#### -자바의 main메서드가 이미 실행된 다음
#### -스프링과 같은 컨테이너 프록시 DI 빈 포스트 프로세서 같은 개념을 총동원

##스프링이 제공하는 AOP는 프록시를 사용합니다
### 프록시를 통해 메서드를 실행하는 시점에만 AOP가 적용됩니다
### AspectJ를 사용하면 더 복잡하고 다양한 기능 사용 가능 하지만 양이 방대하고 어려움
### 스프링AOP는 추가 자바설정 없이 스프링만 있으면 편리하게 사용가능

# AOP용어 정리
|용어|설명|
|:--:|:--:|
|조인포인트 <br> (Join Point)|어드바이스가 적용될 수 있는 위치,메소드 실행,생성자호출,<br>필드값 접근 등 프로그램 실행 중 지점|
|포인트컷<br>Pointcut|조인 포인트 중 어드바이스가 적용될 위치를 선별하는 기능|
|타겟<br>Target|어드바이스를 받는 객체, 포인트컷으로 결정|
|어드바이스<br>Advice|부가기능을 말하며, 특정 조인포인트에서 애스펙트에 의해 취해지는 조치|
|애스펙트<br>Aspect|어드바이스와 포인트컷을 모듈화한 것|
|어드바이저<br>Advisor|하나의 어드바이스와 하나의 포인트컷으로 구성<br>스프링AOP에서 사용되는 용어|
|위빙<br>Weaving|포인트컷으로 결정한 타겟의 포인트에 어드바이스를 적용하는 것|
|AOP 프록시|AOP기능을 구현하기 위해 만든 프록시 개체 <br> 스프링에서 AOP프록시는 JDK동적 프록시 또는 CGLIB프록시임|

### 프록시(Proxy) - 대리행위, 중계를 대신하는 것
#### -서버와 클라이언트 사이의 중계기로써 대리로 통신을 수행하는것,아이피 주소를 우회하여 사용

[![AOP](https://postfiles.pstatic.net/MjAyMTExMDNfNTYg/MDAxNjM1OTAyNzY5OTE5.UV8tGTlQfjU6XZLP-yIpTsyAWygy6cw1DtFTiceDI7Ig.cs5bBMmSNurQKk6tTzbrT2EQVvIk5V_agAiwy-UQxxkg.PNG.inflearn/스크린샷_2021-11-03_오전_10.25.54.png?type=w773)
]

