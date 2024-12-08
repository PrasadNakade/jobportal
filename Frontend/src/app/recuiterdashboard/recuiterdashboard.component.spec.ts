import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RecuiterdashboardComponent } from './recuiterdashboard.component';

describe('RecuiterdashboardComponent', () => {
  let component: RecuiterdashboardComponent;
  let fixture: ComponentFixture<RecuiterdashboardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [RecuiterdashboardComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(RecuiterdashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
