import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DriveapplyComponent } from './driveapply.component';

describe('DriveapplyComponent', () => {
  let component: DriveapplyComponent;
  let fixture: ComponentFixture<DriveapplyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [DriveapplyComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(DriveapplyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
