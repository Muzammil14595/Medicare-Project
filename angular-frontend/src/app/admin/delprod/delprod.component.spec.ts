import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DelprodComponent } from './delprod.component';

describe('DelprodComponent', () => {
  let component: DelprodComponent;
  let fixture: ComponentFixture<DelprodComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DelprodComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DelprodComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
