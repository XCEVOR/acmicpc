let fs = require('fs');
let inputdata = fs.readFileSync('/dev/stdin').toString();

let star = "";

for (let i = 0; i < inputdata; i++) {
    star += "*";
    console.log(star);
}
