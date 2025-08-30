package com.vmlens.nottraced.agent.classtransformer.factorycollectionadapter;

import com.vmlens.nottraced.agent.classtransformer.factorycollection.FactoryCollection;
import com.vmlens.nottraced.agent.classtransformer.methodvisitorfactory.MethodVisitorFactory;
import com.vmlens.shaded.gnu.trove.list.linked.TLinkedList;
import com.vmlens.trace.agent.bootstrap.util.TLinkableWrapper;
import gnu.trove.list.linked.TLinkedList;

public class FactoryCollectionAdapterForTransform implements FactoryCollectionAdapter {

    private final FactoryCollection factoryCollection;

    public FactoryCollectionAdapterForTransform(FactoryCollection factoryCollection) {
        this.factoryCollection = factoryCollection;
    }

    @Override
    public TLinkedList<TLinkableWrapper<MethodVisitorFactory>> get(FactoryCollectionAdapterContext context) {
        return factoryCollection.getTransformAndSetStrategy(context);
    }

    @java.lang.Override
    public gnu.trove.list.linked.TLinkedList<TLinkableWrapper<MethodVisitorFactory>> getForConstructor(FactoryCollectionAdapterContext context) {
        factoryCollection.getTransformAndSetStrategy(context);
    }
}