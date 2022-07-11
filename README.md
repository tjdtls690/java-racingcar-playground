# 기능 구현 목록

## 입력
- [x] 자동차 이름을 입력 받는다.
  - [x] 하나의 Car 객체 생성
  - [x] 여러개의 Car 객체 생성
    - [x] 쉼표 구분자로 나눠야 한다.
  - [x] 하나의 자동차 이름은 5자를 초과할 수 없다.
    `
## 출력
- [ ] 진행 과정 및 우승자 출력

## 도메인
- [x] 랜덤 값에 의해 이동이 정확하게 이루어진다.
  - [x] 랜덤 값이 4 이상이면 1 인지 확인
  - [x] 랜덤 값이 3 이하이면 0 인지 확인
- [x] 4 이상이 나온 횟수만큼 포지션 증가 검증
- [x] 4 이상 나온 횟수만큼 '-' 가 정확히 찍혀야 한다.
  - [x] 여러번 move 일 때 그 횟수만큼 '-' 찍기
  - [x] 한 번 move 일 때 '-' 인지 확인
  - [x] stop 만 나왔을 시, 공백만 찍히는지 확인
- [ ] 우승자가 제대로 선정 되는지 확인
  - [ ] 우승자 한 명일 때 검증
  - [ ] 여러명일 때 검증




각 자동차에 이름을 부여할 수 있다.
자동차 이름은 5자를 초과할 수 없다.
전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
자동차 이름은 쉼표(,)를 기준으로 구분한다.
전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다.
우승자는 한명 이상일 수 있다.