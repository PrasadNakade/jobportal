import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { AppComponent } from '../../app.component';
import { JobdashboardComponent } from '../jobdashboard.component';

@Component({
  selector: 'app-personaldata',
  templateUrl: './personaldata.component.html',
  styleUrl: './personaldata.component.css'
})
export class PersonaldataComponent {

  per10:any=''
  per12:any=''
  perGrad:any=''
  year10:any=''
  year12:any=''
  yearGrad:any=''
  birthDate:any=''

  user:any={}

  constructor(public http:HttpClient,public app:AppComponent, public jd:JobdashboardComponent){

    this.getExistingData();
 
  }

  getExistingData(){
    
    let url=this.app.baseUrl+'getPersonalExistingData'+this.app.userId
     this.http.get(url).subscribe((res:any)=>{
       this.user=res
     })
 
   }



  updateDataToServer(){
    let obj={
      per10:this.user.per10,
      per12:this.user.per12,
      perGrad:this.user.perGrad,
      year10:this.user.year10,
      year12:this.user.year12,
      yearGrad:this.user.yearGrad,
      birthDate:this.user.birthDate
    }
      let url=this.app.baseUrl+'updateStudentDataToServer'+this.app.userId  //userId -- kontya user cha personal data
      this.http.post(url,obj).subscribe((res:any)=>{

        if(res==null || !res)
          window.alert("something is wrong")
        else
          window.alert("done")

      })
    }
  }



