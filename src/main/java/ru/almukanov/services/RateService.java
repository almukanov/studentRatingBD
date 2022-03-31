package ru.almukanov.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.almukanov.classes.Rating;
import ru.almukanov.dao.RateDaoImpl;

@Component
public class RateService {
    public RateDaoImpl getRateDaoImpl() {
        return rateDaoImpl;
    }
@Autowired
    public void setRateDaoImpl(RateDaoImpl rateDaoImpl) {
        this.rateDaoImpl = rateDaoImpl;
    }

    public RateDaoImpl rateDaoImpl;




    public double select(int id){
      return  rateDaoImpl.select(id);
    }
    public void saveRate(Rating rate) {
        rateDaoImpl.save(rate);
    }

    public void deleteRate(Rating rate) {
        rateDaoImpl.delete(rate);
    }

    public void updateRate(Rating rate) {
        rateDaoImpl.update(rate);
    }








}
