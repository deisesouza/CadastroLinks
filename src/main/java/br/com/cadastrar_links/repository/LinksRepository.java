package br.com.cadastrar_links.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.cadastrar_links.model.Links;

@Repository
public interface LinksRepository extends JpaRepository<Links, Long>{

}
