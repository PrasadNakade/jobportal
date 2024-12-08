import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'jobportal';

  userId:number=0   //user id gets after login and these property is same for recuiter userid as well as student user id
  name:String=''
  recuiterName:String=''

  baseUrl="http://localhost:8080/"
}
