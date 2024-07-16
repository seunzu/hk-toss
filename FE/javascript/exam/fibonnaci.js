// fibonnaci.js
// Fibonnaci 수열은 앞의 두 수를 더해서 다음 수를 만들어 나간다.
// 1, 1, 2, 3, 5, ...... 으로 진행됩니다.
// 1 과 1로 부터 시작하는 피보나치 수열의 10번째 수는 무엇인가요?

let num1 = 1;
let num2 = 1;
let num3 = 0;
let result = '';

result += num1 + ", ";
result += num2 + ", ";

for(let i = 0; i < 8; i++) {
    num3    = num1 + num2;  // 세번째 값은 앞의 두 수를 더해서 만든다.
    result += num3 + ", ";

    num1 = num2; // 두 번째 변수의 값을 가지고 첫 번째 변수의 값을 변경한다.
    num2 = num3; // 세 번째 변수의 값을 가지고 두 번째 변수의 값을 변경한다.
}


console.log(result);
