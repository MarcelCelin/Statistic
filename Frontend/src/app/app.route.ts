import { Routes } from '@angular/router';
import { MenuComponent } from './menu/menu.component';
import { AddUserComponent } from './add-user/add-user.component';
import { AppComponent } from './app.component';

export const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' }, 
  { path: 'home', component: MenuComponent },
  { path: 'add-member', component: AddUserComponent },
  { path: '**', redirectTo: '/home' },                     
];
