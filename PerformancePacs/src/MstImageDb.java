import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MstImageDb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3308/cloud_pacs", "root","");
			Statement stmt = con.createStatement();

			ResultSet rs = (ResultSet) stmt.executeQuery("select * from mst_image ");

			while (rs.next()) {
				int id = rs.getInt("image_id");
				String SopInstance = rs.getString("image_sopinstance_uid");
				String SeriesInstance = rs.getString("image_seriesinstance_uid");
				String StudyInstanceId = rs.getString("image_studyinstance_uid");
				String SopClassUid = rs.getString("image_sopclass_uid");
				String ImageInsNum = rs.getString("image_instance_number");
				String StatusId = rs.getString("image_status_id");
				String imagePath = rs.getString("image_image_path");
				String ImageName = rs.getString("image_image_name");
				String  multiframe= rs.getString("image_multiframe");
				String FrameNo = rs.getString("image_number_of_frames");
				String SendStatus = rs.getString("image_send_status");
				String ForwardDate = rs.getString("image_forward_date_time");
				String ReceivedDate = rs.getString("image_received_date_time");
				String ReceiveStatus = rs.getString("image_receive_status");
				String StoreUrl = rs.getString("image_file_store_url");
				String Slicelocation = rs.getString("image_slice_location");
				String EncapsulatedDoc = rs.getString("image_encapsulated_document");
				String ThumbnailStatus = rs.getString("image_thumbnail_status");
				String ReferenceUid = rs.getString("image_frame_of_reference_uid");
				String Position = rs.getString("image_image_position");
				String imageOrient = rs.getString("image_image_orientation");
				String PixelSpacing = rs.getString("image_pixel_spacing");
				String SliceThickness = rs.getString("image_slice_thickness");
				String Rows = rs.getString("image_rows");
				String ImgColumns = rs.getString("image_columns");
				String RefSopInstance = rs.getString("image_referenced_sopinstance_uid");
				String ImgPId = rs.getString("image_patient_id");
				String patientName = rs.getString("image_patient_name");

				for(int a = 01; a<=200000 ;a++) {

				String sql = "INSERT INTO mst_image(image_sopinstance_uid,image_seriesinstance_uid,image_studyinstance_uid,image_sopclass_uid,image_instance_number,"
						+ "image_status_id,image_image_path,image_image_name,image_multiframe,image_number_of_frames,image_send_status,image_forward_date_time,image_received_date_time,image_receive_status,image_file_store_url,image_slice_location,"
						+ "image_encapsulated_document,image_thumbnail_status,image_frame_of_reference_uid,image_image_position,image_image_orientation,image_pixel_spacing,image_slice_thickness,image_rows,image_columns,image_referenced_sopinstance_uid,image_patient_id,image_patient_name)"
						+
						"VALUES ('" + SopInstance +a+ "','" + SeriesInstance +   "','" + StudyInstanceId + "',"
								+ "'" + SopClassUid + "','" + ImageInsNum + "','" + StatusId + "','" + imagePath + "',"
								+ "'" + ImageName + "','" + multiframe + "','" + FrameNo + "','" + SendStatus + "',"
								+ "'" + ForwardDate + "','" + ReceivedDate + "','" + ReceiveStatus + "','" + StoreUrl + "',"
								+ "'" + Slicelocation + "','" + EncapsulatedDoc + "','" + ThumbnailStatus + "','" + ReferenceUid + "',"
								+ "'"+Position+"','"+imageOrient+ "','"+PixelSpacing+ "','"+SliceThickness+ "','"+Rows+ "','"+ImgColumns+ "','"+RefSopInstance+ "','"+ImgPId+ "','"+patientName+ "')";
				
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
