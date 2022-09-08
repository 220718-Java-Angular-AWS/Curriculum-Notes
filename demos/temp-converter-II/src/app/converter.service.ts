import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ConverterService {

  constructor() { }

  thing = "this is a thing";

  test(): void {
    console.log("This is the service method test().");
  }


  celsiusTemp: number = 0;
  fahrenheitTemp: number = 32;

  convertCToF(tempC: number) {
    // c(9/5)+32 = t
    this.celsiusTemp = tempC;
    this.fahrenheitTemp = tempC * 1.8 + 32;
  }

  convertFToC(tempF: number) {
    this.fahrenheitTemp = tempF;
    this.celsiusTemp = (tempF - 32) / 1.8;
  }




}
