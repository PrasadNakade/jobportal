import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdddrivesComponent } from './adddrives.component';

describe('AdddrivesComponent', () => {
  let component: AdddrivesComponent;
  let fixture: ComponentFixture<AdddrivesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AdddrivesComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AdddrivesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
