export class MyClass {
    private _firstName: string;
    private _lastName: string;
    private _age: number;

    constructor(first: any, last: string, age: number) {
        this._firstName = first;
        this._lastName = last;
        this._age = age;
    }

    get firstName(): string {
        return this._firstName;
    }

    set firstName(newFirstName: string) {
        this._firstName = newFirstName;
    }

    get lastName(): string {
        return this._lastName;
    }

    set lastName(newLastName: string) {
        this._lastName = newLastName;
    }

    get age(): number {
        return this._age;
    }

    set age(newAge: number) {
        this._age = newAge;
    }


    getGreeting(): string {
        return `Hello, ${this._firstName} ${this._lastName}. Nice to see you!`
    }

    greet(): void {
        console.log(`Hello, ${this._firstName} ${this._lastName}. Nice to see you!`);
    }


}

export enum HairColors {Blonde, DirtyBlonde, Brown, Black, Red, Auburn, Platnum};

export function addNums(...arr: number[]): number {
    let sum: number = arr[0];
    for(let i = 1; i < arr.length; i++) {
        sum += arr[i];
    }

    return sum;
}