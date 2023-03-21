import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdprodComponent } from './updprod.component';

describe('UpdprodComponent', () => {
  let component: UpdprodComponent;
  let fixture: ComponentFixture<UpdprodComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdprodComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UpdprodComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
