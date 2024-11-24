import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Member } from '../Model/memberModel';


@Injectable({
  providedIn: 'root'
})
export class MemberService {
  private baseUrl = 'http://localhost:8080/members'; 

  constructor(private http: HttpClient) { }

  findAllMembers(): Observable<Member[]> {
    return this.http.get<Member[]>(this.baseUrl+'/find-all-members');
  }

  addMember(member: Member): Observable<Member> {
    return this.http.post<Member>(this.baseUrl+'/add-member', member, { 
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      }),
      responseType: 'text' as 'json' 
    });
  }
}
