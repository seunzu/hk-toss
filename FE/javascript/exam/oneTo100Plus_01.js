// oneTo100Plus_01.js
// 1 + (1+2) + (1+2+3) + ........ + (1+2+...+10)의 결과는 얼마인가요? (220)
let sum         = 0;
let totalSum    = 0;
for(let i = 1; i <= 10; i++) {
    sum         += i;
    totalSum    += sum;
}
console.log("총합 : " + totalSum);

sum = 0;
for(let i = 1; i <= 10; i++) {
    for(let j = 1; j <= i; j++) {
        sum += j;
    }
}
console.log("총합 : " + sum);

