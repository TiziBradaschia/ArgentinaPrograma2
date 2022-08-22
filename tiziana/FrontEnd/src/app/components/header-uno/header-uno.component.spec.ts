import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HeaderUnoComponent } from './header-uno.component';

describe('HeaderUnoComponent', () => {
  let component: HeaderUnoComponent;
  let fixture: ComponentFixture<HeaderUnoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HeaderUnoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HeaderUnoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
