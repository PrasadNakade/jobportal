import { Component } from '@angular/core';
import { AppComponent } from '../app.component';
import { HttpClient } from '@angular/common/http';
import { JobdashboardComponent } from '../jobdashboard/jobdashboard.component';
import {FormBuilder,FormGroup,Validators} from '@angular/forms'

@Component({
  selector: 'app-studentlogin',
  templateUrl: './studentlogin.component.html',
  styleUrl: './studentlogin.component.css'
})
export class StudentloginComponent {


  constructor(private app:AppComponent, private http: HttpClient,private fb: FormBuilder){

    this.loginForm = this.fb.group({
      username: ['', Validators.required], // Just check if it's filled
      password: ['', [Validators.required, Validators.minLength(6)]]
    });
  }

  loginForm: FormGroup;
  username:string=''
  password:string=''
  whatToShow:number=0

  login(value:number)
  {
    let arr=[
      this.username,
      this.password
    ]
    let url=this.app.baseUrl+'login'
    this.http.post(url,arr).subscribe((data:any)=>{

      if(data.status==-1 )
        window.alert("Invalid username format")
      else if(data.status==-2)
        window.alert("data does not exist")
      else if(data.status==-3)
        window.alert("Invalid password")
      else
      {
        this.app.userId=data.userId;
        this.app.name=data.name;
        console.log(data.name)
        console.log(data.userId);
        this.whatToShow=value; 
        window.alert("login sucessful")
      }
      // else
      // window.alert("something is wrong")
        
    })

  
  }
  
}
