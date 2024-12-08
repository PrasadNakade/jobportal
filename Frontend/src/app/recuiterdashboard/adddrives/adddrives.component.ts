import { Component } from '@angular/core';
import { AppComponent } from '../../app.component';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-adddrives',
  templateUrl: './adddrives.component.html',
  styleUrls: ['./adddrives.component.css']
})
export class AdddrivesComponent {

  constructor(public app:AppComponent, public http: HttpClient){}

  drive = { name: '', date: '', description: '' }; // Model for a single drive
  newDrives: any[] = []; // Array to store multiple drives

  // Method to add a drive
  addDrive() {
    if (this.drive.name && this.drive.date && this.drive.description) {
      this.newDrives.push({ ...this.drive }); // Add a copy of the drive object
      this.drive = { name: '', date: '', description: '' }; // Reset form fields
    } else {
      alert('Please fill all fields!');
    }
  }

  // Method to save to backend (mock)
  saveDrives() {
    console.log('Drives to save:', this.newDrives);
    // Use an HTTP service here to send the `newDrives` array to the backend.
    let url=this.app.baseUrl+'savingRecuiterDrives'
    this.http.post(url,this.newDrives).subscribe((res:any)=>{

      if(res==1)
      {
        window.alert("")
      }else
      {
        window.alert("sucess")
      }
    })
  
  }
}
