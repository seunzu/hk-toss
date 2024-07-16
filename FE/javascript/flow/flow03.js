/*  
if(조건) {

} else if(조건) {
 
} else if(조건) {
 
} else {
 
}
*/

// jnum에 들어있는 값이 양수인지, 0인지, 음수인지 알려주세요!
// num의 값은 바뀔 수 있다.
let num = -20;
if(num > 0) {
    console.log('양수입니다.');
} else if(num == 0) {
    console.log('0입니다.');
} else if(num < 0) {
    console.log('음수입니다.');
}

// 위의 내용을 삼항연산자를 이용하여 바꿔주세요.
let str = num > 0 ? '양수' : (num == 0 ? '0' : '음수');
console.log(num + '은 ' + str + '입니다.');






