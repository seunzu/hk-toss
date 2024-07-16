// 형 변환
// 암시적 변환 과 명시적 변환

// 암시적 형변환
const result = 10 + '10'; 
console.log(result);

let sum = '10' + 10;
console.log(sum);

sum = 10 + 10 + '10';
console.log(sum);

sum = '10' + 10 + 10;
console.log(sum);

// 명시적 형변환
let num1 = 10;
let str1 = '10';
if(String(num1) === str1) {
    console.log('같습니다.');
}
