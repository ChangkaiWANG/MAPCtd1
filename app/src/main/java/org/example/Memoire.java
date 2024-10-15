package org.example;

import java.util.List;

public class Memoire implements Document{
  private String titre;
  private List<Chapitre> chapitres;

  public Memoire(String titre, List<Chapitre> chapitres) {
    this.titre = titre;
    this.chapitres = chapitres;
  }

  @Override
  public String titre() {
    return titre;
  }

  @Override
  public int taille() {
    int t = 0;
    for (Chapitre chap : chapitres){
      t += chap.taille();
    }
    return t;
  }

  
}
