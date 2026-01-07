{
  "filepath": "/tmp/Lang-10b/src/test/java/org/apache/commons/lang3/concurrent/BackgroundInitializerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BackgroundInitializerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 304,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.checkInitialize(org.apache.commons.lang3.concurrent.BackgroundInitializerTest.BackgroundInitializerTestImpl)",
      "begin_line": 34,
      "end_line": 43,
      "comment": "\n     * Helper method for checking whether the initialize() method was correctly\n     * called. start() must already have been invoked.\n     *\n     * @param init the initializer to test\n     ",
      "child_ranges": [
        "(line 35,col 9)-(line 42,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testInitialize()",
      "begin_line": 48,
      "end_line": 53,
      "comment": "\n     * Tests whether initialize() is invoked.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 81)",
        "(line 51,col 9)-(line 51,col 21)",
        "(line 52,col 9)-(line 52,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetActiveExecutorBeforeStart()",
      "begin_line": 59,
      "end_line": 63,
      "comment": "\n     * Tries to obtain the executor before start(). It should not have been\n     * initialized yet.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 81)",
        "(line 62,col 9)-(line 62,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetActiveExecutorExternal()",
      "begin_line": 68,
      "end_line": 80,
      "comment": "\n     * Tests whether an external executor is correctly detected.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 67)",
        "(line 71,col 9)-(line 79,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetActiveExecutorTemp()",
      "begin_line": 85,
      "end_line": 91,
      "comment": "\n     * Tests getActiveExecutor() for a temporary executor.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 81)",
        "(line 88,col 9)-(line 88,col 21)",
        "(line 89,col 9)-(line 89,col 70)",
        "(line 90,col 9)-(line 90,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testInitializeTempExecutor()",
      "begin_line": 97,
      "end_line": 104,
      "comment": "\n     * Tests the execution of the background task if a temporary executor has to\n     * be created.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 81)",
        "(line 100,col 9)-(line 100,col 60)",
        "(line 101,col 9)-(line 101,col 30)",
        "(line 102,col 9)-(line 103,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testSetExternalExecutor()",
      "begin_line": 110,
      "end_line": 125,
      "comment": "\n     * Tests whether an external executor can be set using the\n     * setExternalExecutor() method.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 63)",
        "(line 113,col 9)-(line 124,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testSetExternalExecutorAfterStart()",
      "begin_line": 130,
      "end_line": 140,
      "comment": "\n     * Tests that setting an executor after start() causes an exception.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 81)",
        "(line 133,col 9)-(line 133,col 21)",
        "(line 134,col 9)-(line 139,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testStartMultipleTimes()",
      "begin_line": 146,
      "end_line": 154,
      "comment": "\n     * Tests invoking start() multiple times. Only the first invocation should\n     * have an effect.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 81)",
        "(line 149,col 9)-(line 149,col 61)",
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetBeforeStart()",
      "begin_line": 159,
      "end_line": 163,
      "comment": "\n     * Tests calling get() before start(). This should cause an exception.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 81)",
        "(line 162,col 9)-(line 162,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetRuntimeException()",
      "begin_line": 169,
      "end_line": 181,
      "comment": "\n     * Tests the get() method if background processing causes a runtime\n     * exception.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 81)",
        "(line 172,col 9)-(line 172,col 54)",
        "(line 173,col 9)-(line 173,col 22)",
        "(line 174,col 9)-(line 174,col 21)",
        "(line 175,col 9)-(line 180,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetCheckedException()",
      "begin_line": 187,
      "end_line": 199,
      "comment": "\n     * Tests the get() method if background processing causes a checked\n     * exception.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 81)",
        "(line 190,col 9)-(line 190,col 39)",
        "(line 191,col 9)-(line 191,col 21)",
        "(line 192,col 9)-(line 192,col 21)",
        "(line 193,col 9)-(line 198,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetInterruptedException()",
      "begin_line": 204,
      "end_line": 234,
      "comment": "\n     * Tests the get() method if waiting for the initialization is interrupted.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 67)",
        "(line 207,col 9)-(line 208,col 22)",
        "(line 209,col 9)-(line 209,col 60)",
        "(line 210,col 9)-(line 210,col 32)",
        "(line 211,col 9)-(line 211,col 21)",
        "(line 212,col 9)-(line 212,col 102)",
        "(line 213,col 9)-(line 227,col 10)",
        "(line 228,col 9)-(line 228,col 26)",
        "(line 229,col 9)-(line 229,col 30)",
        "(line 230,col 9)-(line 230,col 23)",
        "(line 231,col 9)-(line 231,col 27)",
        "(line 232,col 9)-(line 232,col 69)",
        "(line 233,col 9)-(line 233,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.Anonymous-70c09479-e803-42a5-8759-5467f08aaaa7.run()",
      "begin_line": 214,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 216,col 17)-(line 225,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testIsStartedFalse()",
      "begin_line": 239,
      "end_line": 243,
      "comment": "\n     * Tests isStarted() before start() was called.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 81)",
        "(line 242,col 9)-(line 242,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testIsStartedTrue()",
      "begin_line": 248,
      "end_line": 253,
      "comment": "\n     * Tests isStarted() after start().\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 81)",
        "(line 251,col 9)-(line 251,col 21)",
        "(line 252,col 9)-(line 252,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testIsStartedAfterGet()",
      "begin_line": 258,
      "end_line": 264,
      "comment": "\n     * Tests isStarted() after the background task has finished.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 81)",
        "(line 261,col 9)-(line 261,col 21)",
        "(line 262,col 9)-(line 262,col 30)",
        "(line 263,col 9)-(line 263,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BackgroundInitializerTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.concurrent.BackgroundInitializer\u003cjava.lang.Integer\u003e"
      ],
      "begin_line": 270,
      "end_line": 303,
      "comment": "\n     * A concrete implementation of BackgroundInitializer. It also overloads\n     * some methods that simplify testing.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ex"
      ],
      "begin_line": 273,
      "end_line": 273,
      "comment": " An exception to be thrown by initialize(). "
    },
    {
      "type": "field",
      "varNames": [
        "shouldSleep"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": " A flag whether the background task should sleep a while. "
    },
    {
      "type": "field",
      "varNames": [
        "initializeCalls"
      ],
      "begin_line": 279,
      "end_line": 279,
      "comment": " The number of invocations of initialize(). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.BackgroundInitializerTestImpl.BackgroundInitializerTestImpl()",
      "begin_line": 281,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 282,col 13)-(line 282,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.BackgroundInitializerTestImpl.BackgroundInitializerTestImpl(java.util.concurrent.ExecutorService)",
      "begin_line": 285,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 286,col 13)-(line 286,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.BackgroundInitializerTestImpl.initialize()",
      "begin_line": 293,
      "end_line": 302,
      "comment": "\n         * Records this invocation. Optionally throws an exception or sleeps a\n         * while.\n         ",
      "child_ranges": [
        "(line 295,col 13)-(line 297,col 13)",
        "(line 298,col 13)-(line 300,col 13)",
        "(line 301,col 13)-(line 301,col 37)"
      ]
    }
  ]
}