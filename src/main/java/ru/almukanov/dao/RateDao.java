package ru.almukanov.dao;

import ru.almukanov.classes.Rating;
import ru.almukanov.classes.Students;

public interface RateDao {
    public void save(Rating rate);
    public void update(Rating rate);
    public void delete(Rating rate);

}
