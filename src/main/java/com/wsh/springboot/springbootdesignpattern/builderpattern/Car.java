package com.wsh.springboot.springbootdesignpattern.builderpattern;

/**
 * @Description: 汽车产品类
 * @author: weixiaohuai
 * @Date: 2019/10/24 14:38
 */
public class Car {
    private StampingMaterial stampingMaterial;
    private WeldingMaterial weldingMaterial;
    private PaintingMaterial paintingMaterial;
    private InspectionMaterial inspectionMaterial;

    public StampingMaterial getStampingMaterial() {
        return stampingMaterial;
    }

    public void setStampingMaterial(StampingMaterial stampingMaterial) {
        this.stampingMaterial = stampingMaterial;
    }

    public WeldingMaterial getWeldingMaterial() {
        return weldingMaterial;
    }

    public void setWeldingMaterial(WeldingMaterial weldingMaterial) {
        this.weldingMaterial = weldingMaterial;
    }

    public PaintingMaterial getPaintingMaterial() {
        return paintingMaterial;
    }

    public void setPaintingMaterial(PaintingMaterial paintingMaterial) {
        this.paintingMaterial = paintingMaterial;
    }

    public InspectionMaterial getInspectionMaterial() {
        return inspectionMaterial;
    }

    public void setInspectionMaterial(InspectionMaterial inspectionMaterial) {
        this.inspectionMaterial = inspectionMaterial;
    }

    @Override
    public String toString() {
        return "Car{" +
                "stampingMaterial=" + stampingMaterial +
                ", weldingMaterial=" + weldingMaterial +
                ", paintingMaterial=" + paintingMaterial +
                ", inspectionMaterial=" + inspectionMaterial +
                '}';
    }
}
