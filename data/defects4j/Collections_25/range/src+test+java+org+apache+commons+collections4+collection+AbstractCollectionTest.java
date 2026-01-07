{
  "filepath": "/tmp/Collections-25b/src/test/java/org/apache/commons/collections4/collection/AbstractCollectionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractCollectionTest",
      "is_interface": false,
      "parent_types": [
        "AbstractObjectTest"
      ],
      "begin_line": 122,
      "end_line": 1389,
      "comment": "\n * Abstract test class for {@link java.util.Collection} methods and contracts.\n * \u003cp\u003e\n * You should create a concrete subclass of this class to test any custom\n * {@link Collection} implementation.  At minimum, you\u0027ll have to\n * implement the @{@link #makeObject()}, {@link #makeConfirmedCollection()}\n * and {@link #makeConfirmedFullCollection()} methods.\n * You might want to override some of the additional public methods as well:\n * \u003cp\u003e\n * \u003cb\u003eElement Population Methods\u003c/b\u003e\n * \u003cp\u003e\n * Override these if your collection restricts what kind of elements are\n * allowed (for instance, if \u003ccode\u003enull\u003c/code\u003e is not permitted):\n * \u003cul\u003e\n * \u003cli\u003e{@link #getFullElements()}\n * \u003cli\u003e{@link #getOtherElements()}\n * \u003c/ul\u003e\n * \u003cp\u003e\n * \u003cb\u003eSupported Operation Methods\u003c/b\u003e\n * \u003cp\u003e\n * Override these if your collection doesn\u0027t support certain operations:\n * \u003cul\u003e\n * \u003cli\u003e{@link #isAddSupported()}\n * \u003cli\u003e{@link #isRemoveSupported()}\n * \u003cli\u003e{@link #areEqualElementsDistinguishable()}\n * \u003cli\u003e{@link #isNullSupported()}\n * \u003cli\u003e{@link #isFailFastSupported()}\n * \u003c/ul\u003e\n * \u003cp\u003e\n * \u003cb\u003eFixture Methods\u003c/b\u003e\n * \u003cp\u003e\n * Fixtures are used to verify that the the operation results in correct state\n * for the collection.  Basically, the operation is performed against your\n * collection implementation, and an identical operation is performed against a\n * \u003ci\u003econfirmed\u003c/i\u003e collection implementation.  A confirmed collection\n * implementation is something like \u003ccode\u003ejava.util.ArrayList\u003c/code\u003e, which is\n * known to conform exactly to its collection interface\u0027s contract.  After the\n * operation takes place on both your collection implementation and the\n * confirmed collection implementation, the two collections are compared to see\n * if their state is identical.  The comparison is usually much more involved\n * than a simple \u003ccode\u003eequals\u003c/code\u003e test.  This verification is used to ensure\n * proper modifications are made along with ensuring that the collection does\n * not change when read-only modifications are made.\n * \u003cp\u003e\n * The {@link #collection} field holds an instance of your collection\n * implementation; the {@link #confirmed} field holds an instance of the\n * confirmed collection implementation.  The {@link #resetEmpty()} and\n * {@link #resetFull()} methods set these fields to empty or full collections,\n * so that tests can proceed from a known state.\n * \u003cp\u003e\n * After a modification operation to both {@link #collection} and\n * {@link #confirmed}, the {@link #verify()} method is invoked to compare\n * the results.  You may want to override {@link #verify()} to perform\n * additional verifications.  For instance, when testing the collection\n * views of a map, {@link org.apache.commons.collections4.map.AbstractMapTest AbstractTestMap} \n * would override {@link #verify()} to make\n * sure the map is changed after the collection view is changed.\n * \u003cp\u003e\n * If you\u0027re extending this class directly, you will have to provide\n * implementations for the following:\n * \u003cul\u003e\n * \u003cli\u003e{@link #makeConfirmedCollection()}\n * \u003cli\u003e{@link #makeConfirmedFullCollection()}\n * \u003c/ul\u003e\n * \u003cp\u003e\n * Those methods should provide a confirmed collection implementation\n * that\u0027s compatible with your collection implementation.\n * \u003cp\u003e\n * If you\u0027re extending {@link org.apache.commons.collections4.list.AbstractListTest AbstractListTest},\n * {@link org.apache.commons.collections4.set.AbstractSetTest AbstractTestSet},\n * or {@link org.apache.commons.collections4.bag.AbstractBagTest AbstractBagTest}, \n * you probably don\u0027t have to worry about the\n * above methods, because those three classes already override the methods\n * to provide standard JDK confirmed collections.\u003cP\u003e\n * \u003cp\u003e\n * \u003cb\u003eOther notes\u003c/b\u003e\n * \u003cp\u003e\n * If your {@link Collection} fails one of these tests by design,\n * you may still use this base set of cases.  Simply override the\n * test case (method) your {@link Collection} fails.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "collection"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": "\n     *  A collection instance that will be used for testing.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "confirmed"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": "\n     *  Confirmed collection.  This is an instance of a collection that is\n     *  confirmed to conform exactly to the java.util.Collection contract.\n     *  Modification operations are tested by performing a mod on your\n     *  collection, performing the exact same mod on an equivalent confirmed\n     *  collection, and then calling verify() to make sure your collection\n     *  still matches the confirmed collection.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.AbstractCollectionTest(java.lang.String)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * JUnit constructor.\n     *\n     * @param testName  the test class name\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.areEqualElementsDistinguishable()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     *  Specifies whether equal elements in the collection are, in fact,\n     *  distinguishable with information not readily available.  That is, if a\n     *  particular value is to be removed from the collection, then there is\n     *  one and only one value that can be removed, even if there are other\n     *  elements which are equal to it.\n     *\n     *  \u003cP\u003eIn most collection cases, elements are not distinguishable (equal is\n     *  equal), thus this method defaults to return false.  In some cases,\n     *  however, they are.  For example, the collection returned from the map\u0027s\n     *  values() collection view are backed by the map, so while there may be\n     *  two values that are equal, their associated keys are not.  Since the\n     *  keys are distinguishable, the values are.\n     *\n     *  \u003cP\u003eThis flag is used to skip some verifications for iterator.remove()\n     *  where it is impossible to perform an equivalent modification on the\n     *  confirmed collection because it is not possible to determine which\n     *  value in the confirmed collection to actually remove.  Tests that\n     *  override the default (i.e. where equal elements are distinguishable),\n     *  should provide additional tests on iterator.remove() to make sure the\n     *  proper elements are removed when remove() is called on the iterator.\n     *",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.isAddSupported()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     *  Returns true if the collections produced by\n     *  {@link #makeObject()} and {@link #makeFullCollection()}\n     *  support the \u003ccode\u003eadd\u003c/code\u003e and \u003ccode\u003eaddAll\u003c/code\u003e\n     *  operations.\u003cP\u003e\n     *  Default implementation returns true.  Override if your collection\n     *  class does not support add or addAll.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.isRemoveSupported()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     *  Returns true if the collections produced by\n     *  {@link #makeObject()} and {@link #makeFullCollection()}\n     *  support the \u003ccode\u003eremove\u003c/code\u003e, \u003ccode\u003eremoveAll\u003c/code\u003e,\n     *  \u003ccode\u003eretainAll\u003c/code\u003e, \u003ccode\u003eclear\u003c/code\u003e and\n     *  \u003ccode\u003eiterator().remove()\u003c/code\u003e methods.\n     *  Default implementation returns true.  Override if your collection\n     *  class does not support removal operations.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.isNullSupported()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * Returns true to indicate that the collection supports holding null.\n     * The default implementation returns true;\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.isFailFastSupported()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\n     * Returns true to indicate that the collection supports fail fast iterators.\n     * The default implementation returns true;\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.isEqualsCheckable()",
      "begin_line": 233,
      "end_line": 236,
      "comment": "\n     * Returns true to indicate that the collection supports equals() comparisons.\n     * This implementation returns false;\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.verify()",
      "begin_line": 243,
      "end_line": 308,
      "comment": "\n     *  Verifies that {@link #collection} and {@link #confirmed} have\n     *  identical state.\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 56)",
        "(line 245,col 9)-(line 246,col 40)",
        "(line 247,col 9)-(line 248,col 69)",
        "(line 260,col 9)-(line 260,col 67)",
        "(line 262,col 9)-(line 262,col 25)",
        "(line 264,col 9)-(line 264,col 41)",
        "(line 265,col 9)-(line 265,col 20)",
        "(line 266,col 9)-(line 268,col 9)",
        "(line 272,col 9)-(line 272,col 61)",
        "(line 276,col 9)-(line 276,col 42)",
        "(line 277,col 9)-(line 298,col 9)",
        "(line 301,col 9)-(line 307,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.resetEmpty()",
      "begin_line": 316,
      "end_line": 319,
      "comment": "\n     *  Resets the {@link #collection} and {@link #confirmed} fields to empty\n     *  collections.  Invoke this method before performing a modification\n     *  test.\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 41)",
        "(line 318,col 9)-(line 318,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.resetFull()",
      "begin_line": 326,
      "end_line": 329,
      "comment": "\n     *  Resets the {@link #collection} and {@link #confirmed} fields to full\n     *  collections.  Invoke this method before performing a modification\n     *  test.\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 49)",
        "(line 328,col 9)-(line 328,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.makeConfirmedCollection()",
      "begin_line": 339,
      "end_line": 339,
      "comment": "\n     *  Returns a confirmed empty collection.\n     *  For instance, an {@link java.util.ArrayList} for lists or a\n     *  {@link java.util.HashSet} for sets.\n     *\n     *  @return a confirmed empty collection\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.makeConfirmedFullCollection()",
      "begin_line": 349,
      "end_line": 349,
      "comment": "\n     *  Returns a confirmed full collection.\n     *  For instance, an {@link java.util.ArrayList} for lists or a\n     *  {@link java.util.HashSet} for sets.  The returned collection\n     *  should contain the elements returned by {@link #getFullElements()}.\n     *\n     *  @return a confirmed full collection\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.makeObject()",
      "begin_line": 354,
      "end_line": 355,
      "comment": "\n     * Return a new, empty {@link Collection} to be used for testing.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.makeFullCollection()",
      "begin_line": 365,
      "end_line": 369,
      "comment": "\n     *  Returns a full collection to be used for testing.  The collection\n     *  returned by this method should contain every element returned by\n     *  {@link #getFullElements()}.  The default implementation, in fact,\n     *  simply invokes \u003ccode\u003eaddAll\u003c/code\u003e on an empty collection with\n     *  the results of {@link #getFullElements()}.  Override this default\n     *  if your collection doesn\u0027t support addAll.\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 45)",
        "(line 367,col 9)-(line 367,col 51)",
        "(line 368,col 9)-(line 368,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.cloneMapEntry(java.util.Map.Entry\u003cE, E\u003e)",
      "begin_line": 374,
      "end_line": 378,
      "comment": "\n     * Creates a new Map Entry that is independent of the first and the map.\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 54)",
        "(line 376,col 9)-(line 376,col 50)",
        "(line 377,col 9)-(line 377,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.getFullElements()",
      "begin_line": 391,
      "end_line": 400,
      "comment": "\n     *  Returns an array of objects that are contained in a collection\n     *  produced by {@link #makeFullCollection()}.  Every element in the\n     *  returned array \u003cI\u003emust\u003c/I\u003e be an element in a full collection.\u003cP\u003e\n     *  The default implementation returns a heterogenous array of\n     *  objects with some duplicates. null is added if allowed.\n     *  Override if you require specific testing elements.  Note that if you\n     *  override {@link #makeFullCollection()}, you \u003cI\u003emust\u003c/I\u003e override\n     *  this method to reflect the contents of a full collection.\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 399,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.getOtherElements()",
      "begin_line": 411,
      "end_line": 413,
      "comment": "\n     *  Returns an array of elements that are \u003cI\u003enot\u003c/I\u003e contained in a\n     *  full collection.  Every element in the returned array must\n     *  not exist in a collection returned by {@link #makeFullCollection()}.\n     *  The default implementation returns a heterogenous array of elements\n     *  without null.  Note that some of the tests add these elements\n     *  to an empty or full collection, so if your collection restricts\n     *  certain kinds of elements, you should override this method.\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.getFullNonNullElements()",
      "begin_line": 424,
      "end_line": 446,
      "comment": "\n     *  Returns a list of elements suitable for return by\n     *  {@link #getFullElements()}.  The array returned by this method\n     *  does not include null, but does include a variety of objects\n     *  of different types.  Override getFullElements to return\n     *  the results of this method if your collection does not support\n     *  the null element.\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 445,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.getOtherNonNullElements()",
      "begin_line": 453,
      "end_line": 466,
      "comment": "\n     *  Returns the default list of objects returned by\n     *  {@link #getOtherElements()}.  Includes many objects\n     *  of different types.\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 465,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.getFullNonNullStringElements()",
      "begin_line": 474,
      "end_line": 479,
      "comment": "\n     *  Returns a list of string elements suitable for return by\n     *  {@link #getFullElements()}.  Override getFullElements to return\n     *  the results of this method if your collection does not support\n     *  heterogenous elements or the null element.\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 478,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.getOtherNonNullStringElements()",
      "begin_line": 487,
      "end_line": 492,
      "comment": "\n     *  Returns a list of string elements suitable for return by\n     *  {@link #getOtherElements()}.  Override getOtherElements to return\n     *  the results of this method if your collection does not support\n     *  heterogenous elements or the null element.\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 491,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.testCollectionAdd()",
      "begin_line": 499,
      "end_line": 526,
      "comment": "\n     *  Tests {@link Collection#add(Object)}.\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 502,col 9)",
        "(line 504,col 9)-(line 504,col 47)",
        "(line 505,col 9)-(line 512,col 9)",
        "(line 514,col 9)-(line 514,col 21)",
        "(line 515,col 9)-(line 515,col 21)",
        "(line 516,col 9)-(line 525,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.testCollectionAddAll()",
      "begin_line": 531,
      "end_line": 569,
      "comment": "\n     *  Tests {@link Collection#addAll(Collection)}.\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 534,col 9)",
        "(line 536,col 9)-(line 536,col 21)",
        "(line 537,col 9)-(line 537,col 41)",
        "(line 538,col 9)-(line 538,col 68)",
        "(line 539,col 9)-(line 539,col 55)",
        "(line 540,col 9)-(line 540,col 17)",
        "(line 541,col 9)-(line 541,col 69)",
        "(line 542,col 9)-(line 544,col 9)",
        "(line 546,col 9)-(line 546,col 20)",
        "(line 547,col 9)-(line 547,col 42)",
        "(line 548,col 9)-(line 548,col 38)",
        "(line 549,col 9)-(line 549,col 60)",
        "(line 550,col 9)-(line 550,col 55)",
        "(line 551,col 9)-(line 551,col 17)",
        "(line 552,col 9)-(line 552,col 68)",
        "(line 553,col 9)-(line 556,col 9)",
        "(line 557,col 9)-(line 557,col 106)",
        "(line 559,col 9)-(line 559,col 20)",
        "(line 560,col 9)-(line 560,col 38)",
        "(line 561,col 9)-(line 561,col 69)",
        "(line 562,col 9)-(line 562,col 64)",
        "(line 563,col 9)-(line 563,col 17)",
        "(line 564,col 9)-(line 568,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.testUnsupportedAdd()",
      "begin_line": 575,
      "end_line": 621,
      "comment": "\n     *  If {@link #isAddSupported()} returns false, tests that add operations\n     *  raise \u003ccode\u003eUnsupportedOperationException.\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 578,col 9)",
        "(line 580,col 9)-(line 580,col 21)",
        "(line 581,col 9)-(line 586,col 9)",
        "(line 589,col 9)-(line 589,col 17)",
        "(line 591,col 9)-(line 596,col 9)",
        "(line 599,col 9)-(line 599,col 17)",
        "(line 601,col 9)-(line 601,col 20)",
        "(line 602,col 9)-(line 607,col 9)",
        "(line 610,col 9)-(line 610,col 17)",
        "(line 612,col 9)-(line 617,col 9)",
        "(line 620,col 9)-(line 620,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.testCollectionClear()",
      "begin_line": 626,
      "end_line": 639,
      "comment": "\n     *  Test {@link Collection#clear()}.\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 629,col 9)",
        "(line 631,col 9)-(line 631,col 21)",
        "(line 632,col 9)-(line 632,col 32)",
        "(line 633,col 9)-(line 633,col 17)",
        "(line 635,col 9)-(line 635,col 20)",
        "(line 636,col 9)-(line 636,col 32)",
        "(line 637,col 9)-(line 637,col 31)",
        "(line 638,col 9)-(line 638,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.testCollectionContains()",
      "begin_line": 644,
      "end_line": 679,
      "comment": "\n     *  Tests {@link Collection#contains(Object)}.\n     ",
      "child_ranges": [
        "(line 645,col 9)-(line 645,col 26)",
        "(line 647,col 9)-(line 647,col 21)",
        "(line 648,col 9)-(line 648,col 37)",
        "(line 649,col 9)-(line 652,col 9)",
        "(line 654,col 9)-(line 654,col 17)",
        "(line 656,col 9)-(line 656,col 38)",
        "(line 657,col 9)-(line 660,col 9)",
        "(line 662,col 9)-(line 662,col 17)",
        "(line 664,col 9)-(line 664,col 20)",
        "(line 665,col 9)-(line 665,col 37)",
        "(line 666,col 9)-(line 669,col 9)",
        "(line 671,col 9)-(line 671,col 17)",
        "(line 673,col 9)-(line 673,col 20)",
        "(line 674,col 9)-(line 674,col 38)",
        "(line 675,col 9)-(line 678,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.testCollectionContainsAll()",
      "begin_line": 684,
      "end_line": 724,
      "comment": "\n     *  Tests {@link Collection#containsAll(Collection)}.\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 21)",
        "(line 686,col 9)-(line 686,col 45)",
        "(line 687,col 9)-(line 688,col 71)",
        "(line 689,col 9)-(line 689,col 54)",
        "(line 690,col 9)-(line 691,col 78)",
        "(line 693,col 9)-(line 693,col 17)",
        "(line 695,col 9)-(line 695,col 20)",
        "(line 696,col 9)-(line 697,col 51)",
        "(line 699,col 9)-(line 699,col 20)",
        "(line 700,col 9)-(line 700,col 53)",
        "(line 701,col 9)-(line 702,col 50)",
        "(line 704,col 9)-(line 704,col 17)",
        "(line 706,col 9)-(line 706,col 61)",
        "(line 707,col 9)-(line 708,col 81)",
        "(line 709,col 9)-(line 709,col 65)",
        "(line 710,col 9)-(line 711,col 50)",
        "(line 712,col 9)-(line 712,col 109)",
        "(line 714,col 9)-(line 714,col 17)",
        "(line 716,col 9)-(line 716,col 33)",
        "(line 717,col 9)-(line 717,col 53)",
        "(line 718,col 9)-(line 718,col 53)",
        "(line 719,col 9)-(line 720,col 50)",
        "(line 723,col 9)-(line 723,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.testCollectionIsEmpty()",
      "begin_line": 729,
      "end_line": 739,
      "comment": "\n     *  Tests {@link Collection#isEmpty()}.\n     ",
      "child_ranges": [
        "(line 730,col 9)-(line 730,col 21)",
        "(line 731,col 9)-(line 731,col 89)",
        "(line 733,col 9)-(line 733,col 17)",
        "(line 735,col 9)-(line 735,col 20)",
        "(line 736,col 9)-(line 736,col 93)",
        "(line 738,col 9)-(line 738,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.testCollectionIterator()",
      "begin_line": 744,
      "end_line": 782,
      "comment": "\n     *  Tests the read-only functionality of {@link Collection#iterator()}.\n     ",
      "child_ranges": [
        "(line 745,col 9)-(line 745,col 21)",
        "(line 746,col 9)-(line 746,col 53)",
        "(line 747,col 9)-(line 747,col 97)",
        "(line 748,col 9)-(line 754,col 9)",
        "(line 756,col 9)-(line 756,col 17)",
        "(line 758,col 9)-(line 758,col 20)",
        "(line 759,col 9)-(line 759,col 41)",
        "(line 760,col 9)-(line 763,col 9)",
        "(line 764,col 9)-(line 764,col 66)",
        "(line 766,col 9)-(line 766,col 53)",
        "(line 767,col 9)-(line 767,col 41)",
        "(line 768,col 9)-(line 773,col 9)",
        "(line 774,col 9)-(line 779,col 9)",
        "(line 781,col 9)-(line 781,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.testCollectionIteratorRemove()",
      "begin_line": 787,
      "end_line": 853,
      "comment": "\n     *  Tests removals from {@link Collection#iterator()}.\n     ",
      "child_ranges": [
        "(line 789,col 9)-(line 791,col 9)",
        "(line 793,col 9)-(line 793,col 21)",
        "(line 794,col 9)-(line 799,col 9)",
        "(line 800,col 9)-(line 800,col 17)",
        "(line 802,col 9)-(line 809,col 9)",
        "(line 810,col 9)-(line 810,col 17)",
        "(line 812,col 9)-(line 812,col 20)",
        "(line 813,col 9)-(line 813,col 42)",
        "(line 814,col 9)-(line 814,col 54)",
        "(line 815,col 9)-(line 840,col 9)",
        "(line 841,col 9)-(line 841,col 97)",
        "(line 843,col 9)-(line 843,col 20)",
        "(line 844,col 9)-(line 844,col 42)",
        "(line 845,col 9)-(line 845,col 20)",
        "(line 846,col 9)-(line 846,col 22)",
        "(line 847,col 9)-(line 852,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.testCollectionRemove()",
      "begin_line": 858,
      "end_line": 899,
      "comment": "\n     *  Tests {@link Collection#remove(Object)}.\n     ",
      "child_ranges": [
        "(line 859,col 9)-(line 861,col 9)",
        "(line 863,col 9)-(line 863,col 21)",
        "(line 864,col 9)-(line 864,col 47)",
        "(line 865,col 9)-(line 868,col 9)",
        "(line 870,col 9)-(line 870,col 45)",
        "(line 872,col 9)-(line 872,col 20)",
        "(line 873,col 9)-(line 876,col 9)",
        "(line 878,col 9)-(line 878,col 48)",
        "(line 879,col 9)-(line 898,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.testCollectionRemoveAll()",
      "begin_line": 904,
      "end_line": 946,
      "comment": "\n     *  Tests {@link Collection#removeAll(Collection)}.\n     ",
      "child_ranges": [
        "(line 905,col 9)-(line 907,col 9)",
        "(line 909,col 9)-(line 909,col 21)",
        "(line 910,col 9)-(line 911,col 67)",
        "(line 912,col 9)-(line 912,col 17)",
        "(line 914,col 9)-(line 915,col 82)",
        "(line 916,col 9)-(line 916,col 17)",
        "(line 918,col 9)-(line 918,col 20)",
        "(line 919,col 9)-(line 920,col 70)",
        "(line 921,col 9)-(line 921,col 17)",
        "(line 923,col 9)-(line 924,col 82)",
        "(line 925,col 9)-(line 925,col 17)",
        "(line 927,col 9)-(line 928,col 76)",
        "(line 929,col 9)-(line 929,col 65)",
        "(line 930,col 9)-(line 930,col 17)",
        "(line 932,col 9)-(line 932,col 20)",
        "(line 933,col 9)-(line 933,col 48)",
        "(line 934,col 9)-(line 934,col 61)",
        "(line 935,col 9)-(line 936,col 81)",
        "(line 937,col 9)-(line 937,col 85)",
        "(line 938,col 9)-(line 938,col 92)",
        "(line 939,col 9)-(line 939,col 38)",
        "(line 940,col 9)-(line 940,col 17)",
        "(line 942,col 9)-(line 942,col 94)",
        "(line 943,col 9)-(line 945,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.testCollectionRetainAll()",
      "begin_line": 951,
      "end_line": 1008,
      "comment": "\n     *  Tests {@link Collection#retainAll(Collection)}.\n     ",
      "child_ranges": [
        "(line 952,col 9)-(line 954,col 9)",
        "(line 956,col 9)-(line 956,col 21)",
        "(line 957,col 9)-(line 957,col 66)",
        "(line 958,col 9)-(line 958,col 64)",
        "(line 960,col 9)-(line 961,col 67)",
        "(line 962,col 9)-(line 962,col 17)",
        "(line 964,col 9)-(line 964,col 98)",
        "(line 965,col 9)-(line 965,col 17)",
        "(line 967,col 9)-(line 967,col 20)",
        "(line 968,col 9)-(line 969,col 66)",
        "(line 970,col 9)-(line 970,col 56)",
        "(line 971,col 9)-(line 971,col 17)",
        "(line 973,col 9)-(line 973,col 20)",
        "(line 974,col 9)-(line 974,col 96)",
        "(line 975,col 9)-(line 975,col 40)",
        "(line 976,col 9)-(line 976,col 17)",
        "(line 978,col 9)-(line 978,col 20)",
        "(line 979,col 9)-(line 979,col 42)",
        "(line 980,col 9)-(line 981,col 57)",
        "(line 982,col 9)-(line 982,col 17)",
        "(line 983,col 9)-(line 983,col 87)",
        "(line 985,col 9)-(line 998,col 9)",
        "(line 1000,col 9)-(line 1000,col 20)",
        "(line 1001,col 9)-(line 1001,col 56)",
        "(line 1002,col 9)-(line 1002,col 38)",
        "(line 1003,col 9)-(line 1004,col 74)",
        "(line 1005,col 9)-(line 1005,col 17)",
        "(line 1006,col 9)-(line 1007,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.testCollectionSize()",
      "begin_line": 1013,
      "end_line": 1019,
      "comment": "\n     *  Tests {@link Collection#size()}.\n     ",
      "child_ranges": [
        "(line 1014,col 9)-(line 1014,col 21)",
        "(line 1015,col 9)-(line 1015,col 80)",
        "(line 1017,col 9)-(line 1017,col 20)",
        "(line 1018,col 9)-(line 1018,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.testCollectionToArray()",
      "begin_line": 1024,
      "end_line": 1065,
      "comment": "\n     *  Tests {@link Collection#toArray()}.\n     ",
      "child_ranges": [
        "(line 1025,col 9)-(line 1025,col 21)",
        "(line 1026,col 9)-(line 1027,col 58)",
        "(line 1029,col 9)-(line 1029,col 20)",
        "(line 1030,col 9)-(line 1030,col 57)",
        "(line 1031,col 9)-(line 1032,col 54)",
        "(line 1033,col 9)-(line 1033,col 65)",
        "(line 1034,col 9)-(line 1035,col 101)",
        "(line 1036,col 9)-(line 1036,col 60)",
        "(line 1038,col 9)-(line 1060,col 9)",
        "(line 1061,col 9)-(line 1064,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.testCollectionToArray2()",
      "begin_line": 1070,
      "end_line": 1122,
      "comment": "\n     *  Tests {@link Collection#toArray(Object[])}.\n     ",
      "child_ranges": [
        "(line 1071,col 9)-(line 1071,col 21)",
        "(line 1072,col 9)-(line 1072,col 63)",
        "(line 1073,col 9)-(line 1073,col 52)",
        "(line 1074,col 9)-(line 1074,col 63)",
        "(line 1075,col 9)-(line 1075,col 63)",
        "(line 1076,col 9)-(line 1076,col 17)",
        "(line 1078,col 9)-(line 1078,col 20)",
        "(line 1079,col 9)-(line 1084,col 9)",
        "(line 1085,col 9)-(line 1085,col 17)",
        "(line 1087,col 9)-(line 1092,col 9)",
        "(line 1093,col 9)-(line 1093,col 17)",
        "(line 1095,col 9)-(line 1095,col 55)",
        "(line 1096,col 9)-(line 1096,col 38)",
        "(line 1097,col 9)-(line 1098,col 61)",
        "(line 1102,col 9)-(line 1102,col 66)",
        "(line 1103,col 9)-(line 1105,col 9)",
        "(line 1106,col 9)-(line 1108,col 9)",
        "(line 1110,col 9)-(line 1110,col 48)",
        "(line 1111,col 9)-(line 1113,col 9)",
        "(line 1114,col 9)-(line 1114,col 48)",
        "(line 1115,col 9)-(line 1115,col 43)",
        "(line 1116,col 9)-(line 1117,col 48)",
        "(line 1118,col 9)-(line 1120,col 58)",
        "(line 1121,col 9)-(line 1121,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.testCollectionToString()",
      "begin_line": 1127,
      "end_line": 1133,
      "comment": "\n     *  Tests \u003ccode\u003etoString\u003c/code\u003e on a collection.\n     ",
      "child_ranges": [
        "(line 1128,col 9)-(line 1128,col 21)",
        "(line 1129,col 9)-(line 1129,col 89)",
        "(line 1131,col 9)-(line 1131,col 20)",
        "(line 1132,col 9)-(line 1132,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.testUnsupportedRemove()",
      "begin_line": 1139,
      "end_line": 1188,
      "comment": "\n     *  If isRemoveSupported() returns false, tests to see that remove\n     *  operations raise an UnsupportedOperationException.\n     ",
      "child_ranges": [
        "(line 1140,col 9)-(line 1142,col 9)",
        "(line 1144,col 9)-(line 1144,col 21)",
        "(line 1145,col 9)-(line 1150,col 9)",
        "(line 1151,col 9)-(line 1151,col 17)",
        "(line 1153,col 9)-(line 1158,col 9)",
        "(line 1159,col 9)-(line 1159,col 17)",
        "(line 1161,col 9)-(line 1166,col 9)",
        "(line 1167,col 9)-(line 1167,col 17)",
        "(line 1169,col 9)-(line 1174,col 9)",
        "(line 1175,col 9)-(line 1175,col 17)",
        "(line 1177,col 9)-(line 1177,col 20)",
        "(line 1178,col 9)-(line 1185,col 9)",
        "(line 1186,col 9)-(line 1186,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.testCollectionIteratorFailFast()",
      "begin_line": 1193,
      "end_line": 1272,
      "comment": "\n     *  Tests that the collection\u0027s iterator is fail-fast.\n     ",
      "child_ranges": [
        "(line 1194,col 9)-(line 1196,col 9)",
        "(line 1198,col 9)-(line 1223,col 9)",
        "(line 1225,col 9)-(line 1227,col 9)",
        "(line 1229,col 9)-(line 1229,col 20)",
        "(line 1230,col 9)-(line 1239,col 9)",
        "(line 1241,col 9)-(line 1241,col 20)",
        "(line 1242,col 9)-(line 1249,col 9)",
        "(line 1251,col 9)-(line 1251,col 20)",
        "(line 1252,col 9)-(line 1260,col 9)",
        "(line 1262,col 9)-(line 1262,col 20)",
        "(line 1263,col 9)-(line 1271,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.testSerializeDeserializeThenCompare()",
      "begin_line": 1274,
      "end_line": 1304,
      "comment": "",
      "child_ranges": [
        "(line 1276,col 9)-(line 1276,col 34)",
        "(line 1277,col 9)-(line 1289,col 9)",
        "(line 1290,col 9)-(line 1290,col 35)",
        "(line 1291,col 9)-(line 1303,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.getCollection()",
      "begin_line": 1306,
      "end_line": 1308,
      "comment": "",
      "child_ranges": [
        "(line 1307,col 9)-(line 1307,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.setCollection(java.util.Collection\u003cE\u003e)",
      "begin_line": 1314,
      "end_line": 1316,
      "comment": "\n     * Set the collection.\n     * @param collection the Collection\u003cE\u003e to set\n     ",
      "child_ranges": [
        "(line 1315,col 9)-(line 1315,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.getConfirmed()",
      "begin_line": 1318,
      "end_line": 1320,
      "comment": "",
      "child_ranges": [
        "(line 1319,col 9)-(line 1319,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.setConfirmed(java.util.Collection\u003cE\u003e)",
      "begin_line": 1326,
      "end_line": 1328,
      "comment": "\n     * Set the confirmed.\n     * @param confirmed the Collection\u003cE\u003e to set\n     ",
      "child_ranges": [
        "(line 1327,col 9)-(line 1327,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.assertNotCollectionContains(java.util.Collection\u003c?\u003e, java.lang.Object)",
      "begin_line": 1335,
      "end_line": 1343,
      "comment": "\n     * Handle the optional exceptions declared by {@link Collection#contains(Object)}\n     * @param coll\n     * @param element\n     ",
      "child_ranges": [
        "(line 1336,col 9)-(line 1342,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.assertNotCollectionContainsAll(java.util.Collection\u003c?\u003e, java.util.Collection\u003c?\u003e)",
      "begin_line": 1350,
      "end_line": 1358,
      "comment": "\n     * Handle the optional exceptions declared by {@link Collection#containsAll(Collection)}\n     * @param coll\n     * @param sub\n     ",
      "child_ranges": [
        "(line 1351,col 9)-(line 1357,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.assertNotRemoveFromCollection(java.util.Collection\u003c?\u003e, java.lang.Object)",
      "begin_line": 1365,
      "end_line": 1373,
      "comment": "\n     * Handle optional exceptions of {@link Collection#remove(Object)}\n     * @param coll\n     * @param element\n     ",
      "child_ranges": [
        "(line 1366,col 9)-(line 1372,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionTest.assertNotRemoveAllFromCollection(java.util.Collection\u003c?\u003e, java.util.Collection\u003c?\u003e)",
      "begin_line": 1380,
      "end_line": 1388,
      "comment": "\n     * Handle optional exceptions of {@link Collection#removeAll(Collection)}\n     * @param coll\n     * @param sub\n     ",
      "child_ranges": [
        "(line 1381,col 9)-(line 1387,col 9)"
      ]
    }
  ]
}