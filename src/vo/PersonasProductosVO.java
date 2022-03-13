package vo;

public class PersonasProductosVO {
	
	private Long personaId;
	private Long productoId;
	
	public PersonasProductosVO() {
		
	}
	
	public PersonasProductosVO(Long personaId, Long productoId) {
		super();
		this.personaId = personaId;
		this.productoId = productoId;
	}

	public Long getPersonaId() {
		return personaId;
	}

	public void setPersonaId(Long personaId) {
		this.personaId = personaId;
	}

	public Long getProductoId() {
		return productoId;
	}

	public void setProductoId(Long productoId) {
		this.productoId = productoId;
	}

	@Override
	public String toString() {
		return "PersonasProductosVO [personaId=" + personaId + ", productoId=" + productoId + "]";
	}
	
}
