package cn.com.exception;

import java.io.IOException;

/**
 * HTTP request exception whose cause is always an {@link IOException}
 *
 * @author czx.me
 * @date 2019/9/30
 */
public class RequestException extends RuntimeException {

    /**
     * Create a new HttpRequestException with the given cause
     *
     * @param cause
     */
    public RequestException(final IOException cause) {
        super(cause);
    }

    /**
     * Get {@link IOException} that triggered this request exception
     *
     * @return {@link IOException} cause
     */
    @Override
    public IOException getCause() {
        return (IOException) super.getCause();
    }

}
