var D=require('../Oops/clinicU');
var file=require('fs');
var read=require('readline-sync');

var data=file.readFileSync('ClinicNew.json');
var object=JSON.parse(data)

var patient=new D.Patient;
var doctor=new D.Doctor;
var clinic=new D.Clinic;
console.log("-----Clinique Management-----\n");

console.log("Enter 1 to Search for Doctors");
console.log("Enter 2 to Search for Patients");
console.log("Enter 3 to take Appointment from Doctors");
console.log("Enter 4 for Appointment Details");
console.log("Enter 5 to Exit");

var number=read.question("Enter your Choice: ");




if(number==1)
{
 doctor.searchDoctor(object)
}

if(number==2)
{
 patient.searchPatient(object)
}

if(number==3)
{
 doctor.appointment(object)
}

if(number==4)
{
 clinic.showReport(object)
}
if(number==5)
{
 console.log("Exiting the Program...!")
}