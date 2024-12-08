import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { WelcomeComponent } from './welcome/welcome.component';
import { StudentloginComponent } from './studentlogin/studentlogin.component';
import { RecuiterloginComponent } from './recuiterlogin/recuiterlogin.component';
import { StudentregisterComponent } from './studentregister/studentregister.component';
import { RecuiterregisterComponent } from './recuiterregister/recuiterregister.component';
import { JobdashboardComponent } from './jobdashboard/jobdashboard.component';

const routes: Routes = [

  {path:'',component:WelcomeComponent},
  {path:"studentlogin", component:StudentloginComponent},
  {path:"recruiterlogin",component:RecuiterloginComponent},
  {path:"stdreg",component:StudentregisterComponent},
  {path:"recreg",component:RecuiterregisterComponent},
  {path:"dashboard",component:JobdashboardComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
