import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';

@Component({
    moduleId: module.id,
    standalone:true,
    imports:[RouterModule],
    selector: 'menu',
    templateUrl: 'menu.component.html',
    styleUrls: ['menu.component.scss']
})
export class MenuComponent {

}
