// React component for TaskView

/*
this.props:
{
	datarUrl: service URL
	task: task
	taskNum: task number
}
this.state:
{
	enabled, started, finished, description
}
 */

var md = new Remarkable();

class TaskView extends React.Component {

	constructor(props) {
		super(props);
		this.state = this.props;
	}

	displayName() {
		return "Task view component"
	}

  	render() {
  		var divClass = "task";
  		if (this.state.task.finished) {
  			divClass = "finishedTask";
  		} else if (this.state.task.started) {
  			divClass = "startedTask";
  		} else if (this.state.task.enabled) {
  			divClass = "enabledTask";
  		}
  		var taskLink = AppUtils.appUrl(this.props.dataUrl);
	    	return React.createElement(
      		"div", { className: divClass },
      		React.createElement(
      			"a", { href: taskLink },
      			"Task " + this.props.taskNum + " - ",
      			md.render(this.props.task.description)
      		)
    		);
  	}
}
