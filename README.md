# 기능 구현 목록

## 입력
- [ ] 사용자로부터 차 이름 입력 받기
- [ ] 플레이 회수 입력 받기

## 출력
- [ ] 이동 과정 출력
- [ ] 우승자 출력

## 도메인
- [x] 입력받은 문자열을 쉼표 구분자로 나누어서 차 객체 생성
  - [x] 1개 생성
  - [x] 여러개 생성
- [x] 자동차 이름은 5자를 초과할 수 없다.
- [x] 자동차 이동
  - [x] 랜덤값이 4 이상이면 1
  - [x] 랜덤값이 3 이하이면 0
- [x] 우승자 선정하기
  - [x] 한 명인 경우
  - [x] 여러명인 경우


각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
자동차 이름은 쉼표(,)를 기준으로 구분한다.
전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.