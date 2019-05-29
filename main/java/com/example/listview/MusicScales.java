package com.example.listview;

import java.util.HashMap;

public class MusicScales {

    public String getScales(String asteikko) {

        HashMap<String, String> points = new HashMap<String, String>();

        //pentatonic scales
        points.put("MWHMH", "Hirajoshi scale");
        points.put("HMWHM", "In scale");
        points.put("HMHmW", "Insen scale");
        points.put("HMHMW", "Iwato scale");
        points.put("mWWmW", "Minor pentatonic scale");
        points.put("WmWWm", "Yo scale");
        points.put("WWmWm", "Major pentatonic scale");
        points.put("HWHWH", "Istrian scale");

        //hexatonic scales
        points.put("WWWWWW", "Whole tone scale");
        points.put("WWWmHW", "Prometheus scale");
        points.put("HmWHmW", "Tritone scale");
        points.put("mHmHmH", "Augmented scale");
        points.put("mWHHmW", "Blues scale");

        // Chromatic scale
        points.put("HHHHHHH", "Chromatic scale");

        //Enigmatic heptatonic scale (Giuseppe Verdi/enigmatic, mysterious, puzzling, ambiguous, unclear)
        points.put("HmWWWHH", "Enigmatic scale");

        // Neapolitan Major
        points.put("HWWWWWH", "Neapolitan major scale");
        points.put("WWHHWWW", "Major Locrian scale");

        // Neopolitan minor
        points.put("HWWWHmH", "Neapolitan minor scale");
        points.put("WHmHHWW", "Gypsy scale[a]");

        //Harmoinic Major
        points.put("WWHWHmH", "Harmonic major scale");
        points.put("WHmHWWH", "Pfluke scale");

        //Persian
        points.put("HmHHWmH", "Persian scale");

        //church modes (heptatonic)
        points.put("WWHWWWH", "Ionian mode or major scale");
        points.put("WHWWWHW", "Dorian mode");
        points.put("HWWWHWW", "Phrygian mode");
        points.put("WWWHWWH", "Lydian mode");
        points.put("WWHWWHW", "Mixolydian mode or Adonai malakh mode");
        points.put("WHWWHWW", "Aeolian mode or natural minor scale");
        points.put("HWWHWWW", "Locrian mode");

        //melodic minor mode (heptatonic)
        points.put("WHWWWWH","mi Ma7 Melodic minor scale (mm)" );
        points.put("HWWWWHW","mi7 Dorian b2 mm scale" );
        points.put("WWWWHWH","Ma7#5 Lydian augmented mm scale" );
        points.put("WWWHWHW","7 Lydian dom./Acoustic mm scale" );
        points.put("WWHWHWW","7 Aeolian dom. mm scale" );
        points.put("WHWHWWW","mi7b5 Half dim. mm scale" );
        points.put("HWHWWWW","7 Altered mm scale" );

        //harmonic minor modes (heptatonic)
        points.put("HWHWWHm", "Superlocrian hm scale (Locrian b4)");
        points.put("mHWHWWH", "Lydian #2 hm scale");
        points.put("HmHWHWW", "Phrygian dominant hm scale, Spanish Gypsy Scales");
        points.put("WHmHWHW", "Dorian #4 hm scale (Ukrainian Dorian scale)");
        points.put("WWHmHWH", "Ionian #5 hm scale");
        points.put("HWWHmHW", "Locrian #6 hm scale");
        points.put("WHWWHmH", "Harmonic minor scale (hm)");

        //"Jazz" scales (heptatonic)
        points.put("mWWHHmH", "Blues scale");
        points.put("WWHWHHH", "Bebop dominant scale");
        points.put("WWHHHWH", "Major bebop scale");

        //Double harmonic scales (heptatonic)
        //Also known as: Major Romani, Hungarian Romani Persian, Double Harmonic Major, Enigmatic, Byzantine,
        //Flamenco Mode, Bhairav That, Bhairav Theta, Mela Mayamalavagaula, Raga Paraj, Kalingada, Gaulipantu,
        //Lalitapancamam, Chromatic 2nd Byzantine Liturgical, Hitzazkiar, Maqam Zengule, Hijaz Kar, Suzidil
        points.put("HmHWHmH", "Double harmonic major, Flamenco mode, Gypsy Major, 'Chopin' scale");
        points.put("mHWHmHH", "Lydian ♯2 ♯6");
        points.put("HWHmHmH", "Ultraphrygian");
        points.put("WHmHHmH", "Hungarian Gypsy minor (Flamenco), 'Lizt scale', Algerian");
        points.put("HmHHmHW", "Oriental");
        points.put("mHHmHWH", "Ionian ♯2 ♯5");
        points.put("HHmHWHm", "Locrian double flat3 double flat7");

        //octatonic scales
        points.put("WHWHWHWH", "Octatonic scale");
        points.put("HWHWHWHW", "Diminished scale");
        points.put("HHHHHHHH", "Chromatic scale");

        // Uusia skaaloja

        return points.get(asteikko);

    }
}
