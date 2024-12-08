import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RecuiterregisterComponent } from './recuiterregister/recuiterregister.component';
import { RecuiterloginComponent } from './recuiterlogin/recuiterlogin.component';
import { StudentregisterComponent } from './studentregister/studentregister.component';
import { StudentloginComponent } from './studentlogin/studentlogin.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { JobdashboardComponent } from './jobdashboard/jobdashboard.component';
import { ReactiveFormsModule } from '@angular/forms';
import { PersonaldataComponent } from './jobdashboard/personaldata/personaldata.component';
import { DriveapplyComponent } from './jobdashboard/driveapply/driveapply.component';

import { CompanydataComponent } from './recuiterdashboard/companydata/companydata.component';
import { AdddrivesComponent } from './recuiterdashboard/adddrives/adddrives.component';
import { RecuiterdashboardComponent } from './recuiterdashboard/recuiterdashboard.component';

@NgModule({
  declarations: [
    AppComponent,
    RecuiterregisterComponent,
    RecuiterloginComponent,
    StudentregisterComponent,
    StudentloginComponent,
    WelcomeComponent,
    JobdashboardComponent,
    PersonaldataComponent,
    DriveapplyComponent,
    CompanydataComponent,
    AdddrivesComponent,
    RecuiterdashboardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
