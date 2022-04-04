package com.zensar.booking.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.booking.bean.Room;

@Repository
public interface RoomDAO extends JpaRepository<Room, Integer> {

}
