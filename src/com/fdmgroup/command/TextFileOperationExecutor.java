package com.fdmgroup.command;

import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecutor {
    
	//only if further control of the operations 
	//execution process is necessary
    private final List<TextFileOperation> textFileOperations
     = new ArrayList<>();
    
    public String executeOperation(TextFileOperation textFileOperation) {
        textFileOperations.add(textFileOperation);
        return textFileOperation.execute();
    }
}