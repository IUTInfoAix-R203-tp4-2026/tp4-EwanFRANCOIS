package fr.univ_amu.iut.exercice3;

import java.util.ArrayList;
import java.util.List;

public class Historique {
  private static final int TAILLE_MAX_HISTORIQUE = 10;
  private final List<String> historique = new ArrayList<>();

  public void enregistrer(String choix) {
    this.historique.add(choix);
    if (this.historique.size() > TAILLE_MAX_HISTORIQUE) {
      this.historique.remove(0);
    }
  }

  public List<String> asList() {
    return historique;
  }

  /// Retourne le menu formaté (numérotation 1-based, une option par ligne).
  public String afficher() {
    StringBuilder sb = new StringBuilder();
    sb.append("--- Historique ---\n");
    for (String h : historique) {
      sb.append("- ").append(h).append("\n");
    }
    return sb.toString();
  }
}
