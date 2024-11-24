import { ChangeDetectionStrategy, Component, inject } from '@angular/core';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatTabsModule } from '@angular/material/tabs';
import { MatButtonModule } from '@angular/material/button';
import {MatSelectModule} from '@angular/material/select';
import {
  FormBuilder,
  FormControl,
  FormGroup,
  ReactiveFormsModule,
} from '@angular/forms';
import { MemberService } from '../Service/memberService';
import { provideNativeDateAdapter } from '@angular/material/core';
import {MatDatepickerModule} from '@angular/material/datepicker';
import { Member } from '../Model/memberModel';

@Component({
  selector: 'app-add-user',
  standalone: true,
  imports: [
    MatFormFieldModule,
    MatInputModule,
    MatTabsModule,
    MatButtonModule,
    MatFormFieldModule,
    MatInputModule,
    MatSelectModule,
    ReactiveFormsModule,
    MatDatepickerModule,
  ],
  changeDetection: ChangeDetectionStrategy.OnPush,
  providers: [MemberService,provideNativeDateAdapter()],
  templateUrl: './add-user.component.html',
  styleUrl: './add-user.component.css',
})
export class AddUserComponent {
  memberService = inject(MemberService);
  form: FormGroup;
  readonly maxDate = new Date(Date.now());
  constructor(private formBuilderGroup: FormBuilder) {
    this.form = this.formBuilderGroup.group({

      nom: new FormControl(''),
      prenom: new FormControl(''),
      sex: new FormControl(''),
      dateDeNaissance: new FormControl(''),
      email: new FormControl(''),
      numeroDeTel: new FormControl(''),
      profession: new FormControl(''),
      situation: new FormControl(''),
      adresse:new FormControl('')
    });
  }

  addMember(member: Member) {
    this.memberService.addMember(member).subscribe({
      next: (data) => {
        console.log('Add member successful', data);
      },
      error: (error) => {
        console.error('Error adding member:', error);
      },
      complete: () => {
        console.log('Add member request completed.');
      }
    });
  }
  

  onSubmit() {
     let newMember:Member={
     firstName:this.form.get('nom')?.value,
     lastName:this.form.get('prenom')?.value,
     dateOfBirth:this.form.get('dateDeNaissance')?.value,
     email:this.form.get('email')?.value,
     gender:this.form.get('sex')?.value,
     address:this.form.get('adresse')?.value,
     contact:this.form.get('numeroDeTel')?.value,
     profession:this.form.get('profession')?.value,
     situation:this.form.get('situation')?.value,
    }
    this.addMember(newMember);
  }

}
