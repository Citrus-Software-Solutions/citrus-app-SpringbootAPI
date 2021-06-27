package application.port;

import org.springframework.data.jpa.repository.JpaRepository;

import adapter.out.persistance.Job_OfferJPA;

public interface IJob_OfferJPA extends JpaRepository<Job_OfferJPA, Long> {

}
