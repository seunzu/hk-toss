// 자료형 (data type)
// 기본 자료형 과 참조 자료형으로 ㅓ구분한다.
// 기본 자료형 : 문자, 숫자, 논리(boolean : false(0), true(1)), undefined, null, symbol
// 참조 자료형 : 객체

// 문자열
let str1 = '안녕하세요?';
let str2 = "둘리입니다.";
// let str3 = '오래간만입니다.";
console.log(str1 + str2);

let str3 = '안녕하세요? "둘리"입니다.';
let str4 = "안녕하세요? '희동이'입니다.";
console.log(str3);
console.log(str4);

// escape 문자
let str5 = '안녕하세요? \'길동이\' 입니다.';
let str6 = "안녕하세요? \"길동이\" 입니다.";
let str7 = "안녕하세요?\n \"길동이\" \t\t입니다.";
let str8 = "안\\녕\\하\\세\\요?\n \"길동이\" \t\t입니다.";
console.log(str5);
console.log(str6);
console.log(str7);
console.log(str8);

// 템플릿 문자열 : 백틱(`)
// Enter를 눌렀을 때 줄바꿈이 적용이 되고, 이스케이프 문자를 사용하지 않아도 된다.
let str9 = `문자열의 큰 따옴표 " 나 작은 따옴표 ' 를 사용할 수 있습니다.`;
let str10 = 
`문자열의 
            큰 따옴표 " 나 
            작은 따옴표 ' 를 사용할 수 있습니다.`;
console.log(str9);
console.log(str10);

let num1 = 10;
let num2 = 2;
console.log(num1 + " x " + num2 + " = " + num1 * num2);

let str11 = `${num1} x ${num2} = ${num1 * num2}`;
console.log(str11);
