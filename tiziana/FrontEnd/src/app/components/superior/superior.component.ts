import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-superior',
  templateUrl: './superior.component.html',
  styleUrls: ['./superior.component.css']
})
export class SuperiorComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }
login(){
  this.router.navigate(['/login'])
}
}
