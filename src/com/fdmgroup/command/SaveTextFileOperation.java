package com.fdmgroup.command;

public class SaveTextFileOperation implements TextFileOperation {
    
    private TextFile textFile;
    
    public SaveTextFileOperation() {
		super();
	}

	public SaveTextFileOperation(TextFile textFile) {
		super();
		this.textFile = textFile;
	}

	@Override
    public String execute() {
        return textFile.save();
    }
}
