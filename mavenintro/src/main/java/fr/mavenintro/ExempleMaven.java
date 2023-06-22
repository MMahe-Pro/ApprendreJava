package fr.mavenintro;
//Utiliser Maj+Ctrl+O pour importer les bibliothèques

import ij.IJ;
import ij.ImagePlus;

public class ExempleMaven {

	public static void main(String[] args) {
        ImagePlus imp = IJ.openImage(); // Choisit un fichier et stocke le résultat dans imp
        imp.show(); // Affiche l'image à l'écran

	}

}
