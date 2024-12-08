import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RecuiterloginComponent } from './recuiterlogin.component';

describe('RecuiterloginComponent', () => {
  let component: RecuiterloginComponent;
  let fixture: ComponentFixture<RecuiterloginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [RecuiterloginComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(RecuiterloginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
