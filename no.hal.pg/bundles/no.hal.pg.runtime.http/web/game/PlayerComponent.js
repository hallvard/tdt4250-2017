// React component for Player list

/*
this.props:
{
	dataUrl: the url that returns the current Player object
	player : the player
	{
		name: player name
	}
}
this.state:
{
	name: player name
}
*/

var emailPattern = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
var urlPattern = /(http|ftp|https):\/\/[\w-]+(\.[\w-]+)+([\w.,@?^=%&amp;:\/~+#-]*[\w@?^=%&amp;\/~+#-])?/;

var PlayerComponent = React.createClass({
	displayName: "Player component",
	
	getInitialState : function() {
		var comp = this;
		AppUtils.loadData(this.props.dataUrl, false, function(response) {
			var person = {
					name : response.name,
					ids : response.ids
				};
			comp.setState(person);
//			comp.props.taskList.setPlayer(person);
		});
		return {
			name : "???", // this.props.player.name,
			ids : [ "???" ] // this.props.player.ids
		};
	},

  	render: function render() {
  		var ids = (this.state.ids ? this.state.ids : []);
  		var idRows = (this.props.compact ? [] : ids.map(function(id) {
  			var url = null;
  			if (emailPattern.test(id)) {
  				url = "mailto:" + id;
  			} else if (urlPattern.test(id)) {
  				url = id;
  			}
      		return React.createElement("tr", { key: id },
    	    	React.createElement("td", { className: "playerId" },
    		    	(url != null ? React.createElement( "a", { href: url }, id ) : id)
    	 		)
          	);
  		}));
  		var playerLink = AppUtils.appUrl(this.props.dataUrl);
    	return React.createElement("table", { className: "player" },
      		React.createElement("tbody", null,
	    			React.createElement("tr", null,
		    	    	React.createElement("td", { className: "playerName" },
		        		    "Name: ",
	    	    			React.createElement( "a", { href: playerLink }, this.state.name )
		        	 	)
	    		),
	    		idRows
      		)
    	);
  	}
});
