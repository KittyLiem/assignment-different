package com.finalist.beans;

import java.util.Calendar;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import com.finalist.beans.Imageset;

@HippoEssentialsGenerated(internalName = "myassignment:newsdocument")
@Node(jcrType = "myassignment:newsdocument")
public class NewsDocument extends HippoDocument {
	/** 
	 * The document type of the news document.
	 */
	public final static String DOCUMENT_TYPE = "myassignment:newsdocument";
	private final static String TITLE = "myassignment:title";
	private final static String DATE = "myassignment:date";
	private final static String INTRODUCTION = "myassignment:introduction";
	private final static String IMAGE = "myassignment:image";
	private final static String CONTENT = "myassignment:content";
	private final static String LOCATION = "myassignment:location";
	private final static String AUTHOR = "myassignment:author";
	private final static String SOURCE = "myassignment:source";

	/** 
	 * Get the title of the document.
	 * @return the title
	 */
	@HippoEssentialsGenerated(internalName = "myassignment:title")
	public String getTitle() {
		return getProperty(TITLE);
	}

	/** 
	 * Get the date of the document.
	 * @return the date
	 */
	@HippoEssentialsGenerated(internalName = "myassignment:date")
	public Calendar getDate() {
		return getProperty(DATE);
	}

	/** 
	 * Get the introduction of the document.
	 * @return the introduction
	 */
	@HippoEssentialsGenerated(internalName = "myassignment:introduction")
	public String getIntroduction() {
		return getProperty(INTRODUCTION);
	}

	/** 
	 * Get the main content of the document.
	 * @return the content
	 */
	@HippoEssentialsGenerated(internalName = "myassignment:content")
	public HippoHtml getContent() {
		return getHippoHtml(CONTENT);
	}

	/** 
	 * Get the location of the document.
	 * @return the location
	 */
	@HippoEssentialsGenerated(internalName = "myassignment:location")
	public String getLocation() {
		return getProperty(LOCATION);
	}

	/** 
	 * Get the author of the document.
	 * @return the author
	 */
	@HippoEssentialsGenerated(internalName = "myassignment:author")
	public String getAuthor() {
		return getProperty(AUTHOR);
	}

	/** 
	 * Get the source of the document.
	 * @return the source
	 */
	@HippoEssentialsGenerated(internalName = "myassignment:source")
	public String getSource() {
		return getProperty(SOURCE);
	}

	@HippoEssentialsGenerated(internalName = "myassignment:image")
	public Imageset getImage() {
		return getLinkedBean("myassignment:image", Imageset.class);
	}
}
