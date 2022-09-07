import { Component, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
    console.log("ngOnInit()");
  }

  ngOnChanges() {
    console.log("ngOnChanges()");
  }

  ngDoCheck() {
    console.log("doCheck()");
  }
  ngAfterContentInit() {
    console.log("ngAfterContentInit()");
  }

  ngAfterContentChecked() {
    console.log("ngAfterContentChecked()");
  }

  ngAfterViewInit() {
    console.log("ngAfterViewInit()");
  }

  ngAfterViewChecked() {
    console.log("ngAfterViewChecked()");
  }

  ngOnDestroy() {
    console.log("ngOnDestroy()");
  }

  num: number = 0;

}
