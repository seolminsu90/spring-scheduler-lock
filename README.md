## shedlock library를 이용한 스케쥴링 locking

멀티 프로세스 환경에서 간단한 scheduler에 대해 반복 실행되는 것을 방지할 때,   
번거롭게 DB 구현해서 사용할 필요 없이 사용 가능한 방식이다.

> 예시에선 H2를 사용하지만, 실제 멀티 프로세스 환경에서는 글로벌 DB를 사용해야 한다.   

[github][ref]

[ref]: https://github.com/lukas-krecan/ShedLock