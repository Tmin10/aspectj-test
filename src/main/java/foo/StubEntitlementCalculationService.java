package foo;

public class StubEntitlementCalculationService implements EntitlementCalculationService {
    @Override
    public void calculateEntitlement() {
        System.out.println("calculation...");
        try {
            Thread.sleep(123);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
