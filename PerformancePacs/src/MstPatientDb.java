import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MstPatientDb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3308/cloud_pacs", "root","");
			Statement stmt = con.createStatement();

			ResultSet rs = (ResultSet) stmt.executeQuery("select * from mst_patient ");

			while (rs.next()) {
				int id = rs.getInt("patient_id");
				String FirstName = rs.getString("patient_first_name");
				String MiddleName = rs.getString("patient_middle_name");
				String LastName = rs.getString("patient_last_name");
				String PPid = rs.getString("patient_patient_id");
				String Fullname = rs.getString("patient_fullname");
				String Sex = rs.getString("patient_sex");
				String BirthDate = rs.getString("patient_birth_date");
				String MrNo = rs.getString("patient_mr_no");
				String  PatientAge= rs.getString("patient_age");
				String Weight = rs.getString("patient_weight");
				String Height = rs.getString("patient_height");
				String phn = rs.getString("patient_phone_no");
				String Mob = rs.getString("patient_mobile_no");
				String email = rs.getString("patient_email");
				String Address = rs.getString("patient_address");
				String requestPro = rs.getString("patient_req_procedure");
				String ProDate = rs.getString("patient_sch_pro_date");
				String Protime = rs.getString("patient_sch_pro_time");
				String patientPS = rs.getString("patient_ps");
				String History = rs.getString("patient_history");
				String Instanceid = rs.getString("patient_studyinstance_uid");

				for(int a = 0; a<=200000 ;a++) {

				String sql = "INSERT INTO mst_patient(patient_first_name,patient_middle_name,patient_last_name,patient_patient_id,"
						+ "patient_fullname,patient_sex,patient_birth_date,patient_mr_no,patient_age,patient_weight,patient_height,patient_phone_no,"
						+ "patient_mobile_no,patient_email,patient_address,patient_req_procedure,patient_sch_pro_date,patient_sch_pro_time,patient_ps,patient_history,patient_studyinstance_uid)"
						+
						"VALUES ('" + FirstName + "','" + MiddleName +   "','" + LastName + "',"
								+ "'" + PPid + "','" + Fullname + "','" + Sex + "','" + BirthDate + "',"
								+ "'" + MrNo + "','" + PatientAge + "','" + Weight + "','" + Height + "',"
								+ "'" + phn + "','" + Mob + "','" + email + "','" + Address + "',"
								+ "'" + requestPro + "','" + ProDate + "','" + Protime + "','" + patientPS + "',"
								+ "'"+History+"','"+Instanceid+ a +"')";
				
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
