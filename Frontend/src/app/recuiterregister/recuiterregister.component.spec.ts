import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RecuiterregisterComponent } from './recuiterregister.component';

describe('RecuiterregisterComponent', () => {
  let component: RecuiterregisterComponent;
  let fixture: ComponentFixture<RecuiterregisterComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [RecuiterregisterComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(RecuiterregisterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
