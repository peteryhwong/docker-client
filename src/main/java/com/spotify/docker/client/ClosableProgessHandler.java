package com.spotify.docker.client;

import java.io.Closeable;

/**
 * A {@link ProgressHandler} that can be closed as a resource
 */
public interface ClosableProgessHandler extends ProgressHandler, Closeable {

}
