import { Component } from '@angular/core';
import { AppComponent } from '../app.component';

@Component({
  selector: 'app-jobdashboard',
  templateUrl: './jobdashboard.component.html',
  styleUrl: './jobdashboard.component.css'
})
export class JobdashboardComponent {

  whatToShow=0;

  constructor(public app:AppComponent){}

  StudentName:String=this.app.name

  user:any=this.app.userId;

  changeWhatToShow(num:number)
  {
    this.whatToShow=num


  }
}
