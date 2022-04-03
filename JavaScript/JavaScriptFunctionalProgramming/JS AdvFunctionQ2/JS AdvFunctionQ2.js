function square(num){
    return num*num;
   }
   var resList=[]
   function map(list,fun){
       if(list.length==0){
         return;
       }
       resList.push(fun(list.slice(0,1)))
       list= list.slice(1,(list.length));
       return map(list,fun);
   }
   map([1,2,3,4,5],square);
  
   document.write(resList);
   const numbers = [4, 9, 16, 25];
   document.getElementById("demo").innerHTML = numbers.map(Math.sqrt);