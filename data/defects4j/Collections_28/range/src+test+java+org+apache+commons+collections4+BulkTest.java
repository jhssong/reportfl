{
  "filepath": "/tmp/Collections-28b/src/test/java/org/apache/commons/collections4/BulkTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BulkTest",
      "is_interface": false,
      "parent_types": [
        "TestCase",
        "java.lang.Cloneable"
      ],
      "begin_line": 138,
      "end_line": 274,
      "comment": "\n * A {@link TestCase} that can define both simple and bulk test methods.\n * \u003cp\u003e\n * A \u003cI\u003esimple test method\u003c/I\u003e is the type of test traditionally\n * supplied by by {@link TestCase}.  To define a simple test, create a public\n * no-argument method whose name starts with \"test\".  You can specify the\n * the name of simple test in the constructor of \u003ccode\u003eBulkTest\u003c/code\u003e;\n * a subsequent call to {@link TestCase#run} will run that simple test.\n * \u003cp\u003e\n * A \u003cI\u003ebulk test method\u003c/I\u003e, on the other hand, returns a new instance\n * of \u003ccode\u003eBulkTest\u003c/code\u003e, which can itself define new simple and bulk\n * test methods.  By using the {@link #makeSuite} method, you can\n * automatically create a hierarchical suite of tests and child bulk tests.\n * \u003cp\u003e\n * For instance, consider the following two classes:\n *\n * \u003cPre\u003e\n *  public class SetTest extends BulkTest {\n *\n *      private Set set;\n *\n *      public SetTest(Set set) {\n *          this.set \u003d set;\n *      }\n *\n *      public void testContains() {\n *          boolean r \u003d set.contains(set.iterator().next()));\n *          assertTrue(\"Set should contain first element, r);\n *      }\n *\n *      public void testClear() {\n *          set.clear();\n *          assertTrue(\"Set should be empty after clear\", set.isEmpty());\n *      }\n *  }\n *\n *\n *  public class HashMapTest extends BulkTest {\n *\n *      private Map makeFullMap() {\n *          HashMap result \u003d new HashMap();\n *          result.put(\"1\", \"One\");\n *          result.put(\"2\", \"Two\");\n *          return result;\n *      }\n *\n *      public void testClear() {\n *          Map map \u003d makeFullMap();\n *          map.clear();\n *          assertTrue(\"Map empty after clear\", map.isEmpty());\n *      }\n *\n *      public BulkTest bulkTestKeySet() {\n *          return new TestSet(makeFullMap().keySet());\n *      }\n *\n *      public BulkTest bulkTestEntrySet() {\n *          return new TestSet(makeFullMap().entrySet());\n *      }\n *  }\n *  \u003c/Pre\u003e\n *\n *  In the above examples, \u003ccode\u003eSetTest\u003c/code\u003e defines two\n *  simple test methods and no bulk test methods; \u003ccode\u003eHashMapTest\u003c/code\u003e\n *  defines one simple test method and two bulk test methods.  When\n *  \u003ccode\u003emakeSuite(HashMapTest.class).run\u003c/code\u003e is executed,\n *  \u003cI\u003efive\u003c/I\u003e simple test methods will be run, in this order:\u003cP\u003e\n *\n *  \u003cOl\u003e\n *  \u003cLi\u003eHashMapTest.testClear()\n *  \u003cLi\u003eHashMapTest.bulkTestKeySet().testContains();\n *  \u003cLi\u003eHashMapTest.bulkTestKeySet().testClear();\n *  \u003cLi\u003eHashMapTest.bulkTestEntrySet().testContains();\n *  \u003cLi\u003eHashMapTest.bulkTestEntrySet().testClear();\n *  \u003c/Ol\u003e\n *\n *  In the graphical junit test runners, the tests would be displayed in\n *  the following tree:\u003cP\u003e\n *\n *  \u003cUL\u003e\n *  \u003cLI\u003eHashMapTest\u003c/LI\u003e\n *      \u003cUL\u003e\n *      \u003cLI\u003etestClear\n *      \u003cLI\u003ebulkTestKeySet\n *          \u003cUL\u003e\n *          \u003cLI\u003etestContains\n *          \u003cLI\u003etestClear\n *          \u003c/UL\u003e\n *      \u003cLI\u003ebulkTestEntrySet\n *          \u003cUL\u003e\n *          \u003cLI\u003etestContains\n *          \u003cLI\u003etestClear\n *          \u003c/UL\u003e\n *      \u003c/UL\u003e\n *  \u003c/UL\u003e\n *\n *  A subclass can override a superclass\u0027s bulk test by\n *  returning \u003ccode\u003enull\u003c/code\u003e from the bulk test method.  If you only\n *  want to override specific simple tests within a bulk test, use the\n *  {@link #ignoredTests} method.\u003cP\u003e\n *\n *  Note that if you want to use the bulk test methods, you \u003cI\u003emust\u003c/I\u003e\n *  define your \u003ccode\u003esuite()\u003c/code\u003e method to use {@link #makeSuite}.\n *  The ordinary {@link TestSuite} constructor doesn\u0027t know how to\n *  interpret bulk test methods.\n *\n *  @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "IBMJDK16"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": "\n     * IBM JDK 1.6.0 has several bugs in their java.util.TreeMap implementation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TEST_DATA_PATH"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " Path to test data resources "
    },
    {
      "type": "field",
      "varNames": [
        "verboseName"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": "\n     *  The full name of this bulk test instance.  This is the full name\n     *  that is compared to {@link #ignoredTests} to see if this\n     *  test should be ignored.  It\u0027s also displayed in the text runner\n     *  to ease debugging.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.BulkTest.BulkTest(java.lang.String)",
      "begin_line": 179,
      "end_line": 182,
      "comment": "\n     *  Constructs a new \u003ccode\u003eBulkTest\u003c/code\u003e instance that will run the\n     *  specified simple test.\n     *\n     *  @param name  the name of the simple test method to run\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 20)",
        "(line 181,col 9)-(line 181,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BulkTest.clone()",
      "begin_line": 190,
      "end_line": 197,
      "comment": "\n     *  Creates a clone of this \u003ccode\u003eBulkTest\u003c/code\u003e.\u003cP\u003e\n     *\n     *  @return  a clone of this \u003ccode\u003eBulkTest\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 196,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BulkTest.ignoredTests()",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\n     *  Returns an array of test names to ignore.\u003cP\u003e\n     *\n     *  If a test that\u0027s defined by this \u003ccode\u003eBulkTest\u003c/code\u003e or\n     *  by one of its bulk test methods has a name that\u0027s in the returned\n     *  array, then that simple test will not be executed.\u003cP\u003e\n     *\n     *  A test\u0027s name is formed by taking the class name of the\n     *  root \u003ccode\u003eBulkTest\u003c/code\u003e, eliminating the package name, then\n     *  appending the names of any bulk test methods that were invoked\n     *  to get to the simple test, and then appending the simple test\n     *  method name.  The method names are delimited by periods:\n     *\n     *  \u003cpre\u003e\n     *  HashMapTest.bulkTestEntrySet.testClear\n     *  \u003c/pre\u003e\n     *\n     *  is the name of one of the simple tests defined in the sample classes\n     *  described above.  If the sample \u003ccode\u003eHashMapTest\u003c/code\u003e class\n     *  included this method:\n     *\n     *  \u003cpre\u003e\n     *  public String[] ignoredTests() {\n     *      return new String[] { \"HashMapTest.bulkTestEntrySet.testClear\" };\n     *  }\n     *  \u003c/pre\u003e\n     *\n     *  then the entry set\u0027s clear method wouldn\u0027t be tested, but the key\n     *  set\u0027s clear method would.\n     *\n     *  @return an array of the names of tests to ignore, or null if\n     *   no tests should be ignored\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BulkTest.toString()",
      "begin_line": 243,
      "end_line": 246,
      "comment": "\n     *  Returns the display name of this \u003ccode\u003eBulkTest\u003c/code\u003e.\n     *\n     *  @return the display name of this \u003ccode\u003eBulkTest\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BulkTest.makeSuite(java.lang.Class\u003c? extends org.apache.commons.collections4.BulkTest\u003e)",
      "begin_line": 264,
      "end_line": 272,
      "comment": "\n     *  Returns a {@link TestSuite} for testing all of the simple tests\n     *  \u003cI\u003eand\u003c/I\u003e all the bulk tests defined by the given class.\u003cP\u003e\n     *\n     *  The class is examined for simple and bulk test methods; any child\n     *  bulk tests are also examined recursively; and the results are stored\n     *  in a hierarchical {@link TestSuite}.\u003cP\u003e\n     *\n     *  The given class must be a subclass of \u003ccode\u003eBulkTest\u003c/code\u003e and must\n     *  not be abstract.\u003cP\u003e\n     *\n     *  @param c  the class to examine for simple and bulk tests\n     *  @return  a {@link TestSuite} containing all the simple and bulk tests\n     *    defined by that class\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 48)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BulkTestSuiteMaker",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 280,
      "end_line": 507,
      "comment": " it easier to handle the recursion."
    },
    {
      "type": "field",
      "varNames": [
        "startingClass"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": " The class that defines simple and bulk tests methods. "
    },
    {
      "type": "field",
      "varNames": [
        "ignored"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": " List of ignored simple test names. "
    },
    {
      "type": "field",
      "varNames": [
        "result"
      ],
      "begin_line": 289,
      "end_line": 289,
      "comment": " The TestSuite we\u0027re currently populating.  Can change over time. "
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": "\n     * The prefix for simple test methods.  Used to check if a test is in\n     * the ignored list.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.BulkTestSuiteMaker.BulkTestSuiteMaker(java.lang.Class\u003c? extends org.apache.commons.collections4.BulkTest\u003e)",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\n     * Constructor.\n     *\n     * @param startingClass  the starting class\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BulkTestSuiteMaker.make()",
      "begin_line": 311,
      "end_line": 324,
      "comment": "\n     * Makes a hierarchical TestSuite based on the starting class.\n     *\n     * @return  the hierarchical TestSuite for startingClass\n     ",
      "child_ranges": [
        "(line 312,col 10)-(line 312,col 39)",
        "(line 313,col 10)-(line 313,col 50)",
        "(line 314,col 10)-(line 314,col 32)",
        "(line 316,col 10)-(line 316,col 64)",
        "(line 317,col 10)-(line 317,col 43)",
        "(line 318,col 10)-(line 318,col 48)",
        "(line 319,col 10)-(line 321,col 10)",
        "(line 322,col 10)-(line 322,col 20)",
        "(line 323,col 10)-(line 323,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BulkTestSuiteMaker.make(org.apache.commons.collections4.BulkTest)",
      "begin_line": 333,
      "end_line": 344,
      "comment": "\n     * Appends all the simple tests and bulk tests defined by the given\n     * instance\u0027s class to the current TestSuite.\n     *\n     * @param bulk  An instance of the class that defines simple and bulk\n     *    tests for us to append\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 60)",
        "(line 335,col 9)-(line 335,col 44)",
        "(line 336,col 9)-(line 343,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BulkTestSuiteMaker.addTest(org.apache.commons.collections4.BulkTest, java.lang.reflect.Method)",
      "begin_line": 354,
      "end_line": 362,
      "comment": "\n     * Adds the simple test defined by the given method to the TestSuite.\n     *\n     * @param bulk  The instance of the class that defined the method\n     *   (I know it\u0027s weird.  But the point is, we can clone the instance\n     *   and not have to worry about constructors.)\n     * @param m  The simple test method\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 54)",
        "(line 356,col 9)-(line 356,col 35)",
        "(line 357,col 9)-(line 357,col 55)",
        "(line 358,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 361,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BulkTestSuiteMaker.addBulk(org.apache.commons.collections4.BulkTest, java.lang.reflect.Method)",
      "begin_line": 373,
      "end_line": 408,
      "comment": "\n     * Adds a whole new suite of tests that are defined by the result of\n     * the given bulk test method.  In other words, the given bulk test\n     * method is invoked, and the resulting BulkTest instance is examined\n     * for yet more simple and bulk tests.\n     *\n     * @param bulk  The instance of the class that defined the method\n     * @param m  The bulk test method\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 62)",
        "(line 375,col 9)-(line 377,col 9)",
        "(line 379,col 9)-(line 379,col 23)",
        "(line 380,col 9)-(line 391,col 9)",
        "(line 394,col 9)-(line 394,col 40)",
        "(line 395,col 9)-(line 395,col 43)",
        "(line 397,col 9)-(line 397,col 44)",
        "(line 398,col 9)-(line 398,col 33)",
        "(line 399,col 9)-(line 399,col 36)",
        "(line 401,col 9)-(line 401,col 20)",
        "(line 403,col 9)-(line 403,col 34)",
        "(line 406,col 9)-(line 406,col 27)",
        "(line 407,col 9)-(line 407,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BulkTestSuiteMaker.getBaseName(java.lang.Class\u003c?\u003e)",
      "begin_line": 416,
      "end_line": 423,
      "comment": "\n     * Returns the base name of the given class.\n     *\n     * @param c  the class\n     * @return the name of that class, minus any package names\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 34)",
        "(line 418,col 9)-(line 418,col 44)",
        "(line 419,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BulkTestSuiteMaker.getTestCaseConstructor(java.lang.Class\u003cT\u003e)",
      "begin_line": 429,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 430,col 9)-(line 434,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BulkTestSuiteMaker.makeTestCase(java.lang.Class\u003cT\u003e, java.lang.reflect.Method)",
      "begin_line": 437,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 61)",
        "(line 439,col 9)-(line 448,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BulkTestSuiteMaker.makeFirstTestCase(java.lang.Class\u003cT\u003e)",
      "begin_line": 451,
      "end_line": 459,
      "comment": "",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 44)",
        "(line 453,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 458,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BulkTestSuiteMaker.isTest(java.lang.reflect.Method)",
      "begin_line": 464,
      "end_line": 482,
      "comment": "\n     * Returns true if the given method is a simple test method.\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 467,col 9)",
        "(line 468,col 9)-(line 470,col 9)",
        "(line 471,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 474,col 42)",
        "(line 475,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 481,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BulkTestSuiteMaker.isBulk(java.lang.reflect.Method)",
      "begin_line": 487,
      "end_line": 505,
      "comment": "\n     * Returns true if the given method is a bulk test method.\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 493,col 9)",
        "(line 494,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 497,col 42)",
        "(line 498,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 503,col 9)",
        "(line 504,col 9)-(line 504,col 20)"
      ]
    }
  ]
}