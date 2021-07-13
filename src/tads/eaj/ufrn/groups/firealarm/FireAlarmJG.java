package tads.eaj.ufrn.groups.firealarm;

import org.jgroups.JChannel;
import org.jgroups.Message;

public class FireAlarmJG { 
	
	public void raise() {
		try {
			JChannel channel = new JChannel();
		 	channel.connect("AlarmChannel"); 
			Message msg = new Message(null, "Fire!");
			channel.send(msg);
			channel.close();
		} 
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		FireAlarmJG alarm = new FireAlarmJG();
		alarm.raise();
	}
}
