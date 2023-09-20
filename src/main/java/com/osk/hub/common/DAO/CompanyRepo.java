/**
 * @author OAK SOE KHANT
 *
 */
package com.osk.hub.common.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.osk.hub.common.Company;

@Repository
public interface CompanyRepo extends JpaRepository<Company, String> {

}
