import { Component, OnInit, NgModule } from '@angular/core';

@Component({
  selector: 'app-converter',
  templateUrl: './converter.component.html',
  styleUrls: ['./converter.component.css']
})
export class ConverterComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  convertCToF() {
    this.fahrenheitTemp = this.celsiusTemp * (1.8) + 32;
  }

  convertFToC() {
    this.celsiusTemp = (this.fahrenheitTemp - 32) / (1.8);
  }


  fahrenheitTemp: number = 212;
  celsiusTemp: number = 100;

}
