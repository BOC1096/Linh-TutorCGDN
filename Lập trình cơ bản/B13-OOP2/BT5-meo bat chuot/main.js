tom = new Cat("Tom", 15, 20);
jerry = new Rat("Jerry", 10, 25);

document.writeln("Cat is catching rat <br>");
document.writeln(tom.name + ": " + tom.speed + "<br>");
document.writeln(jerry.name + ": " + jerry.speed + "<br>");

tom.catch(jerry);
tom.speed += 20;

document.writeln(tom.name + ": " + tom.speed + "<br>");
document.writeln(jerry.name + ": " + jerry.speed + "<br>");
tom.catch(jerry);