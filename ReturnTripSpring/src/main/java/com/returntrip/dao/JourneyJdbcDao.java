package com.returntrip.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
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
				journey.setNomination(rs.getString("NOMINATION"));
				journey.setPhone(rs.getString("PHONE"));
				journey.setTerm(rs.getString("J_TERM"));
				journey.setVisit(rs.getInt("SEARCH"));
				journey.setHit(rs.getInt("HIT"));
				journey.setContent(rs.getString("J_CONTENT"));
				journey.setHomepage(rs.getString("Homepage"));
				journey.setFee(rs.getString("FEE"));
				journey.setHashtag((new Gson()).fromJson(rs.getString("HASHTAG"), String[].class));
				journey.setImg((new Gson()).fromJson(rs.getString("IMG"), String[].class));
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
	public int initializeJourney(Journey journey) {
		// TODO Auto-generated method stub		
		
		String sql = "INSERT INTO JOURNEY VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		int result = 0;
		try {
			connect();
			
			stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, journey.getJourneyName());
			stmt.setString(2, journey.getOrganizerName());
			stmt.setString(3, journey.getParking());
			stmt.setString(4, journey.getRoad_base_addr());
			stmt.setString(5, journey.getNomination());
			stmt.setString(6, journey.getPhone());
			stmt.setString(7, journey.getTerm());
			stmt.setString(8, journey.getContent());
			stmt.setString(9, journey.getHomepage());
			stmt.setString(10, journey.getFee());
			stmt.setInt(11, 0);
			stmt.setInt(12, 0);
			stmt.setString(13, (new Gson()).toJson(journey.getHashtag(),String[].class));
			stmt.setString(14, (new Gson()).toJson(journey.getImg(),String[].class));
			stmt.setString(15, journey.getCategory());
			
			result = stmt.executeUpdate();

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
	

	private String convertToCSV(int[] ids) {
		StringBuilder csv = new StringBuilder();

		for (int i=0; i<ids.length-1; i++) {
			csv.append(ids[i]).append(", ");
		}
		csv.append(ids[ids.length-1]);
		
		return csv.toString();
	}

	@Override
	public List<Journey> getJourneyDatas(String category) {
		// TODO Auto-generated method stub
		Journey journey = null;
		List<Journey> list = null;
		String sql = "SELECT * FROM JOURNEY WHERE category = ?"; //index : category �꽕�젙
		
		try {
			connect();
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, category);
			rs = stmt.executeQuery();
			
			if (rs.isBeforeFirst()) {
				list = new ArrayList<Journey>();
				while(rs.next()) {
					journey = new Journey();
					journey.setRoad_base_addr(rs.getString("ROAD_BASE_ADDR"));
					journey.setJourneyName(rs.getString("JOURNEY_NAME"));
					journey.setOrganizerName(rs.getString("ORGANIZER_NAME"));
					journey.setNomination(rs.getString("NOMINATION"));
					journey.setPhone(rs.getString("PHONE"));
					journey.setTerm(rs.getString("J_TERM"));
					journey.setVisit(rs.getInt("visit"));
					journey.setHit(rs.getInt("HIT"));
					journey.setContent(rs.getString("J_CONTENT"));
					journey.setHomepage(rs.getString("Homepage"));
					journey.setFee(rs.getString("FEE"));
					journey.setHashtag((new Gson()).fromJson(rs.getString("HASHTAG"), String[].class));
					journey.setImg((new Gson()).fromJson(rs.getString("img"), String[].class));
					journey.setCategory(rs.getString("Categoty"));
					list.add(journey);
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
		return list;
	}

	@Override
	public List<String> getCategory(String category) {
		// TODO Auto-generated method stub
		List<String> list = null;
		String sql = "SELECT Categoty FROM JOURNEY where categoty LIKE ? group by Categoty"; //index : category �꽕�젙
		
		try {
			connect();
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, "%" +category + "%");
			rs = stmt.executeQuery();
			
			if (rs.isBeforeFirst()) {
				list = new ArrayList<String>();
				while(rs.next()) {
					list.add(rs.getString("categoty"));
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
		return list;
	}
}
