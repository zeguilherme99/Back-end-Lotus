package com.MeuProjetoSpring.Meu.projeto.model;

public class UserLogin {
	
	private String nome;
	private String usuario;
	private String senha;
	private String token;
	private String foto;
	private String bio;
	private String linkLinkedin;
	private String linkFacebook;
	private String tipo;
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getLinkFacebook() {
		return linkFacebook;
	}
	public void setLinkFacebook(String linkFacebook) {
		this.linkFacebook = linkFacebook;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getLinkLinkedin() {
		return linkLinkedin;
	}
	public void setLinkLinkedin(String linkLinkedin) {
		this.linkLinkedin = linkLinkedin;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

}
