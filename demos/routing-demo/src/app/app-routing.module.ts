import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component';
import { LinkGuardGuard } from './link-guard.guard';

const routes: Routes = [
  { path: "first", component: FirstComponent, canActivate: [LinkGuardGuard] },
  { path: "second", component: SecondComponent, canActivate: [LinkGuardGuard] }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
