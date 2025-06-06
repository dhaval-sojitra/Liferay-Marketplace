package com.ignek.marketplace.orphen.fragment.cleaner.portlet;

import com.ignek.marketplace.orphen.fragment.cleaner.constants.OrphenFragmentCleanerWebPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author dell
 */

@Component(
	property = {
		"com.liferay.portlet.display-category=category.hidden",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=Orphen Fragment Cleaner Web",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/fragment_cleaner.jsp",
		"javax.portlet.name=" + OrphenFragmentCleanerWebPortletKeys.ORPHEN_FRAGMENT_CLEANER_WEB_PORTLET_KEY,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=administrator"
	},
	service = Portlet.class
)
public class OrphenFragmentCleanerWebPortlet extends MVCPortlet {

}