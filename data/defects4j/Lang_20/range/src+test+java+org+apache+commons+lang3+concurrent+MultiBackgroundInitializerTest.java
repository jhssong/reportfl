{
  "filepath": "/tmp/Lang-20b/src/test/java/org/apache/commons/lang3/concurrent/MultiBackgroundInitializerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiBackgroundInitializerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 381,
      "comment": "\n * Test class for {@link MultiBackgroundInitializer}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CHILD_INIT"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Constant for the names of the child initializers. "
    },
    {
      "type": "field",
      "varNames": [
        "initializer"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The initializer to be tested. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.setUp()",
      "begin_line": 45,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.checkChild(org.apache.commons.lang3.concurrent.BackgroundInitializer\u003c?\u003e, java.util.concurrent.ExecutorService)",
      "begin_line": 59,
      "end_line": 69,
      "comment": "\n     * Tests whether a child initializer has been executed. Optionally the\n     * expected executor service can be checked, too.\n     *\n     * @param child the child initializer\n     * @param expExec the expected executor service (null if the executor should\n     * not be checked)\n     * @throws ConcurrentException if an error occurs\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 78)",
        "(line 62,col 9)-(line 62,col 37)",
        "(line 63,col 9)-(line 63,col 59)",
        "(line 64,col 9)-(line 64,col 77)",
        "(line 65,col 9)-(line 68,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testAddInitializerNullName()",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Tests addInitializer() if a null name is passed in. This should cause an\n     * exception.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testAddInitializerNullInit()",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Tests addInitializer() if a null initializer is passed in. This should\n     * cause an exception.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeNoChildren()",
      "begin_line": 92,
      "end_line": 100,
      "comment": "\n     * Tests the background processing if there are no child initializers.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 67)",
        "(line 95,col 9)-(line 96,col 23)",
        "(line 97,col 9)-(line 97,col 79)",
        "(line 98,col 9)-(line 99,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.checkInitialize()",
      "begin_line": 108,
      "end_line": 131,
      "comment": "\n     * Helper method for testing the initialize() method. This method can\n     * operate with both an external and a temporary executor service.\n     *\n     * @return the result object produced by the initializer\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 28)",
        "(line 111,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 28)",
        "(line 116,col 9)-(line 117,col 23)",
        "(line 118,col 9)-(line 119,col 44)",
        "(line 120,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeTempExec()",
      "begin_line": 136,
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
      "end_line": 158,
      "comment": "\n     * Tests background processing if an external executor service is provided.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 63)",
        "(line 149,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeChildWithExecutor()",
      "begin_line": 164,
      "end_line": 181,
      "comment": "\n     * Tests the behavior of initialize() if a child initializer has a specific\n     * executor service. Then this service should not be overridden.\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 63)",
        "(line 167,col 9)-(line 167,col 67)",
        "(line 168,col 9)-(line 180,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testAddInitializerAfterStart()",
      "begin_line": 187,
      "end_line": 197,
      "comment": "\n     * Tries to add another child initializer after the start() method has been\n     * called. This should not be allowed.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 28)",
        "(line 190,col 9)-(line 196,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testResultGetInitializerUnknown()",
      "begin_line": 203,
      "end_line": 207,
      "comment": "\n     * Tries to query an unknown child initializer from the results object. This\n     * should cause an exception.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 93)",
        "(line 206,col 9)-(line 206,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testResultGetResultObjectUnknown()",
      "begin_line": 213,
      "end_line": 217,
      "comment": "\n     * Tries to query the results of an unknown child initializer from the\n     * results object. This should cause an exception.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 93)",
        "(line 216,col 9)-(line 216,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testResultGetExceptionUnknown()",
      "begin_line": 223,
      "end_line": 227,
      "comment": "\n     * Tries to query the exception of an unknown child initializer from the\n     * results object. This should cause an exception.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 93)",
        "(line 226,col 9)-(line 226,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testResultIsExceptionUnknown()",
      "begin_line": 233,
      "end_line": 237,
      "comment": "\n     * Tries to query the exception flag of an unknown child initializer from\n     * the results object. This should cause an exception.\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 93)",
        "(line 236,col 9)-(line 236,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testResultInitializerNamesModify()",
      "begin_line": 242,
      "end_line": 250,
      "comment": "\n     * Tests that the set with the names of the initializers cannot be modified.\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 26)",
        "(line 245,col 9)-(line 246,col 23)",
        "(line 247,col 9)-(line 247,col 64)",
        "(line 248,col 9)-(line 248,col 18)",
        "(line 249,col 9)-(line 249,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeRuntimeEx()",
      "begin_line": 256,
      "end_line": 268,
      "comment": "\n     * Tests the behavior of the initializer if one of the child initializers\n     * throws a runtime exception.\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 76)",
        "(line 259,col 9)-(line 259,col 42)",
        "(line 260,col 9)-(line 260,col 54)",
        "(line 261,col 9)-(line 261,col 28)",
        "(line 262,col 9)-(line 267,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeEx()",
      "begin_line": 274,
      "end_line": 286,
      "comment": "\n     * Tests the behavior of the initializer if one of the child initializers\n     * throws a checked exception.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 76)",
        "(line 277,col 9)-(line 277,col 35)",
        "(line 278,col 9)-(line 278,col 54)",
        "(line 279,col 9)-(line 279,col 28)",
        "(line 280,col 9)-(line 281,col 23)",
        "(line 282,col 9)-(line 282,col 69)",
        "(line 283,col 9)-(line 283,col 76)",
        "(line 284,col 9)-(line 284,col 63)",
        "(line 285,col 9)-(line 285,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeResultsIsSuccessfulTrue()",
      "begin_line": 292,
      "end_line": 301,
      "comment": "\n     * Tests the isSuccessful() method of the result object if no child\n     * initializer has thrown an exception.\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 76)",
        "(line 296,col 9)-(line 296,col 54)",
        "(line 297,col 9)-(line 297,col 28)",
        "(line 298,col 9)-(line 299,col 23)",
        "(line 300,col 9)-(line 300,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeResultsIsSuccessfulFalse()",
      "begin_line": 307,
      "end_line": 317,
      "comment": "\n     * Tests the isSuccessful() method of the result object if at least one\n     * child initializer has thrown an exception.\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 76)",
        "(line 311,col 9)-(line 311,col 35)",
        "(line 312,col 9)-(line 312,col 54)",
        "(line 313,col 9)-(line 313,col 28)",
        "(line 314,col 9)-(line 315,col 23)",
        "(line 316,col 9)-(line 316,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeNested()",
      "begin_line": 323,
      "end_line": 349,
      "comment": "\n     * Tests whether MultiBackgroundInitializers can be combined in a nested\n     * way.\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 57)",
        "(line 326,col 9)-(line 327,col 78)",
        "(line 328,col 9)-(line 328,col 74)",
        "(line 329,col 9)-(line 329,col 28)",
        "(line 330,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 51)",
        "(line 336,col 9)-(line 336,col 28)",
        "(line 337,col 9)-(line 338,col 23)",
        "(line 339,col 9)-(line 339,col 63)",
        "(line 340,col 9)-(line 340,col 57)",
        "(line 341,col 9)-(line 342,col 44)",
        "(line 343,col 9)-(line 344,col 44)",
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 63)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ChildBackgroundInitializer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.concurrent.BackgroundInitializer\u003cjava.lang.Integer\u003e"
      ],
      "begin_line": 355,
      "end_line": 380,
      "comment": "\n     * A concrete implementation of {@code BackgroundInitializer} used for\n     * defining background tasks for {@code MultiBackgroundInitializer}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "currentExecutor"
      ],
      "begin_line": 358,
      "end_line": 358,
      "comment": " Stores the current executor service. "
    },
    {
      "type": "field",
      "varNames": [
        "initializeCalls"
      ],
      "begin_line": 361,
      "end_line": 361,
      "comment": " A counter for the invocations of initialize(). "
    },
    {
      "type": "field",
      "varNames": [
        "ex"
      ],
      "begin_line": 364,
      "end_line": 364,
      "comment": " An exception to be thrown by initialize(). "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.ChildBackgroundInitializer.initialize()",
      "begin_line": 369,
      "end_line": 379,
      "comment": "\n         * Records this invocation. Optionally throws an exception.\n         ",
      "child_ranges": [
        "(line 371,col 13)-(line 371,col 50)",
        "(line 372,col 13)-(line 372,col 30)",
        "(line 374,col 13)-(line 376,col 13)",
        "(line 378,col 13)-(line 378,col 35)"
      ]
    }
  ]
}