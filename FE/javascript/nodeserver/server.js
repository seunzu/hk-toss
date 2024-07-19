const express = require('express');
const app   = express();
const path  = require('path');

app.listen(8080, function() {
    console.log('8080포트로 서비스를 시작합니다!');
});

app.get('/dog', function(req, res) {
    res.send('어머나! 너무 귀여운 멍멍이예요!!!');
});

app.get('/cat', function(req, res) {
    res.send('안녕하세요? 저는 귀여운 야옹이예요!!!');
});

app.get('/friend', function(req, res) {
    res.send('친구야 밤새 잘 지냈니?');
});

app.get('/owl', function(req, res) {
    res.send('부엉이야 밤새 잘 지냈니?');
});

app.get('/hello', function(request, response) {
    response.sendFile(path.resolve(__dirname + '/index.html'));
    console.log('index.html 페이지를 보내주었습니다!');
});

app.get('/member', function(request, response) {
    response.sendFile(path.resolve(__dirname + '/insertMember.html'));
    console.log('/insertMember.html 페이지를 보내주었습니다!');
});

app.post('/userCheck', function(request, response) {
    // response.send('1');
    const rNum = Math.floor(Math.random() * 2);
    response.send(String(rNum));
});
