// 삼항 연산자
// 조건  ?  조건이 참이면 실행  : 조건이 거짓일 때 실행  

// 90점 이상이면 A학점, 90점 미만이면 B학점
let score = 95;
// score >= 90 ? console.log('A학점') : console.log('B학점');
let grade = score >= 90 ? 'A학점' : 'B학점';
console.log(grade);

// 90점 이상이면 A학점, 89 ~ 80까지 B학점, 그 외 나머지는 C학점
score = 40;
grade = score >= 90 ? 'A학점' : (score >= 80 ? 'B학점' : 'C학점');
console.log('당신의 점수는 ' + score + '점이고, 학점은 ' + grade + '입니다.');

