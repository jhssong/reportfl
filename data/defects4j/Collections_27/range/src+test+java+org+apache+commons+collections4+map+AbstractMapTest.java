{
  "filepath": "/tmp/Collections-27b/src/test/java/org/apache/commons/collections4/map/AbstractMapTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMapTest",
      "is_interface": false,
      "parent_types": [
        "AbstractObjectTest"
      ],
      "begin_line": 124,
      "end_line": 2064,
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
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.getSampleKeys()",
      "begin_line": 297,
      "end_line": 307,
      "comment": "\n     *  Returns the set of keys in the mappings used to test the map.  This\n     *  method must return an array with the same length as {@link\n     *  #getSampleValues()} and all array elements must be different. The\n     *  default implementation constructs a set of String keys, and includes a\n     *  single null key if {@link #isAllowNullKey()} returns \u003ccode\u003etrue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 305,col 10)",
        "(line 306,col 9)-(line 306,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.getOtherKeys()",
      "begin_line": 309,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.getOtherValues()",
      "begin_line": 314,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.getAsList(java.lang.Object[])",
      "begin_line": 319,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 55)",
        "(line 322,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.getOtherNonNullStringElements()",
      "begin_line": 336,
      "end_line": 341,
      "comment": "\n     * Returns a list of string elements suitable for return by\n     * {@link #getOtherKeys()} or {@link #getOtherValues}.\n     *\n     * \u003cp\u003eOverride getOtherElements to return the results of this method if your\n     * collection does not support heterogenous elements or the null element.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 340,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.getSampleValues()",
      "begin_line": 352,
      "end_line": 362,
      "comment": "\n     * Returns the set of values in the mappings used to test the map.  This\n     * method must return an array with the same length as\n     * {@link #getSampleKeys()}.  The default implementation constructs a set of\n     * String values and includes a single null value if\n     * {@link #isAllowNullValue()} returns \u003ccode\u003etrue\u003c/code\u003e, and includes\n     * two values that are the same if {@link #isAllowDuplicateValues()} returns\n     * \u003ccode\u003etrue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 360,col 10)",
        "(line 361,col 9)-(line 361,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.getNewSampleValues()",
      "begin_line": 375,
      "end_line": 386,
      "comment": "\n     * Returns a the set of values that can be used to replace the values\n     * returned from {@link #getSampleValues()}.  This method must return an\n     * array with the same length as {@link #getSampleValues()}.  The values\n     * returned from this method should not be the same as those returned from\n     * {@link #getSampleValues()}.  The default implementation constructs a\n     * set of String values and includes a single null value if\n     * {@link #isAllowNullValue()} returns \u003ccode\u003etrue\u003c/code\u003e, and includes two values\n     * that are the same if {@link #isAllowDuplicateValues()} returns\n     * \u003ccode\u003etrue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 384,col 10)",
        "(line 385,col 9)-(line 385,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.addSampleMappings(java.util.Map\u003c? super K, ? super V\u003e)",
      "begin_line": 392,
      "end_line": 418,
      "comment": "\n     *  Helper method to add all the mappings described by\n     * {@link #getSampleKeys()} and {@link #getSampleValues()}.\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 41)",
        "(line 395,col 9)-(line 395,col 45)",
        "(line 397,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 417,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.makeObject()",
      "begin_line": 426,
      "end_line": 427,
      "comment": "\n     * Return a new, empty {@link Map} to be used for testing.\n     *\n     * @return the map to be tested\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.makeFullMap()",
      "begin_line": 438,
      "end_line": 442,
      "comment": "\n     * Return a new, populated map.  The mappings in the map should match the\n     * keys and values returned from {@link #getSampleKeys()} and\n     * {@link #getSampleValues()}.  The default implementation uses makeEmptyMap()\n     * and calls {@link #addSampleMappings} to add all the mappings to the\n     * map.\n     *\n     * @return the map to be tested\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 41)",
        "(line 440,col 9)-(line 440,col 29)",
        "(line 441,col 9)-(line 441,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.makeConfirmedMap()",
      "begin_line": 449,
      "end_line": 451,
      "comment": "\n     * Override to return a map other than HashMap as the confirmed map.\n     *\n     * @return a map that is known to be valid\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(java.util.Map.Entry\u003cK, V\u003e)",
      "begin_line": 456,
      "end_line": 460,
      "comment": "\n     * Creates a new Map Entry that is independent of the first and the map.\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 54)",
        "(line 458,col 9)-(line 458,col 50)",
        "(line 459,col 9)-(line 459,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.getCompatibilityVersion()",
      "begin_line": 465,
      "end_line": 468,
      "comment": "\n     * Gets the compatability version, needed for package access.\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testSampleMappings()",
      "begin_line": 481,
      "end_line": 521,
      "comment": "\n     * Test to ensure the test setup is working properly.  This method checks\n     * to ensure that the getSampleKeys and getSampleValues methods are\n     * returning results that look appropriate.  That is, they both return a\n     * non-null array of equal length.  The keys array must not have any\n     * duplicate values, and may only contain a (single) null key if\n     * isNullKeySupported() returns true.  The values array must only have a null\n     * value if useNullValue() is true and may only have duplicate values if\n     * isAllowDuplicateValues() returns true.\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 46)",
        "(line 483,col 9)-(line 483,col 50)",
        "(line 484,col 9)-(line 484,col 56)",
        "(line 486,col 9)-(line 487,col 41)",
        "(line 489,col 9)-(line 490,col 45)",
        "(line 494,col 9)-(line 495,col 68)",
        "(line 497,col 9)-(line 498,col 52)",
        "(line 501,col 9)-(line 520,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMakeMap()",
      "begin_line": 532,
      "end_line": 554,
      "comment": "\n     * Test to ensure that makeEmptyMap and makeFull returns a new non-null\n     * map with each invocation.\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 42)",
        "(line 534,col 9)-(line 535,col 31)",
        "(line 537,col 9)-(line 537,col 43)",
        "(line 538,col 9)-(line 539,col 31)",
        "(line 541,col 9)-(line 542,col 55)",
        "(line 544,col 9)-(line 544,col 43)",
        "(line 545,col 9)-(line 546,col 31)",
        "(line 548,col 9)-(line 548,col 44)",
        "(line 549,col 9)-(line 550,col 31)",
        "(line 552,col 9)-(line 553,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapIsEmpty()",
      "begin_line": 559,
      "end_line": 569,
      "comment": "\n     * Tests Map.isEmpty()\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 21)",
        "(line 561,col 9)-(line 562,col 47)",
        "(line 563,col 9)-(line 563,col 17)",
        "(line 565,col 9)-(line 565,col 20)",
        "(line 566,col 9)-(line 567,col 48)",
        "(line 568,col 9)-(line 568,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapSize()",
      "begin_line": 574,
      "end_line": 584,
      "comment": "\n     * Tests Map.size()\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 21)",
        "(line 576,col 9)-(line 577,col 41)",
        "(line 578,col 9)-(line 578,col 17)",
        "(line 580,col 9)-(line 580,col 20)",
        "(line 581,col 9)-(line 582,col 76)",
        "(line 583,col 9)-(line 583,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapClear()",
      "begin_line": 594,
      "end_line": 613,
      "comment": "\n     * Tests {@link Map#clear()}.  If the map {@link #isRemoveSupported()}\n     * can add and remove elements}, then {@link Map#size()} and\n     * {@link Map#isEmpty()} are used to ensure that map has no elements after\n     * a call to clear.  If the map does not support adding and removing\n     * elements, this method checks to ensure clear throws an\n     * UnsupportedOperationException.\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 602,col 9)",
        "(line 604,col 9)-(line 604,col 21)",
        "(line 605,col 9)-(line 605,col 25)",
        "(line 606,col 9)-(line 606,col 31)",
        "(line 607,col 9)-(line 607,col 17)",
        "(line 609,col 9)-(line 609,col 20)",
        "(line 610,col 9)-(line 610,col 25)",
        "(line 611,col 9)-(line 611,col 31)",
        "(line 612,col 9)-(line 612,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapContainsKey()",
      "begin_line": 620,
      "end_line": 636,
      "comment": "\n     * Tests Map.containsKey(Object) by verifying it returns false for all\n     * sample keys on a map created using an empty map and returns true for\n     * all sample keys returned on a full map.\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 46)",
        "(line 623,col 9)-(line 623,col 21)",
        "(line 624,col 9)-(line 627,col 9)",
        "(line 628,col 9)-(line 628,col 17)",
        "(line 630,col 9)-(line 630,col 20)",
        "(line 631,col 9)-(line 634,col 9)",
        "(line 635,col 9)-(line 635,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapContainsValue()",
      "begin_line": 643,
      "end_line": 659,
      "comment": "\n     * Tests Map.containsValue(Object) by verifying it returns false for all\n     * sample values on an empty map and returns true for all sample values on\n     * a full map.\n     ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 50)",
        "(line 646,col 9)-(line 646,col 21)",
        "(line 647,col 9)-(line 650,col 9)",
        "(line 651,col 9)-(line 651,col 17)",
        "(line 653,col 9)-(line 653,col 20)",
        "(line 654,col 9)-(line 657,col 9)",
        "(line 658,col 9)-(line 658,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapEquals()",
      "begin_line": 665,
      "end_line": 687,
      "comment": "\n     * Tests Map.equals(Object)\n     ",
      "child_ranges": [
        "(line 666,col 9)-(line 666,col 21)",
        "(line 667,col 9)-(line 667,col 70)",
        "(line 668,col 9)-(line 668,col 17)",
        "(line 670,col 9)-(line 670,col 20)",
        "(line 671,col 9)-(line 671,col 69)",
        "(line 672,col 9)-(line 672,col 17)",
        "(line 674,col 9)-(line 674,col 20)",
        "(line 677,col 9)-(line 677,col 63)",
        "(line 678,col 9)-(line 678,col 20)",
        "(line 679,col 9)-(line 679,col 22)",
        "(line 680,col 9)-(line 680,col 73)",
        "(line 682,col 9)-(line 682,col 20)",
        "(line 683,col 9)-(line 683,col 74)",
        "(line 684,col 9)-(line 685,col 51)",
        "(line 686,col 9)-(line 686,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapGet()",
      "begin_line": 692,
      "end_line": 709,
      "comment": "\n     * Tests Map.get(Object)\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 21)",
        "(line 695,col 9)-(line 695,col 46)",
        "(line 696,col 9)-(line 696,col 50)",
        "(line 698,col 9)-(line 701,col 9)",
        "(line 702,col 9)-(line 702,col 17)",
        "(line 704,col 9)-(line 704,col 20)",
        "(line 705,col 9)-(line 708,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapHashCode()",
      "begin_line": 714,
      "end_line": 722,
      "comment": "\n     * Tests Map.hashCode()\n     ",
      "child_ranges": [
        "(line 715,col 9)-(line 715,col 21)",
        "(line 716,col 9)-(line 717,col 61)",
        "(line 719,col 9)-(line 719,col 20)",
        "(line 720,col 9)-(line 721,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapToString()",
      "begin_line": 733,
      "end_line": 743,
      "comment": "\n     * Tests Map.toString().  Since the format of the string returned by the\n     * toString() method is not defined in the Map interface, there is no\n     * common way to test the results of the toString() method.  Thereforce,\n     * it is encouraged that Map implementations override this test with one\n     * that checks the format matches any format defined in its API.  This\n     * default implementation just verifies that the toString() method does\n     * not return null.\n     ",
      "child_ranges": [
        "(line 734,col 9)-(line 734,col 21)",
        "(line 735,col 9)-(line 736,col 45)",
        "(line 737,col 9)-(line 737,col 17)",
        "(line 739,col 9)-(line 739,col 20)",
        "(line 740,col 9)-(line 741,col 45)",
        "(line 742,col 9)-(line 742,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testEmptyMapCompatibility()",
      "begin_line": 749,
      "end_line": 765,
      "comment": "\n     * Compare the current serialized form of the Map\n     * against the canonical version in SVN.\n     ",
      "child_ranges": [
        "(line 759,col 9)-(line 759,col 43)",
        "(line 760,col 9)-(line 764,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testFullMapCompatibility()",
      "begin_line": 771,
      "end_line": 787,
      "comment": "\n     * Compare the current serialized form of the Map\n     * against the canonical version in SVN.\n     ",
      "child_ranges": [
        "(line 781,col 9)-(line 781,col 44)",
        "(line 782,col 9)-(line 786,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapPut()",
      "begin_line": 792,
      "end_line": 871,
      "comment": "\n     * Tests Map.put(Object, Object)\n     ",
      "child_ranges": [
        "(line 793,col 9)-(line 793,col 21)",
        "(line 794,col 9)-(line 794,col 41)",
        "(line 795,col 9)-(line 795,col 45)",
        "(line 796,col 9)-(line 796,col 51)",
        "(line 798,col 9)-(line 870,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapPutNullKey()",
      "begin_line": 876,
      "end_line": 891,
      "comment": "\n     * Tests Map.put(null, value)\n     ",
      "child_ranges": [
        "(line 877,col 9)-(line 877,col 20)",
        "(line 878,col 9)-(line 878,col 45)",
        "(line 880,col 9)-(line 890,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapPutNullValue()",
      "begin_line": 896,
      "end_line": 911,
      "comment": "\n     * Tests Map.put(null, value)\n     ",
      "child_ranges": [
        "(line 897,col 9)-(line 897,col 20)",
        "(line 898,col 9)-(line 898,col 41)",
        "(line 900,col 9)-(line 910,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapPutAll()",
      "begin_line": 916,
      "end_line": 972,
      "comment": "\n     * Tests Map.putAll(map)\n     ",
      "child_ranges": [
        "(line 917,col 9)-(line 927,col 9)",
        "(line 930,col 9)-(line 930,col 21)",
        "(line 931,col 9)-(line 931,col 41)",
        "(line 932,col 9)-(line 932,col 45)",
        "(line 933,col 9)-(line 933,col 41)",
        "(line 936,col 9)-(line 936,col 20)",
        "(line 937,col 9)-(line 937,col 41)",
        "(line 938,col 9)-(line 938,col 45)",
        "(line 939,col 9)-(line 939,col 44)",
        "(line 942,col 9)-(line 942,col 21)",
        "(line 943,col 9)-(line 943,col 37)",
        "(line 944,col 9)-(line 944,col 28)",
        "(line 945,col 9)-(line 945,col 34)",
        "(line 946,col 9)-(line 946,col 17)",
        "(line 949,col 9)-(line 949,col 21)",
        "(line 950,col 9)-(line 950,col 32)",
        "(line 951,col 9)-(line 951,col 41)",
        "(line 952,col 9)-(line 952,col 45)",
        "(line 953,col 9)-(line 955,col 9)",
        "(line 956,col 9)-(line 956,col 28)",
        "(line 957,col 9)-(line 957,col 34)",
        "(line 958,col 9)-(line 958,col 17)",
        "(line 961,col 9)-(line 961,col 21)",
        "(line 962,col 9)-(line 962,col 32)",
        "(line 963,col 9)-(line 963,col 41)",
        "(line 964,col 9)-(line 964,col 47)",
        "(line 965,col 9)-(line 965,col 17)",
        "(line 966,col 9)-(line 968,col 9)",
        "(line 969,col 9)-(line 969,col 28)",
        "(line 970,col 9)-(line 970,col 34)",
        "(line 971,col 9)-(line 971,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testMapRemove()",
      "begin_line": 977,
      "end_line": 1019,
      "comment": "\n     * Tests Map.remove(Object)\n     ",
      "child_ranges": [
        "(line 978,col 9)-(line 985,col 9)",
        "(line 987,col 9)-(line 987,col 21)",
        "(line 989,col 9)-(line 989,col 46)",
        "(line 990,col 9)-(line 990,col 50)",
        "(line 991,col 9)-(line 994,col 9)",
        "(line 995,col 9)-(line 995,col 17)",
        "(line 997,col 9)-(line 997,col 20)",
        "(line 999,col 9)-(line 1006,col 9)",
        "(line 1008,col 9)-(line 1008,col 46)",
        "(line 1010,col 9)-(line 1010,col 20)",
        "(line 1011,col 9)-(line 1011,col 41)",
        "(line 1012,col 9)-(line 1017,col 9)",
        "(line 1018,col 9)-(line 1018,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testValuesClearChangesMap()",
      "begin_line": 1026,
      "end_line": 1048,
      "comment": "\n     * Tests that the {@link Map#values} collection is backed by\n     * the underlying map for clear().\n     ",
      "child_ranges": [
        "(line 1027,col 9)-(line 1029,col 9)",
        "(line 1032,col 9)-(line 1032,col 20)",
        "(line 1033,col 9)-(line 1033,col 49)",
        "(line 1034,col 9)-(line 1034,col 40)",
        "(line 1035,col 9)-(line 1035,col 38)",
        "(line 1036,col 9)-(line 1036,col 23)",
        "(line 1037,col 9)-(line 1037,col 41)",
        "(line 1038,col 9)-(line 1038,col 39)",
        "(line 1041,col 9)-(line 1041,col 20)",
        "(line 1042,col 9)-(line 1042,col 35)",
        "(line 1043,col 9)-(line 1043,col 40)",
        "(line 1044,col 9)-(line 1044,col 38)",
        "(line 1045,col 9)-(line 1045,col 25)",
        "(line 1046,col 9)-(line 1046,col 41)",
        "(line 1047,col 9)-(line 1047,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testKeySetClearChangesMap()",
      "begin_line": 1054,
      "end_line": 1076,
      "comment": "\n     * Tests that the {@link Map#keySet} collection is backed by\n     * the underlying map for clear().\n     ",
      "child_ranges": [
        "(line 1055,col 9)-(line 1057,col 9)",
        "(line 1060,col 9)-(line 1060,col 20)",
        "(line 1061,col 9)-(line 1061,col 42)",
        "(line 1062,col 9)-(line 1062,col 40)",
        "(line 1063,col 9)-(line 1063,col 38)",
        "(line 1064,col 9)-(line 1064,col 23)",
        "(line 1065,col 9)-(line 1065,col 41)",
        "(line 1066,col 9)-(line 1066,col 39)",
        "(line 1069,col 9)-(line 1069,col 20)",
        "(line 1070,col 9)-(line 1070,col 35)",
        "(line 1071,col 9)-(line 1071,col 40)",
        "(line 1072,col 9)-(line 1072,col 38)",
        "(line 1073,col 9)-(line 1073,col 25)",
        "(line 1074,col 9)-(line 1074,col 41)",
        "(line 1075,col 9)-(line 1075,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testEntrySetClearChangesMap()",
      "begin_line": 1082,
      "end_line": 1104,
      "comment": "\n     * Tests that the {@link Map#entrySet()} collection is backed by\n     * the underlying map for clear().\n     ",
      "child_ranges": [
        "(line 1083,col 9)-(line 1085,col 9)",
        "(line 1088,col 9)-(line 1088,col 20)",
        "(line 1089,col 9)-(line 1089,col 60)",
        "(line 1090,col 9)-(line 1090,col 40)",
        "(line 1091,col 9)-(line 1091,col 40)",
        "(line 1092,col 9)-(line 1092,col 25)",
        "(line 1093,col 9)-(line 1093,col 41)",
        "(line 1094,col 9)-(line 1094,col 41)",
        "(line 1097,col 9)-(line 1097,col 20)",
        "(line 1098,col 9)-(line 1098,col 39)",
        "(line 1099,col 9)-(line 1099,col 40)",
        "(line 1100,col 9)-(line 1100,col 40)",
        "(line 1101,col 9)-(line 1101,col 25)",
        "(line 1102,col 9)-(line 1102,col 41)",
        "(line 1103,col 9)-(line 1103,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testEntrySetContains1()",
      "begin_line": 1107,
      "end_line": 1112,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 1108,col 9)-(line 1108,col 20)",
        "(line 1109,col 9)-(line 1109,col 66)",
        "(line 1110,col 9)-(line 1110,col 65)",
        "(line 1111,col 9)-(line 1111,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testEntrySetContains2()",
      "begin_line": 1114,
      "end_line": 1120,
      "comment": "",
      "child_ranges": [
        "(line 1115,col 9)-(line 1115,col 20)",
        "(line 1116,col 9)-(line 1116,col 66)",
        "(line 1117,col 9)-(line 1117,col 65)",
        "(line 1118,col 9)-(line 1118,col 58)",
        "(line 1119,col 9)-(line 1119,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testEntrySetContains3()",
      "begin_line": 1122,
      "end_line": 1131,
      "comment": "",
      "child_ranges": [
        "(line 1124,col 9)-(line 1124,col 20)",
        "(line 1125,col 9)-(line 1125,col 66)",
        "(line 1126,col 9)-(line 1126,col 65)",
        "(line 1127,col 9)-(line 1127,col 55)",
        "(line 1128,col 9)-(line 1128,col 63)",
        "(line 1129,col 9)-(line 1129,col 71)",
        "(line 1130,col 9)-(line 1130,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testEntrySetRemove1()",
      "begin_line": 1133,
      "end_line": 1146,
      "comment": "",
      "child_ranges": [
        "(line 1134,col 9)-(line 1136,col 9)",
        "(line 1137,col 9)-(line 1137,col 20)",
        "(line 1138,col 9)-(line 1138,col 41)",
        "(line 1139,col 9)-(line 1139,col 66)",
        "(line 1140,col 9)-(line 1140,col 65)",
        "(line 1141,col 9)-(line 1141,col 37)",
        "(line 1143,col 9)-(line 1143,col 51)",
        "(line 1144,col 9)-(line 1144,col 55)",
        "(line 1145,col 9)-(line 1145,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testEntrySetRemove2()",
      "begin_line": 1148,
      "end_line": 1162,
      "comment": "",
      "child_ranges": [
        "(line 1149,col 9)-(line 1151,col 9)",
        "(line 1152,col 9)-(line 1152,col 20)",
        "(line 1153,col 9)-(line 1153,col 41)",
        "(line 1154,col 9)-(line 1154,col 66)",
        "(line 1155,col 9)-(line 1155,col 65)",
        "(line 1156,col 9)-(line 1156,col 37)",
        "(line 1157,col 9)-(line 1157,col 58)",
        "(line 1159,col 9)-(line 1159,col 50)",
        "(line 1160,col 9)-(line 1160,col 55)",
        "(line 1161,col 9)-(line 1161,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testEntrySetRemove3()",
      "begin_line": 1164,
      "end_line": 1181,
      "comment": "",
      "child_ranges": [
        "(line 1166,col 9)-(line 1168,col 9)",
        "(line 1169,col 9)-(line 1169,col 20)",
        "(line 1170,col 9)-(line 1170,col 41)",
        "(line 1171,col 9)-(line 1171,col 66)",
        "(line 1172,col 9)-(line 1172,col 65)",
        "(line 1173,col 9)-(line 1173,col 37)",
        "(line 1174,col 9)-(line 1174,col 55)",
        "(line 1175,col 9)-(line 1175,col 63)",
        "(line 1176,col 9)-(line 1176,col 71)",
        "(line 1178,col 9)-(line 1178,col 51)",
        "(line 1179,col 9)-(line 1179,col 54)",
        "(line 1180,col 9)-(line 1180,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testValuesRemoveChangesMap()",
      "begin_line": 1199,
      "end_line": 1221,
      "comment": "\n     * Tests that the {@link Map#values} collection is backed by\n     * the underlying map by removing from the values collection\n     * and testing if the value was removed from the map.\n     * \u003cp\u003e\n     * We should really test the \"vice versa\" case--that values removed\n     * from the map are removed from the values collection--also,\n     * but that\u0027s a more difficult test to construct (lacking a\n     * \"removeValue\" method.)\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * See bug \u003ca href\u003d\"http://issues.apache.org/bugzilla/show_bug.cgi?id\u003d9573\"\u003e\n     * 9573\u003c/a\u003e.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1200,col 9)-(line 1200,col 20)",
        "(line 1201,col 9)-(line 1201,col 51)",
        "(line 1202,col 9)-(line 1202,col 55)",
        "(line 1203,col 9)-(line 1220,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testValuesRemoveAll()",
      "begin_line": 1226,
      "end_line": 1247,
      "comment": "\n     * Tests values.removeAll.\n     ",
      "child_ranges": [
        "(line 1227,col 9)-(line 1227,col 20)",
        "(line 1228,col 9)-(line 1228,col 55)",
        "(line 1229,col 9)-(line 1229,col 76)",
        "(line 1230,col 9)-(line 1232,col 9)",
        "(line 1233,col 9)-(line 1238,col 9)",
        "(line 1239,col 9)-(line 1239,col 65)",
        "(line 1240,col 9)-(line 1245,col 9)",
        "(line 1246,col 9)-(line 1246,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testValuesRetainAll()",
      "begin_line": 1252,
      "end_line": 1273,
      "comment": "\n     * Test values.retainAll.\n     ",
      "child_ranges": [
        "(line 1253,col 9)-(line 1253,col 20)",
        "(line 1254,col 9)-(line 1254,col 55)",
        "(line 1255,col 9)-(line 1255,col 76)",
        "(line 1256,col 9)-(line 1258,col 9)",
        "(line 1259,col 9)-(line 1264,col 9)",
        "(line 1265,col 9)-(line 1265,col 65)",
        "(line 1266,col 9)-(line 1271,col 9)",
        "(line 1272,col 9)-(line 1272,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testValuesIteratorRemoveChangesMap()",
      "begin_line": 1278,
      "end_line": 1304,
      "comment": "\n     * Verifies that values.iterator.remove changes the underlying map.\n     ",
      "child_ranges": [
        "(line 1280,col 9)-(line 1280,col 20)",
        "(line 1281,col 9)-(line 1281,col 76)",
        "(line 1282,col 9)-(line 1282,col 98)",
        "(line 1283,col 9)-(line 1283,col 55)",
        "(line 1284,col 9)-(line 1302,col 9)",
        "(line 1303,col 9)-(line 1303,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testKeySetRemoveChangesMap()",
      "begin_line": 1311,
      "end_line": 1326,
      "comment": "\n     * Tests that the {@link Map#keySet} set is backed by\n     * the underlying map by removing from the keySet set\n     * and testing if the key was removed from the map.\n     ",
      "child_ranges": [
        "(line 1312,col 9)-(line 1312,col 20)",
        "(line 1313,col 9)-(line 1313,col 47)",
        "(line 1314,col 9)-(line 1314,col 46)",
        "(line 1315,col 9)-(line 1325,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testKeySetRemoveAll()",
      "begin_line": 1331,
      "end_line": 1350,
      "comment": "\n     * Test keySet.removeAll.\n     ",
      "child_ranges": [
        "(line 1332,col 9)-(line 1332,col 20)",
        "(line 1333,col 9)-(line 1333,col 46)",
        "(line 1334,col 9)-(line 1334,col 72)",
        "(line 1335,col 9)-(line 1337,col 9)",
        "(line 1338,col 9)-(line 1342,col 9)",
        "(line 1343,col 9)-(line 1343,col 45)",
        "(line 1344,col 9)-(line 1348,col 9)",
        "(line 1349,col 9)-(line 1349,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testKeySetRetainAll()",
      "begin_line": 1355,
      "end_line": 1374,
      "comment": "\n     * Test keySet.retainAll.\n     ",
      "child_ranges": [
        "(line 1356,col 9)-(line 1356,col 20)",
        "(line 1357,col 9)-(line 1357,col 46)",
        "(line 1358,col 9)-(line 1358,col 72)",
        "(line 1359,col 9)-(line 1361,col 9)",
        "(line 1362,col 9)-(line 1366,col 9)",
        "(line 1367,col 9)-(line 1367,col 45)",
        "(line 1368,col 9)-(line 1372,col 9)",
        "(line 1373,col 9)-(line 1373,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testKeySetIteratorRemoveChangesMap()",
      "begin_line": 1379,
      "end_line": 1390,
      "comment": "\n     * Verify that keySet.iterator.remove changes the underlying map.\n     ",
      "child_ranges": [
        "(line 1380,col 9)-(line 1380,col 20)",
        "(line 1381,col 9)-(line 1389,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testEntrySetRemoveChangesMap()",
      "begin_line": 1397,
      "end_line": 1413,
      "comment": "\n     * Tests that the {@link Map#entrySet} set is backed by\n     * the underlying map by removing from the entrySet set\n     * and testing if the entry was removed from the map.\n     ",
      "child_ranges": [
        "(line 1398,col 9)-(line 1398,col 20)",
        "(line 1399,col 9)-(line 1399,col 47)",
        "(line 1400,col 9)-(line 1400,col 51)",
        "(line 1401,col 9)-(line 1401,col 66)",
        "(line 1402,col 9)-(line 1412,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testEntrySetRemoveAll()",
      "begin_line": 1418,
      "end_line": 1448,
      "comment": "\n     * Test entrySet.removeAll.\n     ",
      "child_ranges": [
        "(line 1419,col 9)-(line 1419,col 20)",
        "(line 1420,col 9)-(line 1420,col 47)",
        "(line 1421,col 9)-(line 1421,col 51)",
        "(line 1423,col 9)-(line 1433,col 9)",
        "(line 1434,col 9)-(line 1434,col 66)",
        "(line 1435,col 9)-(line 1435,col 94)",
        "(line 1436,col 9)-(line 1440,col 9)",
        "(line 1441,col 9)-(line 1441,col 57)",
        "(line 1442,col 9)-(line 1446,col 9)",
        "(line 1447,col 9)-(line 1447,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testEntrySetRetainAll()",
      "begin_line": 1453,
      "end_line": 1483,
      "comment": "\n     * Test entrySet.retainAll.\n     ",
      "child_ranges": [
        "(line 1454,col 9)-(line 1454,col 20)",
        "(line 1455,col 9)-(line 1455,col 47)",
        "(line 1456,col 9)-(line 1456,col 51)",
        "(line 1458,col 9)-(line 1468,col 9)",
        "(line 1469,col 9)-(line 1469,col 66)",
        "(line 1470,col 9)-(line 1470,col 94)",
        "(line 1471,col 9)-(line 1475,col 9)",
        "(line 1476,col 9)-(line 1476,col 57)",
        "(line 1477,col 9)-(line 1481,col 9)",
        "(line 1482,col 9)-(line 1482,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.testEntrySetIteratorRemoveChangesMap()",
      "begin_line": 1488,
      "end_line": 1499,
      "comment": "\n     * Verify that entrySet.iterator.remove changes the underlying map.\n     ",
      "child_ranges": [
        "(line 1489,col 9)-(line 1489,col 20)",
        "(line 1490,col 9)-(line 1498,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.makeEntryArray(K[], V[])",
      "begin_line": 1509,
      "end_line": 1518,
      "comment": "\n     * Utility methods to create an array of Map.Entry objects\n     * out of the given key and value arrays.\u003cP\u003e\n     *\n     * @param keys    the array of keys\n     * @param values  the array of values\n     * @return an array of Map.Entry of those keys to those values\n     ",
      "child_ranges": [
        "(line 1511,col 9)-(line 1511,col 68)",
        "(line 1512,col 9)-(line 1516,col 9)",
        "(line 1517,col 9)-(line 1517,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.bulkTestMapEntrySet()",
      "begin_line": 1528,
      "end_line": 1530,
      "comment": "\n     * Bulk test {@link Map#entrySet()}.  This method runs through all of\n     * the tests in {@link AbstractSetTest}.\n     * After modification operations, {@link #verify()} is invoked to ensure\n     * that the map and the other collection views are still valid.\n     *\n     * @return a {@link AbstractSetTest} instance for testing the map\u0027s entry set\n     ",
      "child_ranges": [
        "(line 1529,col 9)-(line 1529,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMapEntrySet",
      "is_interface": false,
      "parent_types": [
        "AbstractSetTest\u003cMap.Entry\u003cK,V\u003e\u003e"
      ],
      "begin_line": 1532,
      "end_line": 1709,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.TestMapEntrySet()",
      "begin_line": 1533,
      "end_line": 1535,
      "comment": "",
      "child_ranges": [
        "(line 1534,col 13)-(line 1534,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.getFullElements()",
      "begin_line": 1541,
      "end_line": 1544,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1543,col 13)-(line 1543,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.getFullNonNullElements()",
      "begin_line": 1549,
      "end_line": 1554,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1551,col 13)-(line 1551,col 42)",
        "(line 1552,col 13)-(line 1552,col 44)",
        "(line 1553,col 13)-(line 1553,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.getOtherElements()",
      "begin_line": 1557,
      "end_line": 1562,
      "comment": " Have to implement manually; entrySet doesn\u0027t support addAll",
      "child_ranges": [
        "(line 1559,col 13)-(line 1559,col 41)",
        "(line 1560,col 13)-(line 1560,col 43)",
        "(line 1561,col 13)-(line 1561,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.makeObject()",
      "begin_line": 1564,
      "end_line": 1567,
      "comment": "",
      "child_ranges": [
        "(line 1566,col 13)-(line 1566,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.makeFullCollection()",
      "begin_line": 1569,
      "end_line": 1572,
      "comment": "",
      "child_ranges": [
        "(line 1571,col 13)-(line 1571,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.isAddSupported()",
      "begin_line": 1574,
      "end_line": 1578,
      "comment": "",
      "child_ranges": [
        "(line 1577,col 13)-(line 1577,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.isRemoveSupported()",
      "begin_line": 1580,
      "end_line": 1584,
      "comment": "",
      "child_ranges": [
        "(line 1583,col 13)-(line 1583,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.isGetStructuralModify()",
      "begin_line": 1586,
      "end_line": 1588,
      "comment": "",
      "child_ranges": [
        "(line 1587,col 13)-(line 1587,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.isTestSerialization()",
      "begin_line": 1590,
      "end_line": 1593,
      "comment": "",
      "child_ranges": [
        "(line 1592,col 13)-(line 1592,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.resetFull()",
      "begin_line": 1595,
      "end_line": 1600,
      "comment": "",
      "child_ranges": [
        "(line 1597,col 13)-(line 1597,col 45)",
        "(line 1598,col 13)-(line 1598,col 68)",
        "(line 1599,col 13)-(line 1599,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.resetEmpty()",
      "begin_line": 1602,
      "end_line": 1607,
      "comment": "",
      "child_ranges": [
        "(line 1604,col 13)-(line 1604,col 46)",
        "(line 1605,col 13)-(line 1605,col 68)",
        "(line 1606,col 13)-(line 1606,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.testMapEntrySetIteratorEntry()",
      "begin_line": 1609,
      "end_line": 1623,
      "comment": "",
      "child_ranges": [
        "(line 1610,col 13)-(line 1610,col 24)",
        "(line 1611,col 13)-(line 1611,col 76)",
        "(line 1612,col 13)-(line 1612,col 26)",
        "(line 1613,col 13)-(line 1621,col 13)",
        "(line 1622,col 13)-(line 1622,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.testMapEntrySetIteratorEntrySetValue()",
      "begin_line": 1625,
      "end_line": 1675,
      "comment": "",
      "child_ranges": [
        "(line 1626,col 13)-(line 1626,col 46)",
        "(line 1627,col 13)-(line 1627,col 97)",
        "(line 1628,col 13)-(line 1628,col 56)",
        "(line 1629,col 13)-(line 1629,col 116)",
        "(line 1631,col 13)-(line 1631,col 24)",
        "(line 1634,col 13)-(line 1634,col 91)",
        "(line 1635,col 13)-(line 1635,col 62)",
        "(line 1636,col 13)-(line 1636,col 65)",
        "(line 1637,col 13)-(line 1637,col 62)",
        "(line 1638,col 13)-(line 1638,col 99)",
        "(line 1639,col 13)-(line 1639,col 80)",
        "(line 1640,col 13)-(line 1640,col 73)",
        "(line 1641,col 13)-(line 1641,col 80)",
        "(line 1642,col 13)-(line 1642,col 21)",
        "(line 1644,col 13)-(line 1650,col 13)",
        "(line 1652,col 13)-(line 1652,col 39)",
        "(line 1653,col 13)-(line 1653,col 48)",
        "(line 1654,col 13)-(line 1654,col 55)",
        "(line 1655,col 13)-(line 1655,col 91)",
        "(line 1656,col 13)-(line 1656,col 87)",
        "(line 1657,col 13)-(line 1657,col 88)",
        "(line 1658,col 13)-(line 1658,col 21)",
        "(line 1660,col 13)-(line 1660,col 39)",
        "(line 1661,col 13)-(line 1661,col 48)",
        "(line 1662,col 13)-(line 1662,col 55)",
        "(line 1663,col 13)-(line 1663,col 91)",
        "(line 1664,col 13)-(line 1664,col 87)",
        "(line 1665,col 13)-(line 1665,col 88)",
        "(line 1666,col 13)-(line 1666,col 21)",
        "(line 1668,col 13)-(line 1668,col 39)",
        "(line 1669,col 13)-(line 1669,col 48)",
        "(line 1670,col 13)-(line 1670,col 55)",
        "(line 1671,col 13)-(line 1671,col 91)",
        "(line 1672,col 13)-(line 1672,col 87)",
        "(line 1673,col 13)-(line 1673,col 88)",
        "(line 1674,col 13)-(line 1674,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.getEntry(java.util.Iterator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e, K)",
      "begin_line": 1677,
      "end_line": 1693,
      "comment": "",
      "child_ranges": [
        "(line 1678,col 13)-(line 1678,col 41)",
        "(line 1679,col 13)-(line 1690,col 13)",
        "(line 1691,col 13)-(line 1691,col 83)",
        "(line 1692,col 13)-(line 1692,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.testMapEntrySetRemoveNonMapEntry()",
      "begin_line": 1695,
      "end_line": 1702,
      "comment": "",
      "child_ranges": [
        "(line 1696,col 13)-(line 1698,col 13)",
        "(line 1699,col 13)-(line 1699,col 24)",
        "(line 1700,col 13)-(line 1700,col 62)",
        "(line 1701,col 13)-(line 1701,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapEntrySet.verify()",
      "begin_line": 1704,
      "end_line": 1708,
      "comment": "",
      "child_ranges": [
        "(line 1706,col 13)-(line 1706,col 27)",
        "(line 1707,col 13)-(line 1707,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.bulkTestMapKeySet()",
      "begin_line": 1720,
      "end_line": 1722,
      "comment": "\n     * Bulk test {@link Map#keySet()}.  This method runs through all of\n     * the tests in {@link AbstractSetTest}.\n     * After modification operations, {@link #verify()} is invoked to ensure\n     * that the map and the other collection views are still valid.\n     *\n     * @return a {@link AbstractSetTest} instance for testing the map\u0027s key set\n     ",
      "child_ranges": [
        "(line 1721,col 9)-(line 1721,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMapKeySet",
      "is_interface": false,
      "parent_types": [
        "AbstractSetTest\u003cK\u003e"
      ],
      "begin_line": 1724,
      "end_line": 1788,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapKeySet.TestMapKeySet()",
      "begin_line": 1725,
      "end_line": 1727,
      "comment": "",
      "child_ranges": [
        "(line 1726,col 13)-(line 1726,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapKeySet.getFullElements()",
      "begin_line": 1729,
      "end_line": 1732,
      "comment": "",
      "child_ranges": [
        "(line 1731,col 13)-(line 1731,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapKeySet.getOtherElements()",
      "begin_line": 1734,
      "end_line": 1737,
      "comment": "",
      "child_ranges": [
        "(line 1736,col 13)-(line 1736,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapKeySet.makeObject()",
      "begin_line": 1739,
      "end_line": 1742,
      "comment": "",
      "child_ranges": [
        "(line 1741,col 13)-(line 1741,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapKeySet.makeFullCollection()",
      "begin_line": 1744,
      "end_line": 1747,
      "comment": "",
      "child_ranges": [
        "(line 1746,col 13)-(line 1746,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapKeySet.isNullSupported()",
      "begin_line": 1749,
      "end_line": 1752,
      "comment": "",
      "child_ranges": [
        "(line 1751,col 13)-(line 1751,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapKeySet.isAddSupported()",
      "begin_line": 1754,
      "end_line": 1757,
      "comment": "",
      "child_ranges": [
        "(line 1756,col 13)-(line 1756,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapKeySet.isRemoveSupported()",
      "begin_line": 1759,
      "end_line": 1762,
      "comment": "",
      "child_ranges": [
        "(line 1761,col 13)-(line 1761,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapKeySet.isTestSerialization()",
      "begin_line": 1764,
      "end_line": 1767,
      "comment": "",
      "child_ranges": [
        "(line 1766,col 13)-(line 1766,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapKeySet.resetEmpty()",
      "begin_line": 1769,
      "end_line": 1774,
      "comment": "",
      "child_ranges": [
        "(line 1771,col 13)-(line 1771,col 46)",
        "(line 1772,col 13)-(line 1772,col 66)",
        "(line 1773,col 13)-(line 1773,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapKeySet.resetFull()",
      "begin_line": 1776,
      "end_line": 1781,
      "comment": "",
      "child_ranges": [
        "(line 1778,col 13)-(line 1778,col 45)",
        "(line 1779,col 13)-(line 1779,col 66)",
        "(line 1780,col 13)-(line 1780,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapKeySet.verify()",
      "begin_line": 1783,
      "end_line": 1787,
      "comment": "",
      "child_ranges": [
        "(line 1785,col 13)-(line 1785,col 27)",
        "(line 1786,col 13)-(line 1786,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.bulkTestMapValues()",
      "begin_line": 1799,
      "end_line": 1801,
      "comment": "\n     * Bulk test {@link Map#values()}.  This method runs through all of\n     * the tests in {@link AbstractCollectionTest}.\n     * After modification operations, {@link #verify()} is invoked to ensure\n     * that the map and the other collection views are still valid.\n     *\n     * @return a {@link AbstractCollectionTest} instance for testing the map\u0027s\n     *    values collection\n     ",
      "child_ranges": [
        "(line 1800,col 9)-(line 1800,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMapValues",
      "is_interface": false,
      "parent_types": [
        "AbstractCollectionTest\u003cV\u003e"
      ],
      "begin_line": 1803,
      "end_line": 1890,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.TestMapValues()",
      "begin_line": 1804,
      "end_line": 1806,
      "comment": "",
      "child_ranges": [
        "(line 1805,col 13)-(line 1805,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.getFullElements()",
      "begin_line": 1808,
      "end_line": 1811,
      "comment": "",
      "child_ranges": [
        "(line 1810,col 13)-(line 1810,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.getOtherElements()",
      "begin_line": 1813,
      "end_line": 1816,
      "comment": "",
      "child_ranges": [
        "(line 1815,col 13)-(line 1815,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.makeObject()",
      "begin_line": 1818,
      "end_line": 1821,
      "comment": "",
      "child_ranges": [
        "(line 1820,col 13)-(line 1820,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.makeFullCollection()",
      "begin_line": 1823,
      "end_line": 1826,
      "comment": "",
      "child_ranges": [
        "(line 1825,col 13)-(line 1825,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.isNullSupported()",
      "begin_line": 1828,
      "end_line": 1831,
      "comment": "",
      "child_ranges": [
        "(line 1830,col 13)-(line 1830,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.isAddSupported()",
      "begin_line": 1833,
      "end_line": 1836,
      "comment": "",
      "child_ranges": [
        "(line 1835,col 13)-(line 1835,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.isRemoveSupported()",
      "begin_line": 1838,
      "end_line": 1841,
      "comment": "",
      "child_ranges": [
        "(line 1840,col 13)-(line 1840,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.isTestSerialization()",
      "begin_line": 1843,
      "end_line": 1846,
      "comment": "",
      "child_ranges": [
        "(line 1845,col 13)-(line 1845,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.areEqualElementsDistinguishable()",
      "begin_line": 1848,
      "end_line": 1853,
      "comment": "",
      "child_ranges": [
        "(line 1852,col 13)-(line 1852,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.makeConfirmedCollection()",
      "begin_line": 1855,
      "end_line": 1859,
      "comment": "",
      "child_ranges": [
        "(line 1858,col 13)-(line 1858,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.makeConfirmedFullCollection()",
      "begin_line": 1861,
      "end_line": 1865,
      "comment": "",
      "child_ranges": [
        "(line 1864,col 13)-(line 1864,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.resetFull()",
      "begin_line": 1867,
      "end_line": 1872,
      "comment": "",
      "child_ranges": [
        "(line 1869,col 13)-(line 1869,col 45)",
        "(line 1870,col 13)-(line 1870,col 40)",
        "(line 1871,col 13)-(line 1871,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.resetEmpty()",
      "begin_line": 1874,
      "end_line": 1879,
      "comment": "",
      "child_ranges": [
        "(line 1876,col 13)-(line 1876,col 46)",
        "(line 1877,col 13)-(line 1877,col 40)",
        "(line 1878,col 13)-(line 1878,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.TestMapValues.verify()",
      "begin_line": 1881,
      "end_line": 1885,
      "comment": "",
      "child_ranges": [
        "(line 1883,col 13)-(line 1883,col 27)",
        "(line 1884,col 13)-(line 1884,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.resetEmpty()",
      "begin_line": 1897,
      "end_line": 1901,
      "comment": "\n     * Resets the {@link #map}, {@link #entrySet}, {@link #keySet},\n     * {@link #values} and {@link #confirmed} fields to empty.\n     ",
      "child_ranges": [
        "(line 1898,col 9)-(line 1898,col 32)",
        "(line 1899,col 9)-(line 1899,col 16)",
        "(line 1900,col 9)-(line 1900,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.resetFull()",
      "begin_line": 1907,
      "end_line": 1916,
      "comment": "\n     * Resets the {@link #map}, {@link #entrySet}, {@link #keySet},\n     * {@link #values} and {@link #confirmed} fields to full.\n     ",
      "child_ranges": [
        "(line 1908,col 9)-(line 1908,col 33)",
        "(line 1909,col 9)-(line 1909,col 16)",
        "(line 1910,col 9)-(line 1910,col 44)",
        "(line 1911,col 9)-(line 1911,col 38)",
        "(line 1912,col 9)-(line 1912,col 40)",
        "(line 1913,col 9)-(line 1915,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.views()",
      "begin_line": 1921,
      "end_line": 1926,
      "comment": "\n     * Resets the collection view fields.\n     ",
      "child_ranges": [
        "(line 1922,col 9)-(line 1922,col 40)",
        "(line 1925,col 9)-(line 1925,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.verify()",
      "begin_line": 1938,
      "end_line": 1943,
      "comment": "\n     * Verifies that {@link #map} is still equal to {@link #confirmed}.\n     * This method checks that the map is equal to the HashMap,\n     * \u003cI\u003eand\u003c/I\u003e that the map\u0027s collection views are still equal to\n     * the HashMap\u0027s collection views.  An \u003cCode\u003eequals\u003c/Code\u003e test\n     * is done on the maps and their collection views; their size and\n     * \u003cCode\u003eisEmpty\u003c/Code\u003e results are compared; their hashCodes are\n     * compared; and \u003cCode\u003econtainsAll\u003c/Code\u003e tests are run on the\n     * collection views.\n     ",
      "child_ranges": [
        "(line 1939,col 9)-(line 1939,col 20)",
        "(line 1940,col 9)-(line 1940,col 25)",
        "(line 1941,col 9)-(line 1941,col 23)",
        "(line 1942,col 9)-(line 1942,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.verifyMap()",
      "begin_line": 1945,
      "end_line": 1964,
      "comment": "",
      "child_ranges": [
        "(line 1946,col 9)-(line 1946,col 47)",
        "(line 1947,col 9)-(line 1947,col 55)",
        "(line 1948,col 9)-(line 1948,col 82)",
        "(line 1949,col 9)-(line 1949,col 85)",
        "(line 1950,col 9)-(line 1950,col 101)",
        "(line 1955,col 9)-(line 1955,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.verifyEntrySet()",
      "begin_line": 1966,
      "end_line": 1983,
      "comment": "",
      "child_ranges": [
        "(line 1967,col 9)-(line 1967,col 47)",
        "(line 1968,col 9)-(line 1968,col 55)",
        "(line 1969,col 9)-(line 1971,col 44)",
        "(line 1972,col 9)-(line 1974,col 48)",
        "(line 1975,col 9)-(line 1977,col 68)",
        "(line 1978,col 9)-(line 1980,col 80)",
        "(line 1981,col 9)-(line 1982,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.verifyKeySet()",
      "begin_line": 1985,
      "end_line": 2002,
      "comment": "",
      "child_ranges": [
        "(line 1986,col 9)-(line 1986,col 47)",
        "(line 1987,col 9)-(line 1987,col 55)",
        "(line 1988,col 9)-(line 1990,col 42)",
        "(line 1991,col 9)-(line 1993,col 46)",
        "(line 1994,col 9)-(line 1996,col 64)",
        "(line 1997,col 9)-(line 1999,col 76)",
        "(line 2000,col 9)-(line 2001,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.verifyValues()",
      "begin_line": 2004,
      "end_line": 2035,
      "comment": "",
      "child_ranges": [
        "(line 2005,col 9)-(line 2005,col 72)",
        "(line 2011,col 9)-(line 2011,col 35)",
        "(line 2013,col 9)-(line 2013,col 54)",
        "(line 2015,col 9)-(line 2015,col 47)",
        "(line 2016,col 9)-(line 2016,col 55)",
        "(line 2017,col 9)-(line 2019,col 42)",
        "(line 2020,col 9)-(line 2022,col 46)",
        "(line 2023,col 9)-(line 2025,col 45)",
        "(line 2026,col 9)-(line 2028,col 44)",
        "(line 2030,col 9)-(line 2033,col 9)",
        "(line 2034,col 9)-(line 2034,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.tearDown()",
      "begin_line": 2040,
      "end_line": 2047,
      "comment": "\n     * Erases any leftover instance variables by setting them to null.\n     ",
      "child_ranges": [
        "(line 2042,col 9)-(line 2042,col 19)",
        "(line 2043,col 9)-(line 2043,col 22)",
        "(line 2044,col 9)-(line 2044,col 24)",
        "(line 2045,col 9)-(line 2045,col 22)",
        "(line 2046,col 9)-(line 2046,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.getMap()",
      "begin_line": 2053,
      "end_line": 2055,
      "comment": "\n     * Get the map.\n     * @return Map\u003cK,V\u003e\n     ",
      "child_ranges": [
        "(line 2054,col 9)-(line 2054,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapTest.getConfirmed()",
      "begin_line": 2061,
      "end_line": 2063,
      "comment": "\n     * Get the confirmed.\n     * @return Map\u003cK,V\u003e\n     ",
      "child_ranges": [
        "(line 2062,col 9)-(line 2062,col 25)"
      ]
    }
  ]
}