import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { AppComponent } from '../app.component';

@Component({
  selector: 'app-recuiterlogin',
  templateUrl: './recuiterlogin.component.html',
  styleUrl: './recuiterlogin.component.css'
})
export class RecuiterloginComponent {



  
  constructor(private app:AppComponent, private http: HttpClient){}



  username:string=''
  password:string=''
  whatToShow:number=0

  login(value:number)
  {
    let arr=[
      this.username,
      this.password
    ]
    let url=this.app.baseUrl+'recuiterLogin'
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
        this.app.recuiterName=data.name;
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


