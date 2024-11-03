import { Component } from '@angular/core';
import {MatTabsModule} from '@angular/material/tabs'

@Component({
    moduleId: module.id,
    selector: 'navigation',
    templateUrl: 'navigation.component.html',
    styleUrls: ['navigation.component.scss'],
    standalone: true,
    imports:  [MatTabsModule]
})
export class NavigationComponent {

}
