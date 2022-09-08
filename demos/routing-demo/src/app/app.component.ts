import { Component } from '@angular/core';
import { AuthServiceService } from './auth-service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'routing-demo';

  authService: AuthServiceService;

  constructor(authService: AuthServiceService) {
    this.authService = authService;
  }

  login() {
    this.authService.login();
  }

  logout() {
    this.authService.logout();
  }


}
