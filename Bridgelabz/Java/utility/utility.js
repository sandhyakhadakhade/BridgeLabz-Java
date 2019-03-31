const readline = require('readline-sync');
module.exports = {

    /**************************************************************************************
    * Purpose  : To deploy all the business logic
    * 
    * @description 
    * @file     : utility.js
    * @overview : All the business logic are coded here.
    * @author   : Bhavana Sai <bhavanab1506@gmail.com>
    * @version  : 1.0
    * @scince   : 24/01/2019
    * 
    *****************************************************************************************/

    /*************************************fileRead********************************************
     * @purpose    : To read file from the path
     * @function   : fileRead function reads the file and splits it by space and returns 
     ******************************************************************************************/
    
     fileRead(){
        var fileStream=require('fs');
        var f=fileStream.readFileSync('sample.txt','utf8');
        var arr=f.trim().split(' ');
        return arr;
    },

    /*************************************fileWrite********************************************
     * @purpose    : To write the data into a file.
     * @function   : fileWrite function write the data to a file.
     * @param      : fileWrite function accepts fileName and data to be written.
     *******************************************************************************************/

    fileWrite(fileName, data){
        const fs=require('fs');
        fs.writeFile(fileName, data, function(err){
            if(err){
                return console.log(err);
                
            }
        });
    },


    /*********************************String Replace******************************************
        * 1.stringReplace
        * *************************
        * @purpose      : To ensure that user name should be minimum 3 characters, not a number
        *                 and must be an alphabet, then replace the username with user input 
        *                 and print the value.
        * @param        : Invoke this method and pass user input as parameter.
        * @function     : username takes the user input and prints the value              
        ****************************************************************************************/

    replaceString(username) {
        try {
            var s = /[a-zA-Z]/
            if (username.length > 3 && isNaN(username) && s.test(username)) {
                var input = "Hello <<UserName>>, How are you???";
                var output = input.replace(/<<UserName>>/g, username);
                console.log(output);
            }
            else {
                console.log("enter the name with more than 3 characters and must be alphabet");
            }
        }
        catch (e) {
            console.log(e.message);
        }

    },


    /*************************************FlipCoin***************************************** 
     * 2.flipCoin
     * ***************************
     * @purpose     : BY using random function, flip the coin the number of times the user input
     *                and print the percentage of heads and tails.
     * @param       : Declaring a function and passing the user input for flipping the coin.
     * @function    : flipCoin takes the number of times to flip the coin and 
     *                print the percentage of heads and tails. 
     ****************************************************************************************/

    flipCoin(flip) {
        try {
            var heads = 0, tails = 0, i = 0;
            for (i = 0; i <= flip; i++) {
                var rn = Math.random();
                if (rn < 0.5)
                    tails++;
            }
            var resT = (tails / flip) * 100;
            console.log("percentage of tails = " + resT + "%");
            console.log("percentage of heads = " + (100 - resT) + "%");
        }
        catch (e) {
            console.log(e.message);
        }
    },


    /*****************************************LeapYear**************************************
     * 3. checkLeapYear
     * ******************************
     * @purpose     : Accept four digit number as input from the user and check whether it 
     *                is a leap year or not.
     * @param       : declare a function and pass four digit number as argument.
     * @function    : function checks length of the given number, if length equals to 4, 
     *                then it prints given number is Leap year or not. 
     ****************************************************************************************/

    checkLeapYear(year) {
        try {
            if (year.length == 4 && !isNaN(year) || year > 0) {
                if ((year % 4 == 0) || (year % 400 == 0) || (year % 100 == 0))
                    console.log(year + " is a leap year");
                else
                    console.log(year + " is not a leap year");

            }
            else {
                console.log("enter valid year");
            }
        }
        catch (e) {
            console.log(e.message);
        }
    },


    /***************************************PowerOfTwo***************************************
     * 4.powerof2
     * ****************************
     * @purpose     : To Accept value of "N" from user and prints a table of the powers of 2 
     *                that are less than or equal to 2^N. value of N should be less then 31.
     * @param       : Prints the value of two's power, accepting input from the command line 
     *                argument.
     * @function    : function checks the given number is less then 31, if less than 31, then 
     *                it prints the value of two's power i.e., 2^N value
     ****************************************************************************************/

    findPowerOf2() {
        try {
            var pow = process.argv[2]
            if (pow >= 0 && pow < 31 && !isNaN(pow)) {
                if (pow == 0) {
                    console.log(1);
                }
                else {
                    for (let i = 0; i <= pow; i++) {
                        console.log("2^" + i + "=" + Math.pow(2, i));
                    }

                }

            }
            else {
                console.log("enter less than 31");
            }
        }
        catch (e) {
            console.log(e.message);
        }
    },


    /************************************HarmonicNumber**************************************
     * 5.harmonicNumber
     * *****************************
     * @purpose     : To generate Harmonic numbers to Accept value of "N" from user and prints 
     *                the Nth harmonic number for the user input.
     * @param       : To generate sum of harmonic numbers by accepting input from user
     * @function    : function Harmonic function takes user input and sum it number of times that 
     *                user given.
     ******************************************************************************************/

    isHarmonic(harmNum) {
        try {
            var sum = 0, i = 0;
            if (harmNum != 0) {
                for (i = 1; i <= harmNum; i++) {
                    sum += (1 / i);
                }
                console.log("Harmonic value of " + harmNum + " = " + sum);
            }
            else {
                console.log("Enter the correct number");
            }
        }
        catch (e) {
            console.log(e.message);
        }
    },


    /**************************************Factorial***************************************
     * 6.primeFactor
     * ****************************
     * @purpose     : To generate the prime factorials of N number using brute force.
     * @param       : Prints the factorials of a number by accepting the num as argument.
     * @function    : Traverse till i*i <= N instead of i <= N for efficiency and prints the 
     *                factorials for the given user input value.
     **************************************************************************************/

    findPrimeFactor(num) {
        try {
            var i;
            for (i = 2; i * i < num; i++) {
                while (num % i == 0) {
                    console.log(i);
                    num = num / i;
                }
            }
            if (num > 2) {
                console.log(num);
            }
        }
        catch (e) {
            console.log(e.message);
        }
    },


    /***************************************Gambler****************************************
     * 7.gambler
     * ******************************
     * @purpose     : Simulates a gambler who start with some initial stake amount and plays 
     *                fair one bets until he/she goes broke (i.e. has no money) or reach 
     *                goal(gains expected amount). Keeps track of the number of times he/she wins
     *                and the number of bets he/she makes. will run the experiment N times, 
     *                averages the results, and prints them out.
     * @param       : It accepts the stake and the goal amount from the user, where stake<goal and
     *                must be a number also it keeps track on the number of times he/she bets and 
     *                prints the percentage of win and loss and the number of wins.
     * @function    : Play till the gambler is broke or has won.
     ***************************************************************************************/

    playGambler(stake, goal, times) {
        try {
            var win = 0;
            var loss = 0;
            for (let i = 0; i < times; i++) {
                while (times > 0 && stake <= goal && stake > 0) {
                    if (Math.random() > 0.5) {
                        win++;
                        stake++;
                        times--;
                    }
                    else {
                        loss++;
                        stake--;
                        times--;
                    }
                }
            }
            var total = win + loss;
            var wp = (win / total) * 100;
            var lp = (loss / total) * 100;
            console.log("percentage of win = " + wp + "%");
            console.log("percentage of loss = " + lp + "%");
        }
        catch (e) {
            console.log(e.message);
        }
    },


    /************************************CouponNumbers***************************************
     * 8.couponNumber
     **********************************
     * @purpose     : Given N distinct Coupon Numbers, how many random numbers do you need to
     *                generate distinct coupon number? This program simulates this random process.
     * @param : To print the distinct numbers by accepting the N number from the user. 
     * @function    : repeatedly choose a random number and check whether it's a new one.
     *****************************************************************************************/

    findCouponNumber(num) {
        try {
            var arr = [];
            var count = 0;
            while (count < num) {
                var r = Math.round(Math.random() * 1000);
                if (!arr.includes(r)) {
                    arr.push(r);
                }
                count++;
            }
            console.log(arr);
            return count;
        }
        catch (e) {
            console.log(e.message);
        }
    },


    /***************************************2DArray***********************************************
     * 9.array
     * ********************************
     * @purpose     : To create 2 dimensional array in memory to read in M rows and N cols. 
     * @param       : It accepts rows, cols and the elements from the user and prints the output. 
     * @function    : A library for reading in 2D arrays of integers, doubles, or booleans 
    *                    from standard input and printing them out to standard output.
     ********************************************************************************************/

    getArray(row, column, read) {
        try {
            var arr = [];
            for (let i = 0; i < row; i++) {
                arr.push([])
                for (let j = 0; j < column; j++) {
                    var element = read.question("Enter the array elements = ");
                    arr[i][j] = element;
                }
            }
            console.log(arr);
        }
        catch (e) {
            console.log(e.message);
        }
    },

    /***************************************FindTriplets****************************************
     * 10.sumOf3Integers
     * ********************************
     * @purpose    : To find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0.
     * @param      : It accepts the number and the elements from the user and search for the distinct
     *               elements whose sum is equal to 0.
     * @function   : A program with cubic running time. Read in N integers and counts the  
     *               number of triples that sum to exactly 0 and print the distinct triplets.
     *********************************************************************************************/


    findSumOf3Integers(size) {
        try {
            var find = true;
            var arr = [];
            var count = 0;
            for (let i = 0; i < size; i++) {
                arr[i] = readline.question("Enter the elements : ");
            }
            console.log("Array elements are = " + arr);
            for (let i = 0; i < arr.length - 2; i++) {
                for (let j = i + 1; j < arr.length - 1; j++) {
                    for (let k = j + 1; k < arr.length; k++) {
                        if (Number(arr[i]) + Number(arr[j]) + Number(arr[k]) == 0) {
                            console.log((arr[i] + " " + arr[j]) + " " + arr[k]);
                            count++;
                            find = true;
                        }
                    }
                }
            }
            console.log(count);
            if (find == false) {
                console.log("Triplets does'nt exist");
            }
        }
        catch (e) {
            console.log(e.message);
        }
    },


    /***********************************Distance***************************************
     * 11.findDistance
     * ************************
     * @purpose     : To find the distance between two points.
     * @param       : To calculate the distance from the given point
     * @function    : To print the distance from the origin.
     **********************************************************************************/

    findDistance() {
        try {
            var x = process.argv[2];
            var y = process.argv[3];
            var d = Math.sqrt(x * x + y * y);
            console.log("Distance from the origin = " + d);
        }
        catch (e) {
            console.log(e.message)
        }
    },


    /****************************************stringPermutation***********************************
     * 12 stringPermutation
     * **********************************
     * @purpose     : To Check if the arrays returned by two string functions are equal. 
     * @param       : It accepts the input from the user and prints the permutations of the given string.
     * @function    : Functions to return all permutation of a String using iterative method 
     *                and Recursion method.
     ********************************************************************************************/


    getStringPermutation(string) {
        try {
            var res = [];
            if (string.length === 1) {
                res.push(string);
                return res;
            }
            for (var i = 0; i < string.length; i++) {
                var firstChar = string[i];
                var charsLeft = string.substring(0, i) + string.substring(i + 1);
                var innerPermutations = this.getStringPermutation(charsLeft);
                for (var j = 0; j < innerPermutations.length; j++) {
                    res.push(firstChar + innerPermutations[j]);
                }
            }
            return res;
        } catch (e) {
            console.log(e.message);
        }
    },



    /****************************************StopWatch*****************************************
     * 13.readTime
     * *****************************
     * @purpose     : To measure the elapsed time between start and end.
     * @param       : It accepts the input 0 to start the time and 1 to stop, then calculates the 
     *                average time and print the value.
     * @function    : A Stopwatch Program for measuring the time that elapses between the start 
     *                and end clicks then print the value.
    
     * *****************************************************************************************/

    getTime(read) {
        try {
            var starttime = read.question("Press enter to start");
            var start = new Date();
            var stoptime = read.question("Press enter to stop");
            var stop = new Date();
            var totalTime = stop - start;
            totalTime = totalTime / 1000;
            var seconds = Math.round(totalTime);
            console.log(seconds + "sec");
        }
        catch (e) {
            console.log(e.message);
        }
    },


    /***************************************TicTacToe***********************************************
     * 14.ticTac
     * **********************************
     * @purpose     : To play a Cross Game or Tic-Tac-Toe Game. Player 1 is the Computer and the
     *                Player 2 is the user. Player 1 take Random Cell that is the Column and Row. 
     * @param       : It accepts the input from the user and prints the result.
     * @function    : Sum the number of times the count of heads and tails,calculate the percentage.
     * *********************************************************************************************/


    intializeGame() {
        var game = [];
        for (let i = 0; i <= 2; i++) {
            game.push([]);
            for (let j = 0; j <= 2; j++)
                game[i][j] = '-';
        }
        return game;
    },

    random() {
        var value = Math.floor(Math.random() * 3);
        console.log(value + 1);
        return value;
    },

    mark(game, x, y, value) {
        if (game[x][y] == '-')
            game[x][y] = value;
        for (let i = 0; i <= 2; i++) {
            var print = [];
            for (let j = 0; j <= 2; j++)
                print[j] = game[i][j];
            console.log(print);
        }
        return game;
    }
    ,
    computerPlayer(game) {
        var arr;
        var flag = false;
        while (flag == false) {
            var x = this.random();
            var y = this.random();
            if (game[x][y] == '-') {
                arr = this.mark(game, x, y, 'O');
                flag = true;
            }
        }
        return game;
    }
    ,
    userPlayer(game) {
        var flag = false;
        while (flag == false) {
            console.log("Enter the row value:");
            let x = readline.questionInt('Enter the value of x within 1,2,3 : ') - 1;
            let y = readline.questionInt('Enter the value of y within 1,2,3 : ') - 1;
            if (game[x][y] == '-') {
                this.mark(game, x, y, 'X');
                flag = true;
            }
            else
                console.log("Please enter the correct choice");
        }
        return game;
    }
    ,
    check(game) {
        for (let i = 0; i <= 2; i++) {
            if (game[i][0] == game[i][1] && game[i][1] == game[i][2]) {
                if (game[i][0] == 'O' || game[i][0] == 'X') {
                    return true;
                }
            }
            if (game[0][i] == game[1][i] && game[1][i] == game[2][i]) {
                if (game[0][i] == 'O' || game[0][i] == 'X') {
                    return true;
                }
            }
        }
        var k = 0, l = 0;
        if (game[k][k] == game[k + 1][k + 1] && game[k + 1][k + 1] == game[k + 2][k + 2]) {
            if (game[0][0] == 'O' || game[0][0] == 'X') {
                return true;
            }
        }
        if (game[l][l + 2] == game[l + 1][l + 1] && game[l + 1][l + 1] == game[l + 2][l]) {
            if (game[0][0] == 'O' || game[0][0] == 'X') {
                return true;
            }
        }
        return false;
    },


    /******************************************Quadratic******************************************
    * 15.quadratic
    * ******************************
    * @purpose     : to find the roots of the equation a*x*x + b*x + c.
    * @param       : It accept the inputs from the user and find the roots for the given equation.
    * @function    : The roots of the equation can be found using a formula, delta = b*b - 4*a*c,
    *                Root 1 of x = (-b + sqrt(delta))/(2*a), Root 2 of x = (-b - sqrt(delta))/(2*a)
    *                and print the roots.
    **********************************************************************************************/

    isQuadratic(a, b, c) {
        try {
            var d = b * b - (4 * a * c);
            if (d == 0) {
                var d1 = -b / (2 * a);
                console.log(d1);
            }
            else if (d > 0) {
                var root1 = (-b + Math.sqrt(d)) / (2 * a);
                var root2 = (-b - Math.sqrt(d)) / (2 * a);
                console.log("Root1 = " + root1);
                console.log("Root2 = " + root2);

            }
            else if (d < 0) {
                var real = -b / (2 * a);
                var image = Math.sqrt(-d) / (2 * a);
                console.log("Root1 = " + real + "i" + image);
                console.log("Root2 = " + real + "-i" + image);
            }
            else {
                console.log("something went wrong");
            }
        }
        catch (e) {
            console.log(e.message);
        }
    },


    /******************************************WindChill*****************************************
     * 16.windChill
     * **************************
     * @purpose     : To find the temperature,wind speed and wind chill.
     * @param       : It accepts the input from the command line argument and calculates the windChill 
     *                by using National weather service formule.  
     * @function    : Given the temperature t (in Fahrenheit) and the wind speed v (in miles per hour), 
     *                the National Weather Service defines the effective temperature (the wind chill) 
     *                to be: w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16).
     ********************************************************************************************/


    findWindChill() {
        try {
            var temp = process.argv[2];
            var speed = process.argv[3];
            if (Math.abs(temp) < 50 && (speed < 120) && (speed > 3)) {
                var wind = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(speed, 0.16);
                console.log("Temperature = " + temp);
                console.log("Wind speed = " + speed);
                console.log("Wind chill = " + wind);
            }
            else {
                console.log("enter proper inputs");
            }
        }
        catch (e) {
            console.log(e.message);
        }
    },




    /**************************************************************************************************
                                           Algorithm Programs
    ***************************************************************************************************/

    /*****************************************Anagram*******************************************
     * 1.anagram
     * *****************************
     * @purpose     : Take 2 Strings as Input such abcd and dcba and Check for Anagrams.
     * @param       : To find whether given strings are anagrams.
     * @function    : One string is an anagram of another if the second is simply a rearrangement
     *                of the first.
     * *****************************************************************************************/


    isAnagram(s1, s2) {
        try {
            var format = /[a-zA-Z0-9]/;
            var result;
            if (format.test(s1) && format.test(s2)) {
                if (s1.length !== s2.length) {
                    result = false;
                }
                var sorts1 = s1.toString().split("").sort().join("");
                var sorts2 = s2.toString().split("").sort().join("");
                result = sorts1 === sorts2;
                if (result == true) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                console.log("enter only letters or alphabets");
            }
        }
        catch (e) {
            console.log(e.message);
        }
    },


    /************************************PrimeNumber*********************************************
     * 2.isPrime
     * *******************************
     * @purpose     : To find prime number in the given range.
     * @param       : It takes the input from the user and searches for the prime factors.
     * @function    : Takes a range of 0-1000 Numbers and find the Prime numbers in that range.
     *********************************************************************************************/

    isPrime(num) {
        try {
            if (num == 0 || num == 1)
                return false;
            for (let i = 2; i < num; i++) {
                if (num % i == 0)
                    return false;
            }
            return true;
        }
        catch (e) {
            console.log(e.message);
        }
    },

    findPrimeNumber() {
        try {
            console.log("Prime number must be in the range of 0-1000");
            for (let i = 0; i <= 1000; i++) {
                if (this.isPrime(i))
                    console.log(i);
            }
        }
        catch (e) {
            console.log(e.message);
        }
    },


    /**************************Anagram, Palindrome, PrimrNumber************************************
     * 3.isAnagramPalindrome
     * ****************************************
     * @purpose     : To find the numbers that are Anagram and Palindrome.
     * @param       : Extending the above program to find the prime numbers that are Anagram and Palindrome.
     * @function    : isNumberPalindrom function checks if the given 2 numbers are palindrome are not.
     *                isAnagramPalindrome function checks if the prime number is anagram and palindrome.
     **********************************************************************************************/

    isNumberPalindrome(n1) {
        try {
            var string = "";
            n1 = n1 + "";

            for (let i = 0; i < n1.length; i++) {
                string = n1.charAt(i) + string;
            }
            if (string == n1) {
                return true;
            }
            return false;
        }
        catch (e) {
            console.log(e.message);
        }
    },

    isAnagramPalindrome() {
        try {
            console.log("Prime number in the range 0-1000 which are anagram and palindrome ");
            var arr = [];
            for (let i = 0; i < 1000; i++) {
                if (this.isPrime(i)) {
                    arr.push(i);
                }
            }
            for (let i = 0; i < arr.length; i++) {
                for (let j = i + 1; j < arr.length; j++) {
                    if (this.isAnagram(arr[i], arr[j])) {
                        console.log(arr[i] + " and " + arr[j] + " are anagram");
                        if (this.isNumberPalindrome(arr[i])) {
                            console.log(arr[i] + "  is palindrome");
                        }
                        if (this.isNumberPalindrome(arr[j])) {
                            console.log(arr[j] + " is Palindrome");
                        }
                    }
                }
            }
        }
        catch (e) {
            console.log(e.message);
        }
    },


    /******************************************BinaryInteger*********************************************
     * 4.binarySearchInt
     * *****************************************
     * @purpose     : To print the binary number.
     * @param       : It accepts the input and searches for the given number.
     * @function    : A function to binary which accepts the input to find the number and print the result.
     **************************************************************************************************/


    binarySearchInt(arr1, search) {
        try {
            var first = 0;
            var last = arr1.length - 1;
            while (first <= last) {
                var mid = first + Math.floor((last - first) / 2);
                if (Number(arr1[mid] === search))
                    return true;
                else if (Number(arr1[mid]) < search)
                    first = mid + 1;
                else
                    last = mid - 1;
            }
            return false;
        }
        catch (e) {
            console.log(e.message);

        }
    },

    /******************************************BinaryString*********************************************
     * 4.binarySearchString
     * *****************************************
     * @purpose     : To print the binary string.
     * @param       : It accepts the input and searches for the given string from the file.
     * @function    : A function to binary which accepts the input to find the string and print the result.
     **************************************************************************************************/


    binarySearchStr(arr2, search) {
        try {
            arr2.sort();
            console.log(arr2);

            var first = 0;
            var last = arr2.length - 1;
            while (first <= last) {
                var mid = first + Math.floor((last - first) / 2);
                if ((arr2[mid] === search))
                    return true;
                else if ((arr2[mid]) < search)
                    first = mid + 1;
                else
                    last = mid - 1;
            }
            return false;
        }
        catch (e) {
            console.log(e.message);

        }
    },


    /*****************************************FindNumber********************************************
     * 5.findNumber
     * **********************************
     * @purpose     : Use Binary Search to find the number.
     * @param       : It accepts the command-line argument N,and finds the number using binary search.
     * @function    : Takes a command-line argument N, asks you to think of a number between 0 and N-1,
     *                where N = 2^n, and always guesses the answer with n questions, the Number N and 
     *                then recursively ask true/false if the number is between a high and low value
     ***********************************************************************************************/

    findNumber(low, high, read) {
        try {
            var mid = low + Math.floor((high - low) / 2);
            var k;
            if (low < high) {
                if (low == high - 1) {
                    k = read.question("Is the number " + low + " If yes press -> yes " + " If number is high press -> no " + " ");
                    if (k == "yes")
                        return low;
                    if (k == "no")
                        return high;
                }
                k = read.question("Is the number in the range " + mid + "-" + high + " If yes press yes else press no" + " ");
                if (k == "yes")
                    mid = this.findNumber(mid, high, read);
                if (k == "no")
                    mid = this.findNumber(low, mid - 1, read);
            }
            return mid;
        }
        catch (e) {
            console.log(e.message);
        }
    },

    /*****************************************SearchWord**********************************************
     * 15.searchWord
     * *********************************
     * @purpose     : To use Arrays to sort the word list and then to perform the binary search.
     * @param       : read in the list words comma separated from a File and then enter the word to be searched.
     * @function    : Read in a list of words from File. Then prompt the user to enter a word to 
     *                search the list. The program reports if the search word is found in the list.
     *                Print the result if the word is found or not.
     *
     *************************************************************************************************/

    searchWord() {
        try {
            var arr = [];
            var search = readline.question("Enter the word to search = ");
            const fs = require("fs");
            fs.readFile("searchSample.txt", (err, data) => {
                if (err)
                    throw err;
                arr = data.toLocaleString().split(",");
                console.log(this.binarySearchStr(arr, search));

            })

        }
        catch (e) {
            console.log(e.message);

        }
    },




    /******************************************InsertionSort******************************************
     * 7.insertionSort
     * *********************************
     * @purpose     : Use Insertion Sort to sort the words in the String array.
     * @param       : It accepts the input from the user and sort the array using insertion sort.
     * @function    : Reads in strings from standard input and prints them in sorted order.
     *                Uses insertion sort.
     * ***********************************************************************************************/

    getInsertionSort(size) {
        try {
            var arr = [];
            for (let i = 0; i < size; i++) {
                arr[i] = readline.question("Enter the elements = ");
            }
            for (let i = 1; i < arr.length; i++) {
                var c = arr[i];
                var j = i - 1
                while (j >= 0 && arr[j] > c) {
                    console.log(arr)
                    arr[j + 1] = arr[j]
                    j = j - 1
                }
                arr[j + 1] = c
            }
            console.log(arr)
        }
        catch (e) {
            console.log(e.message);
        }
    },



    /*******************************************BubbleSort*****************************************
     * 8.bubbleSort
     * ********************************
     * @purpose     : To print the sorted list.
     * @param       : It accepts the size and elements from the user and sort them.
     * @function    : Reads in integers prints them in sorted order using Bubble Sort.
     **********************************************************************************************/


    getBubbleSort(size) {
        try {
            var arr = [];
            for (let i = 0; i < size; i++) {
                arr[i] = readline.question("Enter the elements = ");
            }
            for (let a = 0; a < arr.length; a++) {
                for (let b = a + 1; b < arr.length; b++) {
                    if (arr[a] > arr[b]) {
                        var temp = arr[a];
                        arr[a] = arr[b];
                        arr[b] = temp;
                    }
                }
            }
            console.log("Sorted elements are = " + arr);
        }
        catch (e) {
            console.log(e.message);
        }
    },

    bubbleSort(size){
        for (let a = 0; a < size.length; a++) {
            for (let b = a + 1; b < size.length; b++) {
                if (size[a] > size[b]) {
                    var temp = size[a];
                    size[a] = size[b];
                    size[b] = temp;
                }
            }
        }
        return size;
       // console.log("  [  "+size +"  ]  " );
    },

    /*******************************************MergeSort***********************************************
     * 9.mergeSort
     * **************************************
     * @purpose      : To get merge Sort of list of Strings. 
     * @param        : It accepts the input from the user and prints the result.
     * @function     : To Merge Sort an array, we divide it into two halves, sort the two halves
     *                 independently, and then merge the results to sort the full array.
     *  
     **************************************************************************************************/

    mergeSort(res) {
        var n = res.length;
        if (n < 2) {
            return;
        } 
        var mid = Math.floor(n / 2);
        var left = [mid];
        var right = [n - mid];
        for (let i = 0; i < mid; i++) {
            left[i] = res[i];
        }
        for (let j = mid; j < n; j++) {
            right[j - mid] = res[j];
        } 
        this.mergeSort(left);
        this.mergeSort(right);
        this.merge(left, right, res);

    },

    merge(arr, brr, crr) {
        var i = 0; var j = 0;
        var k = 0;
        while (i < arr.length && j < brr.length) {
            if (arr[i] <= brr[j]) {
                crr[k] = arr[i]
                i++;
            }
            else {
                crr[k] = brr[j];
                j++;
            }
            k++;
        }
        while (i < arr.length) {
            crr[k] = arr[i];
            i++;
            k++;
        }
        while (j < brr.length) {
            crr[k] = brr[j];
            j++;
            k++;
        }
        return crr;
    },
    
    /*****************************************VendingMachine****************************************
     * 10.vendingMachine
     * ********************************
     * @purpose     : To calculate the minimum number of Notes as well as the 
     *                Notes to be returned by the Vending Machine as a Change.
     * @param       : It accepts the amount from the user and print the number of notes.
     * @function    : There is 1, 2, 5, 10, 50, 100, 500 and 2000 Rs Notes which can be 
     *               returned by Vending Machine and print the number of notes. 
     * *********************************************************************************************/


    findNumberOfNotes(arr, amount) {
        try {
            var notes = 0
            for (let i = 0; i < arr.length; i++) {
                if (amount / arr[i] >= 1) {
                    var c = Math.floor(amount / arr[i])
                    notes = notes + c
                    console.log(arr[i] + " notes are :" + c)
                    amount = amount % arr[i]
                }
            }
            console.log("total number of notes :" + notes)
        }
        catch (e) {
            console.log(e.message);

        }

    },

    /****************************************FindDay***********************************************
     * 11.dayOfWeek
     * ************************************
     * @purpose     : Function that takes a date as input and prints the day of the week.
     * @param       : program that takes three command-line arguments: m (month), d (day), and y (year),
     *                and prints the value.
     * @function    : Print the day of the week, using Gregorian calendar formulars.
     **********************************************************************************************/

    findDayOfWeek(day, month, year) {
        try {
            if (!isNaN(day, month, year) && (0 < day && day < 32) && (0 < month && month < 13) && (999 < year && year < 10000)) {
                var y0 = year - Math.floor((14 - month) / 12);
                var x = y0 + Math.floor((y0 / 4)) - Math.floor((y0 / 100)) + Math.floor((y0 / 400));
                var m0 = month + 12 * Math.floor((14 - month) / 12) - 2;
                var d0 = (day + x + Math.floor((31 * m0) / 12)) % 7;

                switch (d0) {
                    case 0: return "Sunday";
                    case 1: return "Monday";
                    case 2: return "Tuesday";
                    case 3: return "Wednesday";
                    case 4: return "Thrusday";
                    case 5: return "Friday";
                    case 6: return "Saturday";
                }
            }
            else {
                return "please enter the valid data";
            }
        }
        catch (e) {
            console.log(e.message);
        }
    },

    /*************************************TemperatureConversion**************************************
     * 12.temperatureConversion
     * *******************************
     * @purpose     : To convert the temperature into celsius or fahrenheit.
     * @param       : It accepts the temperature as input from the user and based on their choice,
     *                print the temperature in clesius or fahrenheit.
     * @function    : given the temperature in fahrenheit as input outputs the temperature in Celsius
     *                or viceversa using the formula.
     ************************************************************************************************/

    findTemperatureConversion() {
        try {
            var t = 0;
            var celsius = 0;
            var fahrenheit = 0;
            t = readline.question("Press 0 to get result in fahrenheit \nPress 1 to get result in celsius \nEnter your choice = ");
            if (t == 0) {
                celsius = readline.question("Enter the temperature = ");
                fahrenheit = (celsius * 9 / 5) + 32;
                console.log("Temperature in fahrenheit = " + fahrenheit);
            }
            else if (t == 1) {
                fahrenheit = readline.question("Enter the temperature = ");
                celsius = (fahrenheit - 32) * 5 / 9;
                console.log("Temperature in celsius = " + celsius);
            }
        }
        catch (e) {
            console.log(e.message);
        }
    },


    /****************************************MonthlyPayment******************************************
     * 13.monthlyPayment
     * *******************************
     * @purpose     : To calculate thye monthly payment.
     * @param       : It accepts the input from the command line argument and calculates the monthly 
     *                payment.
     * @function    : It reads in three command-line arguments P, Y, and R and calculates the monthly 
     *                payments you would have to make over Y years to pay off a P principal loan amount
     *                at R per cent interest compounded monthly
     * ***********************************************************************************************/


    findMonthlyPayment() {
        try {
            var Principal = process.argv[2];
            var Years = process.argv[3];
            var Rate = process.argv[4];
            var Payment = 0;
            var r = Rate / (12 * 100);
            var n = 12 * Years;
            Payment = (Principal * r) / (1 - Math.pow((1 + r), -n));
            console.log(Payment);
        }
        catch (e) {
            console.log(e.message);
        }
    },

    /****************************************SquareRoot******************************************
     * 14.squareRoot
     * *********************************
     * @purpose     : To compute the square root of a nonnegative number.
     * @param       : It accepts the number from the user and print the squareRoot.
     * @function    : initialize t = c, replace t with the average of c/t and t then repeat until 
     *                desired accuracy reached using condition Math.abs(t - c/t) > epsilon*t where 
     *                epsilon = 1e-15;
     **********************************************************************************************/

    findSquareRoot(num) {
        try {
            var format = /[0-9]/;
            if (format.test(num)) {

                var temp = num;
                var epsilon = 1e-15;
                while (Math.abs(temp - num / temp) > epsilon * temp) {
                    temp = (num / temp + temp) / 2;
                }
                console.log("Square root of a number = " + temp);
            }
            else {
                console.log("enter only numbers");
            }
        }
        catch (e) {
            console.log(e.message);
        }
    },


    /***************************************BinaryRepresentation************************************
     * 15.binaryNumber
     * *******************************
     * @purpose     : To print the binary number to the given number.
     * @param       : It accepts the number from the user and prints the value.
     * @function    : The function toBinary that outputs the binary (base 2) representation 
     *                of the decimal number typed as the input. It is based on decomposing the 
     *                number into a sum of powers of 2.
     * **********************************************************************************************/

    toBinary(num) {
        try {
            var temp = num;
            var string = "";
            while (num > .9) {
                var result = Math.floor(num % 2);
                string = result + string;
                num = num / 2;
            }
            console.log("Binary value of given number = " + string);
        }
        catch (e) {
            console.log(e.message);
        }
    },


    /******************************************SwapBinary*******************************************
     * 16.swapBinary
     * *************************************
     * @purpose     : To read an integer as an Input, convert to Binary using toBinary function.
     * @param       : It accepts the input from the user, swap it and prints the value.
     * @function    : A nibble is a four-bit aggregation, or half an octet. There are two nibbles in a byte.
     *                Given a byte, swap the two nibbles in it. For example 100 is to be represented as 
     *                01100100 in a byte (or 8 bits). The two nibbles are (0110) and (0100). If we swap the
     *                two nibbles, we get 01000110 which is 70 in decimal.
     ***********************************************************************************************/

    swapBinary(num) {
        var bin = this.toBinary(num)
        console.log(bin)
        while (bin.length < 8) {
            bin = 0 + bin;
        }
        console.log(bin);
        var st = bin.substring(4, 8) + bin.substring(0, 4)
        console.log(st)
        var arr = st.split("")
        var sum = 0
        console.log(arr)
        var c = 0;
        for (let i = arr.length - 1; i >= 0; i--) {
            var s = 2 ** c
            var s1 = arr[i] * s
            sum = sum + s1
            c++
        }
        console.log(10)
        var x = this.toBinary(sum)
        var arr2 = x.split("")
        var con = 0;
        for (let i = 0; i < arr2.length; i++) {
            if (arr2[i] == 1) {
                con++
            }
        }
        if (con == 1) {
            console.log("number is power of 2")
        }
        else
            console.log("not")
    },
}