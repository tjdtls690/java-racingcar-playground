# 기능 구현 목록

## 입력
- [ ] 문자열을 입력 받는다.
- [ ] 입력받은 문자열을, 구분자를 기준으로 분리해서 모두 더하기를 진행한다.
  - [x] List<String> 을 List<Integer> 로 변환 후 반환
  - [ ] default 는 (,) , (:) 을 구분자로 삼아서 분리한다. (String 배열)
  - [ ] 커스텀 구분자를 지정할 수 있다.
    - [ ] 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다.
      - ex) “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환
- [ ] 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw 한다.

## 출력
- [ ] 모두 더한 값을 출력한다.

## 도메인
- [x] 두 숫자를 더해서 더한 값을 반환
- [x] 차례대로 모두 더한 값을 반환

기능 요구사항
쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우
구분자를 기준으로 분리한
각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정할 수 있다.
커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다.
예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw 한다.