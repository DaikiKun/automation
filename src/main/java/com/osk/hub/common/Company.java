/**
 * @author OAK SOE KHANT
 *
 */
package com.osk.hub.common;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.core.annotation.Order;

import jakarta.annotation.Priority;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "COMPANY")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Company implements Serializable {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.UUID)
		@Column(name="ID")
		private String id;
		@Column(name = "COMPANY_NAME",columnDefinition = "varchar(50)")
		private String cpnName;
		@Column(name = "COMPANY_CONTACT",columnDefinition = "varchar(50)")
		private String cpnContact;
		@Column(name = "COMPANY_ADDRESS",columnDefinition = "varchar(50)")
		private String cpnAddress;
		@Column(name = "CREATEDATE",columnDefinition = "datetime2")
		private LocalDate createdDate;
		@Column(name = "UPDATEDDATE")
		private LocalDate updatedDate;
		@Column(name = "VERSION",columnDefinition = "smallint")
		private int version;
		

}
