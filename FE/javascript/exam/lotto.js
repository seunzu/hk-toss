// lotto.js

// 1 ~ 45 사이의 정수를 랜덤하게 6개를 추출하여 ball에 저장한다.
// 각 방의 번호가 중복이 되면 안됩니다!!!
let ball = [0, 0, 0, 0, 0, 0];
for(let i = 0; i < ball.length; i++) {
    ball[i] = Math.floor(Math.random() * 45 + 1);

    if(i > 0) { // 맨 앞의 방은 검사할 필요가 없다.
        for(let j = 0; j < i; j++) {
            if(ball[j] == ball[i]) {
                // console.log('중복:' + i);
                i--;    // 새로 뽑은 번호가 앞의 방과 중복되면 추출하는 행위를 다시 한다.
            }
        }
    }
}
console.log("번호\t" + ball[0] + "\t" + ball[1] + "\t" + ball[2] + "\t" + ball[3] + "\t" + ball[4] + "\t" + ball[5]);

// 추출된 번호를 올림차순으로 보여주세요!!!
for(let i = 0; i < ball.length -1; i++) {
    for(let j = 0; j < ball.length -1 -i; j++) {
        if(ball[j] > ball[j+1]) { // 왼쪽 방의 값이 오른 쪽 방의 값보다 크면 서로 값을 교환한다.
            let imsi    = ball[j];
            ball[j]     = ball[j+1];
            ball[j+1]   = imsi;
        }
    }
}
console.log("번호\t" + ball[0] + "\t" + ball[1] + "\t" + ball[2] + "\t" + ball[3] + "\t" + ball[4] + "\t" + ball[5]);
