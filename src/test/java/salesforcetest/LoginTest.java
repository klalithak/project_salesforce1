package salesforcetest;

import java.util.ArrayList;

import org.testng.annotations.Test;

import salesforece_base.ExcelReader;
import salesforece_base.Keywords;

public class LoginTest {
	@Test
	public void Logintest() {
		ArrayList Data = ExcelReader.getdata("E://salesforce excel//loginexcel.xlsx");
		Keywords key = new Keywords();
		for (int i = 0; i < Data.size(); i++) {
			if (Data.get(i).equals("open")) {
				key.open();
			}
			if(Data.get(i).equals("url")) {
				String httpurl = Data.get(i+1).toString();
				key.url(httpurl);
			}
			if(Data.get(i).equals("inputs")) {
				String testdata = Data.get(i+1).toString();
				String objectname = Data.get(i+2).toString();
				key.inputs(testdata, objectname);
			}
			if(Data.get(i).equals("select")) {
				String objectname = Data.get(i+1).toString();
				key.select(objectname);
			}
			if(Data.get(i).equals("click")) {
				String objectname = Data.get(i+2).toString();
				key.click(objectname);
			}
			if(Data.get(i).equals("close")) {
				key.close();
			}
		}
	}
}
