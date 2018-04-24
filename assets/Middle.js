import TGNode from '~/assets/TGNode';

export default class Middle extends TGNode {
	constructor(/*string*/ name, /*Input*/ dest) {
		super(name);
		this.dest = dest;
		this.charged = false;
	}
	receive() {
		this.charged = true;
	}
	send() {
		this.dest.receive();
	}
};
