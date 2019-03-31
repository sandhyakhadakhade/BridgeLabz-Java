
var file = require('fs')
var readline = require('readline-sync')


class Clinic
{
 getNameFromDoctor(object) 
 {
 var nameArray = []
 var data = object.Doctor
 for (let key in data) 
 {
 nameArray.push(data[key].Name)
 }
 return nameArray;
 }
 getIdFromDoctor(object) 
 { 
 var nameArray = []
 var data = object.Doctor
 for (let key in data) 
 {
 nameArray.push(data[key].Id)
 }
 return nameArray;
 }
getSpecialisationFromDoctor(object) 
{
 var nameArray = []
 var data = object.Doctor
 for (let key in data) 
 {
 nameArray.push(data[key].Specialisation)
 }
 return nameArray;
 }
getNameFromPatient(object) 
 {
 var nameArray = []
 var data = object.Patient
 for (let key in data) 
 {
 nameArray.push(data[key].Name)
 }
 return nameArray;
 }
 getIdFromPatient(object) 
 {
 var nameArray = []
 var data = object.Patient
 for (let key in data) 
 {
 nameArray.push(data[key].Id)
 }
 return nameArray;
 }
 getPhoneNumberFromPatient(object) 
 {
 var nameArray = []
 var data = object.Patient
 for (let key in data) 
 {
 nameArray.push(data[key].PhoneNumber)
 }
 return nameArray;
 }
showReport(data)
 {
 var c=Patient.length;
 console.log();
 console.log("PatientName DoctorName Appointment Taken on date ");
 console.log("---------------------------------------------------------------------------------");
 var data=file.readFileSync('ClinicNew.json');
 var object=JSON.parse(data)
 var doctor=data.Doctor
 var newarr=[];
 var count=Doctor.cnt;////
 var data = object.Patient
 for (let key in data) 
 {
 console.log(data[key].Name +" "+ data[key].AppointmentFrom +" "+data[key].OnTheDayOf);
 newarr.push( data[key].AppointmentFrom )
 }
console.log(count);

 console.log("-------------------------------------------------------------------------");
 }
}




class Doctor
{
    
 constructor()
 {
 }

 searchDoctor(data)
 {
    var cnt=0;///////
 var Doctor1=new Clinic;
 var doctor=data.Doctor
 var numbers=readline.questionInt("enter \n 1 to search Doctor by name \n 2 by ID \n 3 by Specialization: ")

 if(numbers==1)
 {
 console.log("the Doctor Names are :") 
 console.log(Doctor1.getNameFromDoctor(data));

 var name1=readline.question("Enter Doctor Name: ")
 for(const key in doctor)
 {
 if(doctor[key].Name==name1)
 {
 console.log("-----Your Doctor Information is--------");
 console.log(doctor[key]);
 console.log("-----------------------------------------");
 }
 }
 }

 if(numbers==2)
 {
 console.log("the Doctor ID's are :")
 console.log(Doctor1. getIdFromDoctor(data));
 var Id1=readline.question("Enter Doctor ID: ");
 for(const key in doctor)
 {
 if(doctor[key].Id==Id1)
 {
    //  cnt++;
    //  Doctor.push({
    //     "noOfPatient": cnt
    //  })
    // file.writeFileSync('ClinicNew.json', JSON.stringify(data))
 console.log("-----Your Doctor Information is--------");
 console.log(doctor[key]);
 console.log("-----------------------------------------");

 //return cnt+doctor[key];///////
 }
 }
 }

 if(numbers==3)
 {
 console.log("Doctors Specilization are :")
 console.log(Doctor1.getSpecialisationFromDoctor(data));
 
 var sp=readline.question("Enter Doctor Specilization: ")
 for(const key in doctor)
 {
 if(doctor[key].Specialisation==sp)
 {
 console.log("-----Your Doctor Information is--------");
 console.log(doctor[key]);
 console.log("-----------------------------------------");
 
 }
 }
 }

 }


 appointment(data)
 {
 var patient=data.Patient;
 var doctor=data.Doctor;
 var count=patient.length;
 var count;
 var Clinic1=new Clinic;
 count++;
 var date = new Date();
 if (count > 5)
 {
 var rem = Math.floor(count / 5)
 var day = (date.getDate()) + rem;
 }
 else 
 {
 var day = date.getDate()
 }
 var name = readline.question("Enter the patientname :")
 var age = readline.questionInt("Enter the age of the patient :")
 var Id = Math.floor(Math.random() * 100000)
 var PhoneNumber = readline.questionInt('Enter the phoneNumber :')
 while (PhoneNumber > 9999999999 || PhoneNumber < 999999999) {
 console.log("number should be of 10 digit")
 PhoneNumber = readline.questionInt('Enter valid phone number')
 }
 console.log("----------------Doctors available are------------")
 console.log(Clinic1.getNameFromDoctor(data))
 var appointmentFrom = readline.question('Enter the doctor name from you want to take appointment :')
 patient.push({
 "Name": name,
 "Id": Id,
 "PhoneNumber": PhoneNumber,
 "Age": age,
 "AppointmentFrom": appointmentFrom,
 "OnTheDayOf": day
//---------
 })
 file.writeFileSync('ClinicNew.json', JSON.stringify(data))
 console.log("Your appointment is confirmed on :" + day + "/" + date.getMonth())
 }
}

 class Patient
 {
 constructor()
 {}

 searchPatient(data)
 {
 var Patient1=new Clinic;
 var patient=data.Patient;
 var number1=readline.questionInt("Enter \n 1 to Search Patient by Name \n 2 by ID \n 3 by MobileNumber ")
 
 if(number1==1)
 {
 console.log("The Patients List");
 console.log(Patient1.getNameFromPatient(data))
 
 var name1=readline.question("Enter Patient Name: ")
 for(const key in patient)
 {
 if(patient[key].Name==name1)
 {
 console.log("-----------Your Patient Information is-----------");
 console.log((patient[key]));
 console.log("--------------------------------------------------");
 
 }
 }
 }
 if(number1==2)
 {
 console.log("The Patients ID are :");
 console.log(Patient1.getIdFromPatient(data) );
 var Id1=readline.question("Enter Patient ID: ")
 for(const key in patient)
 {
 if(patient[key].Id==Id1)
 {
 console.log("-----------Your Patient Information is-----------");
 console.log(patient[key]);
 console.log("---------------------------------------------------");
 }
 }
 }
 if(number1==3)
 {
 console.log("The Patient PhoneNumbers are: ");
 console.log(Patient1.getPhoneNumberFromPatient(data));
 var phoneNumber1=readline.question("Enter Patient MobileNumber: ")
 for(const key in patient)
 {
 if(patient[key].PhoneNumber==phoneNumber1)
 {
 console.log("-----------Your Patient Information is-----------");
 console.log(patient[key]);
 console.log("---------------------------------------------------");
 }
 }
 }
 }
 }


module.exports={Clinic,Doctor,Patient}

