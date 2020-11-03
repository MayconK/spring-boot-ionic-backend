package com.nelioalves.cursomc.domain.enums;

public enum TipoCliente {

	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private int id;
	private String description;
	
	private TipoCliente(int id, String description) {
		this.id = id;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public static TipoCliente toEnum(Integer id) {
		if(id == null) return null;
		for (TipoCliente tc : TipoCliente.values()) {
			if (id.equals(tc.getId()))
				return tc;
		}

		throw new IllegalArgumentException("ID inválido: " + id);
	}
}
