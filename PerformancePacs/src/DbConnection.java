import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ListIterator;

public class DbConnection {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3308/cloud_pacs", "root",
					"");
			Statement stmt = con.createStatement();

			ResultSet rs = (ResultSet) stmt.executeQuery("select * from mst_study ");
			// ResultSet rs=(ResultSet) stmt.executeQuery("INSERT INTO mst_study ");
			while (rs.next()) {
				int id = rs.getInt("study_id");
				String StudyDate = rs.getString("study_study_date");
				String PatientName = rs.getString("study_patient_name");
				String Modality = rs.getString("study_modality");
				String time = rs.getString("study_study_time");
				String patientId = rs.getString("study_patient_id");
				String AccessNumber = rs.getString("study_accession_number");
				String InstanceId = rs.getString("study_studyinstance_uid");
				String PhysicianName = rs.getString("study_referring_physician_name");
				String StudyDescription = rs.getString("study_study_description");
				String SeriesStudy = rs.getString("study_series_in_study");
				String ImagesAcquisition = rs.getString("study_images_in_acquisition");
				String SeriesinStudy = rs.getString("study_number_of_series_in_study");
				String relatedInstance = rs.getString("study_number_of_study_related_instances");
				String Location = rs.getString("study_location");
				String InstituteName = rs.getString("study_institution_name");
				String StudySourceType = rs.getString("study_source_type");
				String Compression = rs.getString("study_compression");
				String favorite = rs.getString("is_favorite");
				String archiveDeleted = rs.getString("study_is_archive_deleted");
				String StudyAnominized = rs.getString("study_is_anominized");
				String AcquisitionDate = rs.getString("study_acquisition_date");
				String StudyPriority = rs.getString("study_priority");
				String StudyRadiologist = rs.getString("study_radiologest_id");
				String ReferingPhysician = rs.getString("study_referring_physician_address");
				for(Long a = 10l;InstanceId==InstanceId;a++) {

				String sql = "INSERT INTO mst_study(study_study_date,study_patient_name,"
						+ "study_modality,study_study_time,study_patient_id,study_accession_number"
						+ ",study_studyinstance_uid,study_referring_physician_name,study_study_description,study_series_in_study,study_images_in_acquisition,"
						+ "study_number_of_series_in_study,study_number_of_study_related_instances,study_location,study_institution_name,study_source_type,study_compression,is_favorite,"
						+ "study_is_archive_deleted, study_is_anominized,study_acquisition_date,study_priority,study_radiologest_id,study_referring_physician_address) "
						+

						"VALUES ('" + StudyDate + "','" + PatientName + "','" + Modality + "','" + time + "','"
						+ patientId + "','" + AccessNumber + "','" + InstanceId + a + "','" + PhysicianName + "','"
						+ StudyDescription + "','" + SeriesStudy + "','" + ImagesAcquisition + "','" + SeriesinStudy
						+ "','" + relatedInstance + "','" + Location + "','" + InstituteName + "','" + StudySourceType
						+ "','" + Compression + "','" + favorite + "','" + archiveDeleted + "','" + StudyAnominized
						+ "','" + AcquisitionDate + "','" + StudyPriority + "','" + StudyRadiologist + "','"
						+ ReferingPhysician + "')";
				
				System.out.println(sql);
				stmt = con.createStatement();
				stmt.executeUpdate(sql);

				a++;
				}
			}
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
