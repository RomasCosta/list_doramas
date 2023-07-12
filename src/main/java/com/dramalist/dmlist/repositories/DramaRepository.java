/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dramalist.dmlist.repositories;

import com.dramalist.dmlist.entities.Drama;
import com.dramalist.dmlist.projections.DramaMinProjection;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author romar
 */
public interface DramaRepository extends JpaRepository<Drama, Long> {
    
    @Query(nativeQuery = true, value = """
		SELECT tb_drama.id, tb_drama.title, tb_drama.drama_year AS `year`, tb_drama.img_url AS imgUrl,
		tb_drama.short_description AS shortDescription, tb_belonging.position
		FROM tb_drama
		INNER JOIN tb_belonging ON tb_drama.id = tb_belonging.drama_id
		WHERE tb_belonging.list_id = :listId
		ORDER BY tb_belonging.position
			""")
    List<DramaMinProjection> searchByList(Long listId);
}
