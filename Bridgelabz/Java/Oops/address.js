var read =require('readline-sync')
var file=require('fs')
var utility=require('../Oops/utilityOOPS')
class Person{
    constructor(fname,lname,city,state,nation,zip,phnum){
        this.Name=fname;
        this.LastName=lname;
        this.City=city;
        this.State=state;
        this.Nation=nation
        this.Zip=zip;
        this.PhoneNum=phnum;
    }
}  

class AddressBook{
    constructor(){}
    address(data){
        console.log('Enter 1 to add person information');
        console.log('Enter 2 to update person information');
        console.log('Enter 3 to remove person information');
        console.log('Enter 4 to sort the addressBook based on Zip');
        console.log('Enter 5 to sort the addressBook based on firstname');
        console.log('Enter 6 to print all addressBook information');
        var num=read.questionInt('select any number');
        switch(num){
            case 1: this.addPerson(data)
            break;
            case 2: this.updatePerson(data)
            break;
            case 3: this.removePerson(data)
            break;
            case 4: this.sortZip(data)
            break;
            case 5: this.sortfname(data)
            break;
            case 6: this.printAdd(data)
            break;
        }
    }
    addPerson(data){
        var fname=read.question('Enter firstname of person : ');
        var lname=read.question('Enter lastname of person : ');
        var city=read.question('Enter city of person : ');
        var state=read.question('Enter state of person : ');
        var phoneNumber=read.question('Enter PhoneNumber : ');
        var zip=read.question('Enter zip code');
        var o=new Person(fname,lname,city,state,phoneNumber);
        data.Person.push(
            {
                personfname : fname,
                personlname : lname,
                pphoneNumber : phoneNumber,
                pcity : city,
                pstate : state
                
            }
        )
        var d=file.writeFileSync('address.json',JSON.stringify(data))
    }
    upDatePerson(data){
        var name=read.question('Enter first name : ');
        for(let i=0;i<data.Person.length;i++){
            if(data.Person[i].personfname==name){
                var index=data.Person.indexOf(data.Person[i])
                console.log('select number to update the information');
                console.log('Enter 1 to update the first name');
                console.log('Enter 2 to update the last name');
                console.log('Enter 3 to update the phone number');
                console.log('Enter 4 to update the city');
                console.log('Enter 5 to update state');
                console.log('Enter 6 to update zip ');
                var num1=read.questionInt('Enter your number : ');
                switch(num1){
                    case 1 : this.firstname(data,index)
                    break;
                    case 2 : this.lastname(data,index)
                    break;
                    case 3 : this.phoneNumber(data,index)
                    break;
                    case 4 : this.city(data,index)
                    break;
                    case 5 : this.state(data,index)
                    break;
                    case 6 : this.zip(data,index)
                    break;
                }   
            }
        }
    }
    firstname(dat,index){
        var fname=read.question('Enter the name : ');
        data.Person[index].personfname=fname;
        var d=file.writeFileSync('address.json',JSON.stringify(data))
    }
    lastname(dat,index){
        var lname=read.question('Enter the name : ');
        data.Person[index].personlname=lname;
        var d=file.writeFileSync('address.json',JSON.stringify(data))
    }
    phoneNumber(dat,index){
        var fname=read.question('Enter the name : ');
        data.Person[index].pphoneNumber=phoneNumber;
        var d=file.writeFileSync('address.json',JSON.stringify(data))
    }
    city(dat,index){
        var city=read.question('Enter the name : ');
        data.Person[index].pcity=city;
        var d=file.writeFileSync('address.json',JSON.stringify(data))
    }
    state(dat,index){
        var state=read.question('Enter the name : ');
        data.Person[index].pstate=state;
        var d=file.writeFileSync('address.json',JSON.stringify(data))
    }
    zip(dat,index){
        var zip=read.question('Enter the name : ');
        data.Person[index].zip=zip;
        var d=file.writeFileSync('address.json',JSON.stringify(data))
    }
    removePerson(data){
        var name=read.question('Enter name of person to be removed')
        for(let i=0;i<data.Person.length;i++){
            if(data.Person[i].personfname==name)
            var index=data.Person.indexOf(data.Person[i]);
            var dd=data.Person.splice(index,1);
        }
        var d=file.writeFileSync('address.json',JSON.stringify(data));
    }
    sortFname(data){
        let fname=data.Person;
        function sortByFname(a,b){
            if(a.personfname==b.personfname);
            return 0;
           if(a.personfname>b.personfname);
            return 1;
            if(a.personfname<b.personfname);
            return -1;
        }
        var result=fname.sort(sortByFname);
        console.log(result);
    }
    sortZip(data){
        let refer=data.Person;
        function sortByZip(a,b){
            return(a.zip-b.zip);
        }
        var result=refer.sort(sortByZip);
        console.log(result);
        }
        printAdd(data){
            var person=data.Person;
            for(const key in person){
                console.log(person[key]);
                }
        }
}

module.exports=(Person,AddressBook)