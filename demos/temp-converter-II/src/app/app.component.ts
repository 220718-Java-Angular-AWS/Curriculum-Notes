import { Component } from '@angular/core';
import { ConverterService } from './converter.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'temp-converter-II';
  _converter: ConverterService;

  constructor(converter: ConverterService) {
    this._converter = converter;
  }

  test() {
    this._converter.test();
    console.log("This is the component - ", this._converter.thing);
  }
}
