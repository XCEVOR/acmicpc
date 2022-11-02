const fs = require('fs');
const [num1, num2] = fs.readFileSync('dev/stdin').toString().trim().split('\n');

const num1toInt = parseInt(num1);
const num2toMapNum = num2.split('').map(Number);

let result = num2toMapNum.reverse().map(x => x * num1toInt);
result.push(num1toInt * parseInt(num2));

console.log(result.join('\n'));
