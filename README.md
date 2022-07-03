# 기능 구현 목록

## 프로그램 구현
- [ ] 모든 객체를 이용하여 프로그램 구현

## 도메인
- [x] 숫자를 하나만 입력 시 그대로 그 숫자 반환
- [x] "" 또는 null 입력 시 0 반환
- [x] 쉼표 구분자를 통해 덧셈 진행
- [x] 쉼표 또는 콜론 구분자를 통해 덧셈 진행
- [x] 커스텀 구분자를 통해 덧셈 진행
- [x] 음수를 입력 시, RuntimeException 예외를 throw 하기

## 입력
- [x] 사용자로부터 입력을 받는다.

## 출력
- [x] 결과를 출력 한다.


기능 요구사항
쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 
구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정할 수 있다. 
커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 
예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw한다.