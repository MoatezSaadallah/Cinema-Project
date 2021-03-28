package com.cinema.service;

import com.cinema.dao.*;
import com.cinema.entities.Cinema;
import com.cinema.entities.Place;
import com.cinema.entities.Salle;
import com.cinema.entities.Ville;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class CinemaInitServiceImpl implements ICinemaInitService{
    @Autowired
    private VilleRepository villeRepository;
    @Autowired
    private CinemaRepository cinemaRepository;
    @Autowired
    private SalleRepository salleRepository;
    @Autowired
    private PlaceRepository placeRepository;
    @Autowired
    private FilmRepository filmRepository;
    @Autowired
    private TicketRepository ticketRepository;
    @Autowired
    private ProjectionRepository projectionRepository;
    @Autowired
    private SeanceRepository seanceRepository;
    @Autowired
    private CategorieRepository categorieRepository;

    @Override
    public void initVilles() {
        Stream.of("Tunis","Hammam Lif","Ezzahra","Carthage","Ariana").forEach(nameVille-> {
            Ville ville=new Ville();
            ville.setName(nameVille);
            villeRepository.save(ville);
        });
    }

    @Override
    public void initCinemas() {
        villeRepository.findAll().forEach(v->{
            Stream.of("MegaRama","Path","IMAX","FOUNOUN")
                    .forEach(nameCinema-> {
                        Cinema cinema = new Cinema();
                        cinema.setName(nameCinema);
                        cinema.setNombreSalles((int) (3+Math.random()*7));
                        cinema.setVille(v);
                    });
        });

    }

    @Override
    public void initSalles() {
        cinemaRepository.findAll().forEach(cinema -> {
           for (int i=0;i<cinema.getNombreSalles();i++){
               Salle salle = new Salle();
               salle.setName("Salle : "+(i+1));
               salle.setCinema(cinema);
               salle.setNombrePlace(15+(int) (20+(Math.random()*20)));
               salleRepository.save(salle);
           }
        });
    }

    @Override
    public void initPlaces() {
        salleRepository.findAll().forEach(salle -> {
            for (int i=0;i<salle.getNombrePlace();i++){
                Place place = new Place();
                place.setNumero(i+1);
                place.setSalle(salle);
                placeRepository.save(place);
            }
        });
    }

    @Override
    public void initSeances() {
a
    }

    @Override
    public void initCategories() {

    }

    @Override
    public void initFilms() {

    }

    @Override
    public void initProjections() {

    }

    @Override
    public void initTickets() {

    }
}
