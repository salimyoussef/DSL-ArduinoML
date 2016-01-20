package NewLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {

  /*package*/ final ConceptDescriptor myConceptAction = new ConceptDescriptorBuilder("NewLanguage.structure.Action", MetaIdFactory.conceptId(0x24f6669a8ba14c5aL, 0xbbc4b68f2c44cf80L, 0x1e5fee171cf7de31L)).super_("jetbrains.mps.lang.core.structure.BaseConcept").super_(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).parents("jetbrains.mps.lang.core.structure.BaseConcept").parentIds(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).propertyDescriptors(new ConceptDescriptorBuilder.Prop(2188729726963015420L, "status")).properties("status").referenceDescriptors(new ConceptDescriptorBuilder.Ref(2188729726963015441L, "actuator", MetaIdFactory.conceptId(0x24f6669a8ba14c5aL, 0xbbc4b68f2c44cf80L, 0x1e5fee171cefced3L), false)).references("actuator").create();
  /*package*/ final ConceptDescriptor myConceptActuator = new ConceptDescriptorBuilder("NewLanguage.structure.Actuator", MetaIdFactory.conceptId(0x24f6669a8ba14c5aL, 0xbbc4b68f2c44cf80L, 0x1e5fee171cefced3L)).super_("NewLanguage.structure.Brick").super_(MetaIdFactory.conceptId(0x24f6669a8ba14c5aL, 0xbbc4b68f2c44cf80L, 0x1e5fee171cef0996L)).parents("NewLanguage.structure.Brick").parentIds(MetaIdFactory.conceptId(0x24f6669a8ba14c5aL, 0xbbc4b68f2c44cf80L, 0x1e5fee171cef0996L)).create();
  /*package*/ final ConceptDescriptor myConceptApp = new ConceptDescriptorBuilder("NewLanguage.structure.App", MetaIdFactory.conceptId(0x24f6669a8ba14c5aL, 0xbbc4b68f2c44cf80L, 0x1e5fee171cefcedcL)).super_("jetbrains.mps.lang.core.structure.BaseConcept").super_(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.execution.util.structure.IMainClass").parentIds(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL), MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L), MetaIdFactory.conceptId(0x4caf0310491e41f5L, 0x8a9b2006b3a94898L, 0x40c1a7cb987d20d5L)).referenceDescriptors(new ConceptDescriptorBuilder.Ref(2188729726963015875L, "init_state", MetaIdFactory.conceptId(0x24f6669a8ba14c5aL, 0xbbc4b68f2c44cf80L, 0x1e5fee171cf7dd9bL), false)).references("init_state").childDescriptors(new ConceptDescriptorBuilder.Link(2188729726962487015L, "bricks", MetaIdFactory.conceptId(0x24f6669a8ba14c5aL, 0xbbc4b68f2c44cf80L, 0x1e5fee171cef0996L), false, true, false), new ConceptDescriptorBuilder.Link(2188729726963015825L, "states", MetaIdFactory.conceptId(0x24f6669a8ba14c5aL, 0xbbc4b68f2c44cf80L, 0x1e5fee171cf7dd9bL), false, true, false)).children(new String[]{"bricks", "states"}, new boolean[]{true, true}).create();
  /*package*/ final ConceptDescriptor myConceptBrick = new ConceptDescriptorBuilder("NewLanguage.structure.Brick", MetaIdFactory.conceptId(0x24f6669a8ba14c5aL, 0xbbc4b68f2c44cf80L, 0x1e5fee171cef0996L)).super_("jetbrains.mps.lang.core.structure.BaseConcept").super_(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept").parentIds(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL), MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L)).propertyDescriptors(new ConceptDescriptorBuilder.Prop(2188729726962486990L, "pin")).properties("pin").abstract_().create();
  /*package*/ final ConceptDescriptor myConceptSensor = new ConceptDescriptorBuilder("NewLanguage.structure.Sensor", MetaIdFactory.conceptId(0x24f6669a8ba14c5aL, 0xbbc4b68f2c44cf80L, 0x1e5fee171cf3a2b5L)).super_("NewLanguage.structure.Brick").super_(MetaIdFactory.conceptId(0x24f6669a8ba14c5aL, 0xbbc4b68f2c44cf80L, 0x1e5fee171cef0996L)).parents("NewLanguage.structure.Brick").parentIds(MetaIdFactory.conceptId(0x24f6669a8ba14c5aL, 0xbbc4b68f2c44cf80L, 0x1e5fee171cef0996L)).create();
  /*package*/ final ConceptDescriptor myConceptState = new ConceptDescriptorBuilder("NewLanguage.structure.State", MetaIdFactory.conceptId(0x24f6669a8ba14c5aL, 0xbbc4b68f2c44cf80L, 0x1e5fee171cf7dd9bL)).super_("jetbrains.mps.lang.core.structure.BaseConcept").super_(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).parents("jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.core.structure.BaseConcept").parentIds(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L), MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).childDescriptors(new ConceptDescriptorBuilder.Link(2188729726963017526L, "actions", MetaIdFactory.conceptId(0x24f6669a8ba14c5aL, 0xbbc4b68f2c44cf80L, 0x1e5fee171cf7de31L), false, true, false), new ConceptDescriptorBuilder.Link(2188729726963017530L, "transition", MetaIdFactory.conceptId(0x24f6669a8ba14c5aL, 0xbbc4b68f2c44cf80L, 0x1e5fee171cf7de62L), false, false, false)).children(new String[]{"actions", "transition"}, new boolean[]{true, false}).create();
  /*package*/ final ConceptDescriptor myConceptTransition = new ConceptDescriptorBuilder("NewLanguage.structure.Transition", MetaIdFactory.conceptId(0x24f6669a8ba14c5aL, 0xbbc4b68f2c44cf80L, 0x1e5fee171cf7de62L)).super_("jetbrains.mps.lang.core.structure.BaseConcept").super_(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).parents("jetbrains.mps.lang.core.structure.BaseConcept").parentIds(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).propertyDescriptors(new ConceptDescriptorBuilder.Prop(2188729726963015328L, "status")).properties("status").referenceDescriptors(new ConceptDescriptorBuilder.Ref(2188729726963015362L, "sensor", MetaIdFactory.conceptId(0x24f6669a8ba14c5aL, 0xbbc4b68f2c44cf80L, 0x1e5fee171cf3a2b5L), false), new ConceptDescriptorBuilder.Ref(2188729726963015381L, "target", MetaIdFactory.conceptId(0x24f6669a8ba14c5aL, 0xbbc4b68f2c44cf80L, 0x1e5fee171cf7dd9bL), false)).references("sensor", "target").create();

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptAction, myConceptActuator, myConceptApp, myConceptBrick, myConceptSensor, myConceptState, myConceptTransition);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0l, conceptFqName)) {
      case 0:
        return myConceptAction;
      case 1:
        return myConceptActuator;
      case 2:
        return myConceptApp;
      case 3:
        return myConceptBrick;
      case 4:
        return myConceptSensor;
      case 5:
        return myConceptState;
      case 6:
        return myConceptTransition;
      default:
        return null;
    }
  }
  private static String[] stringSwitchCases_1htk8d_a0a0l = new String[]{"NewLanguage.structure.Action", "NewLanguage.structure.Actuator", "NewLanguage.structure.App", "NewLanguage.structure.Brick", "NewLanguage.structure.Sensor", "NewLanguage.structure.State", "NewLanguage.structure.Transition"};
}
