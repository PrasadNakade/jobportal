import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { AppComponent } from '../app.component';

@Component({
  selector: 'app-recuiterregister',
  templateUrl: './recuiterregister.component.html',
  styleUrl: './recuiterregister.component.css'
})
export class RecuiterregisterComponent {


  constructor(public http:HttpClient,public app:AppComponent){}

  name:string=''
  email:string=''
  mobile:number=0
  


  onRegister()
  {
    let obj={
      "name":this.name,
      "email":this.email,
      "mobile":this.mobile,
    
    }

    let url=this.app.baseUrl+"recReg"
    this.http.post(url,obj).subscribe((data:any)=>{
      if(data==1)
        window.alert("Please Enter Name")
      else if(data==2)
        window.alert("Please Enter Email")
      else if(data==3)
        window.alert("Please Enter Valid Mobile Number")
      else
      window.alert("Register SuccessFul")
    
    })
  }
}
