package controllers;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Application.Application;
import Offer.Offer;
import views.OfferView;
import views.SearchResultsView;

public class SearchResultsController implements ListSelectionListener {

	private SearchResultsView view;

	public SearchResultsController(SearchResultsView view) {
		this.view = view;
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		/*
		 * This fires twice, when we press the mouse, and when we release it, so we
		 * avoid the first one in order to prevent possible errors.
		 */
		if(e.getValueIsAdjusting()) {
			return;
		}
		
		/*If the user is not logged, he should not be able
		 * to see the complete offer.*/
		if(view.getLogged() == false) {
			return;
		}

		Offer o = view.getList().getSelectedValue();

		OfferView v = new OfferView(o);
		OfferController c = new OfferController(v);
		v.setController(c);
		Application.getWindow().setSecondaryView(v);

	}

}
