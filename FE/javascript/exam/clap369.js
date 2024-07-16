// clap369.js
// 1 부터 100 까지 정수를 순서대로 진행하는데,
// 3, 6, 9 라는 숫자가 나오면 박수를 쳐주세요.(화면에 '짝'을 출력하세요!)

let number = 0;
for(let i = 1; i <= 100; i++) {
    number = i;
    while(number > 0) {
        if(number % 10 == 3 || number % 10 == 6 || number % 10 == 9)
            console.log(i + '짝');
        else
            console.log(i);
        number = Math.floor(number / 10);
    }
}
// 같은 숫자의 '짝'이 여러번 나오면 같은 줄에 나오게 하자!
let count   = 0;
let clap    = '';
number  = 0;

for(let i = 1; i <= 100; i++) {
    number = i;
    while(number > 0) {
        if(number % 10 == 3 || number % 10 == 6 || number % 10 == 9)
            count++;
        number = Math.floor(number / 10);
    }
    if(count > 0)   clap += i + ' ==> ';
    else            console.log(i);

    for(let j = 1; j <= count; j++)
        clap += '짝';

    if(count > 0)   console.log(clap);
    clap    = '';
    count   = 0;
}