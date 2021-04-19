package com.bcp.card.credit.dao;

import com.bcp.card.credit.model.entity.CrediCard;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CrediCardRespository extends ReactiveCrudRepository<CrediCard, Long> {

}
