## shedlock library를 이용한 스케쥴링 locking

멀티 프로세스 환경에서 간단한 scheduler에 대해 반복 실행되는 것을 방지할 때,   
번거롭게 DB 구현해서 사용할 필요 없이 사용 가능한 방식이다.

> 예시에선 H2를 사용하지만, 실제 멀티 프로세스 환경에서는 글로벌 DB를 사용해야 한다.   

[github][ref]

---

만약 동적으로 스케쥴러를 구현해야 할 경우 위 방법으로는 처리가 안 된다.
Quartz를 사용하여 DB를 연동하고 동적 스케쥴 등록과, 멀티인스턴스를 대응할 수 있다. 자세한건 쓸 일 있을때 찾아보기

[example][ref2]

[ref]: https://github.com/lukas-krecan/ShedLock
[example]: https://medium.com/turkcell/spring-boot-quartz-scheduler-1-c61bbbafdbbb
