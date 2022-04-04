package com.zensar.booking.bean;

import java.util.List;
import java.util.Objects;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "booking_table")
public class Booking {

	@Id
	@NonNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ElementCollection
	private List<Room> bookedRooms;
	@Embedded
	private Employee stakeholder;
	@NonNull
	private String purpose;
	@NonNull
	private String dateOfBooking;
	@NonNull
	private int participants;

	public Booking() {
		super();
	}

	public Booking(int id) {
		super();
		this.id = id;
	}

	public Booking(List<Room> bookedRooms, Employee stakeholder, String purpose, String dateOfBooking,
			int participants) {
		super();
		this.bookedRooms = bookedRooms;
		this.stakeholder = stakeholder;
		this.purpose = purpose;
		this.dateOfBooking = dateOfBooking;
		this.participants = participants;
	}

	public Booking(int id, List<Room> bookedRooms, Employee stakeholder, String purpose, String dateOfBooking,
			int participants) {
		super();
		this.id = id;
		this.bookedRooms = bookedRooms;
		this.stakeholder = stakeholder;
		this.purpose = purpose;
		this.dateOfBooking = dateOfBooking;
		this.participants = participants;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Room> getBookedRooms() {
		return bookedRooms;
	}

	public void setBookedRooms(List<Room> bookedRooms) {
		this.bookedRooms = bookedRooms;
	}

	public Employee getStakeholder() {
		return stakeholder;
	}

	public void setStakeholder(Employee stakeholder) {
		this.stakeholder = stakeholder;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getDateOfBooking() {
		return dateOfBooking;
	}

	public void setDateOfBooking(String dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}

	public int getParticipants() {
		return participants;
	}

	public void setParticipants(int participants) {
		this.participants = participants;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookedRooms, dateOfBooking, id, participants, purpose, stakeholder);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Booking other = (Booking) obj;
		return Objects.equals(bookedRooms, other.bookedRooms) && Objects.equals(dateOfBooking, other.dateOfBooking)
				&& id == other.id && participants == other.participants && Objects.equals(purpose, other.purpose)
				&& Objects.equals(stakeholder, other.stakeholder);
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", bookedRooms=" + bookedRooms + ", stakeholder=" + stakeholder + ", purpose="
				+ purpose + ", dateOfBooking=" + dateOfBooking + ", participants=" + participants + "]";
	}

}
