// 두 자연수 A와 B가 주어진다. 
// 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 

const fs = require('fs');
const inputData = fs.readFileSync('/dev/stdin').toString().split(' ');

const num1 = Number(inputData[0]);
const num2 = Number(inputData[1]);

console.log(num1 + num2);
console.log(num1 - num2);
console.log(num1 * num2);
console.log(Math.floor(num1 / num2));
console.log(num1 % num2);
