// 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.

const fs = require('fs');
const inputData = fs.readFileSync("/dev/stdin").toString().split(" ");

const A = parseInt(inputData[0]);
const B = parseInt(inputData[1]);

console.log(A - B);
