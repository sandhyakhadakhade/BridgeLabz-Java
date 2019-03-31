var util=require('../Oops/oopsUtility');
var file=require('fs');
var read=require('readline-sync');
var data=file.readFileSync('cliniquemanagement.json','utf8');
var object=JSON.parse(data);
var p=new util.Patient;
var p1=new util.Doctors;
console.log("Enter 1 to search Patients");
console.log("Enter 2 to search Doctors");
console.log("Enter 3 to take appointment");
var number=read.questionInt("choose a number: ");

if(number==1)
{
    p.searchpatient(object)
}
if(number==2)
{
    p1.searchDoctor(object)
}
if(number==3)
{
    p1.appointment(object)
}


	
	
    



