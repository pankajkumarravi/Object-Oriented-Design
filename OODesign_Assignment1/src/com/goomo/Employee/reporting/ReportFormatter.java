package com.goomo.Employee.reporting;

public class ReportFormatter {
	String formattedoutput;

	public ReportFormatter(Object object, FormatType formatType) {
		switch (formatType) {
		case XML:
			formattedoutput = convertObjectToXML(object);
			break;
		case CSV:
			formattedoutput = convertObjectToCSV(object);
			break;
		}
	}

	private String convertObjectToXML(Object object) {
		return "XML : <title>" + object.toString() + "</title>";
	}

	private String convertObjectToCSV(Object object) {
		return "CSV :,,,  " + object.toString() + " ,,,";
	}

	protected String getFormattedvalue() {
		return formattedoutput;
	}
}
