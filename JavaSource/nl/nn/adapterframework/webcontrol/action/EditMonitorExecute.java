/*
 * $Log: EditMonitorExecute.java,v $
 * Revision 1.2  2008-07-24 12:42:10  europe\L190409
 * rework of monitoring
 *
 * Revision 1.1  2008/07/17 16:21:49  Gerrit van Brakel <gerrit.van.brakel@ibissource.org>
 * work in progess
 *
 */
package nl.nn.adapterframework.webcontrol.action;

import nl.nn.adapterframework.monitoring.Monitor;
import nl.nn.adapterframework.monitoring.MonitorManager;

import org.apache.struts.action.DynaActionForm;



/**
 * Edit a Monitor - process the form.
 * 
 * @author  Gerrit van Brakel
 * @since   4.9
 * @version Id
 */
public final class EditMonitorExecute extends EditMonitor {

	public void performAction(DynaActionForm monitorForm, String action, int index, int triggerIndex) {
		
		MonitorManager mm = MonitorManager.getInstance();
		if (index>=0) {
			Monitor monitor = mm.getMonitor(index);
			Monitor formMonitor = (Monitor)monitorForm.get("monitor");
			monitor.setName(formMonitor.getName());
			monitor.setTypeEnum(formMonitor.getTypeEnum());
			monitor.setGuardedObject(formMonitor.getGuardedObject());
			monitor.setDestinations(formMonitor.getDestinations());
			monitor.setSeverity(formMonitor.getSeverity());
		}
	}
}