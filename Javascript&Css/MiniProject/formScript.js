const validator=()=>{
    const firstname=document.getElementById("firstname").value;
    const lastname=document.getElementById("lastname").value;
    const password=document.getElementById("password").value;
    const passwordconfirm=document.getElementById("passwordconfirm").value;

    const phone=document.getElementById("phone").value;
    const email=document.getElementById("email").value;

    const date=document.getElementById("date").value;

    if(firstname.match(/\w/)==null){
        alert("Invalid first name");
        return false;
    }

    if(lastname.match(/\w/)==null){
        alert("Invalid last name");
        return false;
    }

    if(password.length>=6 && password.length<=20){
        if(password!==passwordconfirm){
            alert("Invalid password");
            return false;
        }
    }else{
        alert("Invalid password");
        return false;
    }

    if(phone.match(/^[0-9]{3}[-\.\s][0-9]{3}[-\.\s][0-9]{3}$/)==null){
        alert("Invalid last phone number");
        return false;
    }

    if( document.getElementById("male").checked || document.getElementById("female").checked){

    }else{
        alert("Select gender");
        return false;
    }

    if(date.length===0){
        alert("Select date");
        return false;
    }

    if(email.length===0){
        alert("Enter email");
        return false;
    }


    return true;

}

setInterval(()=>{
    alert("Three minutes alert")
},180000)