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
package melnorme.lang.tooling;

import static melnorme.utilbox.core.CoreUtil.areEqual;
import melnorme.lang.tooling.ast.SourceRange;
import melnorme.lang.tooling.completion.LangToolCompletionProposal;
import melnorme.utilbox.collections.Indexable;

@LANG_SPECIFIC
public class ToolCompletionProposal extends LangToolCompletionProposal {
	
	protected String description;
	
	public ToolCompletionProposal(int replaceOffset, int replaceLength, String replaceString, String label,
			CompletionProposalKind kind, ElementAttributes attributes, String moduleName, String description) {
		this(replaceOffset, replaceLength, replaceString, label, kind, attributes, moduleName, description, 
			replaceString, null);
	}
	
	public ToolCompletionProposal(int replaceOffset, int replaceLength, String replaceString, String label,
			CompletionProposalKind kind, ElementAttributes attributes, String moduleName, String description, 
			String fullReplaceString, Indexable<SourceRange> sourceSubElements) {
		super(replaceOffset, replaceLength, replaceString, label, kind, attributes, moduleName, fullReplaceString, 
			sourceSubElements);
		this.description = description;
	}
	
	@Override
	protected boolean subclassEquals(LangToolCompletionProposal other) {
		/* FIXME: add this to ToolProposal */
		return areEqual(description, ((ToolCompletionProposal) other).description);
	}
	
}