package com.citrus.api.infraestructure.RabbitMQ.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class data {

	 	private Integer id;
	    private String company_name;
	    private String special_requirements;
	    private Integer status;
	    
	    
		public Integer getid() {
			return id;
		}
		public void setid(Integer id) {
			this.id = id;
		}
		
		public String getcompany_name() {
			return company_name;
		}
		public void setcompany_name(String company_name) {
			this.company_name = company_name;
		}
		
		public String getSpecial_requirements() {
			return special_requirements;
		}

		public void setSpecial_requirements(String special_requirements) {
			this.special_requirements = special_requirements;
		}
		
		public Integer getStatus() {
			return status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
}
