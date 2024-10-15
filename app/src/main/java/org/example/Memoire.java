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
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'titre'");
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
