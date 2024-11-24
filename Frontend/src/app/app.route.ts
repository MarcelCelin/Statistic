import { Routes } from '@angular/router';
import { MenuComponent } from './menu/menu.component';
import { AddUserComponent } from './add-user/add-user.component';

export const routes: Routes = [
  { path: '', redirectTo: '/menu', pathMatch: 'full' }, 
  { path: 'menu', component: MenuComponent },
  { path: 'add-member', component: AddUserComponent },
  { path: '**', redirectTo: '/menu' },                     
];
