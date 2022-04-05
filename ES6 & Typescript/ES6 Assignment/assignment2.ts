//Assignment 02  
//Q1 
// code to show the fibonacci series 
console.log("Question-1");

class Fibonacci{
    previousNo = Symbol();
    currentNo = Symbol();
    constructor(){
        this.previousNo=0;
        this.currentNo=1;
    }
    next(){
        let next = Symbol();
        next = this.previousNo + this.currentNo;
        this.previousNo=this.currentNo;
        this.currentNo=next;
        return next;
    }
}

let obj =new Fibonacci();
// console.log(obj) but we have used .next to print next number in console;
console.log("Here fibonacci series End");
console.log(obj.next()); // 1
console.log(obj.next()); // 2
console.log(obj.next());   // 3
console.log(obj.next());    // 5

console.log("Question-2");

//Q2  
const  listArmStrong=[0, 1, 153, 370, 371, 407];
let n = 0;
function Q2() {
    return { getNextArmstrong : function() {n += 1; return { value: listArmStrong[n], done: false };}};}
  // Create Iterable here
var n1 = Q2();
console.log("Armstrong numbers are follows : ");
console.log(n1.getNextArmstrong());
console.log(n1.getNextArmstrong());
console.log(n1.getNextArmstrong());
console.log(n1.getNextArmstrong());
console.log(n1.getNextArmstrong());

//Q3 
console.log("Question-3");

// check a number is armstrong or not here
function isArmstrong(number: number) {
    let sum = 0;
    let temp = number;
    while (temp > 0) {
        let digit = temp % 10;
        sum += digit ** 3;
        temp = Math.floor(temp / 10);
    }
    return (number == sum);
}
//Generator function to call is Armstrong and reset the value of n if n is greater than 1000 in it
function *getNextArmstrong1(){
    let i=0;
    while(true){
        if( isArmstrong(i)){
            yield i;
        }
        if(i>1000){
            i=0;
            yield "The number is too big....";
        }
        i++;
    }
}
console.log("Armstrong numbers are : ");
console.log("Using-Generator");
var g = getNextArmstrong1();
console.log(g.next().value);
console.log(g.next().value)
console.log(g.next().value)
console.log(g.next().value)
console.log(g.next().value)
console.log(g.next().value)
console.log(g.next().value) // The number is too big....
console.log(g.next().value)
console.log(g.next().value)
console.log(g.next().value)

//Q4 
console.log("Question-4")
//using set here to store users...
var chatRoom1 = new Map();
var chatRoom2 = new Map();
// adding users and messages to the chatrooms ....
chatRoom1.set("user1", ["Hello","Kya hal Hai?","Mai Theek Hu", "Thank you"]);
chatRoom1.set("user2", ["Hi","Kya hal Hai?","Mai Theek Hu", "Thank you"]);
chatRoom1.set("user3", ["Hi","Kya hal Hai?","Mai theek Hu", "Thank you"]);
chatRoom2.set("user4", ["Hello","Kya hal Hai?","Mai hheek Hu", "Thank you"]);
chatRoom2.set("user5", ["Hmm","Kya hal Hai?","Mai theek Hu", "Thank you"]);
chatRoom2.set("user6", ["Hi","Kya hal Hai?","apna batao", "Welcome"]);
//printing users and messages from the chatrooms....
var printusers= (room: any[] | Map<any, any>,name: string)=>{
    console.log(`Users in room name  ${name} are : `);
    for(let key of room.keys()){console.log(key);}
}
var printmessages= (room: any[] | Map<any, any>,name: string)=>{
    console.log(`Messages in room name  ${name} are : `);
    for(let value of room.values()){console.log(value);}
}
printusers(chatRoom1,"chatroom1");
printusers(chatRoom2,"chatroom2");
printmessages(chatRoom1,"chatroom1");
printmessages(chatRoom2,"chatroom2");

