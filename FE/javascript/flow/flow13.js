
// let num = 11;
// while(num <= 10) {
//     console.log('num ==> ' + num);
//     num++;
// }

let num = 12;
do {
    console.log('num ==> ' + num);
    num++;
} while(num <= 10);

do {
    let yesno = confirm("게임을 계속하시겠습니까?");
    if(yesno == true) {
        console.log('게임을 계속 진행합니다.');
    } else {
        console.log('게임을 종료합니다.');
        break;
    }
} while(true);

console.log('그만 집에 돌아갑니다.');

