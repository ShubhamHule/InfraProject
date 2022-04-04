package com.zensar.booking.bean;

import java.util.Objects;

import javax.persistence.Embeddable;

import org.springframework.lang.NonNull;

@Embeddable
public class Role {

	@NonNull
	private int id;
	@NonNull
	private String authority;

	public Role() {
		super();
	}

	public Role(int id) {
		super();
		this.id = id;
	}

	public Role(String authority) {
		super();
		this.authority = authority;
	}

	public Role(int id, String authority) {
		super();
		this.id = id;
		this.authority = authority;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public int hashCode() {
		return Objects.hash(authority, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		return Objects.equals(authority, other.authority) && id == other.id;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", authority=" + authority + "]";
	}

}
