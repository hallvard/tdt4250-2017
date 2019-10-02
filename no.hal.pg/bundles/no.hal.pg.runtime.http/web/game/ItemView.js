// React component for ItemView

/*
this.props:
{
	datarUrl: service URL
	item: item
	itemNum: item number
}
 */

var md = new Remarkable();

class ItemView extends React.Component {

	constructor(props) {
		super(props);
		this.state = this.props;
	}

	displayName() {
		return "Item view component"
	}

  	render() {
	    	return React.createElement(
      		"div", { className: "item" },
      			"Item " + this.props.itemNum + " - ",
      			md.render(this.props.item.description)
    		);
  	}
}
