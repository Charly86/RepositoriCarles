
public class Prova {
	
	private String name;
	
	private String cognom;
	
	public Prova(String name, String cognom){
		
		this.name=name;
		this.cognom=cognom;
	}

	/**
	 * @return the cognom
	 */
	public String getCognom() {
		return cognom;
	}

	/**
	 * @param cognom the cognom to set
	 */
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public String Mostrar(){
		
		StringBuilder sb=new StringBuilder();
		
		sb.append("Nom: "+" "+ this.getName()+ "Cognom"+ " "+ this.getCognom());
		
		return sb.toString();
	}
	
	
}
