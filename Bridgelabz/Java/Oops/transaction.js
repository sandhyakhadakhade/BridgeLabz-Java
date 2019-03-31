/**************************************************************************
 * Execution        : Default node             cmd> node CompanySharesQueue.js
 * @file            : CompanySharesQueue.js
 * @overview        : To add and remove the company info from the list of company shares.
 *                    List of CompanyShares in a stack and new CompanyShares can
 *                    be added or removed easily.
 * @author          : sandhyarani khadkhade
 * @version         : 1.0.
 * @since           : 31/03/2019
 ***************************************************************************/
var file = require("fs");
var readline = require("readline-sync");
var utility = require("../Oops/utilityOOPS");
function main() {
  try {
    var companyShares = new utility.CompanySharesQueue();
    outer: while (true) {
      console.log("1. Add");
      console.log("2. Remove");
      console.log("3. Print");
      console.log("4. Save and exit");
      var choice = readline.questionInt("Enter valid choice :");
      switch (choice) {
        case 1:
          companyShares.addTolist();
          break;
        case 2:
          companyShares.removeFromList();
          break;
        case 3:
          companyShares.print();
          break;
        case 4:
          companyShares.writeList();
          break outer;
        default:
          console.log("Please enter valid number ");
          break;
      }
    }
  } catch (err) {
    console.log(err.message);
  }
}
main();