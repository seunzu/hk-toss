let num1 = 10;
let num2 = 0.1
console.log(num1);
console.log(num2);

let sum = 0.1 + 0.2;
console.log(sum);

let num3 = Math.random(); // 0이상 ~ 1미만의 임의의 실수가 추출된다.
let num4 = Math.random();
console.log(num3);
console.log(num4);

console.log('---------------------------------------------');
console.log(num3); // => 0.19593905148820978
// Math.floor(실수) : 주어진 실수보다 작은 정수들 중에서 제일 큰 정수
// Math.ceil(실수)  : 주어진 실수보다 큰   정수들 중에서 제일 작은 정수
// num3 * 10 => 1.9593905148820978
let num5 = Math.floor(num3*10);
console.log(num5); // => 1
let num6 = Math.ceil(num3*10);
console.log(num6); // => 2

let sm = Symbol('😂😂');
console.log(sm);



