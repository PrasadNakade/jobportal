import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { AppComponent } from '../app.component';

@Component({
  selector: 'app-recuiterdashboard',
  templateUrl: './recuiterdashboard.component.html',
  styleUrl: './recuiterdashboard.component.css'
})
export class RecuiterdashboardComponent {


  constructor(public http:HttpClient,public app:AppComponent){}


  whatToShow=0;


  changeWhatToShow(num:number)
  {
    this.whatToShow=num
  }
}
