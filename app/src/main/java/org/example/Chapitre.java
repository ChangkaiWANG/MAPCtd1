package org.example;

public class Chapitre implements Document{

  private String titre;
  private String[] pages;

  public Chapitre(String titre, String[] pages) {
    this.titre = titre;
    this.pages = pages;
  }

  @Override
  public String titre() {
    return titre;
  }

  @Override
  public int taille() {
    return pages.length;
  }
  
}
