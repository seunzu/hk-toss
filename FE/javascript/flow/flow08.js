let score = Math.floor(Math.random() * 101);    // 시험점수
let grade = '';

switch(Math.floor(score/10)) {
    case 10: 
    case 9:
        grade = 'A';    console.log('A');   break;
    case 8:
        grade = 'B';    console.log('B');   break;
    case 7:
        grade = 'C';    console.log('C');   break;
    default:    
        grade = 'D';    console.log('D');   break;                                    
}
console.log('당신의 성적은 ' + score + '점이고, 등급은 ' + grade + '입니다.');
