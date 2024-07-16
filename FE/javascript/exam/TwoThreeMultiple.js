// TwoThreeMultiple.js
// AND ( && )  OR ( || )  Not Equal ( != )

// 1 부터 20 까지의 정수 중에서 2의 배수 또는 3의 배수가 아닌 정수들의 총합은? (73)
let sum = 0;

for(let i = 1; i <= 20; i++) {
    if(i % 2 == 0 || i % 3 == 0)
        continue;
    sum += i;   // sum = sum + i;
}
console.log("누적합계 : " + sum);

sum = 0;
for(let i = 1; i <= 20; i++) {
    if(i % 2 != 0 && i % 3 != 0)
        sum += i;   // sum = sum + i;
}
console.log("누적합계 : " + sum);
