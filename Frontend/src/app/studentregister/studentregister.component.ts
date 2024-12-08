import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { AppComponent } from '../app.component';

@Component({
  selector: 'app-studentregister',
  templateUrl: './studentregister.component.html',
  styleUrl: './studentregister.component.css'
})
export class StudentregisterComponent {

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

    let url=this.app.baseUrl+"StudReg"
    this.http.post(url,obj).subscribe((data:any)=>{
      if(data==1)
        window.alert("Please Enter Name")
      else if(data==2)
        window.alert("Please Enter Email")
      else if(data==3)
        window.alert("Please Enter Valid Mobile Number")
      else{
      window.alert("Register SuccessFul")
        // this.stud.whatToShow==0
      
    }
    })
  }
}
