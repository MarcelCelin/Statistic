import { Component, inject } from '@angular/core';
import { MemberService } from '../Service/memberService';

@Component({
  selector: 'app-user-list-component',
  standalone: true,
  imports: [],
  providers: [MemberService],
  templateUrl: './user-list-component.component.html',
  styleUrl: './user-list-component.component.css',
})
export class UserListComponentComponent {
  memberService = inject(MemberService);

  getAllMembers() {
    let members;
    this.memberService.findAllMembers().subscribe({
      next: (data) => {
        members = data;
        console.log('Members fetched:', data);
      },
      error: (error) => {
        console.error('Error fetching members:', error);
      },
      complete: () => {},
    });
  }
}
