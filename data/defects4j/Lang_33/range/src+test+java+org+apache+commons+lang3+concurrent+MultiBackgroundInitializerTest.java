{
  "filepath": "/tmp/Lang-33b/src/test/java/org/apache/commons/lang3/concurrent/MultiBackgroundInitializerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiBackgroundInitializerTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 364,
      "comment": "\n * Test class for {@link MultiBackgroundInitializer}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CHILD_INIT"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Constant for the names of the child initializers. "
    },
    {
      "type": "field",
      "varNames": [
        "initializer"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " The initializer to be tested. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.setUp()",
      "begin_line": 38,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 22)",
        "(line 41,col 9)-(line 41,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.checkChild(org.apache.commons.lang3.concurrent.BackgroundInitializer\u003c?\u003e, java.util.concurrent.ExecutorService)",
      "begin_line": 53,
      "end_line": 63,
      "comment": "\n     * Tests whether a child initializer has been executed. Optionally the\n     * expected executor service can be checked, too.\n     *\n     * @param child the child initializer\n     * @param expExec the expected executor service (null if the executor should\n     * not be checked)\n     * @throws ConcurrentException if an error occurs\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 78)",
        "(line 56,col 9)-(line 56,col 37)",
        "(line 57,col 9)-(line 57,col 59)",
        "(line 58,col 9)-(line 58,col 77)",
        "(line 59,col 9)-(line 62,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testAddInitializerNullName()",
      "begin_line": 69,
      "end_line": 76,
      "comment": "\n     * Tests addInitializer() if a null name is passed in. This should cause an\n     * exception.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 75,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testAddInitializerNullInit()",
      "begin_line": 82,
      "end_line": 89,
      "comment": "\n     * Tests addInitializer() if a null initializer is passed in. This should\n     * cause an exception.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 88,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeNoChildren()",
      "begin_line": 94,
      "end_line": 101,
      "comment": "\n     * Tests the background processing if there are no child initializers.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 67)",
        "(line 96,col 9)-(line 97,col 23)",
        "(line 98,col 9)-(line 98,col 79)",
        "(line 99,col 9)-(line 100,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.checkInitialize()",
      "begin_line": 109,
      "end_line": 132,
      "comment": "\n     * Helper method for testing the initialize() method. This method can\n     * operate with both an external and a temporary executor service.\n     *\n     * @return the result object produced by the initializer\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 28)",
        "(line 112,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 28)",
        "(line 117,col 9)-(line 118,col 23)",
        "(line 119,col 9)-(line 120,col 44)",
        "(line 121,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeTempExec()",
      "begin_line": 137,
      "end_line": 141,
      "comment": "\n     * Tests background processing if a temporary executor is used.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 26)",
        "(line 139,col 9)-(line 140,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeExternalExec()",
      "begin_line": 146,
      "end_line": 157,
      "comment": "\n     * Tests background processing if an external executor service is provided.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 63)",
        "(line 148,col 9)-(line 156,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeChildWithExecutor()",
      "begin_line": 163,
      "end_line": 179,
      "comment": "\n     * Tests the behavior of initialize() if a child initializer has a specific\n     * executor service. Then this service should not be overridden.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 63)",
        "(line 165,col 9)-(line 165,col 67)",
        "(line 166,col 9)-(line 178,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testAddInitializerAfterStart()",
      "begin_line": 185,
      "end_line": 194,
      "comment": "\n     * Tries to add another child initializer after the start() method has been\n     * called. This should not be allowed.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 28)",
        "(line 187,col 9)-(line 193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testResultGetInitializerUnknown()",
      "begin_line": 200,
      "end_line": 208,
      "comment": "\n     * Tries to query an unknown child initializer from the results object. This\n     * should cause an exception.\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 93)",
        "(line 202,col 9)-(line 207,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testResultGetResultObjectUnknown()",
      "begin_line": 214,
      "end_line": 222,
      "comment": "\n     * Tries to query the results of an unknown child initializer from the\n     * results object. This should cause an exception.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 93)",
        "(line 216,col 9)-(line 221,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testResultGetExceptionUnknown()",
      "begin_line": 228,
      "end_line": 236,
      "comment": "\n     * Tries to query the exception of an unknown child initializer from the\n     * results object. This should cause an exception.\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 93)",
        "(line 230,col 9)-(line 235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testResultIsExceptionUnknown()",
      "begin_line": 242,
      "end_line": 250,
      "comment": "\n     * Tries to query the exception flag of an unknown child initializer from\n     * the results object. This should cause an exception.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 93)",
        "(line 244,col 9)-(line 249,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testResultInitializerNamesModify()",
      "begin_line": 255,
      "end_line": 267,
      "comment": "\n     * Tests that the set with the names of the initializers cannot be modified.\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 26)",
        "(line 257,col 9)-(line 258,col 23)",
        "(line 259,col 9)-(line 259,col 64)",
        "(line 260,col 9)-(line 260,col 18)",
        "(line 261,col 9)-(line 266,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeRuntimeEx()",
      "begin_line": 273,
      "end_line": 284,
      "comment": "\n     * Tests the behavior of the initializer if one of the child initializers\n     * throws a runtime exception.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 76)",
        "(line 275,col 9)-(line 275,col 42)",
        "(line 276,col 9)-(line 276,col 54)",
        "(line 277,col 9)-(line 277,col 28)",
        "(line 278,col 9)-(line 283,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeEx()",
      "begin_line": 290,
      "end_line": 301,
      "comment": "\n     * Tests the behavior of the initializer if one of the child initializers\n     * throws a checked exception.\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 76)",
        "(line 292,col 9)-(line 292,col 35)",
        "(line 293,col 9)-(line 293,col 54)",
        "(line 294,col 9)-(line 294,col 28)",
        "(line 295,col 9)-(line 296,col 23)",
        "(line 297,col 9)-(line 297,col 69)",
        "(line 298,col 9)-(line 298,col 76)",
        "(line 299,col 9)-(line 299,col 63)",
        "(line 300,col 9)-(line 300,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeNested()",
      "begin_line": 307,
      "end_line": 332,
      "comment": "\n     * Tests whether MultiBackgroundInitializers can be combined in a nested\n     * way.\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 57)",
        "(line 309,col 9)-(line 310,col 78)",
        "(line 311,col 9)-(line 311,col 74)",
        "(line 312,col 9)-(line 312,col 28)",
        "(line 313,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 51)",
        "(line 319,col 9)-(line 319,col 28)",
        "(line 320,col 9)-(line 321,col 23)",
        "(line 322,col 9)-(line 322,col 63)",
        "(line 323,col 9)-(line 323,col 57)",
        "(line 324,col 9)-(line 325,col 44)",
        "(line 326,col 9)-(line 327,col 44)",
        "(line 328,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 63)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ChildBackgroundInitializer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.concurrent.BackgroundInitializer\u003cjava.lang.Integer\u003e"
      ],
      "begin_line": 338,
      "end_line": 363,
      "comment": "\n     * A concrete implementation of {@code BackgroundInitializer} used for\n     * defining background tasks for {@code MultiBackgroundInitializer}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "currentExecutor"
      ],
      "begin_line": 341,
      "end_line": 341,
      "comment": " Stores the current executor service. "
    },
    {
      "type": "field",
      "varNames": [
        "initializeCalls"
      ],
      "begin_line": 344,
      "end_line": 344,
      "comment": " A counter for the invocations of initialize(). "
    },
    {
      "type": "field",
      "varNames": [
        "ex"
      ],
      "begin_line": 347,
      "end_line": 347,
      "comment": " An exception to be thrown by initialize(). "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.ChildBackgroundInitializer.initialize()",
      "begin_line": 352,
      "end_line": 362,
      "comment": "\n         * Records this invocation. Optionally throws an exception.\n         ",
      "child_ranges": [
        "(line 354,col 13)-(line 354,col 50)",
        "(line 355,col 13)-(line 355,col 30)",
        "(line 357,col 13)-(line 359,col 13)",
        "(line 361,col 13)-(line 361,col 35)"
      ]
    }
  ]
}