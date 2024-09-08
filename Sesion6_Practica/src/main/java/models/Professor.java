package models;


/**
 * @author andre
 * @version 1.0
 * @created 05-sep.-2024 07:21:59
 */
public class Professor {

	private String id;
	private String names;
	private String surnames;
	private String title;
	public Coordination m_Coordination;

	public Professor(){

	}

	public Professor(String id, String names, String surnames, String title, Coordination m_Coordination) {
		this.id = id;
		this.names = names;
		this.surnames = surnames;
		this.title = title;
		this.m_Coordination = m_Coordination;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getSurnames() {
		return surnames;
	}

	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Coordination getM_Coordination() {
		return m_Coordination;
	}

	public void setM_Coordination(Coordination m_Coordination) {
		this.m_Coordination = m_Coordination;
	}

	public Coordination getCoordination(){
		return null;
	}

	/**
	 * 
	 * @param Coordination
	 */
	public void setCoordination(Coordination Coordination){

	}
}//end Professor