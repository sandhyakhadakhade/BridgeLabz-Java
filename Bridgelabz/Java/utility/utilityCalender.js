/***********************************************************
 *
 * Execution     :Default node      cmd>node filename.js
 * Purpose       :To deploy all the business logic.
 * 
 *@description 
 *@file          :utilityDataStructures.js
 *@overview      :All the business logic are coded here.
 *@author        :Bhavana Sai B  <bhavanab1506@gmail.com>
 *@version       :1.0
 *@since         :02/02/2019
 * 
 ***********************************************************/


var utility = require('../utility/utility')
module.exports = {
    day(m, d, y) {
        var v = Math.floor((14 - m) / 12)
        var y0 = y - v
        var x = y0 + Math.floor(y0 / 4) - Math.floor(y0 / 100) + Math.floor(y0 / 400)
        var m0 = m + 12 * Math.floor((14 - m) / 12) - 2
        var d0 = (d + x + Math.floor((31 * m0) / 12)) % 7
        d0 = Math.floor(d0)
        return d0;
    },
    leapYear(year) {
        if (year % 4 == 0 || year % 400 == 0 || year % 100 == 0) {
            return true;
        }
        else {
            return false;
        }
    },
    monthof(month) {
        switch (month) {
            case 1: return 31;
                break;
            case 2: return 28;
                break;
            case 3: return 31;
                break;
            case 4: return 30;
                break;
            case 5: return 31;
                break;
            case 6: return 30;
                break;
            case 7: return 31;
                break;
            case 8: return 31;
                break;
            case 9: return 30;
                break;
            case 10: return 31;
                break;
            case 11: return 30;
                break;
            case 12: return 31;
                break;
        }
    }


}