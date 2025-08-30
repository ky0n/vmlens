package com.vmlens.nottraced.agent.classtransformer.factorycollectionadapter;

import com.vmlens.nottraced.agent.classtransformer.methodvisitorfactory.MethodVisitorFactory;
import com.vmlens.shaded.gnu.trove.list.linked.TLinkedList;
import com.vmlens.trace.agent.bootstrap.util.TLinkableWrapper;
import gnu.trove.list.linked.TLinkedList;

public interface FactoryCollectionAdapter {

    TLinkedList<TLinkableWrapper<MethodVisitorFactory>> get(FactoryCollectionAdapterContext context);

    gnu.trove.list.linked.TLinkedList<TLinkableWrapper<MethodVisitorFactory>> getForConstructor(FactoryCollectionAdapterContext context);
}
