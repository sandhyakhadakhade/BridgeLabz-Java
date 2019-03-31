var util=require('../Oops/address');
var file=require('fs');
var data1=file.readFileSync('address.json','utf8');
var data=JSON.parse(data1);
var object=new util.address;
object.address(data);