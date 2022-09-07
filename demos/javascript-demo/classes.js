class Animal {
    constructor(name) {
        this.name = name;
    }
    static breathe() {
        console.log("breathes");
    }
    speak() {
        console.log('Hello, my name is' + this.name);
    }
}

class Cat extends Animal {
    constructor(name, color) {
        super(name);
        this.color = color;
    }
    speak() {
        console.log('Meow');
    }

    misbehave(callback) {
        callback();
    }

    act(action, callback) {
        callback(action);
    }
}

