package org.jbpm.michaelsproject;

/**
 * This class was automatically generated by the data modeler tool.
 */
@org.kie.workbench.common.services.datamodeller.annotations.Label(value = "mdmod")
public class michaelsDMOD  implements java.io.Serializable {

static final long serialVersionUID = 1L;
    
    @org.kie.workbench.common.services.datamodeller.annotations.Label(value = "value 01")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String val_01;
    
    @org.kie.workbench.common.services.datamodeller.annotations.Label(value = "value 02")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.String val_02;
    
    @org.kie.workbench.common.services.datamodeller.annotations.Label(value = "value 03")
    @org.kie.api.definition.type.Position(value = 2)
    private org.jbpm.michaelsproject.subDMOD val_03;

    public michaelsDMOD() {
    }

    public michaelsDMOD(java.lang.String val_01, java.lang.String val_02, org.jbpm.michaelsproject.subDMOD val_03) {
        this.val_01 = val_01;
        this.val_02 = val_02;
        this.val_03 = val_03;
    }


    
    public java.lang.String getVal_01() {
        return this.val_01;
    }

    public void setVal_01(  java.lang.String val_01 ) {
        this.val_01 = val_01;
    }
    
    public java.lang.String getVal_02() {
        return this.val_02;
    }

    public void setVal_02(  java.lang.String val_02 ) {
        this.val_02 = val_02;
    }
    
    public org.jbpm.michaelsproject.subDMOD getVal_03() {
        return this.val_03;
    }

    public void setVal_03(  org.jbpm.michaelsproject.subDMOD val_03 ) {
        this.val_03 = val_03;
    }
}