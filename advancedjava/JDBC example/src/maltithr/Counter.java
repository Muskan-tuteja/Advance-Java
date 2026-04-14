package maltithr;

import java.util.ArrayList;

public class Counter {

	int count;
	public synchronized void inc() {
		count++;
	}
	

}
//synchronized:  race condition problem : deadlock
///Array list
/// vector
/// string buffer
/// string builder
/// diff b/w string buffer  & string builder
/// 
/// task 
/// create bank aplication where features r like depoite            show use the multithread concept with sysnchorized
