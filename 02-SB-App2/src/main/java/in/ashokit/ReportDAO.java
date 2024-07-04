package in.ashokit;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ReportDAO {

	public ReportDAO() {
		System.out.println("Constructor :: ReportDAO");
	}
}
