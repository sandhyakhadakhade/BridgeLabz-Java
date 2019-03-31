var prompt = require('readline-sync')
var access=require('../Oops/aAddress')
var utiOpenAddBook=require('../Oops/oAddress');
var fs = require('fs');
var data = fs.readFileSync('NewaddressBook.json','utf8');
var addressb = JSON.parse(data);

    

    var a = new access.Address;
    var b= new utiOpenAddBook.OpenAddBook;
    while(choice1!=5)
    {
    console.log("*****Detail of Address Book*****");
    console.log("1:Add New Person");
    console.log("2:List  the  Address Book Detail");
    console.log("3:changes the information ");
    console.log("4:Delete Person  ");

    console.log("5:Exit");
    var choice1 = prompt.question(" Enter your choice: ");
    switch (parseInt(choice1)) {
        case 1:
            a.createAddress(addressb);
            break;
        case 2:
            b.showDetails(addressb);
            break;
       
        case 3:
           b.changeTheInformation (addressb);
           break ;
        case 4 :
           b.deletePerson(addressb);
         break;
     
            break;
        case 5 :
        console.log("ThankYou!");
           break ;
        default:
            console.log("Please enter a valid option!!");
    }
}
