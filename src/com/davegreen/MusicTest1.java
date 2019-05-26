package com.davegreen;

import javax.sound.midi.*;

public class MusicTest1
{
    public void play()
    {
        try
        {
            Sequencer musicPlayer = MidiSystem.getSequencer();      // A sequencer is basically the thing that plays the music.
    
            System.out.println("We got a sequencer!");
        }
        catch(MidiUnavailableException midiEx)
        {
            System.out.println("Bummer!");
        }
        
    }
}
