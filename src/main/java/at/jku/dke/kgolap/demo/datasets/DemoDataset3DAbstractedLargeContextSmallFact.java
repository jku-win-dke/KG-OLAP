
package at.jku.dke.kgolap.demo.datasets;

public class DemoDataset3DAbstractedLargeContextSmallFact extends DemoDataset3DAbstractedLargeContext {
  public DemoDataset3DAbstractedLargeContextSmallFact() {
    super();
    
    this.setNoOfFillerIterations(8);
    this.setNoOfAirports(10);
    this.setNoOfRunways(20);
    this.setNoOfTaxiways(60);
    this.setNoOfVors(10);
  }
}
