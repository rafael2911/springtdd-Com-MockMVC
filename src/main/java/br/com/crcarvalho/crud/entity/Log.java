package br.com.crcarvalho.crud.entity;

public class Log {

	private Long id;
	private String register;
	private String source;

	public Log(Long id, String register, String source) {
		this.id = id;
		this.register = register;
		this.source = source;
	}

	public Log() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

}
