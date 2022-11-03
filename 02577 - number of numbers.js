let numbers_ls = require('fs').readFileSync('dev/stdin').toString().split('\n');
// console.log(numbers_ls)         // test print

const result = String(numbers_ls[0] * numbers_ls[1] * numbers_ls[2]); 
// console.log(result)         // test print

for(let i = 0; i <= 9; i++){
  console.log(result.split(i).length-1);
}
