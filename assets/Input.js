import TGNode from '~/assets/TGNode';

export default class Input extends TGNode {
	constructor(/*string*/ name, /*(Middle|Output)*/ dest) {
		super(name);
		this.dest = dest;
	}
	send() {
		this.dest.receive();
	}
};
