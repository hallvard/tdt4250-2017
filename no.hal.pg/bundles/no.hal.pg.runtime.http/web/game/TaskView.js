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
		var taskState = null;
  		if (this.state.task.finished) {
  			taskState = "finished";
  		} else if (this.state.task.started) {
  			taskState = "started";
  		} else if (this.state.task.enabled) {
  			taskState = "enabled";
  		}
  		var divClass = (taskState == null ? "task" : taskState + "Task");
  		var taskLink = AppUtils.appUrl(this.props.dataUrl, { taskState: taskState });
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
