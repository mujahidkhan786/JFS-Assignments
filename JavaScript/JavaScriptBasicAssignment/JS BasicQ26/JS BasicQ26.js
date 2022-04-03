
 
// Javascript program to convert
// a number from any base
// to decimal
 
// To return value of a char.
// For example, 2 is returned
// for '2'. 10 is returned
// for 'A', 11 for 'B'
function val(c)
{
    if (c >= '0'.charCodeAt() &&
        c <= '9'.charCodeAt())
        return (c - '0'.charCodeAt());
    else
        return (c - 'A'.charCodeAt() + 10);
}
 
// Function to convert a
// number from given base
// 'b' to decimal
function toDeci(str, b_ase)
{
    let len = str.length;
     
    // Initialize
    // power of base
    let power = 1;
     
    // Initialize result
    let num = 0;
    let i;
 
    // Decimal equivalent is
    // str[len-1]*1 + str[len-2] *
    // base + str[len-3]*(base^2) + ...
    for(i = len - 1; i >= 0; i--)
    {
         
        // A digit in input number
        // must be less than
        // number's base
        if (val(str[i].charCodeAt()) >= b_ase)
        {
            document.write("Invalid Number");
            return -1;
        }
 
        num += val(str[i].charCodeAt()) * power;
        power = power * b_ase;
    }
    return num;
}
 
// Driver code
let str = "11A";
let b_ase = 16;
 
document.write("Decimal equivalent of "+
               str + " in base "+ b_ase +
               " is " + toDeci(str, b_ase));
                