package strings;
import org.junit.Assert;
import org.junit.Assert;
import org.junit.jupiter.api  .Test;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestRotation {

        @org.junit.Test
        public void TestRotation()

        {
            Rotation r = new Rotation();
            Boolean out =r.Rotations("JavaJ2eeStrutsHibernate","StrutsHibernateJavaJ2ee");
            Assert.assertTrue(out);
        }

    @org.junit.Test
    public void TestRotation1()

    {
        Rotation r1 = new Rotation();
        Boolean out =r1.Rotations("Venky","Sai");
        Assert.assertFalse(out);
    }
}
