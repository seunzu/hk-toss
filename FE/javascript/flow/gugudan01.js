let print = '';

for(let i = 2; i <= 9; i++) {   // 단
    for(let j = 1; j <= 9; j++) {
        print += i + "x" + j + "=" + i*j + "\t"; 
    }
    console.log(print);
    print = '';
}
