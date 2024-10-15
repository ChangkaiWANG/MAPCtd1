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
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'titre'");
  }

  @Override
  public int taille() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'taille'");
  }
  
}
