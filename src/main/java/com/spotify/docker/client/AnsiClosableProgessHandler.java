package com.spotify.docker.client;

import java.io.IOException;
import java.io.PrintStream;

public class AnsiClosableProgessHandler extends AnsiProgressHandler implements ClosableProgessHandler {

    private final PrintStream out;
    
    public AnsiClosableProgessHandler(PrintStream out) {
      super(out);
      this.out = out;
    }
    
    @Override
    public void close() throws IOException {
        this.out.close();
    }

}
