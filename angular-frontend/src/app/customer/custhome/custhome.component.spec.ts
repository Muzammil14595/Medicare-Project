import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CusthomeComponent } from './custhome.component';

describe('CusthomeComponent', () => {
  let component: CusthomeComponent;
  let fixture: ComponentFixture<CusthomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CusthomeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CusthomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
