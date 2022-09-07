export class MyClass {
    constructor(first, last, age) {
        this._firstName = first;
        this._lastName = last;
        this._age = age;
    }
    get firstName() {
        return this._firstName;
    }
    set firstName(newFirstName) {
        this._firstName = newFirstName;
    }
    get lastName() {
        return this._lastName;
    }
    set lastName(newLastName) {
        this._lastName = newLastName;
    }
    get age() {
        return this._age;
    }
    set age(newAge) {
        this._age = newAge;
    }
    getGreeting() {
        return `Hello, ${this._firstName} ${this._lastName}. Nice to see you!`;
    }
    greet() {
        console.log(`Hello, ${this._firstName} ${this._lastName}. Nice to see you!`);
    }
}
export var HairColors;
(function (HairColors) {
    HairColors[HairColors["Blonde"] = 0] = "Blonde";
    HairColors[HairColors["DirtyBlonde"] = 1] = "DirtyBlonde";
    HairColors[HairColors["Brown"] = 2] = "Brown";
    HairColors[HairColors["Black"] = 3] = "Black";
    HairColors[HairColors["Red"] = 4] = "Red";
    HairColors[HairColors["Auburn"] = 5] = "Auburn";
    HairColors[HairColors["Platnum"] = 6] = "Platnum";
})(HairColors || (HairColors = {}));
;
export function addNums(...arr) {
    let sum = arr[0];
    for (let i = 1; i < arr.length; i++) {
        sum += arr[i];
    }
    return sum;
}
