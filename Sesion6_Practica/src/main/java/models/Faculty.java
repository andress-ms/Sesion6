package models;


import java.util.ArrayList;

/**
 * @author andre
 * @version 1.0
 * @created 05-sep.-2024 07:21:58
 */
public class Faculty {

	private String building;
	private int id;
	private String name;
	public Coordination m_Coordination;

	public Faculty(){

	}

	public Faculty(String building, int id, String name, Coordination m_Coordination){
		this.building = building;
		this.id = id;
		this.name = name;
		this.m_Coordination = m_Coordination;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Coordination getM_Coordination() {
		return m_Coordination;
	}

	public void setM_Coordination(Coordination m_Coordination) {
		this.m_Coordination = m_Coordination;
	}

	public void addCoordination(int id, String String){

	}

	public ArrayList<Coordination> showListCoordination(){
		return null;
	}
}//end Faculty