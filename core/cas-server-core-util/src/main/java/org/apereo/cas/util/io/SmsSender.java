package org.apereo.cas.util.io;

/**
 * This is {@link SmsSender}.
 *
 * @author Misagh Moayyed
 * @since 5.1.0
 */
public interface SmsSender {

    /**
     * Send sms to phone number.
     *
     * @param from    the from
     * @param to      the to
     * @param message the message
     */
    void send(String from, String to, String message);
}
