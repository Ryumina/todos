# todos
<hr>

## 패키지 구조 (Ports & Adapters, Clean 규칙 준수)
  
- **Ports & Adapters**?  
> **어댑터(adapter)**  
> 어댑터는 포트를 통해 애플리케이션 코어와 외부 세계를 연결한다.  
> 어댑터는 특정 외부 기술이나 프레임워크에 의존적인 로직을 담당하며,  
> 이를 통해 애플리케이션 코어는 외부와의 결합도를 최소화(느슨하게) 한다.  
> 
> in) Controller: 외부 시스템으로부터의 요청을 애플리케이션 코어로 주도  
> out) Repository: 애플리케이션 코어에서 외부에 데이터를 전달하는 역할 담당  

> **포트(port)**  
> 포트는 애플리케이션 코어의 경계를 정의하고, 애플리케이션 코어가 제공해야 할 기능을 나타내며  
> 어댑터를 통해 애플리케이션 코어에 접근하거나, 외부와 연동하는 인터페이스다.
> 
> ex) Input Port : Controller가 호출하는 유스케이스 인터페이스  
> ex) Output Port : Service가 호출하는 영속성/외부 연동 인터페이스  
```Service가 호출하는 영속성/외부 연동 인터페이스
 ├─ domain
 │   ├─ model     // 엔티티/VO
 │   └─ port      // 도메인이 소유한 인터페이스(Input/Output)
 ├─ application   // 유스케이스/서비스
 ├─ adapter
 │   ├─ web       // 인바운드 어댑터(Controller, 요청/응답 DTO)
 │   └─ jpa       // 아웃바운드 어댑터(JPA 구현체)
 └─ config        // 스프링 설정
```

- `domain`: 비즈니스 핵심 규칙, 엔티티, 포트 정의  
- `application`: 유스케이스 구현(Service 계층), 도메인 규칙 활용  
- `adapter`: 외부 입출력 구현부 (웹, DB 등)  
- `config`: 프레임워크/환경 설정
<hr>

## Git Flow
- **Trunk Based Development**
  - `main` : 언제든 릴리즈가 가능한 상태의 branch
  - `작업` : 짧은 기능 브랜치 -> PR -> merge into main
  - `브랜치 규칙` : `Feat/*`, `Fix/*`, `Refactor/*`, `Docs/*`, `Chore/*`, `Test/*`
<hr>

## Database & Persistence
- H2 (in-memory, 개발/테스트 용)
- PostgreSQL (운영)
- Spring Data JPA
- Redis (캐싱, 세션 관리)
<hr>