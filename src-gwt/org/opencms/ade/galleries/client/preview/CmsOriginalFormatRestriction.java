/*
 * File   : $Source: /alkacon/cvs/opencms/src-gwt/org/opencms/ade/galleries/client/preview/CmsOriginalFormatRestriction.java,v $
 * Date   : $Date: 2011/06/10 06:57:23 $
 * Version: $Revision: 1.1 $
 *
 * This library is part of OpenCms -
 * the Open Source Content Management System
 *
 * Copyright (C) 2002 - 2011 Alkacon Software (http://www.alkacon.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about Alkacon Software, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.opencms.ade.galleries.client.preview;

import org.opencms.util.CmsStringUtil;

/**
 * Original image format restriction. To be used within the image format tab of the image preview.<p>
 * 
 * @author Tobias Herrmann
 * 
 * @version $Revision: 1.1 $
 * 
 * @since 8.0.0
 */
public class CmsOriginalFormatRestriction implements I_CmsFormatRestriction {

    /** The format label. */
    private String m_label;

    /**
     * Constructor.<p>
     * 
     * @param label the format label 
     */
    public CmsOriginalFormatRestriction(String label) {

        m_label = label;
    }

    /**
     * @see org.opencms.ade.galleries.client.preview.I_CmsFormatRestriction#adjustCroppingParam(org.opencms.ade.galleries.client.preview.CmsCroppingParamBean)
     */
    public void adjustCroppingParam(CmsCroppingParamBean croppingParam) {

        croppingParam.reset();
    }

    /**
     * @see org.opencms.ade.galleries.client.preview.I_CmsFormatRestriction#getHeight(int, int)
     */
    public int getHeight(int orgHeight, int orgWidth) {

        return orgHeight;
    }

    /**
     * @see org.opencms.ade.galleries.client.preview.I_CmsFormatRestriction#getLabel()
     */
    public String getLabel() {

        return m_label;
    }

    /**
     * @see org.opencms.ade.galleries.client.preview.I_CmsFormatRestriction#getWidth(int, int)
     */
    public int getWidth(int orgHeight, int orgWidth) {

        return orgWidth;
    }

    /**
     * @see org.opencms.ade.galleries.client.preview.I_CmsFormatRestriction#isCroppingEnabled()
     */
    public boolean isCroppingEnabled() {

        return false;
    }

    /**
     * @see org.opencms.ade.galleries.client.preview.I_CmsFormatRestriction#isFixedRatio()
     */
    public boolean isFixedRatio() {

        return true;
    }

    /**
     * @see org.opencms.ade.galleries.client.preview.I_CmsFormatRestriction#isHeightEditable()
     */
    public boolean isHeightEditable() {

        return false;
    }

    /**
     * @see org.opencms.ade.galleries.client.preview.I_CmsFormatRestriction#isWidthEditable()
     */
    public boolean isWidthEditable() {

        return false;
    }

    /**
     * @see org.opencms.ade.galleries.client.preview.I_CmsFormatRestriction#matchesCroppingParam(org.opencms.ade.galleries.client.preview.CmsCroppingParamBean)
     */
    public boolean matchesCroppingParam(CmsCroppingParamBean croppingParam) {

        return CmsStringUtil.isEmpty(croppingParam.toString());
    }

}