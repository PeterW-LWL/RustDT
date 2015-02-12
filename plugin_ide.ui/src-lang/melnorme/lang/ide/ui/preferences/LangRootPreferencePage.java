/*******************************************************************************
 * Copyright (c) 2015, 2015 Bruno Medeiros and other Contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package melnorme.lang.ide.ui.preferences;


import melnorme.lang.ide.core.bundlemodel.SDKPreferences;
import melnorme.lang.ide.ui.LangUIPlugin;
import melnorme.lang.ide.ui.preferences.common.AbstractComponentsPrefPage;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public abstract class LangRootPreferencePage extends AbstractComponentsPrefPage {
	
	protected final LangSDKConfigBlock langSDKConfigBlock = new LangSDKConfigBlock();
	
	public LangRootPreferencePage() {
		super(LangUIPlugin.getCorePrefStore());
		
		addStringComponent(SDKPreferences.SDK_PATH.key, langSDKConfigBlock.getLocationField());
	}
	
	@Override
	protected Control createContents(Composite parent) {
		return langSDKConfigBlock.createComponent(parent);
	}
	
}