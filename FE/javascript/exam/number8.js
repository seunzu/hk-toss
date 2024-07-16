//  number8.js
/*
1 부터 10000 까지의 정수에서 8은 총 몇번나오나요?
808 => 2번, 8088 => 3번
정답 : 4000번
*/

let num= 0; 
let count= 0;
		 
for(let i = 1; i <= 10000; i++) {
    // console.log("i : " + i + ",  count : " + count);
    num = i;
    while(num <= 10000) {
        if(Math.floor(num % 10) == 8) {
            // 10단위에 나타나는 8의 회수를 처리하기 위해서
            // 1단위의 회수처리는 while문 밖에서 처리한다.
            count++;
            num = Math.floor(num /10); // i /= 10;
        } else if(num == 8) {
            // 1단위에 나타나는 8의 회수를 처리하기 위해서
            count++; //19 ~ 29번째 줄 에서 숫자 8이 나오는 순간 count를 1씩 증가시킨다.//
        } else { 
            // console.log("continue : " + i);
            num = Math.floor(num /10);

            if(num == 0)  break;
            else        continue;
        }
    }
    // i = num;
}
console.log("1 ~ 10000까지 8이라는 숫자가 나오는 횟수 1: " + count);

num     = 0;
count   = 0;
for(let i = 0; i <= 10000; i++) {
    num = i;

    while(num > 0) {
        if(Math.floor(num % 10) == 8) count++;
        num = Math.floor(num / 10);
    }
}
console.log("1 ~ 10000까지 8이라는 숫자가 나오는 횟수 2: " + count);
