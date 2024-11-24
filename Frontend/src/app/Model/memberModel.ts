// Define the Member interface (assuming you're using an interface for the member object)
export interface Member {
    firstName: string,
    lastName: string,
    dateOfBirth: Date,
    email: string,
    gender: string,
    address: string,
    contact: string,
    profession: Profession,
    situation: Situation
}
export enum Profession {
  CHILD,
  WORKER,
  STUDENT
}


export enum Situation {
  SINGLE,
  FIANCE,
  MARRIED
}