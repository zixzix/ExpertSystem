q :- write('ciao').

child_of('joe', 'ralf').
child_of('mary', 'joe').
child_of('steve', 'joe').
child_of('steve', 'ralf').
child_of('ciccio', 'pippo').

descendent_of(X, Y) :- child_of(X, Y).
descendent_of(X, Y) :- child_of(Z, Y), descendent_of(X, Z).
	