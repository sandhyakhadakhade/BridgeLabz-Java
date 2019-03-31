/******************************************************************************
 *  Execution       :   default node          : cmd> node addressBook.js
 *                      
 *  Purpose         : To print the 
 * 
 *  @description    
 *  @file           : addressBook.js
 *  @overview       : To create a JSON file . 
 *  @author         : sandhyarani khadakhade
 *  @version        : 1.0
 *  @since          : 31/03/2019
 *
 ******************************************************************************/

var read = require('readline-sync')
var utility=require('../Oops/oopsUtility')
var fs = require('fs');
var data = fs.readFileSync('address.json','utf8');
var addressb = JSON.parse(data);
function addressBook() {
    var address = new utility.Address;
    console.log("\t\t**********ADDRESS BOOK*********");
    console.log(" 1:Create Profile");
    console.log(" 2:Open Address Book");
    console.log(" 3:Exit\n");
    var choice1 = read.question(" Enter your choice: \n");
    switch (parseInt(choice1)) {
        case 1:
            address.createAddress(addressb);
            break;
        case 2:
            address.openProfile(addressb);
            break;
        case 3:
            console.log("ThankYou!");
            break;
        default:
            console.log("Please enter a valid option!!");
    }
}
addressBook();


