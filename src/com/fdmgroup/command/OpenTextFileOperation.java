package com.fdmgroup.command;

public class OpenTextFileOperation implements TextFileOperation {
	 
    private TextFile textFile;
    
    public OpenTextFileOperation() {
		super();
		
	}

	public OpenTextFileOperation(TextFile textFile) {
		super();
		this.textFile = textFile;
	}

	@Override
    public String execute() {
        return textFile.open();
    }
}
