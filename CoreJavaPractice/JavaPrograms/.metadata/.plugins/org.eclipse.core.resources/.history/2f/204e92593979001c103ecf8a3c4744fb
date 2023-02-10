package jdbcexample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcOperationsUsingPreparedStmt {
	
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static Statement stmt = null;
	static Scanner sc = new Scanner(System.in);
	public JdbcOperationsUsingPreparedStmt() {
		conn = DBConnection.getDBConnection();
	}
	char ch = 'y';
	
	public void jdbcMenu() {
		while(ch=='y') {
		System.out.println("Enter the choice of JDBC Operation");
		System.out.println("insert : to insert the movie data");
		System.out.println("update : to update the movie data");
		System.out.println("delete : to delete the movie data");
		System.out.println("selectone : to view a specific movie data");
		System.out.println("selectall : to view all movie data");
		sc.nextLine();
		String choice = sc.nextLine();
		
		switch (choice) {
		case "insert":
			insertMovie();
			break;
		case "update":
			updateMovie();
			break;
		case "delete":
			deleteMovie();
			break;
		case "selectall":
			selectAllMovie();
			break;
		case "selectone":
			selectMovieById();
			break;
		default:
			System.out.println("no case found....");
			break;
		}
			System.out.println("do you want to continue");
			ch = sc.next().charAt(0);
		}
	}

	private void deleteMovie() {
try {
			
			String deleteStmt = "delete from MovieDetails where movieid = ?";
			 pstmt = conn.prepareStatement(deleteStmt);
			//read the values and set the values to the ?
			System.out.println("Enter the movie details to delete");
			System.out.println("enter movie id to update...");
			int mid = sc.nextInt();
			pstmt.setInt(1, mid);
			int i =pstmt.executeUpdate();
			if(i != 0) {
				System.out.println("deleted successfully");
			}else {
				System.out.println("Not deleted as movie with id = " + mid + " not found");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void selectMovieById() {
		try {
			
			String selectStmt = "select * from MovieDetails where movieid = ?";
			 pstmt = conn.prepareStatement(selectStmt);
			//read the values and set the values to the ?
			System.out.println("Enter the Movie id to view details");
			//System.out.println("enter supervisior id to update...");
			int mid = sc.nextInt();
			pstmt.setInt(1, mid);
			//int i =pstmt.executeUpdate();
			ResultSet rs = pstmt.executeQuery();		
				System.out.println("Movie found successfully");
				System.out.println("Movie details are .........");
				while(rs.next()) {
					System.out.println("Movie Id :=" + rs.getInt("movieid"));
					System.out.println("Movie Name :=" + rs.getString("moviename"));
					System.out.println("Movie Lang :=" + rs.getString("movielanguage"));
					System.out.println("Movie Type :=" + rs.getString("movietype"));
					System.out.println("Movie Rating :=" + rs.getFloat("movierating"));
				}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void selectAllMovie() {
try {
			
			String selectStmt = "select * from  MovieDetails";
			 pstmt = conn.prepareStatement(selectStmt);
			ResultSet rs = pstmt.executeQuery();	
			System.out.println("movie details are .........");
			System.out.println("=======================================================================================================================================================================================================");
			System.out.println("Movie ID" + "\t" + "Movie Name" + "\t" + "Movie Language" + "\t" + "Movie Type"+"\t"+"Movie Rating");
			System.out.println("=======================================================================================================================================================================================================");
	
			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+"\t\t"+ rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t\t"+rs.getFloat(5));
				/*
				 * System.out.println("Movie Id :=" + rs.getInt("movieid"));
				 * System.out.println("Movie Name :=" + rs.getString("moviename"));
				 * System.out.println("Movie Lang :=" + rs.getString("movielanguage"));
				 * System.out.println("Movie Type :=" + rs.getString("movietype"));
				 * System.out.println("Movie Rating :=" + rs.getFloat("movierating"));
				 */
				}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void updateMovie() {
		try {
			
			String updateStmt = "update MovieDetails set moviename = ? where movieid = ?";
			 pstmt = conn.prepareStatement(updateStmt);
			//read the values and set the values to the ?
			System.out.println("Enter the movie details to update");
			System.out.println("enter movie name to update...");
			String mname = sc.nextLine();
			pstmt.setString(1, mname);
			System.out.println("enter movie id to update...");
			int mid = sc.nextInt();
			pstmt.setInt(2, mid);
			int i =pstmt.executeUpdate();
			if(i != 0) {
				System.out.println("updated successfully");
			}else {
				System.out.println("Not updated as movie with id = " + mid + " not found");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void insertMovie() {
		//step1 => to register the driver
				try {
					
					String insertStmt =  
							"insert into MovieDetails "
							+ "(movieid,moviename,movielanguage,movietype,movierating) "
							+ "values(?,?,?,?,?);";
				//step 3 => Create statement
					 pstmt = conn.prepareStatement(insertStmt);
					//read the values and set the values to the ?
				
					System.out.println("Enter the movie details");
					System.out.println("enter movie id...");
					
					
					int mid = sc.nextInt();
					pstmt.setInt(1, mid);
					sc.nextLine();
					
					System.out.println("enter movie name...");
					String mname = sc.nextLine();
					pstmt.setString(2, mname);
					
					System.out.println("Enter  movielanguage...");
					String mlan = sc.nextLine();
					pstmt.setString(3, mlan);
					System.out.println("Enter the movie type...");
					String mtype = sc.nextLine();
					pstmt.setString(4, mtype);
					System.out.println("Enter the movie Rating...");
					float mrat = sc.nextFloat();
					pstmt.setFloat(5, mrat);
					// step 4 => Execute the statement
					int i =pstmt.executeUpdate();
					// step 5 => show the results
					if(i != 0) {
						System.out.println("Inserted successfully");
					}else {
						System.out.println("Not inserted successfully");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		
	}


}
