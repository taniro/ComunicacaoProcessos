package tads.eaj.ufrn.groups.firealarm;

import org.jgroups.JChannel;
import org.jgroups.Message;
import org.jgroups.ReceiverAdapter;

public class FireAlarmConsumerJG  extends ReceiverAdapter { 
	
    public void await() {
	    try {
	            JChannel channel = new JChannel(); 
	            channel.setReceiver(this);
	            channel.connect("AlarmChannel"); 

	    } catch(Exception e) {
			System.err.println(e.getMessage());
		}
    }
    
    public void receive(Message msg) {
        String line = msg.getSrc() + ": " + msg.getObject();
        System.out.println(line);

    }
    
    public static void main(String[] args) {
    	
		FireAlarmConsumerJG alarmCall = new FireAlarmConsumerJG();
		alarmCall.await();
	}
}
