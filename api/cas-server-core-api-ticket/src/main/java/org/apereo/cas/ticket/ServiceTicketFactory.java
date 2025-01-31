package org.apereo.cas.ticket;

import org.apereo.cas.authentication.principal.Service;

/**
 * The {@link ServiceTicketFactory} is responsible for
 * creating instances of {@link ServiceTicket}.
 *
 * @author Misagh Moayyed
 * @since 4.2
 */
public interface ServiceTicketFactory extends TicketFactory {

    /**
     * Create the ticket object.
     *
     * @param <T>                  the type parameter
     * @param ticketGrantingTicket the ticket granting ticket
     * @param service              the service
     * @param credentialProvided   current credential if provided as part of primary authn, may be false.
     * @param clazz                the clazz
     * @return the t
     * @throws Throwable the throwable
     */
    <T extends Ticket> T create(TicketGrantingTicket ticketGrantingTicket, Service service,
                                boolean credentialProvided, Class<T> clazz) throws Throwable;
}
