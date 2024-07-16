// changeMoney01.js
// 배열의 개수 => 배열이름.length;
let coinUnit = [500, 100, 50, 10];  // 동전의 단위

let myMoney = 2680;   // 동전으로 바꿀 돈
// console.log(coinUnit.length);

// myMoney 를 동전으로 바꾸면 각각 몇 개가 필요한가요?
// 큰 단위의 동전부터 먼저 바꾸어 준다!!!
// coinUnit[0], coinUnit[1]
for(let i = 0; i < coinUnit.length; i++) {
    console.log(coinUnit[i] + "원 : " +  Math.floor(myMoney / coinUnit[i]) + "개");
    myMoney = myMoney % coinUnit[i];
}

