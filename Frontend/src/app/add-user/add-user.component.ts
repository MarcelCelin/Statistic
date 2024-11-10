import { Component } from '@angular/core';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import { MatTabsModule } from '@angular/material/tabs';
import { MatButtonModule } from '@angular/material/button';
import { MatRadioModule } from '@angular/material/radio';
import {
  FormBuilder,
  FormControl,
  FormGroup,
  ReactiveFormsModule,
} from '@angular/forms';

@Component({
  selector: 'app-add-user',
  standalone: true,
  imports: [MatFormFieldModule, MatInputModule,   MatTabsModule,
    MatButtonModule,
    MatFormFieldModule,
    MatInputModule,
    MatRadioModule,
    ReactiveFormsModule],
  templateUrl: './add-user.component.html',
  styleUrl: './add-user.component.css'
})
export class AddUserComponent {
  form: FormGroup;
  constructor(private formBuilderGroup: FormBuilder) {
    this.form = this.formBuilderGroup.group({
      nom: new FormControl(''),
      prenom: new FormControl(''),
      sex: new FormControl(''),
      'date-de-naissance': new FormControl(''),
      email: new FormControl(''),
      'numero-de-tel': new FormControl(''),
      profession: new FormControl(''),
      situation: new FormControl(''),
    });
  }

  onSubmit() {
    console.log('test output', this.form?.value);
  }
}
