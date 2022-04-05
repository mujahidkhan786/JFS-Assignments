//Q1 

// Declaring Using const :
const c = "Mujahid";
console.log(c + " intial Value"); //Mujahid
//c = "Mujahid"; // Changing the value of const c :
//will give error as const is immutable 


//Q2 : 
var str = "Mujahid";
Q2(str);
function Q2 (str:any){
    if(str.length > 0){
        let strres = str.split(" ");
        console.log(strres);
    }
    else{
        console.log("String is less than 0");
    }
    //return strres;  -   //returning the value of strres
    // but it will not be returned as the scope of let is only within the function .
}

//Q3 :
var Order = {
    id: 11,
    title: 'order',
    price: 1000,
    printOrder() {
        return(this.id + " " + this.title + " " + this.price)
    },
    getPrice() {
       return( this.price);
    }
}

var order1 = Object.assign(Order);  //creating a new object from the existing object using Object.assign()
console.log(order1.printOrder());  //10 order 100
console.log(order1.getPrice());   //100

//Q5

// // ans A. Defaul values

function add(x: number,y=10){
    console.log(x+y);
 }
 
 add(10,40);
 add(5);
 
 // // ans B. 
 
 function userFriendsName(username: string,...arg: string[]){
    console.log("Name: "+username);
    console.log("Friends: ")
    for(var i in arg){
    console.log(arg[i])
    }
 }
 userFriendsName("Mujahid","Afridi","Akriti","Ayushi","Raja");
 
 
 //  //ans C.
 function printCapitalsNames(name1: string,name2: string | undefined,name3: string | undefined,name4: string | undefined,name5: string | undefined){
     console.log("Names after")
     console.log(name1.toUpperCase()+" "+name2.toUpperCase()+" "+name3.toUpperCase()+" "+name4.toUpperCase()+" "+name5.toUpperCase());
 } 
 
 var nameLists=["Mujahid","Afridi","Akriti","Ayushi","Raja"];
 console.log("Names Before: ",nameLists)
 printCapitalsNames(...nameLists);
 
 //Q6
 
 let laptop_model="ASUS TUF505DV";
 let deskNo=10;
 let Name="Mujahid";
 
 console.log(`TICKET:
 Problem: laptop screen is flickering
 laptop Model: ${laptop_model}
 deskNo: ${deskNo}
 Name: ${name}`);
 
 //Q7
 
 var names = ["Mujahid", "Akriti","KHAN", "Afridi"];
 var [firstele,secondele,thirdele,fourthele]= names;
 console.log(thirdele);
 
 
 // //Ans b.
 
 var organization ={
    name:"SRM",
    address:{
        city:"Noida",
        state:"Delhi",
        pincode:110053 
    }
 }
 
 const {address:{city:city1,state:state1,pincode:pincode1}}=organization;
 
 console.log(pincode1);
 
 //Q8
 
 class Account{
     id: any;
     balance: any;
     name: any;
     constructor(id: any,name: any,balance: any){
         this.id=id;
         this.name= name;
         this.balance = balance;
     }
 }
 class SavingAccount extends Account{
    interest: number;
     totalBalance: any;
    constructor(id: number,name: string,balance: number,interest: number){
           super(id,name,balance);
           this.interest  = interest;
    }
    getBalance(){
        this.totalBalance=0;
        this.totalBalance = this.balance + (this.balance*this.interest);
        return this.totalBalance;
    }
 }
 
 class CurrentAccount extends Account{
    cash_credit: number;
     totalBalance: number | undefined;
    constructor(id: number,name: string,balance: number,cash_credit: number){
           super(id,name,balance);
           this.cash_credit  = cash_credit;
    }
    getBalance(){
        this.totalBalance=0;
        this.totalBalance = this.balance -this.cash_credit;
        return this.totalBalance;
    }
 }
 
 var SavingAccountObj = new SavingAccount(11,"Mujahid",8000,10);
 console.log(SavingAccountObj.getBalance());
 
 var CurrentAccountObj = new CurrentAccount(11,"Afridi",80000,100);
 console.log(CurrentAccountObj.getBalance());
 
