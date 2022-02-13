package ru.almukanov.services;

import ru.almukanov.classes.Rating;
import ru.almukanov.classes.Students;
import ru.almukanov.dao.RateDaoImpl;

public class RateService {
    private RateDaoImpl rateDaoImpl = new RateDaoImpl();

    public RateService() {
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
