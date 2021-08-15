package com.returntrip.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.returntrip.entity.Journey;
import com.returntrip.entity.WeatherDO;

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
		
		String sql = "SELECT * FROM JOURNEY WHERE ROAD_BASE_ADDR LIKE ? or NOMINATION LIKE ?";
		
		try {
			connect();
			
			stmt = conn.prepareStatement(sql);


			stmt.setString(1, "%" + query + "%");
			stmt.setString(2, "%" + query + "%");
			
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
		
		String sql = "INSERT INTO JOURNEY VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		int result = 0;
		try {
			connect();
			
			stmt = conn.prepareStatement(sql);
			
			
			result = stmt.executeUpdate();


			
			
			if (rs.next()) {
				stmt.setString(1, journey.getJourneyName());
				stmt.setString(2, journey.getOrganizerName());
				stmt.setBoolean(3, journey.isParking());
				stmt.setString(4, journey.getRoad_base_addr());
				stmt.setInt(5, journey.getZipCode());
				stmt.setString(6, journey.getNomination());
				stmt.setString(7, journey.getPhone());
				stmt.setTimestamp(8, journey.getEventStr());
				stmt.setTimestamp(9, journey.getEventFin());
				stmt.setDate(10, (Date) journey.getDayoff());

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
