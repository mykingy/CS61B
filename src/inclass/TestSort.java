package inclass;


/** Tests the sort class */
public class TestSort {

    /** Test the Sort.sort method.*/
    @org.junit.Test
    public void testSort(){
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};

        Sort.sort(input);

        org.junit.Assert.assertArrayEquals(expected, input);

    }

    /** Test the Sort.findsSmallest method. */
    @org.junit.Test
    public void testFindSmallest(){
        String[] input = {"i", "have", "an", "egg"};
        int expected = 2;

        int actual = Sort.findSmallest(input, 0);

        org.junit.Assert.assertEquals(expected, actual);

        String[] input2 = {"there", "are", "many", "pigs"};
        int expected2 = 1;

        int actual2 = Sort.findSmallest(input2,0 );

        org.junit.Assert.assertEquals(expected2, actual2);

    }

    /** Test the Sort.swap method. */
    @org.junit.Test
    public void testSwap(){
        String[] input = {"i", "have", "an", "egg"};
        int a = 0;
        int b = 2;
        String[] expected = {"an", "have", "i", "egg"};

        Sort.swap(input, a, b);

        org.junit.Assert.assertArrayEquals(expected, input);

    }


}
