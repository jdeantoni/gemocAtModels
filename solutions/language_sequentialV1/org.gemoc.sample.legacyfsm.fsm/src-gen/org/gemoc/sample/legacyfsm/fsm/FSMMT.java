package org.gemoc.sample.legacyfsm.fsm;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.sample.legacyfsm.fsm.FsmFactory;

@SuppressWarnings("all")
public interface FSMMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract FsmFactory getFsmFactory();
  
  public abstract void save(final String uri) throws IOException;
}
