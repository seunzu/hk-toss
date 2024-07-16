// 1 + (-2) + 3 + (-4) + ........ 
// 위와 같이 더해나가다 보면, 어는 순간에 100이 넘어가게 됩니다.
// 그 때가 언제인가요? (199)

let sum     = 0;    // 총합을 저장할 변수
let sign    = 1;    // 값의 부호를 바꿔주는데 사용할 변수
let num     = 0;

for(let i = 1; true; i++, sign = -sign) {
    num = sign * i;
    sum += num;
    //sum += sign * i; 
    if(sum >= 100)  break;  // 총합이 100보다 같거나 크면 반복문을 벗어난다.
}
console.log("sum => " + sum);
console.log("num => " + num);

sum = 0;
num = 0;
// 내부에서 100이 된 상태에서 while문의 비교로 오기 때문에 sum <= 100로 사용하게 되면
// -짝수와 +홀수를 한 번 더하게 된다.
while(sum < 100) {
    ++num;
    if(num % 2 == 0)    sum -= num;
    else                sum += num;
}
console.log("sum => " + sum);
console.log("num => " + num);

