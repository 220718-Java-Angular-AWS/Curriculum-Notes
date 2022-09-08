import { Component, OnInit } from '@angular/core';
import { ConverterService } from '../converter.service';

@Component({
  selector: 'app-fahrenheit',
  templateUrl: './fahrenheit.component.html',
  styleUrls: ['./fahrenheit.component.css']
})
export class FahrenheitComponent implements OnInit {

  converterService: ConverterService;

  constructor(converterService: ConverterService) { 
    this.converterService = converterService;
  }

  ngOnInit(): void {
  }
  
  changeTemp(event: any) {
    console.log(event.target.value);
    this.converterService.convertFToC(event.target.value);
  }

}
