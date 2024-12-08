import { Routes } from '@angular/router';
import { MenuComponent } from './menu/menu.component';
import { AddUserComponent } from './add-user/add-user.component';
import { AppComponent } from './app.component';
import { UserListComponentComponent } from './user-list-component/user-list-component.component';

export const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' }, 
  { path: 'home', component: MenuComponent },
  { path: 'add-member', component: AddUserComponent },
  {path: 'member-list', component: UserListComponentComponent},
  { path: '**', redirectTo: '/home' },                     
];
