package pe.edu.consejo.facultad.unsch.entities;
// Generated 11/07/2019 10:53:32 PM by Hibernate Tools 5.2.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Perfil generated by hbm2java
 */
@Entity
@Table(name = "perfil", catalog = "consejodefacultad")
public class Perfil implements java.io.Serializable {

	private Integer idperfil;
	private String nombre;
	private Set<UsuarioPerfil> usuarioPerfils = new HashSet<UsuarioPerfil>(0);
	private Set<PerfilOpcion> perfilOpcions = new HashSet<PerfilOpcion>(0);

	public Perfil() {
	}

	public Perfil(String nombre, Set<UsuarioPerfil> usuarioPerfils, Set<PerfilOpcion> perfilOpcions) {
		this.nombre = nombre;
		this.usuarioPerfils = usuarioPerfils;
		this.perfilOpcions = perfilOpcions;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idperfil", unique = true, nullable = false)
	public Integer getIdperfil() {
		return this.idperfil;
	}

	public void setIdperfil(Integer idperfil) {
		this.idperfil = idperfil;
	}

	@Column(name = "nombre", length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "perfil")
	public Set<UsuarioPerfil> getUsuarioPerfils() {
		return this.usuarioPerfils;
	}

	public void setUsuarioPerfils(Set<UsuarioPerfil> usuarioPerfils) {
		this.usuarioPerfils = usuarioPerfils;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "perfil")
	public Set<PerfilOpcion> getPerfilOpcions() {
		return this.perfilOpcions;
	}

	public void setPerfilOpcions(Set<PerfilOpcion> perfilOpcions) {
		this.perfilOpcions = perfilOpcions;
	}

}
