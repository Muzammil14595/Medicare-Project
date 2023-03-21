import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DelcatComponent } from './delcat.component';

describe('DelcatComponent', () => {
  let component: DelcatComponent;
  let fixture: ComponentFixture<DelcatComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DelcatComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DelcatComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
