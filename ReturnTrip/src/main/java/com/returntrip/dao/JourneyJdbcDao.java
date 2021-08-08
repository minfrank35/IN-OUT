package com.returntrip.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.returntrip.entity.Journey;

public class JourneyJdbcDao implements JourneyDao {

	
	private String driver;
	private String url;
	private String username;
	private String password;
	
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	public JourneyJdbcDao(String driver, String url, String username, String password) {
		super();
		this.driver = driver;
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	private void connect() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		conn = DriverManager.getConnection(url, username, password);
	}
	
	private void disconnect() throws SQLException {
		if (rs != null && !rs.isClosed()) {
			rs.close();
			rs = null;
		}
		if (stmt != null && !stmt.isClosed()) {
			stmt.close();
			stmt = null;
		}
		if (conn != null && !conn.isClosed()) {
			conn.close();
			conn = null;
		}
	}
	
	@Override
	public Journey getJourneyData(String query) {
		// TODO Auto-generated method stub		
		Journey journey = null;
		
		String sql = "SELECT * FROM JOURNEY WHERE ROAD_BASE_ADDR = %?% or NOMINATION = %?%";
		
		try {
			connect();
			
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, query);
			stmt.setString(2, query);

			
			rs = stmt.executeQuery();
			
			if (rs.next()) {
				journey = new Journey();
				journey.setRoad_base_addr(rs.getString("ROAD_BASE_ADDR"));
				journey.setJourneyName(rs.getString("JOURNEY_NAME"));
				journey.setOrganizerName(rs.getString("ORGANIZER_NAME"));
				journey.setZipCode(rs.getInt("ZIP_CODE"));
				journey.setNomination(rs.getString("NOMINATION"));
				journey.setPhone(rs.getString("PHONE"));
				journey.setEventStr(rs.getTimestamp("EVENT_PER_STR"));
				journey.setEventFin(rs.getTimestamp("EVENT_PER_FIN"));
				journey.setDayoff(rs.getDate("DAY_OFF"));
				journey.setVisit(rs.getInt("VISIT"));
				journey.setHit(rs.getInt("HIT"));

			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return journey;
	}

	@Override
	public int insertJourney(Journey journey) {
		// TODO Auto-generated method stub
		int result = 0;
		
		String sql = "INSERT INTO JOURNEY(JOURNEY_NAME , ORGANIZER_NAME, PARKING , ROAD_BASE_ADDR, ZIP_CODE,NOMINATION,PHONE,EVENT_PER_STR,EVENT_PER_FIN,DAY_OFF,VISIT,HIT ) VALUES (RSV_SEQ_GEN.NEXTVAL, ?, ?, ?, ?)";
		String sql2 = "SELECT RSV_SEQ_GEN.CURRVAL FROM DUAL";
		
		try {
			connect();
			
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, rsv.getName());
			stmt.setString(2, rsv.getPasswd());
			stmt.setString(3, rsv.getPhone());
			stmt.setString(4, (new Gson()).toJson(rsv.getSeatNumbers()));
			
			result = stmt.executeUpdate();
			
			if (result == 1) {
				stmt = conn.prepareStatement(sql2);
				rs = stmt.executeQuery();
				if (rs.next()) {
					result = rs.getInt("CURRVAL");
				}
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return result;
	}

	@Override
	public int updateJourney(Journey journey) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteJourney(String roadBaseAddr) {
		// TODO Auto-generated method stub
		return 0;
	}

}
