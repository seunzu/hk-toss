/*
switch(조건) {
    case 값: 실행할 문장;
    case 값: 실행할 문장;
    case 값: 실행할 문장;
    default: 모든 case 에 해당하지 않으면 실행할 문장;
}
*/

let pet = 'cat';

switch(pet) {
    case 'cat': 
                console.log('고양이 입니다.');
                break;
    case 'dog':
                console.log('강아지 입니다.');
                break;
    case 'rabbit':
                console.log('토끼 입니다.');
                break;
    default: 
                console.log('나의 애완동물이 없어요.');
                break;
}
