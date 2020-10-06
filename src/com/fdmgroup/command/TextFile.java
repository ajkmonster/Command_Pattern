package com.fdmgroup.command;

public class TextFile {
    
    private String name;
    
    public TextFile() {
		super();
	}
    
	public TextFile(String name) {
		super();
		this.name = name;
	}

	public String open() {
        return "Opening file " + name;
    }
    
    public String save() {  
        return "Saving file " + name;
    }
    
    // additional text file methods (editing, writing, copying, pasting)
}
