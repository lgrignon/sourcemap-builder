package com.google.debugging.sourcemap;

public class OriginalMapping {
	// The original source file.
	public String original_file = "1";

	// The line in the original file.
	public int line_number = 2;

	// The column number on the line.
	public int column_position = 3;

	// The original name of the identifier.
	public String identifier = "4";

	public String getOriginalFile() {
		return original_file;
	}

	public void setOriginalFile(String original_file) {
		this.original_file = original_file;
	}

	public int getLineNumber() {
		return line_number;
	}

	public void setLineNumber(int line_number) {
		this.line_number = line_number;
	}

	public int getColumnPosition() {
		return column_position;
	}

	public void setColumnPosition(int column_position) {
		this.column_position = column_position;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

}
