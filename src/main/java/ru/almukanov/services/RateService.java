package ru.almukanov.services;

import ru.almukanov.classes.Rating;
import ru.almukanov.classes.Students;
import ru.almukanov.dao.RateDao;

import java.util.List;

public class RateService {
    private RateDao rateDao = new RateDao();

    public RateService() {
    }



    public void saveRate(Rating rate) {
        rateDao.save(rate);
    }

    public void deleteRate(Rating rate) {
        rateDao.delete(rate);
    }

    public void updateRate(Rating rate) {
        rateDao.update(rate);
    }





    public Students findStudentById(int id) {
        return rateDao.findStudentById(id);
    }


}
