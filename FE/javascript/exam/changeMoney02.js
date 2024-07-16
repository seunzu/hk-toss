let myMoney     = 2407;
let coinUnit    = [500, 100, 50, 10];   // 동전의 단위
let coin        = [5,   5,   5,   5];   // 동전의 보유 개수

// myMoney를 큰 동전의 단위부터 교환을 시작한다.
// 교환하는데 각 단위의 동전은 몇 개가 필요한가요?
// 교환하고 남은 동전의 개수와 금액을 알려주세요!
console.log('동전으로 교환하고자 하는 금액 : ' + myMoney);

// 동전 종류의 개수만큼 작업을 한다.
for(let i = 0; i < coinUnit.length; i++) {
    let coinNum = 0;

    coinNum = Math.floor(myMoney / coinUnit[i]);
    // console.log(coinNum);

    if(coin[i] >= coinNum) {    // 교환해줄 만큼 충분한 수량이 있으면
        coin[i] -= coinNum;     // coin[i] = coin[i] - coinNum;
    } else {                    // 교환해줘야하는 개수가 보유개수보다 더 많을 경우
        coinNum = coin[i];
        coin[i] = 0;            // 보유한 개수는 모두 거슬러 준다.
    }

    // myMoney에서 동전의 개수(coinNum) 와 동전단위를 곱한 값을 빼준다.
    myMoney -= coinNum * coinUnit[i];
    console.log(coinUnit[i] + "원 : " + coinNum + "개"); 
}

if(myMoney > 0) {
    console.log('거스름 돈이 부족합니다.');
    console.log('교환하고 남은 돈 : ' + myMoney);
}

console.log("*** 남은 동전의 개수 ***");
for(let i = 0; i < coinUnit.length; i++) 
    console.log(coinUnit[i] + "원 : " + coin[i] + "개")
