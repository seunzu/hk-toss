/*
Math.random() => 0 ~ 0.9999999....
Math.random() * 10 => 0 ~ 9.999999...
Math.floor(Math.random() * 10) => 0 ~ 9 사이의 정수
Math.floor(Math.random() * 10) + 1 => 1 ~ 10 사이의 정수

1 ~ 45 사이의 정수를 구하고 싶어요!
Math.floor(Math.random() * 45) + 1
*/
let score = Math.floor(Math.random() * 10) + 1;
// 100, 200, 300, 400점에 대해서만 상을 줍시다.

switch(score * 100) {
    case 100: console.log('상품은 자전거입니다.');  break;
    case 200: console.log('상품은 에어컨입니다.');  break;
    case 300: console.log('상품은 노트북입니다.');  break;
    case 400: console.log('상품은 자동차입니다.');  break;
    default:  console.log('꽝');
}






