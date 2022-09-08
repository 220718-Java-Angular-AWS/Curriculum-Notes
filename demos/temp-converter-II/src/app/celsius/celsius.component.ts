import { Component, OnInit } from '@angular/core';
import { ConverterService } from '../converter.service';


@Component({
  selector: 'app-celsius',
  templateUrl: './celsius.component.html',
  styleUrls: ['./celsius.component.css']
})
export class CelsiusComponent implements OnInit {

  converterService: ConverterService;

  constructor(converterService: ConverterService) {
    this.converterService = converterService;
  }

  ngOnInit(): void {
  }

  changeTemp(event: any) {
    console.log(event.target.value);
    this.converterService.convertCToF(event.target.value);

  }

}
