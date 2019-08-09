import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MStSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3308/cloud_pacs", "root",
					"");
			Statement stmt = con.createStatement();

			ResultSet rs = (ResultSet) stmt.executeQuery("select * from mst_series ");

			while (rs.next()) {
				int id = rs.getInt("series_id");
				String SeriesInstanceId = rs.getString("series_seriesinstance_uid");
				String StudyInstanceId = rs.getString("series_studyinstance_uid");
				String SeriesImage = rs.getString("series_images_in_series");
//				String SeriesFlag = rs.getString("series_series_complete_flag");
				String SereisType = rs.getString("series_series_type");
				String SeriesRelatedInstances = rs.getString("series_number_of_series_related_instances");
				String SereiesNumber = rs.getString("series_series_number");
				String StudyId = rs.getString("series_study_id");
				String  SeriesDate= rs.getString("series_series_date");
				String SeriesTime = rs.getString("series_series_time");
				String SeriesDescription = rs.getString("series_series_description");
				String BodyExamined = rs.getString("series_body_part_examined");
				
				for(int a = 120; a<=200000 ;a++) {

				String sql = "INSERT INTO mst_series(series_seriesinstance_uid,series_studyinstance_uid,series_images_in_series,"
						+ "series_series_type,series_number_of_series_related_instances,series_series_number,series_study_id,series_series_date,series_series_time,series_series_description,series_body_part_examined)"
						+
						"VALUES ('" + SeriesInstanceId +a + "','" + StudyInstanceId +   "','" + SeriesImage + "',"
								+ "'" + SereisType + "','" + SeriesRelatedInstances + "','" + SereiesNumber + "','" + StudyId + "',"
								+ "'" + SeriesDate + "','" + SeriesTime + "','" + SeriesDescription + "','" + BodyExamined + "')";
				
				System.out.println(sql);
				stmt = con.createStatement();
				stmt.executeUpdate(sql);

				a++;
				}
			}
			con.close();

		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
