package bank;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TransactionLogger implements ILogObserver {
	
	private ArrayList<Log> m_logs;
	
	public TransactionLogger() {
		m_logs = new ArrayList<Log>();
	}
	
	private void addLog(Log log)
	{
		this.m_logs.add(log);
	}

	@Override
	public void update(Log log) {
		addLog(log);
	}
	
	public Log lastLog() {
		return m_logs.get(m_logs.size() -1);
	}
	
	public List<Log> logs(LocalDate begin, LocalDate end) {
		
		Integer beginIndex = null;
		Integer endIndex = null;
		for(int i = 0; i < this.m_logs.size(); i++)
		{
			if(beginIndex == null) {
				if(begin.atStartOfDay().isBefore(this.m_logs.get(i).getDateTime()));
					beginIndex = i;
			}
			if(endIndex == null) {
				if(end.atTime(LocalTime.MIDNIGHT.minusSeconds(1)).isAfter(this.m_logs.get(this.m_logs.size()-1-i).getDateTime()))
					endIndex = this.m_logs.size() - i;
			}
			if(beginIndex != null && endIndex != null)
				break;
		}
		if(beginIndex == null || endIndex == null)
			return List.of();
		else if(beginIndex <= endIndex)
			return this.m_logs.subList(beginIndex, endIndex);
		else
			return List.of();
	}
}
