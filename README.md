# 기능 구현 목록

# 입력
- [x] 차 이름들을 입력받는다.
- [x] 경주 시도 횟수를 입력받는다. 

# 출력
- [ ] 차가 이동하는 과정을 차 이름과 함께 출력한다.
- [ ] 우승자를 출력한다.

## 도메인
- [x] 차를 생성한다.
  - [x] 쉼표 구분자로 나누어서 객체 생성
    - [x] 차 1대 생성
    - [x] 차 여러대 생성 (3대)
  - [x] 차 이름은 5자를 초과할 수 없다.
  - [x] 차 이름이 null 또는 공백일 수 없다.
- [x] 차가 랜덤 값(0 ~ 9)에 의해 이동을 결정한다.
  - [x] 랜덤 값이 4이상이면 이동
  - [x] 랜덤 값이 3이하이면 정지
- [x] 우승자 선정하기
  - [x] 우승자 1명
  - [x] 우승자 여러명 (2명)


각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
자동차 이름은 쉼표(,)를 기준으로 구분한다.
전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.