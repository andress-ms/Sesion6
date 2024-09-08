package models;


/**
 * @author andre
 * @version 1.0
 * @created 05-sep.-2024 07:21:56
 */
public class Coordination {

	private int code;
	private String name;

	public Coordination(){

	}

	public Coordination(int code, String name){
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}


}//end Coordination