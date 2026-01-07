{
  "filepath": "/tmp/Collections-27b/src/test/java/org/apache/commons/collections4/set/AbstractSetTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractSetTest",
      "is_interface": false,
      "parent_types": [
        "AbstractCollectionTest\u003cE\u003e"
      ],
      "begin_line": 43,
      "end_line": 178,
      "comment": "\n * Abstract test class for {@link Set} methods and contracts.\n * \u003cp\u003e\n * Since {@link Set} doesn\u0027t stipulate much new behavior that isn\u0027t already\n * found in {@link Collection}, this class basically just adds tests for\n * {@link Set#equals} and {@link Set#hashCode()} along with an updated\n * {@link #verify()} that ensures elements do not appear more than once in the\n * set.\n * \u003cp\u003e\n * To use, subclass and override the {@link #makeObject()}\n * method.  You may have to override other protected methods if your\n * set is not modifiable, or if your set restricts what kinds of\n * elements may be added; see {@link AbstractCollectionTest} for more details.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.AbstractSetTest.AbstractSetTest(java.lang.String)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * JUnit constructor.\n     *\n     * @param name  name for test\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSetTest.verify()",
      "begin_line": 58,
      "end_line": 69,
      "comment": "\n     * Provides additional verifications for sets.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 23)",
        "(line 62,col 9)-(line 62,col 78)",
        "(line 63,col 9)-(line 64,col 76)",
        "(line 65,col 9)-(line 65,col 60)",
        "(line 66,col 9)-(line 68,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSetTest.isEqualsCheckable()",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Set equals method is defined.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSetTest.makeConfirmedCollection()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * Returns an empty Set for use in modification testing.\n     *\n     * @return a confirmed empty collection\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSetTest.makeConfirmedFullCollection()",
      "begin_line": 95,
      "end_line": 100,
      "comment": "\n     * Returns a full Set for use in modification testing.\n     *\n     * @return a confirmed full collection\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 60)",
        "(line 98,col 9)-(line 98,col 53)",
        "(line 99,col 9)-(line 99,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSetTest.makeObject()",
      "begin_line": 107,
      "end_line": 108,
      "comment": "\n     * Makes an empty set.  The returned set should have no elements.\n     *\n     * @return an empty set\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSetTest.makeFullCollection()",
      "begin_line": 118,
      "end_line": 123,
      "comment": "\n     * Makes a full set by first creating an empty set and then adding\n     * all the elements returned by {@link #getFullElements()}.\n     *\n     * Override if your set does not support the add operation.\n     *\n     * @return a full set\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 40)",
        "(line 121,col 9)-(line 121,col 53)",
        "(line 122,col 9)-(line 122,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSetTest.getCollection()",
      "begin_line": 129,
      "end_line": 132,
      "comment": "\n     * Return the {@link AbstractCollectionTest#collection} fixture, but cast as a Set.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSetTest.getConfirmed()",
      "begin_line": 137,
      "end_line": 140,
      "comment": "\n     * Return the {@link AbstractCollectionTest#confirmed} fixture, but cast as a Set.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSetTest.testSetEquals()",
      "begin_line": 146,
      "end_line": 163,
      "comment": "\n     * Tests {@link Set#equals(Object)}.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 21)",
        "(line 149,col 9)-(line 149,col 84)",
        "(line 150,col 9)-(line 150,col 17)",
        "(line 152,col 9)-(line 152,col 61)",
        "(line 153,col 9)-(line 153,col 28)",
        "(line 154,col 9)-(line 154,col 92)",
        "(line 156,col 9)-(line 156,col 20)",
        "(line 157,col 9)-(line 157,col 83)",
        "(line 158,col 9)-(line 158,col 17)",
        "(line 160,col 9)-(line 160,col 21)",
        "(line 161,col 9)-(line 161,col 55)",
        "(line 162,col 9)-(line 162,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSetTest.testSetHashCode()",
      "begin_line": 168,
      "end_line": 176,
      "comment": "\n     * Tests {@link Set#hashCode()}.\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 21)",
        "(line 170,col 9)-(line 171,col 71)",
        "(line 173,col 9)-(line 173,col 20)",
        "(line 174,col 9)-(line 175,col 71)"
      ]
    }
  ]
}