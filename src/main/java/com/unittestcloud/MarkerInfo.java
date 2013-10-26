package com.unittestcloud;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.IRequestCycle;
import org.apache.wicket.request.IRequestHandler;
import org.apache.wicket.request.Response;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * 
 * @author davidtoniolo
 *
 */
public class MarkerInfo extends WebPage {
	
	private static final long serialVersionUID = 1L;

	public MarkerInfo(final PageParameters parameters) {
		getRequestCycle().scheduleRequestHandlerAfterCurrent(
				new IRequestHandler() {

					@Override
					public void detach(IRequestCycle arg0) {
					}

					@Override
					public void respond(IRequestCycle arg0) {
						Response response = arg0.getResponse();
						response.write("{\"type\":\"markerinfo\"}");
					}
				});
	}
}
