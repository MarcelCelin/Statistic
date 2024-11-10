import {Routes} from '@angular/router';
import { NavigationComponent } from 'src/navigation/navigation.component';
import { AddUserComponent } from './add-user/add-user.component';
import { provideRouter } from '@angular/router';

export const routes = [
    {path: 'add-user', component:AddUserComponent },
{path: 'users', component: NavigationComponent },
];