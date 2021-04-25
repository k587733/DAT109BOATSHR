package no.hvl.dat109.controller;

import no.hvl.dat109.model.BåtInfo;
import no.hvl.dat109.model.KundeProfil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Ansatt extends KundeProfil {


   public Ansatt(String navn, String adresse, String epost, int telefonnummer, int kredittkort) {
      super(navn, adresse, epost, telefonnummer, kredittkort);
   }

   public void oppdater() {
      BåtInfo båtInfo = new BåtInfo();
   }



}
