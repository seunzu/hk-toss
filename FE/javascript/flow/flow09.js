/*
for(초기화 ; 비교 ; 증감) {
    실행할 문장;
}
초기화 -> 비교 -> 실행할 문장 -> 증감
       -> 비교 -> 실행할 문장 -> 증감
for(let num = 1; num <= 10; num++) {
    console.log('현재의 값 : ' + num);
}
*/
for(let num = 1; num <= 10; num++) {
    console.log('현재의 값 : ' + num);
}

let num = 1;
for( ;num <= 10; ) {
    console.log('현재의 값 : ' + num);
    num++;
}
