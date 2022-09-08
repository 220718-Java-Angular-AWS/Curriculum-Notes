import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FahrenheitComponent } from './fahrenheit/fahrenheit.component';
import { CelsiusComponent } from './celsius/celsius.component';

@NgModule({
  declarations: [
    AppComponent,
    FahrenheitComponent,
    CelsiusComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
