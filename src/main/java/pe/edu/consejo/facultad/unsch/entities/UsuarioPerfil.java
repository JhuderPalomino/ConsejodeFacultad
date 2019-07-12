package pe.edu.consejo.facultad.unsch.entities;
// Generated 11/07/2019 10:53:32 PM by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * UsuarioPerfil generated by hbm2java
 */
@Entity
@Table(name = "usuario_perfil", catalog = "consejodefacultad")
public class UsuarioPerfil implements java.io.Serializable {

	private Integer idusuarioperfil;
	private Perfil perfil;
	private Usuario usuario;
	private Byte estado;

	public UsuarioPerfil() {
	}

	public UsuarioPerfil(Perfil perfil, Usuario usuario) {
		this.perfil = perfil;
		this.usuario = usuario;
	}

	public UsuarioPerfil(Perfil perfil, Usuario usuario, Byte estado) {
		this.perfil = perfil;
		this.usuario = usuario;
		this.estado = estado;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idusuarioperfil", unique = true, nullable = false)
	public Integer getIdusuarioperfil() {
		return this.idusuarioperfil;
	}

	public void setIdusuarioperfil(Integer idusuarioperfil) {
		this.idusuarioperfil = idusuarioperfil;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idperfil", nullable = false)
	public Perfil getPerfil() {
		return this.perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idusuario", nullable = false)
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Column(name = "estado")
	public Byte getEstado() {
		return this.estado;
	}

	public void setEstado(Byte estado) {
		this.estado = estado;
	}

}
