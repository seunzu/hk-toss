// 중첩된 if문
// 각점수의 1의 자리가 7이상이면 +,  3이하면 - 
// 88점이면 B+, 85점이면 B, 83이하면 B- 로 나타나도록 하세요!
let score = 93;

if(score >= 90) {
    if(score >= 97)         console.log('A+학점입니다.');
    else if(score <= 93)    console.log('A-학점입니다.');
    else                    console.log('A학점입니다.');
} else if(score >= 80 && score <= 89) {
    if(score >= 87)         console.log('B+학점입니다.');
    else if(score <= 83)    console.log('B-학점입니다.');
    else                    console.log('B학점입니다.');
} else if(score >= 70) {
    if(score >= 77)         console.log('C+학점입니다.');
    else if(score <= 73)    console.log('C-학점입니다.');
    else                    console.log('C학점입니다.');
} else {
    console.log('D학점입니다.');
}

let str = '';

if(score >= 90) {
    str = 'A';
    if(score >= 97)         str += '+';
    else if(score <= 93)    str += '-';
    str += '학점입니다.';
    console.log(str);
} else if(score >= 80 && score <= 89) {
    if(score >= 87)         console.log('B+학점입니다.');
    else if(score <= 83)    console.log('B-학점입니다.');
    else                    console.log('B학점입니다.');
} else if(score >= 70) {
    if(score >= 77)         console.log('C+학점입니다.');
    else if(score <= 73)    console.log('C-학점입니다.');
    else                    console.log('C학점입니다.');
} else {
    console.log('D학점입니다.');
}