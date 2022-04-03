
function countSquares(a, b)
{
   return (Math.floor(Math.sqrt(b)) -  Math.ceil(Math.sqrt(a)) + 1);
}
 
// Driver code
 
    let a = 9;
    let b = 25;
    document.write( "Count of squares is ",
              countSquares(a, b));
