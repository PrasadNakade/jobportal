import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { AppComponent } from '../../app.component';
import { JobdashboardComponent } from '../../jobdashboard/jobdashboard.component';

@Component({
  selector: 'app-companydata',
  templateUrl: './companydata.component.html',
  styleUrl: './companydata.component.css'
})
export class CompanydataComponent {


  companyName:any=''
  address:any=''
  numberOfEmployees:any=''
  companyContactDetails:any=''
  recuiter:any={}


  constructor(public http:HttpClient,public app:AppComponent){
    this.getAllRecuiterData();
   
  }

  getAllRecuiterData()
  {
    let url=this.app.baseUrl+'getAllRecuiterData'+this.app.userId
    this.http.get(url).subscribe((res:any)=>{
      this.recuiter=res
    })
  }



  updateRecuiterDataToServer(){
    let obj={
      companyName:this.recuiter.companyName,
      address:this.recuiter.address,
      numberOfEmployees:this.recuiter.numberOfEmployees,
      companyContactDetails:this.recuiter.companyContactDetails, 
    }
      let url=this.app.baseUrl+'updateRecuiterataToServer'+this.app.userId  //userId -- kontya user cha personal data
      this.http.post(url,obj).subscribe((res:any)=>{

        if(res==null || !res)
          window.alert("something is wrong")
        else
          window.alert("done")

      })
    }
  }




