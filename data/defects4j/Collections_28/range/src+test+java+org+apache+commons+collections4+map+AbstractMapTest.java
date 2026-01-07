{
  "filepath": "/tmp/Collections-28b/src/test/java/org/apache/commons/collections4/map/AbstractMapTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMapTest",
      "is_interface": false,
      "parent_types": [
        "AbstractObjectTest"
      ],
      "begin_line": 124,
      "end_line": 2073,
      "comment": "\n * Abstract test class for {@link java.util.Map} methods and contracts.\n * \u003cp\u003e\n * The forces at work here are similar to those in {@link AbstractCollectionTest}.\n * If your class implements the full Map interface, including optional\n * operations, simply extend this class, and implement the\n * {@link #makeObject()} method.\n * \u003cp\u003e\n * On the other hand, if your map implementation is weird, you may have to\n * override one or more of the other protected methods.  They\u0027re described\n * below.\n * \u003cp\u003e\n * \u003cb\u003eEntry Population Methods\u003c/b\u003e\n * \u003cp\u003e\n * Override these methods if your map requires special entries:\n *\n * \u003cul\u003e\n * \u003cli\u003e{@link #getSampleKeys()}\n * \u003cli\u003e{@link #getSampleValues()}\n * \u003cli\u003e{@link #getNewSampleValues()}\n * \u003cli\u003e{@link #getOtherKeys()}\n * \u003cli\u003e{@link #getOtherValues()}\n * \u003c/ul\u003e\n *\n * \u003cb\u003eSupported Operation Methods\u003c/b\u003e\n * \u003cp\u003e\n * Override these methods if your map doesn\u0027t support certain operations:\n *\n * \u003cul\u003e\n * \u003cli\u003e {@link #isPutAddSupported()}\n * \u003cli\u003e {@link #isPutChangeSupported()}\n * \u003cli\u003e {@link #isSetValueSupported()}\n * \u003cli\u003e {@link #isRemoveSupported()}\n * \u003cli\u003e {@link #isGetStructuralModify()}\n * \u003cli\u003e {@link #isAllowDuplicateValues()}\n * \u003cli\u003e {@link #isAllowNullKey()}\n * \u003cli\u003e {@link #isAllowNullValue()}\n * \u003c/ul\u003e\n *\n * \u003cb\u003eFixture Methods\u003c/b\u003e\n * \u003cp\u003e\n * For tests on modification operations (puts and removes), fixtures are used\n * to verify that that operation results in correct state for the map and its\n * collection views.  Basically, the modification is performed against your\n * map implementation, and an identical modification is performed against\n * a \u003cI\u003econfirmed\u003c/I\u003e map implementation.  A confirmed map implementation is\n * something like \u003cCode\u003ejava.util.HashMap\u003c/Code\u003e, which is known to conform\n * exactly to the {@link Map} contract.  After the modification takes place\n * on both your map implementation and the confirmed map implementation, the\n * two maps are compared to see if their state is identical.  The comparison\n * also compares the collection views to make sure they\u0027re still the same.\u003cP\u003e\n *\n * The upshot of all that is that \u003cI\u003eany\u003c/I\u003e test that modifies the map in\n * \u003cI\u003eany\u003c/I\u003e way will verify that \u003cI\u003eall\u003c/I\u003e of the map\u0027s state is still\n * correct, including the state of its collection views.  So for instance\n * if a key is removed by the map\u0027s key set\u0027s iterator, then the entry set\n * is checked to make sure the key/value pair no longer appears.\u003cP\u003e\n *\n * The {@link #map} field holds an instance of your collection implementation.\n * The {@link #entrySet}, {@link #keySet} and {@link #values} fields hold\n * that map\u0027s collection views.  And the {@link #confirmed} field holds\n * an instance of the confirmed collection implementation.  The\n * {@link #resetEmpty()} and {@link #resetFull()} methods set these fields to\n * empty or full maps, so that tests can proceed from a known state.\u003cP\u003e\n *\n * After a modification operation to both {@link #map} and {@link #confirmed},\n * the {@link #verify()} method is invoked to compare the results.  The\n * {@link #verify} method calls separate methods to verify the map and its three\n * collection views ({@link #verifyMap}, {@link #verifyEntrySet},\n * {@link #verifyKeySet}, and {@link #verifyValues}).  You may want to override\n * one of the verification methods to perform additional verifications.  For\n * instance, TestDoubleOrderedMap would want override its\n * {@link #verifyValues()} method to verify that the values are unique and in\n * ascending order.\u003cP\u003e\n *\n * \u003cb\u003eOther Notes\u003c/b\u003e\n * \u003cp\u003e\n * If your {@link Map} fails one of these tests by design, you may still use\n * this base set of cases.  Simply override the test case (method) your map\n * fails and/or the methods that define the assumptions used by the test\n * cases.  For example, if your map does not allow duplicate values, override\n * {@link #isAllowDuplicateValues()} and have it return \u003ccode\u003efalse\u003c/code\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "JDK12"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": "\n     * JDK1.2 has bugs in null handling of Maps, especially HashMap.Entry.toString\n     * This avoids nulls for JDK1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " Map created by reset(). "
    },
    {
      "type": "field",
      "varNames": [
        "entrySet"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " Entry set of map created by reset(). "
    },
    {
      "type": "field",
      "varNames": [
        "keySet"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " Key set of map created by reset(). "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " Values collection of map created by reset(). "
    },
    {
      "type": "field",
      "varNames": [
        "confirmed"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": " HashMap created by reset(). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.AbstractMapTest(java.lang.String)",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * JUnit constructor.\n     *\n     * @param testName  the test name\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.isPutAddSupported()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Returns true if the maps produced by\n     * {@link #makeObject()} and {@link #makeFullMap()}\n     * support the \u003ccode\u003eput\u003c/code\u003e and \u003ccode\u003eputAll\u003c/code\u003e operations\n     * adding new mappings.\n     * \u003cp\u003e\n     * Default implementation returns true.\n     * Override if your collection class does not support put adding.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.isPutChangeSupported()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * Returns true if the maps produced by\n     * {@link #makeObject()} and {@link #makeFullMap()}\n     * support the \u003ccode\u003eput\u003c/code\u003e and \u003ccode\u003eputAll\u003c/code\u003e operations\n     * changing existing mappings.\n     * \u003cp\u003e\n     * Default implementation returns true.\n     * Override if your collection class does not support put changing.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.isSetValueSupported()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * Returns true if the maps produced by\n     * {@link #makeObject()} and {@link #makeFullMap()}\n     * support the \u003ccode\u003esetValue\u003c/code\u003e operation on entrySet entries.\n     * \u003cp\u003e\n     * Default implementation returns isPutChangeSupported().\n     * Override if your collection class does not support setValue but does\n     * support put changing.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.isRemoveSupported()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n     * Returns true if the maps produced by\n     * {@link #makeObject()} and {@link #makeFullMap()}\n     * support the \u003ccode\u003eremove\u003c/code\u003e and \u003ccode\u003eclear\u003c/code\u003e operations.\n     * \u003cp\u003e\n     * Default implementation returns true.\n     * Override if your collection class does not support removal operations.\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.isGetStructuralModify()",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\n     * Returns true if the maps produced by\n     * {@link #makeObject()} and {@link #makeFullMap()}\n     * can cause structural modification on a get(). The example is LRUMap.\n     * \u003cp\u003e\n     * Default implementation returns false.\n     * Override if your map class structurally modifies on get.\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.isSubMapViewsSerializable()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * Returns whether the sub map views of SortedMap are serializable.\n     * If the class being tested is based around a TreeMap then you should\n     * override and return false as TreeMap has a bug in deserialization.\n     *\n     * @return false\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.isAllowNullKey()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * Returns true if the maps produced by\n     * {@link #makeObject()} and {@link #makeFullMap()}\n     * supports null keys.\n     * \u003cp\u003e\n     * Default implementation returns true.\n     * Override if your collection class does not support null keys.\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.isAllowNullValue()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * Returns true if the maps produced by\n     * {@link #makeObject()} and {@link #makeFullMap()}\n     * supports null values.\n     * \u003cp\u003e\n     * Default implementation returns true.\n     * Override if your collection class does not support null values.\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.isAllowDuplicateValues()",
      "begin_line": 274,
      "end_line": 276,
      "comment": "\n     * Returns true if the maps produced by\n     * {@link #makeObject()} and {@link #makeFullMap()}\n     * supports duplicate values.\n     * \u003cp\u003e\n     * Default implementation returns true.\n     * Override if your collection class does not support duplicate values.\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.isFailFastExpected()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\n     * Returns true if the maps produced by\n     * {@link #makeObject()} and {@link #makeFullMap()}\n     * provide fail-fast behavior on their various iterators.\n     * \u003cp\u003e\n     * Default implementation returns true.\n     * Override if your collection class does not support fast failure.\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.areEqualElementsDistinguishable()",
      "begin_line": 290,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.getSampleKeys()",
      "begin_line": 301,
      "end_line": 311,
      "comment": "\n     *  Returns the set of keys in the mappings used to test the map.  This\n     *  method must return an array with the same length as {@link\n     *  #getSampleValues()} and all array elements must be different. The\n     *  default implementation constructs a set of String keys, and includes a\n     *  single null key if {@link #isAllowNullKey()} returns \u003ccode\u003etrue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 309,col 10)",
        "(line 310,col 9)-(line 310,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.getOtherKeys()",
      "begin_line": 313,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.getOtherValues()",
      "begin_line": 318,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.getAsList(java.lang.Object[])",
      "begin_line": 323,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 55)",
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.getOtherNonNullStringElements()",
      "begin_line": 340,
      "end_line": 345,
      "comment": "\n     * Returns a list of string elements suitable for return by\n     * {@link #getOtherKeys()} or {@link #getOtherValues}.\n     *\n     * \u003cp\u003eOverride getOtherElements to return the results of this method if your\n     * collection does not support heterogenous elements or the null element.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 344,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.getSampleValues()",
      "begin_line": 356,
      "end_line": 366,
      "comment": "\n     * Returns the set of values in the mappings used to test the map.  This\n     * method must return an array with the same length as\n     * {@link #getSampleKeys()}.  The default implementation constructs a set of\n     * String values and includes a single null value if\n     * {@link #isAllowNullValue()} returns \u003ccode\u003etrue\u003c/code\u003e, and includes\n     * two values that are the same if {@link #isAllowDuplicateValues()} returns\n     * \u003ccode\u003etrue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 364,col 10)",
        "(line 365,col 9)-(line 365,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.getNewSampleValues()",
      "begin_line": 379,
      "end_line": 390,
      "comment": "\n     * Returns a the set of values that can be used to replace the values\n     * returned from {@link #getSampleValues()}.  This method must return an\n     * array with the same length as {@link #getSampleValues()}.  The values\n     * returned from this method should not be the same as those returned from\n     * {@link #getSampleValues()}.  The default implementation constructs a\n     * set of String values and includes a single null value if\n     * {@link #isAllowNullValue()} returns \u003ccode\u003etrue\u003c/code\u003e, and includes two values\n     * that are the same if {@link #isAllowDuplicateValues()} returns\n     * \u003ccode\u003etrue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 388,col 10)",
        "(line 389,col 9)-(line 389,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.addSampleMappings(java.util.Map\u003c? super K, ? super V\u003e)",
      "begin_line": 396,
      "end_line": 422,
      "comment": "\n     *  Helper method to add all the mappings described by\n     * {@link #getSampleKeys()} and {@link #getSampleValues()}.\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 41)",
        "(line 399,col 9)-(line 399,col 45)",
        "(line 401,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 421,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.makeObject()",
      "begin_line": 430,
      "end_line": 431,
      "comment": "\n     * Return a new, empty {@link Map} to be used for testing.\n     *\n     * @return the map to be tested\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.makeFullMap()",
      "begin_line": 442,
      "end_line": 446,
      "comment": "\n     * Return a new, populated map.  The mappings in the map should match the\n     * keys and values returned from {@link #getSampleKeys()} and\n     * {@link #getSampleValues()}.  The default implementation uses makeEmptyMap()\n     * and calls {@link #addSampleMappings} to add all the mappings to the\n     * map.\n     *\n     * @return the map to be tested\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 41)",
        "(line 444,col 9)-(line 444,col 29)",
        "(line 445,col 9)-(line 445,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.makeConfirmedMap()",
      "begin_line": 453,
      "end_line": 455,
      "comment": "\n     * Override to return a map other than HashMap as the confirmed map.\n     *\n     * @return a map that is known to be valid\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(java.util.Map.Entry\u003cK, V\u003e)",
      "begin_line": 460,
      "end_line": 464,
      "comment": "\n     * Creates a new Map Entry that is independent of the first and the map.\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 54)",
        "(line 462,col 9)-(line 462,col 50)",
        "(line 463,col 9)-(line 463,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.getCompatibilityVersion()",
      "begin_line": 469,
      "end_line": 472,
      "comment": "\n     * Gets the compatability version, needed for package access.\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testSampleMappings()",
      "begin_line": 485,
      "end_line": 525,
      "comment": "\n     * Test to ensure the test setup is working properly.  This method checks\n     * to ensure that the getSampleKeys and getSampleValues methods are\n     * returning results that look appropriate.  That is, they both return a\n     * non-null array of equal length.  The keys array must not have any\n     * duplicate values, and may only contain a (single) null key if\n     * isNullKeySupported() returns true.  The values array must only have a null\n     * value if useNullValue() is true and may only have duplicate values if\n     * isAllowDuplicateValues() returns true.\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 46)",
        "(line 487,col 9)-(line 487,col 50)",
        "(line 488,col 9)-(line 488,col 56)",
        "(line 490,col 9)-(line 491,col 41)",
        "(line 493,col 9)-(line 494,col 45)",
        "(line 498,col 9)-(line 499,col 68)",
        "(line 501,col 9)-(line 502,col 52)",
        "(line 505,col 9)-(line 524,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMakeMap()",
      "begin_line": 536,
      "end_line": 558,
      "comment": "\n     * Test to ensure that makeEmptyMap and makeFull returns a new non-null\n     * map with each invocation.\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 42)",
        "(line 538,col 9)-(line 539,col 31)",
        "(line 541,col 9)-(line 541,col 43)",
        "(line 542,col 9)-(line 543,col 31)",
        "(line 545,col 9)-(line 546,col 55)",
        "(line 548,col 9)-(line 548,col 43)",
        "(line 549,col 9)-(line 550,col 31)",
        "(line 552,col 9)-(line 552,col 44)",
        "(line 553,col 9)-(line 554,col 31)",
        "(line 556,col 9)-(line 557,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapIsEmpty()",
      "begin_line": 563,
      "end_line": 573,
      "comment": "\n     * Tests Map.isEmpty()\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 21)",
        "(line 565,col 9)-(line 566,col 47)",
        "(line 567,col 9)-(line 567,col 17)",
        "(line 569,col 9)-(line 569,col 20)",
        "(line 570,col 9)-(line 571,col 48)",
        "(line 572,col 9)-(line 572,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapSize()",
      "begin_line": 578,
      "end_line": 588,
      "comment": "\n     * Tests Map.size()\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 21)",
        "(line 580,col 9)-(line 581,col 41)",
        "(line 582,col 9)-(line 582,col 17)",
        "(line 584,col 9)-(line 584,col 20)",
        "(line 585,col 9)-(line 586,col 76)",
        "(line 587,col 9)-(line 587,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapClear()",
      "begin_line": 598,
      "end_line": 617,
      "comment": "\n     * Tests {@link Map#clear()}.  If the map {@link #isRemoveSupported()}\n     * can add and remove elements}, then {@link Map#size()} and\n     * {@link Map#isEmpty()} are used to ensure that map has no elements after\n     * a call to clear.  If the map does not support adding and removing\n     * elements, this method checks to ensure clear throws an\n     * UnsupportedOperationException.\n     ",
      "child_ranges": [
        "(line 599,col 9)-(line 606,col 9)",
        "(line 608,col 9)-(line 608,col 21)",
        "(line 609,col 9)-(line 609,col 25)",
        "(line 610,col 9)-(line 610,col 31)",
        "(line 611,col 9)-(line 611,col 17)",
        "(line 613,col 9)-(line 613,col 20)",
        "(line 614,col 9)-(line 614,col 25)",
        "(line 615,col 9)-(line 615,col 31)",
        "(line 616,col 9)-(line 616,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapContainsKey()",
      "begin_line": 624,
      "end_line": 640,
      "comment": "\n     * Tests Map.containsKey(Object) by verifying it returns false for all\n     * sample keys on a map created using an empty map and returns true for\n     * all sample keys returned on a full map.\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 46)",
        "(line 627,col 9)-(line 627,col 21)",
        "(line 628,col 9)-(line 631,col 9)",
        "(line 632,col 9)-(line 632,col 17)",
        "(line 634,col 9)-(line 634,col 20)",
        "(line 635,col 9)-(line 638,col 9)",
        "(line 639,col 9)-(line 639,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapContainsValue()",
      "begin_line": 647,
      "end_line": 663,
      "comment": "\n     * Tests Map.containsValue(Object) by verifying it returns false for all\n     * sample values on an empty map and returns true for all sample values on\n     * a full map.\n     ",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 50)",
        "(line 650,col 9)-(line 650,col 21)",
        "(line 651,col 9)-(line 654,col 9)",
        "(line 655,col 9)-(line 655,col 17)",
        "(line 657,col 9)-(line 657,col 20)",
        "(line 658,col 9)-(line 661,col 9)",
        "(line 662,col 9)-(line 662,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapEquals()",
      "begin_line": 669,
      "end_line": 691,
      "comment": "\n     * Tests Map.equals(Object)\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 670,col 21)",
        "(line 671,col 9)-(line 671,col 70)",
        "(line 672,col 9)-(line 672,col 17)",
        "(line 674,col 9)-(line 674,col 20)",
        "(line 675,col 9)-(line 675,col 69)",
        "(line 676,col 9)-(line 676,col 17)",
        "(line 678,col 9)-(line 678,col 20)",
        "(line 681,col 9)-(line 681,col 63)",
        "(line 682,col 9)-(line 682,col 20)",
        "(line 683,col 9)-(line 683,col 22)",
        "(line 684,col 9)-(line 684,col 73)",
        "(line 686,col 9)-(line 686,col 20)",
        "(line 687,col 9)-(line 687,col 74)",
        "(line 688,col 9)-(line 689,col 51)",
        "(line 690,col 9)-(line 690,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapGet()",
      "begin_line": 696,
      "end_line": 713,
      "comment": "\n     * Tests Map.get(Object)\n     ",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 21)",
        "(line 699,col 9)-(line 699,col 46)",
        "(line 700,col 9)-(line 700,col 50)",
        "(line 702,col 9)-(line 705,col 9)",
        "(line 706,col 9)-(line 706,col 17)",
        "(line 708,col 9)-(line 708,col 20)",
        "(line 709,col 9)-(line 712,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapHashCode()",
      "begin_line": 718,
      "end_line": 726,
      "comment": "\n     * Tests Map.hashCode()\n     ",
      "child_ranges": [
        "(line 719,col 9)-(line 719,col 21)",
        "(line 720,col 9)-(line 721,col 61)",
        "(line 723,col 9)-(line 723,col 20)",
        "(line 724,col 9)-(line 725,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapToString()",
      "begin_line": 737,
      "end_line": 747,
      "comment": "\n     * Tests Map.toString().  Since the format of the string returned by the\n     * toString() method is not defined in the Map interface, there is no\n     * common way to test the results of the toString() method.  Thereforce,\n     * it is encouraged that Map implementations override this test with one\n     * that checks the format matches any format defined in its API.  This\n     * default implementation just verifies that the toString() method does\n     * not return null.\n     ",
      "child_ranges": [
        "(line 738,col 9)-(line 738,col 21)",
        "(line 739,col 9)-(line 740,col 45)",
        "(line 741,col 9)-(line 741,col 17)",
        "(line 743,col 9)-(line 743,col 20)",
        "(line 744,col 9)-(line 745,col 45)",
        "(line 746,col 9)-(line 746,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testEmptyMapCompatibility()",
      "begin_line": 753,
      "end_line": 769,
      "comment": "\n     * Compare the current serialized form of the Map\n     * against the canonical version in SVN.\n     ",
      "child_ranges": [
        "(line 763,col 9)-(line 763,col 43)",
        "(line 764,col 9)-(line 768,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testFullMapCompatibility()",
      "begin_line": 775,
      "end_line": 791,
      "comment": "\n     * Compare the current serialized form of the Map\n     * against the canonical version in SVN.\n     ",
      "child_ranges": [
        "(line 785,col 9)-(line 785,col 44)",
        "(line 786,col 9)-(line 790,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapPut()",
      "begin_line": 796,
      "end_line": 875,
      "comment": "\n     * Tests Map.put(Object, Object)\n     ",
      "child_ranges": [
        "(line 797,col 9)-(line 797,col 21)",
        "(line 798,col 9)-(line 798,col 41)",
        "(line 799,col 9)-(line 799,col 45)",
        "(line 800,col 9)-(line 800,col 51)",
        "(line 802,col 9)-(line 874,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapPutNullKey()",
      "begin_line": 880,
      "end_line": 895,
      "comment": "\n     * Tests Map.put(null, value)\n     ",
      "child_ranges": [
        "(line 881,col 9)-(line 881,col 20)",
        "(line 882,col 9)-(line 882,col 45)",
        "(line 884,col 9)-(line 894,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapPutNullValue()",
      "begin_line": 900,
      "end_line": 915,
      "comment": "\n     * Tests Map.put(null, value)\n     ",
      "child_ranges": [
        "(line 901,col 9)-(line 901,col 20)",
        "(line 902,col 9)-(line 902,col 41)",
        "(line 904,col 9)-(line 914,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapPutAll()",
      "begin_line": 920,
      "end_line": 976,
      "comment": "\n     * Tests Map.putAll(map)\n     ",
      "child_ranges": [
        "(line 921,col 9)-(line 931,col 9)",
        "(line 934,col 9)-(line 934,col 21)",
        "(line 935,col 9)-(line 935,col 41)",
        "(line 936,col 9)-(line 936,col 45)",
        "(line 937,col 9)-(line 937,col 41)",
        "(line 940,col 9)-(line 940,col 20)",
        "(line 941,col 9)-(line 941,col 41)",
        "(line 942,col 9)-(line 942,col 45)",
        "(line 943,col 9)-(line 943,col 44)",
        "(line 946,col 9)-(line 946,col 21)",
        "(line 947,col 9)-(line 947,col 37)",
        "(line 948,col 9)-(line 948,col 28)",
        "(line 949,col 9)-(line 949,col 34)",
        "(line 950,col 9)-(line 950,col 17)",
        "(line 953,col 9)-(line 953,col 21)",
        "(line 954,col 9)-(line 954,col 32)",
        "(line 955,col 9)-(line 955,col 41)",
        "(line 956,col 9)-(line 956,col 45)",
        "(line 957,col 9)-(line 959,col 9)",
        "(line 960,col 9)-(line 960,col 28)",
        "(line 961,col 9)-(line 961,col 34)",
        "(line 962,col 9)-(line 962,col 17)",
        "(line 965,col 9)-(line 965,col 21)",
        "(line 966,col 9)-(line 966,col 32)",
        "(line 967,col 9)-(line 967,col 41)",
        "(line 968,col 9)-(line 968,col 47)",
        "(line 969,col 9)-(line 969,col 17)",
        "(line 970,col 9)-(line 972,col 9)",
        "(line 973,col 9)-(line 973,col 28)",
        "(line 974,col 9)-(line 974,col 34)",
        "(line 975,col 9)-(line 975,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapRemove()",
      "begin_line": 981,
      "end_line": 1023,
      "comment": "\n     * Tests Map.remove(Object)\n     ",
      "child_ranges": [
        "(line 982,col 9)-(line 989,col 9)",
        "(line 991,col 9)-(line 991,col 21)",
        "(line 993,col 9)-(line 993,col 46)",
        "(line 994,col 9)-(line 994,col 50)",
        "(line 995,col 9)-(line 998,col 9)",
        "(line 999,col 9)-(line 999,col 17)",
        "(line 1001,col 9)-(line 1001,col 20)",
        "(line 1003,col 9)-(line 1010,col 9)",
        "(line 1012,col 9)-(line 1012,col 46)",
        "(line 1014,col 9)-(line 1014,col 20)",
        "(line 1015,col 9)-(line 1015,col 41)",
        "(line 1016,col 9)-(line 1021,col 9)",
        "(line 1022,col 9)-(line 1022,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testValuesClearChangesMap()",
      "begin_line": 1030,
      "end_line": 1052,
      "comment": "\n     * Tests that the {@link Map#values} collection is backed by\n     * the underlying map for clear().\n     ",
      "child_ranges": [
        "(line 1031,col 9)-(line 1033,col 9)",
        "(line 1036,col 9)-(line 1036,col 20)",
        "(line 1037,col 9)-(line 1037,col 49)",
        "(line 1038,col 9)-(line 1038,col 40)",
        "(line 1039,col 9)-(line 1039,col 38)",
        "(line 1040,col 9)-(line 1040,col 23)",
        "(line 1041,col 9)-(line 1041,col 41)",
        "(line 1042,col 9)-(line 1042,col 39)",
        "(line 1045,col 9)-(line 1045,col 20)",
        "(line 1046,col 9)-(line 1046,col 35)",
        "(line 1047,col 9)-(line 1047,col 40)",
        "(line 1048,col 9)-(line 1048,col 38)",
        "(line 1049,col 9)-(line 1049,col 25)",
        "(line 1050,col 9)-(line 1050,col 41)",
        "(line 1051,col 9)-(line 1051,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testKeySetClearChangesMap()",
      "begin_line": 1058,
      "end_line": 1080,
      "comment": "\n     * Tests that the {@link Map#keySet} collection is backed by\n     * the underlying map for clear().\n     ",
      "child_ranges": [
        "(line 1059,col 9)-(line 1061,col 9)",
        "(line 1064,col 9)-(line 1064,col 20)",
        "(line 1065,col 9)-(line 1065,col 42)",
        "(line 1066,col 9)-(line 1066,col 40)",
        "(line 1067,col 9)-(line 1067,col 38)",
        "(line 1068,col 9)-(line 1068,col 23)",
        "(line 1069,col 9)-(line 1069,col 41)",
        "(line 1070,col 9)-(line 1070,col 39)",
        "(line 1073,col 9)-(line 1073,col 20)",
        "(line 1074,col 9)-(line 1074,col 35)",
        "(line 1075,col 9)-(line 1075,col 40)",
        "(line 1076,col 9)-(line 1076,col 38)",
        "(line 1077,col 9)-(line 1077,col 25)",
        "(line 1078,col 9)-(line 1078,col 41)",
        "(line 1079,col 9)-(line 1079,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testEntrySetClearChangesMap()",
      "begin_line": 1086,
      "end_line": 1108,
      "comment": "\n     * Tests that the {@link Map#entrySet()} collection is backed by\n     * the underlying map for clear().\n     ",
      "child_ranges": [
        "(line 1087,col 9)-(line 1089,col 9)",
        "(line 1092,col 9)-(line 1092,col 20)",
        "(line 1093,col 9)-(line 1093,col 60)",
        "(line 1094,col 9)-(line 1094,col 40)",
        "(line 1095,col 9)-(line 1095,col 40)",
        "(line 1096,col 9)-(line 1096,col 25)",
        "(line 1097,col 9)-(line 1097,col 41)",
        "(line 1098,col 9)-(line 1098,col 41)",
        "(line 1101,col 9)-(line 1101,col 20)",
        "(line 1102,col 9)-(line 1102,col 39)",
        "(line 1103,col 9)-(line 1103,col 40)",
        "(line 1104,col 9)-(line 1104,col 40)",
        "(line 1105,col 9)-(line 1105,col 25)",
        "(line 1106,col 9)-(line 1106,col 41)",
        "(line 1107,col 9)-(line 1107,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testEntrySetContains1()",
      "begin_line": 1111,
      "end_line": 1116,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 1112,col 9)-(line 1112,col 20)",
        "(line 1113,col 9)-(line 1113,col 66)",
        "(line 1114,col 9)-(line 1114,col 65)",
        "(line 1115,col 9)-(line 1115,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testEntrySetContains2()",
      "begin_line": 1118,
      "end_line": 1124,
      "comment": "",
      "child_ranges": [
        "(line 1119,col 9)-(line 1119,col 20)",
        "(line 1120,col 9)-(line 1120,col 66)",
        "(line 1121,col 9)-(line 1121,col 65)",
        "(line 1122,col 9)-(line 1122,col 58)",
        "(line 1123,col 9)-(line 1123,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testEntrySetContains3()",
      "begin_line": 1126,
      "end_line": 1135,
      "comment": "",
      "child_ranges": [
        "(line 1128,col 9)-(line 1128,col 20)",
        "(line 1129,col 9)-(line 1129,col 66)",
        "(line 1130,col 9)-(line 1130,col 65)",
        "(line 1131,col 9)-(line 1131,col 55)",
        "(line 1132,col 9)-(line 1132,col 63)",
        "(line 1133,col 9)-(line 1133,col 71)",
        "(line 1134,col 9)-(line 1134,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testEntrySetRemove1()",
      "begin_line": 1137,
      "end_line": 1150,
      "comment": "",
      "child_ranges": [
        "(line 1138,col 9)-(line 1140,col 9)",
        "(line 1141,col 9)-(line 1141,col 20)",
        "(line 1142,col 9)-(line 1142,col 41)",
        "(line 1143,col 9)-(line 1143,col 66)",
        "(line 1144,col 9)-(line 1144,col 65)",
        "(line 1145,col 9)-(line 1145,col 37)",
        "(line 1147,col 9)-(line 1147,col 51)",
        "(line 1148,col 9)-(line 1148,col 55)",
        "(line 1149,col 9)-(line 1149,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testEntrySetRemove2()",
      "begin_line": 1152,
      "end_line": 1166,
      "comment": "",
      "child_ranges": [
        "(line 1153,col 9)-(line 1155,col 9)",
        "(line 1156,col 9)-(line 1156,col 20)",
        "(line 1157,col 9)-(line 1157,col 41)",
        "(line 1158,col 9)-(line 1158,col 66)",
        "(line 1159,col 9)-(line 1159,col 65)",
        "(line 1160,col 9)-(line 1160,col 37)",
        "(line 1161,col 9)-(line 1161,col 58)",
        "(line 1163,col 9)-(line 1163,col 50)",
        "(line 1164,col 9)-(line 1164,col 55)",
        "(line 1165,col 9)-(line 1165,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testEntrySetRemove3()",
      "begin_line": 1168,
      "end_line": 1185,
      "comment": "",
      "child_ranges": [
        "(line 1170,col 9)-(line 1172,col 9)",
        "(line 1173,col 9)-(line 1173,col 20)",
        "(line 1174,col 9)-(line 1174,col 41)",
        "(line 1175,col 9)-(line 1175,col 66)",
        "(line 1176,col 9)-(line 1176,col 65)",
        "(line 1177,col 9)-(line 1177,col 37)",
        "(line 1178,col 9)-(line 1178,col 55)",
        "(line 1179,col 9)-(line 1179,col 63)",
        "(line 1180,col 9)-(line 1180,col 71)",
        "(line 1182,col 9)-(line 1182,col 51)",
        "(line 1183,col 9)-(line 1183,col 54)",
        "(line 1184,col 9)-(line 1184,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testValuesRemoveChangesMap()",
      "begin_line": 1203,
      "end_line": 1225,
      "comment": "\n     * Tests that the {@link Map#values} collection is backed by\n     * the underlying map by removing from the values collection\n     * and testing if the value was removed from the map.\n     * \u003cp\u003e\n     * We should really test the \"vice versa\" case--that values removed\n     * from the map are removed from the values collection--also,\n     * but that\u0027s a more difficult test to construct (lacking a\n     * \"removeValue\" method.)\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * See bug \u003ca href\u003d\"http://issues.apache.org/bugzilla/show_bug.cgi?id\u003d9573\"\u003e\n     * 9573\u003c/a\u003e.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1204,col 9)-(line 1204,col 20)",
        "(line 1205,col 9)-(line 1205,col 51)",
        "(line 1206,col 9)-(line 1206,col 55)",
        "(line 1207,col 9)-(line 1224,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testValuesRemoveAll()",
      "begin_line": 1230,
      "end_line": 1251,
      "comment": "\n     * Tests values.removeAll.\n     ",
      "child_ranges": [
        "(line 1231,col 9)-(line 1231,col 20)",
        "(line 1232,col 9)-(line 1232,col 55)",
        "(line 1233,col 9)-(line 1233,col 76)",
        "(line 1234,col 9)-(line 1236,col 9)",
        "(line 1237,col 9)-(line 1242,col 9)",
        "(line 1243,col 9)-(line 1243,col 65)",
        "(line 1244,col 9)-(line 1249,col 9)",
        "(line 1250,col 9)-(line 1250,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testValuesRetainAll()",
      "begin_line": 1256,
      "end_line": 1277,
      "comment": "\n     * Test values.retainAll.\n     ",
      "child_ranges": [
        "(line 1257,col 9)-(line 1257,col 20)",
        "(line 1258,col 9)-(line 1258,col 55)",
        "(line 1259,col 9)-(line 1259,col 76)",
        "(line 1260,col 9)-(line 1262,col 9)",
        "(line 1263,col 9)-(line 1268,col 9)",
        "(line 1269,col 9)-(line 1269,col 65)",
        "(line 1270,col 9)-(line 1275,col 9)",
        "(line 1276,col 9)-(line 1276,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testValuesIteratorRemoveChangesMap()",
      "begin_line": 1282,
      "end_line": 1308,
      "comment": "\n     * Verifies that values.iterator.remove changes the underlying map.\n     ",
      "child_ranges": [
        "(line 1284,col 9)-(line 1284,col 20)",
        "(line 1285,col 9)-(line 1285,col 76)",
        "(line 1286,col 9)-(line 1286,col 98)",
        "(line 1287,col 9)-(line 1287,col 55)",
        "(line 1288,col 9)-(line 1306,col 9)",
        "(line 1307,col 9)-(line 1307,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testKeySetRemoveChangesMap()",
      "begin_line": 1315,
      "end_line": 1330,
      "comment": "\n     * Tests that the {@link Map#keySet} set is backed by\n     * the underlying map by removing from the keySet set\n     * and testing if the key was removed from the map.\n     ",
      "child_ranges": [
        "(line 1316,col 9)-(line 1316,col 20)",
        "(line 1317,col 9)-(line 1317,col 47)",
        "(line 1318,col 9)-(line 1318,col 46)",
        "(line 1319,col 9)-(line 1329,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testKeySetRemoveAll()",
      "begin_line": 1335,
      "end_line": 1354,
      "comment": "\n     * Test keySet.removeAll.\n     ",
      "child_ranges": [
        "(line 1336,col 9)-(line 1336,col 20)",
        "(line 1337,col 9)-(line 1337,col 46)",
        "(line 1338,col 9)-(line 1338,col 72)",
        "(line 1339,col 9)-(line 1341,col 9)",
        "(line 1342,col 9)-(line 1346,col 9)",
        "(line 1347,col 9)-(line 1347,col 45)",
        "(line 1348,col 9)-(line 1352,col 9)",
        "(line 1353,col 9)-(line 1353,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testKeySetRetainAll()",
      "begin_line": 1359,
      "end_line": 1378,
      "comment": "\n     * Test keySet.retainAll.\n     ",
      "child_ranges": [
        "(line 1360,col 9)-(line 1360,col 20)",
        "(line 1361,col 9)-(line 1361,col 46)",
        "(line 1362,col 9)-(line 1362,col 72)",
        "(line 1363,col 9)-(line 1365,col 9)",
        "(line 1366,col 9)-(line 1370,col 9)",
        "(line 1371,col 9)-(line 1371,col 45)",
        "(line 1372,col 9)-(line 1376,col 9)",
        "(line 1377,col 9)-(line 1377,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testKeySetIteratorRemoveChangesMap()",
      "begin_line": 1383,
      "end_line": 1394,
      "comment": "\n     * Verify that keySet.iterator.remove changes the underlying map.\n     ",
      "child_ranges": [
        "(line 1384,col 9)-(line 1384,col 20)",
        "(line 1385,col 9)-(line 1393,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testEntrySetRemoveChangesMap()",
      "begin_line": 1401,
      "end_line": 1417,
      "comment": "\n     * Tests that the {@link Map#entrySet} set is backed by\n     * the underlying map by removing from the entrySet set\n     * and testing if the entry was removed from the map.\n     ",
      "child_ranges": [
        "(line 1402,col 9)-(line 1402,col 20)",
        "(line 1403,col 9)-(line 1403,col 47)",
        "(line 1404,col 9)-(line 1404,col 51)",
        "(line 1405,col 9)-(line 1405,col 66)",
        "(line 1406,col 9)-(line 1416,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testEntrySetRemoveAll()",
      "begin_line": 1422,
      "end_line": 1452,
      "comment": "\n     * Test entrySet.removeAll.\n     ",
      "child_ranges": [
        "(line 1423,col 9)-(line 1423,col 20)",
        "(line 1424,col 9)-(line 1424,col 47)",
        "(line 1425,col 9)-(line 1425,col 51)",
        "(line 1427,col 9)-(line 1437,col 9)",
        "(line 1438,col 9)-(line 1438,col 66)",
        "(line 1439,col 9)-(line 1439,col 94)",
        "(line 1440,col 9)-(line 1444,col 9)",
        "(line 1445,col 9)-(line 1445,col 57)",
        "(line 1446,col 9)-(line 1450,col 9)",
        "(line 1451,col 9)-(line 1451,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testEntrySetRetainAll()",
      "begin_line": 1457,
      "end_line": 1487,
      "comment": "\n     * Test entrySet.retainAll.\n     ",
      "child_ranges": [
        "(line 1458,col 9)-(line 1458,col 20)",
        "(line 1459,col 9)-(line 1459,col 47)",
        "(line 1460,col 9)-(line 1460,col 51)",
        "(line 1462,col 9)-(line 1472,col 9)",
        "(line 1473,col 9)-(line 1473,col 66)",
        "(line 1474,col 9)-(line 1474,col 94)",
        "(line 1475,col 9)-(line 1479,col 9)",
        "(line 1480,col 9)-(line 1480,col 57)",
        "(line 1481,col 9)-(line 1485,col 9)",
        "(line 1486,col 9)-(line 1486,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testEntrySetIteratorRemoveChangesMap()",
      "begin_line": 1492,
      "end_line": 1503,
      "comment": "\n     * Verify that entrySet.iterator.remove changes the underlying map.\n     ",
      "child_ranges": [
        "(line 1493,col 9)-(line 1493,col 20)",
        "(line 1494,col 9)-(line 1502,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.makeEntryArray(K[], V[])",
      "begin_line": 1513,
      "end_line": 1522,
      "comment": "\n     * Utility methods to create an array of Map.Entry objects\n     * out of the given key and value arrays.\u003cP\u003e\n     *\n     * @param keys    the array of keys\n     * @param values  the array of values\n     * @return an array of Map.Entry of those keys to those values\n     ",
      "child_ranges": [
        "(line 1515,col 9)-(line 1515,col 68)",
        "(line 1516,col 9)-(line 1520,col 9)",
        "(line 1521,col 9)-(line 1521,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.bulkTestMapEntrySet()",
      "begin_line": 1532,
      "end_line": 1534,
      "comment": "\n     * Bulk test {@link Map#entrySet()}.  This method runs through all of\n     * the tests in {@link AbstractSetTest}.\n     * After modification operations, {@link #verify()} is invoked to ensure\n     * that the map and the other collection views are still valid.\n     *\n     * @return a {@link AbstractSetTest} instance for testing the map\u0027s entry set\n     ",
      "child_ranges": [
        "(line 1533,col 9)-(line 1533,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMapEntrySet",
      "is_interface": false,
      "parent_types": [
        "AbstractSetTest\u003cMap.Entry\u003cK,V\u003e\u003e"
      ],
      "begin_line": 1536,
      "end_line": 1718,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.TestMapEntrySet()",
      "begin_line": 1537,
      "end_line": 1539,
      "comment": "",
      "child_ranges": [
        "(line 1538,col 13)-(line 1538,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.getFullElements()",
      "begin_line": 1545,
      "end_line": 1548,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1547,col 13)-(line 1547,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.getFullNonNullElements()",
      "begin_line": 1553,
      "end_line": 1558,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1555,col 13)-(line 1555,col 42)",
        "(line 1556,col 13)-(line 1556,col 44)",
        "(line 1557,col 13)-(line 1557,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.getOtherElements()",
      "begin_line": 1561,
      "end_line": 1566,
      "comment": " Have to implement manually; entrySet doesn\u0027t support addAll",
      "child_ranges": [
        "(line 1563,col 13)-(line 1563,col 41)",
        "(line 1564,col 13)-(line 1564,col 43)",
        "(line 1565,col 13)-(line 1565,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.makeObject()",
      "begin_line": 1568,
      "end_line": 1571,
      "comment": "",
      "child_ranges": [
        "(line 1570,col 13)-(line 1570,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.makeFullCollection()",
      "begin_line": 1573,
      "end_line": 1576,
      "comment": "",
      "child_ranges": [
        "(line 1575,col 13)-(line 1575,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.isAddSupported()",
      "begin_line": 1578,
      "end_line": 1582,
      "comment": "",
      "child_ranges": [
        "(line 1581,col 13)-(line 1581,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.isRemoveSupported()",
      "begin_line": 1584,
      "end_line": 1588,
      "comment": "",
      "child_ranges": [
        "(line 1587,col 13)-(line 1587,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.isGetStructuralModify()",
      "begin_line": 1590,
      "end_line": 1592,
      "comment": "",
      "child_ranges": [
        "(line 1591,col 13)-(line 1591,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.areEqualElementsDistinguishable()",
      "begin_line": 1594,
      "end_line": 1597,
      "comment": "",
      "child_ranges": [
        "(line 1596,col 13)-(line 1596,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.isTestSerialization()",
      "begin_line": 1599,
      "end_line": 1602,
      "comment": "",
      "child_ranges": [
        "(line 1601,col 13)-(line 1601,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.resetFull()",
      "begin_line": 1604,
      "end_line": 1609,
      "comment": "",
      "child_ranges": [
        "(line 1606,col 13)-(line 1606,col 45)",
        "(line 1607,col 13)-(line 1607,col 68)",
        "(line 1608,col 13)-(line 1608,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.resetEmpty()",
      "begin_line": 1611,
      "end_line": 1616,
      "comment": "",
      "child_ranges": [
        "(line 1613,col 13)-(line 1613,col 46)",
        "(line 1614,col 13)-(line 1614,col 68)",
        "(line 1615,col 13)-(line 1615,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.testMapEntrySetIteratorEntry()",
      "begin_line": 1618,
      "end_line": 1632,
      "comment": "",
      "child_ranges": [
        "(line 1619,col 13)-(line 1619,col 24)",
        "(line 1620,col 13)-(line 1620,col 76)",
        "(line 1621,col 13)-(line 1621,col 26)",
        "(line 1622,col 13)-(line 1630,col 13)",
        "(line 1631,col 13)-(line 1631,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.testMapEntrySetIteratorEntrySetValue()",
      "begin_line": 1634,
      "end_line": 1684,
      "comment": "",
      "child_ranges": [
        "(line 1635,col 13)-(line 1635,col 46)",
        "(line 1636,col 13)-(line 1636,col 97)",
        "(line 1637,col 13)-(line 1637,col 56)",
        "(line 1638,col 13)-(line 1638,col 116)",
        "(line 1640,col 13)-(line 1640,col 24)",
        "(line 1643,col 13)-(line 1643,col 91)",
        "(line 1644,col 13)-(line 1644,col 62)",
        "(line 1645,col 13)-(line 1645,col 65)",
        "(line 1646,col 13)-(line 1646,col 62)",
        "(line 1647,col 13)-(line 1647,col 99)",
        "(line 1648,col 13)-(line 1648,col 80)",
        "(line 1649,col 13)-(line 1649,col 73)",
        "(line 1650,col 13)-(line 1650,col 80)",
        "(line 1651,col 13)-(line 1651,col 21)",
        "(line 1653,col 13)-(line 1659,col 13)",
        "(line 1661,col 13)-(line 1661,col 39)",
        "(line 1662,col 13)-(line 1662,col 48)",
        "(line 1663,col 13)-(line 1663,col 55)",
        "(line 1664,col 13)-(line 1664,col 91)",
        "(line 1665,col 13)-(line 1665,col 87)",
        "(line 1666,col 13)-(line 1666,col 88)",
        "(line 1667,col 13)-(line 1667,col 21)",
        "(line 1669,col 13)-(line 1669,col 39)",
        "(line 1670,col 13)-(line 1670,col 48)",
        "(line 1671,col 13)-(line 1671,col 55)",
        "(line 1672,col 13)-(line 1672,col 91)",
        "(line 1673,col 13)-(line 1673,col 87)",
        "(line 1674,col 13)-(line 1674,col 88)",
        "(line 1675,col 13)-(line 1675,col 21)",
        "(line 1677,col 13)-(line 1677,col 39)",
        "(line 1678,col 13)-(line 1678,col 48)",
        "(line 1679,col 13)-(line 1679,col 55)",
        "(line 1680,col 13)-(line 1680,col 91)",
        "(line 1681,col 13)-(line 1681,col 87)",
        "(line 1682,col 13)-(line 1682,col 88)",
        "(line 1683,col 13)-(line 1683,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.getEntry(java.util.Iterator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e, K)",
      "begin_line": 1686,
      "end_line": 1702,
      "comment": "",
      "child_ranges": [
        "(line 1687,col 13)-(line 1687,col 41)",
        "(line 1688,col 13)-(line 1699,col 13)",
        "(line 1700,col 13)-(line 1700,col 83)",
        "(line 1701,col 13)-(line 1701,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.testMapEntrySetRemoveNonMapEntry()",
      "begin_line": 1704,
      "end_line": 1711,
      "comment": "",
      "child_ranges": [
        "(line 1705,col 13)-(line 1707,col 13)",
        "(line 1708,col 13)-(line 1708,col 24)",
        "(line 1709,col 13)-(line 1709,col 62)",
        "(line 1710,col 13)-(line 1710,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.verify()",
      "begin_line": 1713,
      "end_line": 1717,
      "comment": "",
      "child_ranges": [
        "(line 1715,col 13)-(line 1715,col 27)",
        "(line 1716,col 13)-(line 1716,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.bulkTestMapKeySet()",
      "begin_line": 1729,
      "end_line": 1731,
      "comment": "\n     * Bulk test {@link Map#keySet()}.  This method runs through all of\n     * the tests in {@link AbstractSetTest}.\n     * After modification operations, {@link #verify()} is invoked to ensure\n     * that the map and the other collection views are still valid.\n     *\n     * @return a {@link AbstractSetTest} instance for testing the map\u0027s key set\n     ",
      "child_ranges": [
        "(line 1730,col 9)-(line 1730,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMapKeySet",
      "is_interface": false,
      "parent_types": [
        "AbstractSetTest\u003cK\u003e"
      ],
      "begin_line": 1733,
      "end_line": 1797,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapKeySet.TestMapKeySet()",
      "begin_line": 1734,
      "end_line": 1736,
      "comment": "",
      "child_ranges": [
        "(line 1735,col 13)-(line 1735,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapKeySet.getFullElements()",
      "begin_line": 1738,
      "end_line": 1741,
      "comment": "",
      "child_ranges": [
        "(line 1740,col 13)-(line 1740,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapKeySet.getOtherElements()",
      "begin_line": 1743,
      "end_line": 1746,
      "comment": "",
      "child_ranges": [
        "(line 1745,col 13)-(line 1745,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapKeySet.makeObject()",
      "begin_line": 1748,
      "end_line": 1751,
      "comment": "",
      "child_ranges": [
        "(line 1750,col 13)-(line 1750,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapKeySet.makeFullCollection()",
      "begin_line": 1753,
      "end_line": 1756,
      "comment": "",
      "child_ranges": [
        "(line 1755,col 13)-(line 1755,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapKeySet.isNullSupported()",
      "begin_line": 1758,
      "end_line": 1761,
      "comment": "",
      "child_ranges": [
        "(line 1760,col 13)-(line 1760,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapKeySet.isAddSupported()",
      "begin_line": 1763,
      "end_line": 1766,
      "comment": "",
      "child_ranges": [
        "(line 1765,col 13)-(line 1765,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapKeySet.isRemoveSupported()",
      "begin_line": 1768,
      "end_line": 1771,
      "comment": "",
      "child_ranges": [
        "(line 1770,col 13)-(line 1770,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapKeySet.isTestSerialization()",
      "begin_line": 1773,
      "end_line": 1776,
      "comment": "",
      "child_ranges": [
        "(line 1775,col 13)-(line 1775,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapKeySet.resetEmpty()",
      "begin_line": 1778,
      "end_line": 1783,
      "comment": "",
      "child_ranges": [
        "(line 1780,col 13)-(line 1780,col 46)",
        "(line 1781,col 13)-(line 1781,col 66)",
        "(line 1782,col 13)-(line 1782,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapKeySet.resetFull()",
      "begin_line": 1785,
      "end_line": 1790,
      "comment": "",
      "child_ranges": [
        "(line 1787,col 13)-(line 1787,col 45)",
        "(line 1788,col 13)-(line 1788,col 66)",
        "(line 1789,col 13)-(line 1789,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapKeySet.verify()",
      "begin_line": 1792,
      "end_line": 1796,
      "comment": "",
      "child_ranges": [
        "(line 1794,col 13)-(line 1794,col 27)",
        "(line 1795,col 13)-(line 1795,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.bulkTestMapValues()",
      "begin_line": 1808,
      "end_line": 1810,
      "comment": "\n     * Bulk test {@link Map#values()}.  This method runs through all of\n     * the tests in {@link AbstractCollectionTest}.\n     * After modification operations, {@link #verify()} is invoked to ensure\n     * that the map and the other collection views are still valid.\n     *\n     * @return a {@link AbstractCollectionTest} instance for testing the map\u0027s\n     *    values collection\n     ",
      "child_ranges": [
        "(line 1809,col 9)-(line 1809,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMapValues",
      "is_interface": false,
      "parent_types": [
        "AbstractCollectionTest\u003cV\u003e"
      ],
      "begin_line": 1812,
      "end_line": 1899,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.TestMapValues()",
      "begin_line": 1813,
      "end_line": 1815,
      "comment": "",
      "child_ranges": [
        "(line 1814,col 13)-(line 1814,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.getFullElements()",
      "begin_line": 1817,
      "end_line": 1820,
      "comment": "",
      "child_ranges": [
        "(line 1819,col 13)-(line 1819,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.getOtherElements()",
      "begin_line": 1822,
      "end_line": 1825,
      "comment": "",
      "child_ranges": [
        "(line 1824,col 13)-(line 1824,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.makeObject()",
      "begin_line": 1827,
      "end_line": 1830,
      "comment": "",
      "child_ranges": [
        "(line 1829,col 13)-(line 1829,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.makeFullCollection()",
      "begin_line": 1832,
      "end_line": 1835,
      "comment": "",
      "child_ranges": [
        "(line 1834,col 13)-(line 1834,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.isNullSupported()",
      "begin_line": 1837,
      "end_line": 1840,
      "comment": "",
      "child_ranges": [
        "(line 1839,col 13)-(line 1839,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.isAddSupported()",
      "begin_line": 1842,
      "end_line": 1845,
      "comment": "",
      "child_ranges": [
        "(line 1844,col 13)-(line 1844,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.isRemoveSupported()",
      "begin_line": 1847,
      "end_line": 1850,
      "comment": "",
      "child_ranges": [
        "(line 1849,col 13)-(line 1849,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.isTestSerialization()",
      "begin_line": 1852,
      "end_line": 1855,
      "comment": "",
      "child_ranges": [
        "(line 1854,col 13)-(line 1854,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.areEqualElementsDistinguishable()",
      "begin_line": 1857,
      "end_line": 1862,
      "comment": "",
      "child_ranges": [
        "(line 1861,col 13)-(line 1861,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.makeConfirmedCollection()",
      "begin_line": 1864,
      "end_line": 1868,
      "comment": "",
      "child_ranges": [
        "(line 1867,col 13)-(line 1867,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.makeConfirmedFullCollection()",
      "begin_line": 1870,
      "end_line": 1874,
      "comment": "",
      "child_ranges": [
        "(line 1873,col 13)-(line 1873,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.resetFull()",
      "begin_line": 1876,
      "end_line": 1881,
      "comment": "",
      "child_ranges": [
        "(line 1878,col 13)-(line 1878,col 45)",
        "(line 1879,col 13)-(line 1879,col 40)",
        "(line 1880,col 13)-(line 1880,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.resetEmpty()",
      "begin_line": 1883,
      "end_line": 1888,
      "comment": "",
      "child_ranges": [
        "(line 1885,col 13)-(line 1885,col 46)",
        "(line 1886,col 13)-(line 1886,col 40)",
        "(line 1887,col 13)-(line 1887,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.verify()",
      "begin_line": 1890,
      "end_line": 1894,
      "comment": "",
      "child_ranges": [
        "(line 1892,col 13)-(line 1892,col 27)",
        "(line 1893,col 13)-(line 1893,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.resetEmpty()",
      "begin_line": 1906,
      "end_line": 1910,
      "comment": "\n     * Resets the {@link #map}, {@link #entrySet}, {@link #keySet},\n     * {@link #values} and {@link #confirmed} fields to empty.\n     ",
      "child_ranges": [
        "(line 1907,col 9)-(line 1907,col 32)",
        "(line 1908,col 9)-(line 1908,col 16)",
        "(line 1909,col 9)-(line 1909,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.resetFull()",
      "begin_line": 1916,
      "end_line": 1925,
      "comment": "\n     * Resets the {@link #map}, {@link #entrySet}, {@link #keySet},\n     * {@link #values} and {@link #confirmed} fields to full.\n     ",
      "child_ranges": [
        "(line 1917,col 9)-(line 1917,col 33)",
        "(line 1918,col 9)-(line 1918,col 16)",
        "(line 1919,col 9)-(line 1919,col 44)",
        "(line 1920,col 9)-(line 1920,col 38)",
        "(line 1921,col 9)-(line 1921,col 40)",
        "(line 1922,col 9)-(line 1924,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.views()",
      "begin_line": 1930,
      "end_line": 1935,
      "comment": "\n     * Resets the collection view fields.\n     ",
      "child_ranges": [
        "(line 1931,col 9)-(line 1931,col 40)",
        "(line 1934,col 9)-(line 1934,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.verify()",
      "begin_line": 1947,
      "end_line": 1952,
      "comment": "\n     * Verifies that {@link #map} is still equal to {@link #confirmed}.\n     * This method checks that the map is equal to the HashMap,\n     * \u003cI\u003eand\u003c/I\u003e that the map\u0027s collection views are still equal to\n     * the HashMap\u0027s collection views.  An \u003cCode\u003eequals\u003c/Code\u003e test\n     * is done on the maps and their collection views; their size and\n     * \u003cCode\u003eisEmpty\u003c/Code\u003e results are compared; their hashCodes are\n     * compared; and \u003cCode\u003econtainsAll\u003c/Code\u003e tests are run on the\n     * collection views.\n     ",
      "child_ranges": [
        "(line 1948,col 9)-(line 1948,col 20)",
        "(line 1949,col 9)-(line 1949,col 25)",
        "(line 1950,col 9)-(line 1950,col 23)",
        "(line 1951,col 9)-(line 1951,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.verifyMap()",
      "begin_line": 1954,
      "end_line": 1973,
      "comment": "",
      "child_ranges": [
        "(line 1955,col 9)-(line 1955,col 47)",
        "(line 1956,col 9)-(line 1956,col 55)",
        "(line 1957,col 9)-(line 1957,col 82)",
        "(line 1958,col 9)-(line 1958,col 85)",
        "(line 1959,col 9)-(line 1959,col 101)",
        "(line 1964,col 9)-(line 1964,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.verifyEntrySet()",
      "begin_line": 1975,
      "end_line": 1992,
      "comment": "",
      "child_ranges": [
        "(line 1976,col 9)-(line 1976,col 47)",
        "(line 1977,col 9)-(line 1977,col 55)",
        "(line 1978,col 9)-(line 1980,col 44)",
        "(line 1981,col 9)-(line 1983,col 48)",
        "(line 1984,col 9)-(line 1986,col 68)",
        "(line 1987,col 9)-(line 1989,col 80)",
        "(line 1990,col 9)-(line 1991,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.verifyKeySet()",
      "begin_line": 1994,
      "end_line": 2011,
      "comment": "",
      "child_ranges": [
        "(line 1995,col 9)-(line 1995,col 47)",
        "(line 1996,col 9)-(line 1996,col 55)",
        "(line 1997,col 9)-(line 1999,col 42)",
        "(line 2000,col 9)-(line 2002,col 46)",
        "(line 2003,col 9)-(line 2005,col 64)",
        "(line 2006,col 9)-(line 2008,col 76)",
        "(line 2009,col 9)-(line 2010,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.verifyValues()",
      "begin_line": 2013,
      "end_line": 2044,
      "comment": "",
      "child_ranges": [
        "(line 2014,col 9)-(line 2014,col 72)",
        "(line 2020,col 9)-(line 2020,col 35)",
        "(line 2022,col 9)-(line 2022,col 54)",
        "(line 2024,col 9)-(line 2024,col 47)",
        "(line 2025,col 9)-(line 2025,col 55)",
        "(line 2026,col 9)-(line 2028,col 42)",
        "(line 2029,col 9)-(line 2031,col 46)",
        "(line 2032,col 9)-(line 2034,col 45)",
        "(line 2035,col 9)-(line 2037,col 44)",
        "(line 2039,col 9)-(line 2042,col 9)",
        "(line 2043,col 9)-(line 2043,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.tearDown()",
      "begin_line": 2049,
      "end_line": 2056,
      "comment": "\n     * Erases any leftover instance variables by setting them to null.\n     ",
      "child_ranges": [
        "(line 2051,col 9)-(line 2051,col 19)",
        "(line 2052,col 9)-(line 2052,col 22)",
        "(line 2053,col 9)-(line 2053,col 24)",
        "(line 2054,col 9)-(line 2054,col 22)",
        "(line 2055,col 9)-(line 2055,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.getMap()",
      "begin_line": 2062,
      "end_line": 2064,
      "comment": "\n     * Get the map.\n     * @return Map\u003cK,V\u003e\n     ",
      "child_ranges": [
        "(line 2063,col 9)-(line 2063,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.getConfirmed()",
      "begin_line": 2070,
      "end_line": 2072,
      "comment": "\n     * Get the confirmed.\n     * @return Map\u003cK,V\u003e\n     ",
      "child_ranges": [
        "(line 2071,col 9)-(line 2071,col 25)"
      ]
    }
  ]
}