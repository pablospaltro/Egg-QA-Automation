let myArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20];


for (let i= 0; i < myArray.length; i++) {

    let auxNumber = Number(myArray[i])
    
    if ((auxNumber % 2) == 0) {
        if ((auxNumber % 5) == 0){
            console.log("The number ", auxNumber, " is even. ");  
            console.log("Also the number ", auxNumber, " is divisible by 5.")
        } else {
            console.log("The number ", auxNumber, " is even. ");
        }
    } else if ((auxNumber % 2) !== 0){
        if ((auxNumber % 5) == 0){
            console.log("The number ", auxNumber, " is odd. ");  
            console.log("Also the number ", auxNumber, " is divisible by 5.")
        } else {
            console.log("The number ", auxNumber, " is odd");
        }
    }
    
}