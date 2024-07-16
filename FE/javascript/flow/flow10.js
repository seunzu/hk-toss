/* 
1부터 20까지의 정수에서 홀수만 더하면 얼마이고, 짝수만 더하면 얼마인가요? 
*/
let odd     = 0; // 홀수의 합
let even    = 0; // 짝수의 합

for(let num = 1; num <= 20; num++) {
    if(num % 2 == 0) {
        console.log('짝수:' + num);
        even += num;
    } else {
        console.log('홀수:' + num);
        odd  += num;
    }
}

console.log('홀수의 합:' + odd + ', 짝수의 합:' + even);