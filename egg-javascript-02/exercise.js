
//egg 
//celsius to fahrenheit

document.getElementById("submitButton").onclick = function(){

    let temp;

    if (document.getElementById("celsiusButton").checked){
        temp = document.getElementById("textBox").value;
        temp = Number(temp);
        temp = Math.round(toCelsius(temp));
        document.getElementById("tempLabel").innerHTML = temp + "°C";
    }
    else if(document.getElementById("fahrenheitButton").checked){
        temp = document.getElementById("textBox").value;
        temp = Number(temp);
        temp = Math.round(toFahrenheit(temp));
        document.getElementById("tempLabel").innerHTML = temp + "°F";
    }
    else{
        document.getElementById("tempLabel").innerHTML = "Please, select a unit";
    }
}


function toCelsius(temp){
    return (temp - 32) * (5 / 9);
}

function toFahrenheit(temp){
    return temp * 9 / 5 + 32;
}