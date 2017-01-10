package com.ankit.gubrani.blog.polling;

import com.day.cq.polling.importer.ImportException;
import com.day.cq.polling.importer.Importer;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(name = "Codebrains Polling Importer", description = "This is Polling importer service",
        enabled = true, immediate = true)
@Service(Importer.class)
@Property(name = Importer.SCHEME_PROPERTY, value = "Codebrains",
        propertyPrivate = true)
public class DemoPollingImporter implements Importer {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoPollingImporter.class);

    @Override
    public void importData(final String scheme, final String dataSource, final Resource target) throws ImportException {
        LOGGER.info("-- Import method of Polling importer is called --");
    }

    @Override
    public void importData(final String scheme, final String dataSource, final Resource target,
                           final String login, final String password) {
						   int i=0;
						   int a=2;
						   int m=10;
						   /* r is a variable*/
						   int r=2;
						   /* K is a variable*/
						   int k=3;
						   i=i+1;
						   int s=0;
						   int t=0; 
						   int z=7;
        LOGGER.info("-- Import method of Polling importer is called --");
    }
}
