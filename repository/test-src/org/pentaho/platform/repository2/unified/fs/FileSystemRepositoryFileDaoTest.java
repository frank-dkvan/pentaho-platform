package org.pentaho.platform.repository2.unified.fs;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: kwalker
 * Date: 8/23/13
 * Time: 8:44 AM
 */
public class FileSystemRepositoryFileDaoTest {
  @Test
  public void testIdToPath() throws Exception {
    assertEquals("C:/Program Files/pentaho/design-tools/data-integration/Unsaved Report.xanalyzer",
      FileSystemRepositoryFileDao.idToPath("C::Program Files:pentaho:design-tools:data-integration/Unsaved Report.xanalyzer"));
    assertEquals("/home/pentaho/design-tools/data-integration/Unsaved Report.xanalyzer",
      FileSystemRepositoryFileDao.idToPath(":home:pentaho:design-tools:data-integration/Unsaved Report.xanalyzer"));
  }
}
