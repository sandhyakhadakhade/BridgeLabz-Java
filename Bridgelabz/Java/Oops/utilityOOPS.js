
var read = require('readline-sync')
var file = require('fs')


class Card
{
    constructor(rank,suit)
    {
        this.rank=rank;
        this.suit=suit;
    }
}




class Deck 
{
    constructor()
    {
        this.suit = ["♣️", "🔸", "❤️", "♠️"];
        this.rank = ['2', '3', '4', '5', '6', '7', '8', '9', '10', "jack", "queen", "king", "ace"];
    }
    createDeck()
    {
        var cardarr = [];
        for (let i = 0; i < this.suit.length; i++) 
        {
            for (let j = 0; j < this.rank.length; j++) 
            {
                cardarr.push(new Card(this.rank[j],this.suit[i]));
            }
        }
        return cardarr;
        
    }


    printCard(Card)
    {
        return ""+Card.rank+Card.suit;
    }


    shuffle(cardarr)
    {
        var cards = this.suit.length * this.rank.length;
        for (let i = 0; i < cards; i++) 
        {
            var num = Math.floor(Math.random() * cards);
            var temp = cardarr[i];
            cardarr[i] = cardarr[num];
            cardarr[num] = temp;
        }
        return cardarr;
    }
        
}

class StockPortFolio
{
    showresult()
    {
        var UtilityOops=require('../Oops/oopsUtility');
        var fileread=require('fs');
        var input=fileread.readFileSync('StockReport.json','utf8');
        var object=JSON.parse(input);
        var totalStock=0;
        var stock=object.StockReport;

    for(let i in stock)
    {   
    var name=stock[i].stockname;
    var numberofshare=stock[i].numberofshare;
    var shareprice=stock[i].shareprice;
    var total=numberofshare * shareprice;
    console.log("The Total Value Of","[",stock[i].stockname,"]","Share Is",stock[i].numberofshare * stock[i].shareprice);
    totalStock=totalStock+total;
    i=new UtilityOops.Stock(name,numberofshare,shareprice);
    //var d=i.shareprice();
    }
console.log("\n"+"Value Of Total Stocks: "+totalStock);
    }
}

var read = require("readline-sync");
var file = require("fs");
var accessDs = require("../utility/utilityDataStructure");
class CompanySharesQueue 
{
    constructor() 
    {
        this.Queue = new accessDs.LinledListQueue;
        try {
            this.data = JSON.parse(
                file.readFileSync("CompanySharesQueue.json")
            );
            console.log(this.data);

            for (let j = 0; j < this.data.company.length; j++) {
                this.Queue.enQueue(this.data.company[j]);
            }
        } catch (err) {
            console.log("File not found");
        }
    }
    
    addTolist() {
        console.log(this.Queue.printShares());
        var flag = false;
        do {
            var name = read.question("Enter the name want to add : ");
            var symbol = read.question("Enter the symbol");
            if (!isNaN(name) || !isNaN(symbol)) {
                console.log("Please enter alphabetics only ......!");
            } else {
                flag = true;
            }
        } while (!flag);
        var share = read.questionInt("Enter the share :");
        var price = read.questionInt("Enter the price :");
        var d=new Date();
        var date=d.toString();
        this.Queue.enQueue({
            name: name,
            symbol: symbol,
            share: share,
            price: price,
            date: date
        });
        console.log("Elements after adding to the list :");
        console.log(this.Queue.printShares());
    }
    removeFromList() {
        console.log(this.Queue.printShares());
        var company = read.question("Enter company name or symbol: ");
        this.Queue.removeStock(company);
        console.log(this.Queue.printShares());
    }
    print() {
        console.log(this.Queue.printShares());
    }
    writeList() {
         file.writeFileSync(
            "CompanySharesQueue1.json",
            JSON.stringify(this.Queue.printShares()),
            function (err) {
                if (err) {
                    throw err;
                }
            }
        );
    }
}

module.exports ={Card,Deck,StockPortFolio,CompanySharesQueue}


